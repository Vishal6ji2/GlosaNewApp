package com.example.glosanewapp.ui.fragments


import android.Manifest
import android.app.ActivityManager
import android.content.*
import android.content.pm.PackageManager
import android.location.Address
import android.location.Geocoder
import android.location.Location
import android.location.LocationManager
import android.media.MediaPlayer
import android.os.*
import android.provider.Settings
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.databinding.ObservableField
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.glosanewapp.R
import com.example.glosanewapp.databinding.FragmentSubscribeBinding
import com.example.glosanewapp.listeners.SubscriptionDataListener
import com.example.glosanewapp.network.subscription.UserSubscriptionAndDataProvider
import com.example.glosanewapp.services.LatLngService
import com.example.glosanewapp.ui.adapters.SubscriptionDataAdapter
import com.example.glosanewapp.viewmodel.LiveFeedsViewModel
import com.example.glosanewapp.network.UserSession
import com.example.glosanewapp.util.JERDecoderUtils.PSMResponse
import com.example.glosanewapp.viewmodel.SubscriptionFragmentViewModel
import com.example.glosanewapp.viewmodel.TravelModeViewModel
import com.google.android.gms.location.*
import com.google.android.gms.location.Priority
import j2735.dsrc.*
import java.math.BigInteger
import java.util.*
import kotlin.math.abs
import kotlin.math.log10


class SubscribeFragment : Fragment(), SubscriptionDataListener {

    private var redlighttime: Int = 0
    private var greenlighttime: Int = 0
    private var rednexttime: Int = 0
    private var greennexttime: Int = 0
    private var speedlimit: Int = -1
    private var lastdistance: Float = -1f
    private var lastlocation: Location = Location("")

    lateinit var mcontext: Context


    private lateinit var serviceintent: Intent
    var latLngService = LatLngService()


    var redlight: ObservableField<Boolean> = ObservableField(false)

    private lateinit var subscribeBinding: FragmentSubscribeBinding
    private lateinit var fusedLocationProviderClient: FusedLocationProviderClient
    lateinit var mPlayer1: MediaPlayer
    lateinit var vibrator: Vibrator
    lateinit var builder: AlertDialog.Builder
    lateinit var alertDialog: AlertDialog

    lateinit var subscriptionFragmentViewModel: SubscriptionFragmentViewModel

    private lateinit var locationCallback: LocationCallback
    private lateinit var locationRequest: LocationRequest
    private lateinit var globallocation: Location

    private lateinit var subscriptionDataAdapter: SubscriptionDataAdapter


    private lateinit var mSubscriptionProvider: UserSubscriptionAndDataProvider
    private var subscribeData: ArrayList<LiveFeedsViewModel>? = null

    lateinit var userSession: UserSession


    val mMessageReceiver: BroadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent) {
            // Get extra data included in the Intent

            if (redlighttime >= 0)
                redlighttime = redlighttime - 10
            if (greenlighttime >= 0)
                greenlighttime = greenlighttime - 10
            globallocation = intent.getParcelableExtra("location") ?: Location("")

            subscribeBinding.subfragTvTimechange.text =
                if (subscriptionFragmentViewModel.redlight.get() == true) "${redlighttime / 10}+\nSeconds to green" else "${greenlighttime / 10}+\nSeconds to red"

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

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mcontext = context
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
/*
        if (isServiceAlive(LatLngService::class.java)){
            mcontext.stopService(Intent(requireContext(), LatLngService::class.java))
            Toast.makeText(requireContext(),"service stopped", Toast.LENGTH_SHORT).show()
        }
*/

        subscribeBinding = FragmentSubscribeBinding.inflate(inflater)

        subscriptionFragmentViewModel = ViewModelProvider(this)[SubscriptionFragmentViewModel::class.java]
        subscribeBinding.viewmodel = subscriptionFragmentViewModel
        subscribeBinding.executePendingBindings()

        subscribeBinding.lifecycleOwner = this
        // DataBindingUtil.inflate(inflater, R.layout.fragment_subscribe, container, false)

        fusedLocationProviderClient =
            LocationServices.getFusedLocationProviderClient(requireContext())

        getCurrentLocation()

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
                    getCurrentAddress(location)
                }
            }
        }


        if (!isServiceAlive(LatLngService::class.java)) {
//            Toast.makeText(requireContext(),"service started", Toast.LENGTH_SHORT).show()
            startBackgroundService()
        }

        return subscribeBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        subscriptionFragmentViewModel = ViewModelProvider(this)[SubscriptionFragmentViewModel::class.java]
        subscribeBinding.viewmodel = subscriptionFragmentViewModel
        subscribeBinding.executePendingBindings()

