package com.example.glosanewapp.ui.fragments


import android.app.ActivityManager
import android.content.*
import android.location.Address
import android.location.Geocoder
import android.location.Location
import android.media.MediaPlayer
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Vibrator
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableField
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.glosanewapp.R
import com.example.glosanewapp.databinding.FragmentSubscribeBinding
import com.example.glosanewapp.listeners.SubscriptionDataListener
import com.example.glosanewapp.network.VehicleSession
import com.example.glosanewapp.network.subscription.UserSubscriptionAndDataProvider
import com.example.glosanewapp.services.LatLngService
import com.example.glosanewapp.ui.adapters.SubscriptionDataAdapter
import com.example.glosanewapp.viewmodel.LiveFeedsViewModel
import com.example.latlngapp.network.UserSession
import com.google.android.gms.location.*
import com.google.android.gms.location.Priority
import j2735.dsrc.*
import java.util.*


class SubscribeFragment : Fragment(), SubscriptionDataListener {

    private var redlighttime: Int = 0
    private var greenlighttime: Int = 0
    private var rednexttime: Int = 0
    private var greennexttime: Int = 0
    private var speedlimit: Int = -1
    private var lastdistance: Float = -1f
    private var lastlocation: Location = Location("")


    companion object {
        private const val TAG = "SubscribeFragment"
    }

    private lateinit var serviceintent: Intent
    var latLngService = LatLngService()


    var redlight: ObservableField<Boolean> = ObservableField(false)

    private lateinit var subscribeBinding: FragmentSubscribeBinding
    private lateinit var fusedLocationProviderClient: FusedLocationProviderClient
    lateinit var mPlayer1: MediaPlayer
    lateinit var vibrator: Vibrator
    lateinit var builder: AlertDialog.Builder
    lateinit var alertDialog: AlertDialog

    private lateinit var locationCallback: LocationCallback
    private lateinit var locationRequest: LocationRequest
    private lateinit var globallocation: Location

    private lateinit var subscriptionDataAdapter: SubscriptionDataAdapter


    private lateinit var mSubscriptionProvider: UserSubscriptionAndDataProvider
    private var subscribeData:ArrayList<LiveFeedsViewModel>?=null

    lateinit var userSession: UserSession