//        getCurrentLocation()
        mPlayer1 = MediaPlayer.create(requireContext(), R.raw.sos_sound)

        vibrator =
            requireContext().getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        builder = AlertDialog.Builder(requireContext())
        alertDialog = builder.create()


        // initialisePresenters()
        userSession = UserSession(requireContext())
        mSubscriptionProvider = UserSubscriptionAndDataProvider(requireContext(), this)
        mSubscriptionProvider.connectClient(this)
        mSubscriptionProvider.getlivedata().observe(viewLifecycleOwner, Observer {
            if (it != null)

                setdataPSM(it)

        })
        mSubscriptionProvider.getlivedataeva().observe(viewLifecycleOwner, Observer {
            if (it != null)

                setdataEVA(it)

        })

        if (userSession.getUserId() != null) {
            Log.d(TAG, "onViewCreated: ${userSession.getUserId()}")
            subscribeBinding.subfragTvId.text =
                "ID: " + String.format("%08X", userSession.getUserId()!!.toInt())
        }

        subscribeData = ArrayList<LiveFeedsViewModel>()
        subscriptionDataAdapter = SubscriptionDataAdapter(
            requireContext(),
            subscribeData as ArrayList<LiveFeedsViewModel>
        )
        subscribeBinding.subfragRecyclerview.layoutManager = LinearLayoutManager(requireContext())
        subscribeBinding.subfragRecyclerview.adapter = subscriptionDataAdapter

    }

    // Starting Background Service
    private fun startBackgroundService() {

        latLngService = LatLngService()
        serviceintent = Intent(requireContext(), latLngService.javaClass)
        serviceintent.setPackage(requireContext().packageName)
        requireContext().startService(serviceintent)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("#########", "onDestroyView: ")
        LocalBroadcastManager.getInstance(requireContext()).unregisterReceiver(
            mMessageReceiver
        )
        mSubscriptionProvider.disconnectConnection()
        requireContext().stopService(Intent(requireContext(), LatLngService::class.java))
        fusedLocationProviderClient.removeLocationUpdates(locationCallback)
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


    private fun setdatabsm(bsm: BasicSafetyMessage) {
        val latitude = bsm.coreData.lat.intValue()
        val longitude = bsm.coreData._long.intValue()
        val geocoder = Geocoder(requireContext(), Locale.getDefault())
        val addresses: List<Address>?
        val address: Address
        var fulladdress = ""
        Log.d(TAG, "getPedestrianAddress: $latitude, $longitude")
        val latdouble =
            if (((Math.log10(latitude.toDouble()) + 1).toInt()) == 10) latitude.toDouble() / 100000000 else latitude.toDouble() / 10000000
        val lngdouble =
            if (((Math.log10(longitude.toDouble()) + 1).toInt()) == 10) longitude.toDouble() / 100000000 else longitude.toDouble() / 10000000
        var oldresult = ""
        if (Build.VERSION.SDK_INT >= 33) {
/*geocoder.getFromLocation(latdouble, lngdouble, 1) {
// fulladdress = it.get(0).getAddressLine(0)
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
// oldresult = oldresult + new
// runOnUiThread {
// mParentBinding.listDataMainLayout.text = oldresult
// }
}*/
        } else {
            try {

                addresses = geocoder.getFromLocation(latdouble, lngdouble, 1)
                if (addresses != null) {
                    if (addresses.isNotEmpty()) {
                        address = addresses[0]
// If any additional address line present than only, check with max available address lines by getMaxAddressLineIndex
// fulladdress = address.getAddressLine(0)
// Only if available else return NULL
                        val city = address.locality
                        var state = address.adminArea
                        var country = address.countryName
                        var postalCode = address.postalCode
                        val premises = address.premises
                        val throughtfare = address.thoroughfare
                        val knownName = address.featureName
                        val localarea = " ${address.subLocality}"
                        val
                        fulladdress = "($latdouble, $lngdouble), $localarea, $city"
                        Log.d(TAG, "getPedestrianAddress: $fulladdress")
                        var check = false
                        for (item in subscribeData!!.indices) {
                            Log.d(TAG, "ids: ${subscribeData!![item].id}")
                            if (subscribeData!![item].id?.equals(
                                    BigInteger(
                                        1,
                                        bsm.coreData.id.byteArrayValue()
                                    ).toInt()
                                ) == true
                            ) {
                                var model = LiveFeedsViewModel()
                                model.latitude = latdouble.toString()
                                model.longitude = lngdouble.toString()
                                model.speed = bsm.coreData.speed.intValue().toString()
                                model.direction = bsm.coreData.heading.intValue().toString()
                                model.streetName = "$premises,$localarea,$city"
                                model.id = BigInteger(1, bsm.coreData.id.byteArrayValue()).toInt()
                                model.type = "bsm"
                                subscribeData!![item] = model
                                check = true
                            }
                        }
                        if (!check) {
                            subscribeData?.add(LiveFeedsViewModel().apply {
                                this.latitude = latdouble.toString()
                                this.longitude = lngdouble.toString()
                                this.speed = bsm.coreData.speed.intValue().toString()
                                this.direction = bsm.coreData.heading.intValue().toString()
                                this.streetName = "$premises,$localarea,$city"
                                this.type = "bsm"
                                this.id = BigInteger(1, bsm.coreData.id.byteArrayValue()).toInt()
                            })
                        }
                        subscribeData?.let { subscriptionDataAdapter.refreshAdapter(it) }
                    } else {
                        fulladdress = "Location not found"
                    }
                } else {
                    fulladdress = "Location not found"
                }
            }catch (e: Exception){
                e.printStackTrace()
            }
        }
    }

    private fun setdataEVA(eva: EmergencyVehicleAlert) {
        val latitude = eva.rsaMsg.position.lat.intValue()
        val longitude = eva.rsaMsg.position._long.intValue()
        val geocoder = Geocoder(requireContext(), Locale.getDefault())
        val addresses: List<Address>?
        val address: Address
        var fulladdress = ""
        Log.d(TAG, "getEmergencyVehicleAddress: $latitude, $longitude")
        val latdouble =
            if (((log10(latitude.toDouble()) + 1).toInt()) == 10) latitude.toDouble() / 100000000 else latitude.toDouble() / 10000000
        val lngdouble =
            if (((log10(longitude.toDouble()) + 1).toInt()) == 10) longitude.toDouble() / 100000000 else longitude.toDouble() / 10000000

        if (Build.VERSION.SDK_INT >= 33) {
        } else {
            try {

                addresses = geocoder.getFromLocation(latdouble, lngdouble, 1)
                if (addresses != null) {
                    if (addresses.isNotEmpty()) {
                        address = addresses[0]
// If any additional address line present than only, check with max available address lines by getMaxAddressLineIndex
// fulladdress = address.getAddressLine(0)
// Only if available else return NULL
                        var city = address.locality
                        var state = address.adminArea
                        var premises = address.premises
                        var subadminarea = address.subAdminArea
                        var sublocality = address.subLocality
                        var subthroughfare = address.subThoroughfare
                        var country = address.countryName
                        var postalCode = address.postalCode
                        var knownName = address.featureName
                        var localarea = address.subLocality
                        fulladdress = "($latdouble, $lngdouble), $localarea, $city"
                        Log.d(TAG, "getPedestrianAddress: $fulladdress")
                        var check = false
                        val dellist: ArrayList<Int> = ArrayList()
                        for (item in subscribeData!!.indices) {
                            //Log.d(TAG, "ids: ${subscribeData!![item].id}")
                            if(System.currentTimeMillis()-subscribeData!![item].datatime>=10000){
                                dellist.add(item)
                                check=true
                            }
                            if (subscribeData!![item].id?.equals(
                                    BigInteger(
                                        1,
                                        eva.id.byteArrayValue()
                                    ).toInt()
                                ) == true
                            ) {

                                val model = LiveFeedsViewModel()
                                model.latitude = latdouble.toString()
                                model.longitude = lngdouble.toString()
                                model.speed = eva.rsaMsg.position.speed.speed.intValue().toString() + "mph"
                                model.direction = eva.rsaMsg.position.heading.intValue()
                                    .toString() + "°" + getDirections(eva.rsaMsg.position.heading.intValue())
                                if (knownName == null) knownName = ""
                                if (localarea == null) localarea = ""
                                if (city == null) city = ""
                                model.streetName = "$knownName $localarea $city"
                                model.id = BigInteger(1, eva.id.byteArrayValue()).toInt()
                                model.type = "eva"
                                var loc2 = Location("")
                                loc2.latitude = globallocation.latitude
                                loc2.longitude = globallocation.longitude
                                var loc1 = Location("")
                                loc1.latitude =
                                    if (((Math.log10(model.latitude!!.toDouble()) + 1).toInt()) == 10)  model.latitude!!.toDouble() / 100000000 else  model.latitude!!.toDouble() / 10000000
                                loc1.longitude =
                                    if (((Math.log10( model.longitude!!.toDouble()) + 1).toInt()) == 10)  model.longitude!!.toDouble() / 100000000 else  model.longitude!!.toDouble() / 10000000
                                val distance = loc1.distanceTo(loc2)
                                model.distance=distance.toInt()
                                model.datatime=System.currentTimeMillis()
                                subscribeData!![item] = model
                                check = true
                            }
                        }
                        for(item2 in dellist){
                            subscribeData!!.removeAt(item2)
                        }
                        if (!check) {
                            subscribeData?.add(LiveFeedsViewModel().apply {
                                this.latitude = latdouble.toString()
                                this.longitude = lngdouble.toString()
                                this.speed = eva.rsaMsg.position.speed.speed.intValue().toString() + "mph"
                                this.direction = eva.rsaMsg.position.heading.intValue()
                                    .toString() + "°" + getDirections(eva.rsaMsg.position.heading.intValue())
                                if (knownName == null) knownName = ""
                                if (localarea == null) localarea = ""
                                if (city == null) city = ""
                                this.streetName = "$knownName $localarea $city"
                                this.type = "eva"
                                var loc2 = Location("")
                                loc2.latitude = globallocation.latitude
                                loc2.longitude = globallocation.longitude
                                var loc1 = Location("")
                                loc1.latitude =
                                    if (((Math.log10(this.latitude!!.toDouble()) + 1).toInt()) == 10)  this.latitude!!.toDouble() / 100000000 else  this.latitude!!.toDouble() / 10000000
                                loc1.longitude =
                                    if (((Math.log10( this.longitude!!.toDouble()) + 1).toInt()) == 10)  this.longitude!!.toDouble() / 100000000 else  this.longitude!!.toDouble() / 10000000
                                val distance = loc1.distanceTo(loc2)
                                this.distance=distance.toInt()
                                this.datatime=System.currentTimeMillis()
                                this.id = BigInteger(1, eva.id.byteArrayValue()).toInt()
                                Log.d(TAG, "setdata: ${BigInteger(1, eva.id.byteArrayValue())}")
                            })
                        }
                        subscribeData!!.sortWith { s1, s2 ->
                            s1.distance.compareTo(s2.distance)
                        }
                        subscribeData?.let { subscriptionDataAdapter.refreshAdapter(it) }
                    } else {
                        fulladdress = "Location not found"
                    }
                } else {
                    fulladdress = "Location not found"
                }
            }catch (e: Exception){
                e.printStackTrace()
            }
        }
    }

    fun getDirections(mAzimuth: Int): String{
        var where = ""
        if (mAzimuth !in 11..349) where = "N"
        if (mAzimuth in 281..349) where = "NW"
        if (mAzimuth in 261..280) where = "W"
        if (mAzimuth in 191..260) where = "SW"
        if (mAzimuth in 171..190) where = "S"
        if (mAzimuth in 101..170) where = "SE"
        if (mAzimuth in 81..100) where = "E"
        if (mAzimuth in 11..80) where = "NE"

        return where
    }

    private fun setdataPSM(psm: PersonalSafetyMessage) {
        val latitude = psm.position.lat.intValue()
        val longitude = psm.position._long.intValue()
        val geocoder = Geocoder(requireContext(), Locale.getDefault())
        val addresses: List<Address>?
        val address: Address
        var fulladdress = ""
        Log.d(TAG, "getPedestrianAddress: $latitude, $longitude")
        val latdouble =
            if (((log10(latitude.toDouble()) + 1).toInt()) == 10) latitude.toDouble() / 100000000 else latitude.toDouble() / 10000000
        val lngdouble =
            if (((log10(longitude.toDouble()) + 1).toInt()) == 10) longitude.toDouble() / 100000000 else longitude.toDouble() / 10000000
        var oldresult = ""
        if (Build.VERSION.SDK_INT >= 33) {
        } else {
            try {
                addresses = geocoder.getFromLocation(latdouble, lngdouble, 1)
                if (addresses != null) {
                    if (addresses.isNotEmpty()) {
                        address = addresses[0]
// If any additional address line present than only, check with max available address lines by getMaxAddressLineIndex
// fulladdress = address.getAddressLine(0)
// Only if available else return NULL
                        var city = address.locality
                        var state = address.adminArea
                        var premises = address.premises
                        var subadminarea = address.subAdminArea
                        var sublocality = address.subLocality
                        var subthroughfare = address.subThoroughfare
                        var country = address.countryName
                        var postalCode = address.postalCode
                        var knownName = address.featureName
                        var localarea = address.subLocality
                        fulladdress = "($latdouble, $lngdouble), $localarea, $city"
                        Log.d(TAG, "getPedestrianAddress: $fulladdress")
                        var check = false
                        val dellist: ArrayList<Int> = ArrayList()
                        for (item in subscribeData!!.indices) {
                            //Log.d(TAG, "ids: ${subscribeData!![item].id}")
                            if(System.currentTimeMillis()-subscribeData!![item].datatime>=10000){
                                dellist.add(item)
                                check=true
                            }
                            if (subscribeData!![item].id?.equals(
                                    BigInteger(
                                        1,
                                        psm.id.byteArrayValue()
                                    ).toInt()
                                ) == true
                            ) {
                                val model = LiveFeedsViewModel()
                                model.latitude = latdouble.toString()
                                model.longitude = lngdouble.toString()
                                model.speed = psm.speed.intValue().toString() + "mph"
                                model.direction = psm.heading.intValue()
                                    .toString() + "°" + getDirections(psm.heading.intValue())
                                if (knownName == null) knownName = ""
                                if (localarea == null) localarea = ""
                                if (city == null) city = ""
                                model.streetName = "$knownName $localarea $city"

                                model.id = BigInteger(1, psm.id.byteArrayValue()).toInt()
                                model.type = "psm"
                                var loc2 = Location("")
                                loc2.latitude = globallocation.latitude
                                loc2.longitude = globallocation.longitude
                                var loc1 = Location("")
                                loc1.latitude =
                                    if (((Math.log10(model.latitude!!.toDouble()) + 1).toInt()) == 10)  model.latitude!!.toDouble() / 100000000 else  model.latitude!!.toDouble() / 10000000
                                loc1.longitude =
                                    if (((Math.log10( model.longitude!!.toDouble()) + 1).toInt()) == 10)  model.longitude!!.toDouble() / 100000000 else  model.longitude!!.toDouble() / 10000000
                                val distance = loc1.distanceTo(loc2)
                                model.distance=distance.toInt()
                                model.datatime=System.currentTimeMillis()
                                subscribeData!![item] = model
                                check = true
                            }
                        }
                        for(item2 in dellist){
                            subscribeData!!.removeAt(item2)
                        }
                        if (!check) {
                            subscribeData?.add(LiveFeedsViewModel().apply {
                                this.latitude = latdouble.toString()
                                this.longitude = lngdouble.toString()
                                this.speed = psm.speed.intValue().toString() + "mph"
                                this.direction = psm.heading.intValue()
                                    .toString() + "°" + getDirections(psm.heading.intValue())
                                if (knownName == null) knownName = ""
                                if (localarea == null) localarea = ""
                                if (city == null) city = ""
                                this.streetName = "$knownName $localarea $city"
                                this.type = "psm"
                                this.datatime=System.currentTimeMillis()
                                this.id = BigInteger(1, psm.id.byteArrayValue()).toInt()
                                Log.d(TAG, "setdata: ${BigInteger(1, psm.id.byteArrayValue())}")
                            })
                        }
                        subscribeData!!.sortWith { s1, s2 ->
                            s1.distance.compareTo(s2.distance)
                        }
                        subscribeData?.let { subscriptionDataAdapter.refreshAdapter(it) }
                    } else {
                        fulladdress = "Location not found"
                    }
                } else {
                    fulladdress = "Location not found"
                }
            }catch (exception: Exception){
                exception.printStackTrace()
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
            handler.postDelayed({ // Do something after 3s = 3000ms
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


    override fun notifyDataReceived(isPublisherData: Boolean, dataDispatchedTime: String) {
        Log.d(TAG, isPublisherData.toString())
    }


    fun updatelight(b: Boolean, name: String) {
        subscriptionFragmentViewModel.redlight.set(b)
        subscriptionFragmentViewModel.greenlight.set(!b)
        subscribeBinding.signalName.text = name
    }

    fun savetime(b: Boolean, minEndTime: TimeMark?, nexttime: TimeMark?, speed: SpeedAdvice) {
        speedlimit = speed.intValue()
        subscribeBinding.speedlimit.text =
            "Speed limit : ${String.format("%.1f", (speedlimit * 3.6 * 0.62))}" + "mph"
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
            loc1.latitude =
                if (((Math.log10(lat.toDouble()) + 1).toInt()) == 10) lat.toDouble() / 100000000 else lat.toDouble() / 10000000
            loc1.longitude =
                if (((Math.log10(_long.toDouble()) + 1).toInt()) == 10) _long.toDouble() / 100000000 else _long.toDouble() / 10000000
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
            subscribeBinding.subfragTvTimechange.text =
                if (subscriptionFragmentViewModel.redlight.get() == true) "${redlighttime / 10}+\nSeconds to green" else "${greenlighttime / 10}+\nSeconds to red"
            subscribeBinding.subfragTvDistance.text =
                String.format("%.1f", (distance / 1000) * 0.62) + "miles"
            if (advisespeed > 0) {
                subscribeBinding.speed.text = "${(abs(advisespeed) * 3.6 * 0.62).toInt()} mph"
                subscribeBinding.speedometer.setSpeed(abs(advisespeed) * 3.6 * 0.62, true)
            }
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
                subscribeBinding.subfragTvDistance.text =
                    String.format("%.1f", (distance / 1000) * 0.62) + "miles"
                if (advisespeed > 0) {
                    subscribeBinding.speed.text =
                        "${(Math.abs(advisespeed) * 3.6 * 0.62).toInt()} mph"
                    subscribeBinding.speedometer.setSpeed(Math.abs(advisespeed) * 3.6 * 0.62, true)
                } else if (distance < 0.1) {
                    subscribeBinding.speedometer.setSpeed(0.0, true)
                    subscribeBinding.speed.text = "0 mph"
                }
            }


        }
    }

    override fun onResume() {
        super.onResume()
        LocalBroadcastManager.getInstance(requireContext()).registerReceiver(
            mMessageReceiver, IntentFilter("GPSLocationUpdates")
        )
    }

    override fun onDestroy() {
        super.onDestroy()

    }

    private fun getCurrentLocation() {
        if (checkPermissions()) {

            if (isLocationEnabled()) {

                if (ActivityCompat.checkSelfPermission(
                        requireContext(),
                        Manifest.permission.ACCESS_FINE_LOCATION
                    ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                        requireContext(),
                        Manifest.permission.ACCESS_COARSE_LOCATION
                    ) != PackageManager.PERMISSION_GRANTED
                ) {
                    requestPermission()
                    return
                }
                fusedLocationProviderClient.lastLocation.addOnCompleteListener(requireActivity()) { taskId ->
                    val location: Location? = taskId.result
                    if (location == null) {
//                        Toast.makeText(mcontext, "Not Received", Toast.LENGTH_SHORT).show()
                        getLocationUpdates()

                    } else {
                        getLocationUpdates()
                    }
                }

            } else {
                //setting open here
//                Toast.makeText(requireContext(), "Turn on Location", Toast.LENGTH_SHORT).show()
                val intent = Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS)
                startActivity(intent)
            }
        } else {

            //request permission here
            requestPermission()
        }
    }

    private fun requestPermission() {
        requestPermissions(
            arrayOf(
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.ACCESS_COARSE_LOCATION
            ),
            PERMISSION_REQUEST_ACCESS_LOCATION
        )
    }

    companion object {
        const val PERMISSION_REQUEST_ACCESS_LOCATION = 100
        const val TAG = "SubscribeFragment"
    }

    private fun checkPermissions(): Boolean {
        if (ActivityCompat.checkSelfPermission(
                requireContext(),
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) == PackageManager.PERMISSION_GRANTED
            && ActivityCompat.checkSelfPermission(
                requireContext(),
                Manifest.permission.ACCESS_FINE_LOCATION
            ) == PackageManager.PERMISSION_GRANTED
        ) {

            return true
        }
        return false
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == PERMISSION_REQUEST_ACCESS_LOCATION) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                Toast.makeText(requireContext(), "Granted", Toast.LENGTH_SHORT).show()
                getCurrentLocation()
            } else {
                Toast.makeText(requireContext(), "Permission Denied", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun isLocationEnabled(): Boolean {

        val locationManager: LocationManager = requireActivity().getSystemService(AppCompatActivity.LOCATION_SERVICE) as LocationManager

        return locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER) ||
                locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER)
    }

    private fun getLocationUpdates() {

        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(requireContext())

        if (ActivityCompat.checkSelfPermission(
                requireContext(),
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                requireContext(),
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            requestPermission()
            return
        }
        fusedLocationProviderClient.requestLocationUpdates(
            locationRequest,
            locationCallback,
            Looper.getMainLooper()
        )
    }

    fun getCurrentAddress(location: Location) {
        val geocoder = Geocoder(mcontext, Locale.getDefault())
        val addresses: List<Address>?
        val address: Address?
        var fulladdress = ""
        try {


            /*   if (Build.VERSION.SDK_INT >= 33) {
                   geocoder.getFromLocation(location.latitude, location.longitude, 1) {
                       fulladdress = it.get(0).getAddressLine(0)
                       activitySecondBinding.secondTvAddress.text = fulladdress
                   }
               } else {*/
            addresses = geocoder.getFromLocation(location.latitude, location.longitude, 1)
            if (addresses != null) {
                if (addresses.isNotEmpty()) {
                    address = addresses[0]
                    // If any additional address line present than only, check with max available address lines by getMaxAddressLineIndex
                    fulladdress = address.getAddressLine(0)
                    // Only if available else return NULL
                    var city = address.getLocality()
                    var state = address.getAdminArea()
                    var country = address.getCountryName()
                    var postalCode = address.getPostalCode()
                    var knownName = address.getFeatureName()
                    subscribeBinding.tvCurrcity.text = city

                } else {
                    fulladdress = "Unknown city"
                    subscribeBinding.tvCurrcity.text = fulladdress
                }
            } else {
                fulladdress = "Unknown city"
                subscribeBinding.tvCurrcity.text = fulladdress
            }
            // }
        } catch (ex: Exception) {

            ex.printStackTrace()
        }
    }



}