    val mMessageReceiver: BroadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent) {
            // Get extra data included in the Intent
            if (redlighttime >= 0)
                redlighttime = redlighttime - 10
            if (greenlighttime >= 0)
                greenlighttime = greenlighttime - 10
            val latitude = intent.getDoubleExtra("latitude", 0.0)
            val longitude = intent.getDoubleExtra("longitude", 0.0)
            val heading = intent.getIntExtra("heading", 0)
            val speed = intent.getFloatExtra("speed", 0.0f)

            val mlatitude = Latitude()
            mlatitude.setValue((latitude * 100000).toLong().toInt())
            val mlongitude = Longitude()
            mlongitude.setValue((longitude * 100000).toLong().toInt())
            val mheading = Heading()
            mheading.setValue(heading)
            val mspeed = Speed()
            mspeed.setValue(speed.toInt())

            Log.d(TAG, "onReceive: " + userSession.getUserId())

            calculatspeed()
            /*  callpublish(
                  mlatitude,
                  mlongitude,
                  mheading,
                  mspeed,
                  Utils.readIntFromPreferences(this@MainScreenActivity, Utils.KEY_CLIENT_ID)
              )*/
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        subscribeBinding =FragmentSubscribeBinding.inflate(inflater)
           // DataBindingUtil.inflate(inflater, R.layout.fragment_subscribe, container, false)
/*

        if (!isServiceAlive(LatLngService::class.java))
            startBackgroundService()
*/

        return subscribeBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fusedLocationProviderClient =
            LocationServices.getFusedLocationProviderClient(requireContext())


//        getCurrentLocation()
        mPlayer1 = MediaPlayer.create(requireContext(), R.raw.sos_sound)

        vibrator =
            requireContext().getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        builder = AlertDialog.Builder(requireContext())
        alertDialog = builder.create()


        locationRequest = LocationRequest.create().apply {
            interval = 100
            fastestInterval = 300
            priority = Priority.PRIORITY_HIGH_ACCURACY
            isWaitForAccurateLocation = true

        }
        locationCallback = object : LocationCallback() {
            override fun onLocationResult(locationResult: LocationResult) {
                for (location in locationResult.locations) {
                    //update location
                    globallocation = location
                }
            }
        }
        // initialisePresenters()
        userSession = UserSession(requireContext())
        mSubscriptionProvider = UserSubscriptionAndDataProvider(requireContext())
        mSubscriptionProvider.connectClient(this)
        mSubscriptionProvider.getlivedata().observe(viewLifecycleOwner, Observer {
            if (it != null)

                setdata(it)

        })

        if (userSession.getUserId()!=null) {
            Log.d(TAG, "onViewCreated: ${userSession.getUserId()}")
            subscribeBinding.subfragTvId.text =
                "ID: " + String.format("%08X", userSession.getUserId()!!.toInt())
        }
//requireActivity().finish()
        subscribeData=ArrayList<LiveFeedsViewModel>()
        subscriptionDataAdapter= SubscriptionDataAdapter(requireContext(),
            subscribeData as ArrayList<LiveFeedsViewModel>
        )
        subscribeBinding.subfragRecyclerview.layoutManager = LinearLayoutManager(requireContext())
        subscribeBinding.subfragRecyclerview.adapter= subscriptionDataAdapter

    }

    // Starting Background Service
    private fun startBackgroundService() {

        latLngService = LatLngService()
        serviceintent = Intent(requireContext(), latLngService.javaClass)
        serviceintent.setPackage(requireContext().packageName)
        requireContext().startService(serviceintent)

    }


    // Checking Service Status
    private fun isServiceAlive(serviceClass: Class<*>): Boolean {
        val manager: ActivityManager =
            requireContext().getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        for (service in manager.getRunningServices(Int.MAX_VALUE)) {
            if (serviceClass.name == service.service.className) {
                return true
            }
        }
        return false
    }



    private fun setdata(psm: PersonalSafetyMessage) {
        val latitude = psm.getPosition().getLat().intValue()
        val longitude = psm.getPosition().get_long().intValue()
        val geocoder = Geocoder(requireContext(), Locale.getDefault())
        val addresses: List<Address>?
        val address: Address
        var fulladdress = ""
        Log.d(TAG, "getPedestrianAddress: $latitude, $longitude")

        val latdouble: Double = (latitude.toDouble()) / 10000000
        val lngdouble: Double = (longitude.toDouble()) / 10000000
        var oldresult = ""
        if (Build.VERSION.SDK_INT >= 33) {
            /*geocoder.getFromLocation(latdouble, lngdouble, 1) {
//                fulladdress = it.get(0).getAddressLine(0)
                address = it.get(0)
                val city = address.locality
                var state = address.getAdminArea()
                var country = address.getCountryName()
                var postalCode = address.getPostalCode()
                var knownName = address.featureName
                val localarea = " ${address.subLocality}"

                fulladdress =
                    "(" + latdouble + ", " + lngdouble + "), " + localarea + ", " + city + ", " + state
                Log.d(
                    TAG,
                    "getPedestrianAddress: ${address.locality} ${address.subLocality} ${address.adminArea} ${address.subAdminArea} ${address.thoroughfare} ${address.subThoroughfare} ${address.featureName} ${address.premises}"
                )
                subscribeData?.add(LiveFeedsViewModel().apply { this.latitude=lngdouble.toString() })
                subscribeData?.let { subscriptionDataAdapter.refreshAdapter(it) }

                val new = "\n\nA new pedestrian is moving near you at position " + fulladdress +
                        " with the speed of ${psm.speed.intValue()}m/s in ${psm.heading.intValue()} degree direction.\n"
                //                oldresult = oldresult + new
//                runOnUiThread {
//                    mParentBinding.listDataMainLayout.text = oldresult
//                }

            }*/
        } else {
            addresses = geocoder.getFromLocation(latdouble, lngdouble, 1)
            Log.d(
                TAG,
                "getPedestrianAddress: " + (latitude.toDouble()) / 10000000 + ", " + (longitude.toDouble()) / 100000
            )
            if (addresses != null) {
                if (addresses.isNotEmpty()) {
                    address = addresses[0]
                    // If any additional address line present than only, check with max available address lines by getMaxAddressLineIndex
//                    fulladdress = address.getAddressLine(0)
                    // Only if available else return NULL
                    val city = address.getLocality()
                    var state = address.getAdminArea()
                    var country = address.getCountryName()
                    var postalCode = address.getPostalCode()
                    var knownName = address.featureName
                    val localarea = " ${address.subLocality}"

                    fulladdress =
                        "(" + latdouble + ", " + lngdouble + "), " + localarea + ", " + city
                    Log.d(TAG, "getPedestrianAddress: " + fulladdress)

                    subscribeData?.add(LiveFeedsViewModel().apply {
                        this.latitude=latdouble.toString()
                        this.longitude = lngdouble.toString()
                        this.speed = psm.speed.intValue().toString()
                        this.direction = psm.heading.intValue().toString()
                        this.streetName = city
                    })


                    subscribeData?.let { subscriptionDataAdapter.refreshAdapter(it) }

                } else {
                    fulladdress = "Location not found"

                }
            } else {
                fulladdress = "Location not found"

            }
        }


    }


    private fun showAlertDialog() {

        if (!alertDialog.isShowing) {
            builder.setMessage("Emergency Vehicle in on your path.")

            builder.setTitle("Emergency SOS")

            builder.setCancelable(false)

            /* builder.setPositiveButton("Yes",
            DialogInterface.OnClickListener { dialog: DialogInterface?, which: Int ->
                // When the user click yes button then app will close
                finish()
            })
*/

            builder.setNegativeButton("OK") { dialog: DialogInterface, _: Int ->
                // If user click no then dialog box is canceled.
                dialog.cancel()
                mPlayer1.stop()
                vibrator.cancel()
            }
            alertDialog = builder.create()
            alertDialog.setOnDismissListener {
                mPlayer1.stop()
                vibrator.cancel()
            }
            alertDialog.show()

            val handler = Handler()
            handler.postDelayed({ // Do something after 5s = 5000ms
                alertDialog.dismiss()
                mPlayer1.stop()
                vibrator.cancel()
            }, 3000)

        }
    }


    fun playsound() {
        if (!mPlayer1.isPlaying) {

            mPlayer1.start()
            mPlayer1.isLooping = true
            val mVibratePattern = longArrayOf(
                0, 400, 200, 400,
                0, 400, 200, 400,
                0, 400, 200, 400,
                0, 400, 200, 400,
                0, 400, 200, 400,
                0, 400, 200, 400,
                0, 400, 200, 400,
                0, 400, 200, 400,
                0, 400, 200, 400,
                0, 400, 200, 400
            )
            vibrator.vibrate(mVibratePattern, -1)

            showAlertDialog()
        }
    }

    fun subscribeUser() {
        Log.d(TAG,"subscribeUser")
        //mSubscriptionProvider.subscribeUser()

    }


    override fun notifyDataReceived(isPublisherData: Boolean, dataDispatchedTime: String) {
        Log.d(TAG,isPublisherData.toString())
    }

    override fun onDetach() {
        super.onDetach()
        mSubscriptionProvider.disconnectConnection()
    }

    fun updatelight(b: Boolean, name: String) {
        redlight.set(b)
        subscribeBinding.signalName.text = name
    }

    fun savetime(b: Boolean, minEndTime: TimeMark?, nexttime: TimeMark?, speed: SpeedAdvice) {
        speedlimit = speed.intValue()
        subscribeBinding.speedlimit.text = String.format("%.1f", (speedlimit * 3.6 * 0.62))
        if (b) {
            greenlighttime = minEndTime?.intValue() ?: 0
            greennexttime = nexttime?.intValue() ?: 0
            redlighttime = 0
        } else {
            redlighttime = minEndTime?.intValue() ?: 0
            rednexttime = nexttime?.intValue() ?: 0
            greenlighttime = 0
        }


    }

    fun calculatediff(lat: Int, _long: Int) {
        if (this::globallocation.isInitialized) {
            Log.d(
                TAG,
                "currentlocation: ${globallocation.latitude}, ${globallocation.longitude}, ${globallocation.speed}"
            )
            Log.d(TAG, "maplocation: ${lat.toDouble() / 10000000}, ${_long.toDouble() / 10000000}")
            var loc1 = Location("")
            loc1.latitude = lat.toDouble() / 10000000
            //if (((Math.log10(lat.toDouble()) + 1) as Int) == 10) lat.toDouble() / 100000000 else lat.toDouble() / 10000000
            loc1.longitude = _long.toDouble() / 10000000
            // if (((Math.log10(_long.toDouble()) + 1) as Int) == 10) _long.toDouble() / 100000000 else _long.toDouble() / 10000000
            lastlocation = loc1
            var loc2 = Location("")
            loc2.latitude = globallocation.latitude
            loc2.longitude = globallocation.longitude
            val distance = loc1.distanceTo(loc2)

            lastdistance = distance

            val currenttime = distance / (globallocation.speed)
            var currenttimesec: Float = 0f
            if (redlighttime != 0 && currenttime < redlighttime / 10) {
                currenttimesec = currenttime + (redlighttime / 10)
            } else currenttimesec = currenttime
            if (greenlighttime != 0 && currenttime > greenlighttime / 10) {
                currenttimesec = currenttime - (greenlighttime / 10)
            } else currenttimesec = currenttime

            var advisespeed = distance / (currenttimesec)

            advisespeed =
                if (speedlimit != -1 && advisespeed > speedlimit) speedlimit.toFloat() else advisespeed

            Log.d(TAG, "distance: ${distance / 1000}")
            Log.d(TAG, "currenttime: $currenttime")
            Log.d(TAG, "expectedtime: $currenttimesec")
            Log.d(TAG, "greelighttime: ${greenlighttime / 10}")
            Log.d(
                TAG,
                "currentspeed: ${String.format("%.4f", (globallocation.speed * 3.6 * 0.62))}"
            )
            Log.d(
                TAG,
                "advicespeed: ${String.format("%.4f", (Math.abs(advisespeed) * 3.6 * 0.62))}"
            )
            subscribeBinding.subfragTvDistance.text = String.format("%.1f", (distance / 1000) * 0.62)
            if (advisespeed > 0)
                subscribeBinding.speedometer.setSpeed(Math.abs(advisespeed) * 3.6 * 0.62,true)
        }
    }

    fun calculatspeed() {
        if (this::globallocation.isInitialized) {

            Log.d(
                TAG,
                "currentlocation: ${globallocation.latitude}, ${globallocation.longitude}, ${globallocation.speed}"
            )

            var loc2 = Location("")
            loc2.latitude = globallocation.latitude
            loc2.longitude = globallocation.longitude
            val distance = lastlocation.distanceTo(loc2)

            if (lastdistance == -1f || lastdistance < distance) {
                // mParentBinding.speedtxt.text = "0"
                return
            }
            lastdistance = distance


            val currenttime = distance / (globallocation.speed)

            var currenttimesec: Float = 0f
            if (redlighttime != 0 && currenttime < redlighttime / 10) {
                currenttimesec = currenttime + (redlighttime / 10)
            } else currenttimesec = currenttime
            if (greenlighttime != 0 && currenttime > greenlighttime / 10) {
                currenttimesec = currenttime - (greenlighttime / 10)
            } else currenttimesec = currenttime

            var advisespeed = distance / (currenttimesec)

            advisespeed =
                if (speedlimit != -1 && advisespeed > speedlimit) speedlimit.toFloat() else advisespeed

            Log.d(TAG, "distance: ${distance / 1000}")
            Log.d(TAG, "currenttime: $currenttime")
            Log.d(TAG, "expectedtime: $currenttimesec")
            Log.d(TAG, "greelighttime: ${greenlighttime / 10}")
            Log.d(TAG, "distance: ${distance / 1000}")
            Log.d(
                TAG,
                "currentspeed: ${String.format("%.4f", (globallocation.speed * 3.6 * 0.62))}"
            )
            Log.d(
                TAG,
                "advicespeed: ${String.format("%.4f", (Math.abs(advisespeed) * 3.6 * 0.62))}"
            )
            if (lastlocation.latitude != null && currenttimesec != 0f) {
                subscribeBinding.subfragTvDistance.text = String.format("%.1f", (distance / 1000) * 0.62)
                if (advisespeed > 0)
                    subscribeBinding.speedometer.setSpeed(Math.abs(advisespeed) * 3.6 * 0.62, true)
                else if (distance < 0.1)
                    subscribeBinding.speedometer.setSpeed(0.0, true)
            }


        }
    }



/*
    override fun onResume() {
        super.onResume()
        LocalBroadcastManager.getInstance(requireContext()).registerReceiver(
            mMessageReceiver, IntentFilter("GPSLocationUpdates")
        )
    }

    override fun onDestroy() {
        super.onDestroy()
        LocalBroadcastManager.getInstance(requireContext()).unregisterReceiver(
            mMessageReceiver
        )
    }
*/

}

