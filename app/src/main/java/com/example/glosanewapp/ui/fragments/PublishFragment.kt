package com.example.glosanewapp.ui.fragments

import android.Manifest
import android.app.ActivityManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.pm.PackageManager
import android.content.res.Resources
import android.location.Address
import android.location.Geocoder
import android.location.Location
import android.location.LocationManager
import android.os.Build
import android.os.Bundle
import android.os.Looper
import android.provider.Settings
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.glosanewapp.R
import com.example.glosanewapp.databinding.FragmentPublishBinding
import com.example.glosanewapp.network.UserSession
import com.example.glosanewapp.network.model.MqttUtils
import com.example.glosanewapp.network.model.TravelMode
import com.example.glosanewapp.services.LatLngService
import com.example.glosanewapp.ui.adapters.TravelModeAdapter
import com.example.glosanewapp.util.*
import com.example.glosanewapp.util.JERDecoderUtils.BSMResponse
import com.example.glosanewapp.util.JERDecoderUtils.EVAResponse
import com.example.glosanewapp.util.JERDecoderUtils.PSMResponse
import com.example.glosanewapp.util.JERDecoderUtils.RSAResponse
import com.example.glosanewapp.util.protobuf.RoutedMsgOuterClass
import com.example.glosanewapp.util.uihelper.ArcLayoutManager
import com.example.glosanewapp.util.uihelper.CircleScaleLayoutManager
import com.example.glosanewapp.viewmodel.TravelModeViewModel
import com.google.android.gms.location.*
import com.google.gson.Gson
import com.google.protobuf.ByteString
import com.google.protobuf.Timestamp
import info.mqtt.android.service.MqttAndroidClient
import j2735.dsrc.Heading
import j2735.dsrc.Latitude
import j2735.dsrc.Longitude
import j2735.dsrc.Speed
import org.eclipse.paho.client.mqttv3.*
import java.nio.ByteBuffer
import java.util.*
import kotlin.math.abs

class PublishFragment : Fragment() {

    private val pub_topic = "VZCV2X/3/IN"
    private val qos = 1

    lateinit var mcontext: Context
    private var gson: Gson = Gson()

    var pos = 0

    private lateinit var fusedLocationProviderClient: FusedLocationProviderClient
    private lateinit var locationCallback: LocationCallback
    private lateinit var locationRequest: LocationRequest


    lateinit var client: MqttAndroidClient

    var travelModeViewModel: TravelModeViewModel? = null
    private var travelModeAdapter: TravelModeAdapter? = null


//    var publishFragmentViewModel: PublishFragmentViewModel? = null


    var heading: Int = 0

    private lateinit var userSession: UserSession

    private lateinit var serviceintent: Intent
    var latLngService = LatLngService()

    private val TAG = "PublishFragment"

    private lateinit var publishBinding: FragmentPublishBinding


    private lateinit var globallocation: Location


    private val mMessageReceiver: BroadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent) {
            // Get extra data included in the Intent
            globallocation = intent.getParcelableExtra("location") ?: Location("")
            heading = intent.getIntExtra("heading", 0)
            var latitude = globallocation.latitude
            var longitude = globallocation.longitude


            val mlatitude = Latitude()
            latitude = if (abs(latitude) >= 100) latitude * 100000000 else latitude * 10000000
            mlatitude.setValue((latitude).toLong().toInt())
            val mlongitude = Longitude()
            longitude = if (abs(longitude) >= 100) longitude * 100000000 else longitude * 10000000
            mlongitude.setValue((longitude).toLong().toInt())
            val mheading = Heading()
            mheading.setValue(heading)
            val mspeed = Speed()
            mspeed.setValue(globallocation.speed.toInt())

            userSession.getUserId()?.let {
                if (publishBinding.pubfragSwLocation.isChecked && pos == 0) {
                    if (!isServiceAlive(LatLngService::class.java))
                        startBackgroundService()
                    callpublishPSM(
                        mlatitude,
                        mlongitude,
                        mheading,
                        mspeed,
                        userSession.getUserId()?.toInt() ?: 0
                    )
//                publishSPAT(userSession.getUserId()!!.toInt())

//                publishMapData(userSession.getUserId()!!.toInt())

                } else if (publishBinding.pubfragSwLocation.isChecked && pos == 2) {
                    if (!isServiceAlive(LatLngService::class.java))
                        startBackgroundService()
                    publishEVAMessage(
                        mlatitude,
                        mlongitude,
                        mspeed,
                        mheading,
                        userSession.getUserId()!!.toInt(),
                    )

                } else if (publishBinding.pubfragSwLocation.isChecked && pos == 1) {
                    if (!isServiceAlive(LatLngService::class.java))
                        startBackgroundService()
                    callpublishBSM(
                        mlatitude,
                        mlongitude,
                        mheading,
                        mspeed,
                        userSession.getUserId()!!.toInt()
                    )

                }
            }
        }

    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        mcontext = context
    }
/*

    // method for publishing MAP
    private fun publishMapData(registeredId: Int) {
        try {
            val routedMsg = RoutedMsgOuterClass.RoutedMsg.newBuilder()
                .setTime(Timestamp.newBuilder().build())
                .setMsgBytes(
                    ByteString.copyFrom(
                        MAPDATAUPEREncoder().mapMessage
                    )
                )
                .build()
            Log.d(
                TAG,
                "publishMAPMessage: /SW/NA/VZ/$registeredId/UPER/MAP"
            )

            client.publish(
                "$pub_topic/SW/NA/VZ/$registeredId/UPER/MAP",
                routedMsg.toByteArray(),
                qos,
                false

            )
        } catch (e: Exception) {
            Log.d(TAG, "Publishing MAP: MqttException " + e.message)
            e.printStackTrace()
        }
    }
*/

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        publishBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_publish, container, false)

        userSession = UserSession(mcontext)

        client = MqttAndroidClient(
            mcontext,
            MqttUtils().getMqttUrl(),
            userSession.getUserId().toString()
        )
//        publishFragmentViewModel = ViewModelProvider(this)[PublishFragmentViewModel::class.java]

        /*publishBinding.viewmodel = publishFragmentViewModel
        publishBinding.executePendingBindings()*/

        // bind RecyclerView

        fusedLocationProviderClient =
            LocationServices.getFusedLocationProviderClient(requireContext())

        getCurrentLocation()

        locationRequest = LocationRequest.create().apply {
            interval = 1000
            fastestInterval = 1000
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

        initRecyclerView()

        publishBinding.pubfragSwLocation.setOnCheckedChangeListener { _, isChecked ->
            val message = if (isChecked) "Sharing On " else "Sharing Off"

            if (isChecked) {

//                Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()

                startBackgroundService()

            } else {

                requireContext().stopService(Intent(requireContext(), LatLngService::class.java))

//                Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
            }
        }

        publishBinding.pubfragSwBroadcast.setOnClickListener {

            if (publishBinding.pubfragSwBroadcast.isChecked && pos == 2 && this::globallocation.isInitialized) {
                // send rsa data
                val mlatitude = Latitude()
                mlatitude.setValue((globallocation.latitude * 10000000).toLong().toInt())
                val mlongitude = Longitude()
                mlongitude.setValue((globallocation.longitude * 10000000).toLong().toInt())
                val mheading = Heading()
                mheading.setValue(heading)
                val mspeed = Speed()
                mspeed.setValue(globallocation.speed.toInt())

                publishRSAMessage(
                    mlatitude,
                    mlongitude,
                    mspeed,
                    mheading,
                    userSession.getUserId()!!.toInt()
                )
//                Toast.makeText(requireContext(), "RSA published", Toast.LENGTH_SHORT).show()
            }
        }


        return publishBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (client.isConnected)
            client.disconnect()
        connectMQTT(userSession.getUserId().toString())
    }


    private fun getcurrLocation(location: Location): String {

        val geocoder = Geocoder(requireContext(), Locale.getDefault())
        val addresses: List<Address>?
        val address: Address
        var fulladdress = ""

        var oldresult = ""
        if (Build.VERSION.SDK_INT >= 33) {
            /*       geocoder.getFromLocation(globallocation.latitude, globallocation.longitude, 1) {
    //                fulladdress = it.get(0).getAddressLine(0)
                    address = it[0]
                    val city = address.locality
                    val state = address.adminArea
                    var country = address.countryName
                    var postalCode = address.postalCode
                    var knownName = address.featureName
                    val localarea = " ${address.subLocality}"

                    fulladdress =
                        "(" + globallocation.latitude + ", " + globallocation.longitude + "), " + localarea + ", " + city + ", " + state
                    Log.d(
                        TAG,
                        "getPedestrianAddress: ${address.locality} ${address.subLocality} ${address.adminArea} ${address.subAdminArea} ${address.thoroughfare} ${address.subThoroughfare} ${address.featureName} ${address.premises}"
                    )

                }
                publishBinding.tvCurraddress.text = fulladdress*/
        } else {

            try {


                addresses = geocoder.getFromLocation(location.latitude, location.longitude, 1)

                if (addresses != null) {
                    if (addresses.isNotEmpty()) {
                        address = addresses[0]
                        // If any additional address line present than only, check with max available address lines by getMaxAddressLineIndex
                        fulladdress = address.getAddressLine(0)
                        // Only if available else return NULL
                        val city = address.locality
                        var state = address.adminArea
                        var country = address.countryName
                        var postalCode = address.postalCode
                        var knownName = address.featureName
                        val localarea = " ${address.subLocality}"

//                    fulladdress = "$knownName, $localarea, $city"
                        Log.d(TAG, "getPedestrianAddress: $fulladdress")
                        publishBinding.tvCurraddress.text = fulladdress

                    } else {
                        fulladdress = "Location not found"
                        publishBinding.tvCurraddress.text = fulladdress
                    }
                } else {
                    fulladdress = "Location not found"
                    publishBinding.tvCurraddress.text = fulladdress
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        return fulladdress
    }


    // Modes set to Recyclerview
    private fun initRecyclerView() {

        travelModeViewModel = ViewModelProvider(this)[TravelModeViewModel::class.java]

        val recyclerView = publishBinding.pubfragRecyclerview
        travelModeAdapter = TravelModeAdapter()
        travelModeViewModel?.allTravelData?.let { travelModeAdapter?.setDeveloperList(it) }
        recyclerView.adapter = travelModeAdapter



        val layoutManager=CircleScaleLayoutManager(requireContext())
        layoutManager.radius = 900
        layoutManager.angleInterval = 55
        recyclerView.layoutManager = layoutManager
       // recyclerView.layoutManager = ScaleLayoutManager(requireContext(),10)
       // recyclerView.layoutManager = ArcLayoutManager(requireContext(),200)
        //recyclerView.itemAnimator = DefaultItemAnimator()


        //init the Custom adapter

        //set the CustomAdapter

        /*  recyclerView.set3DItem(true)
          recyclerView.setFlat(true)*/


        val snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(recyclerView)

        recyclerView.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
                if (newState == RecyclerView.SCROLL_STATE_IDLE) {
                     pos = layoutManager.findLastVisibleItemPosition()

                    if (pos == 0) {
                        "Pedestrian".also { publishBinding.pubfragTvSelectedmode.text = it }
                        publishBinding.pubfragSwBroadcast.isEnabled = false
                        publishBinding.pubfragSwBroadcast.setTextColor(
                            ContextCompat.getColor(
                                requireContext(),
                                android.R.color.tab_indicator_text
                            )
                        )

                    } else if (pos == 1) {
                        "General Vehicle".also { publishBinding.pubfragTvSelectedmode.text = it }
                        publishBinding.pubfragSwBroadcast.isEnabled = false
                        publishBinding.pubfragSwBroadcast.setTextColor(
                            ContextCompat.getColor(
                                requireContext(),
                                android.R.color.tab_indicator_text
                            )
                        )

                    } else if (pos == 2) {
                        "Emergency Vehicle".also { publishBinding.pubfragTvSelectedmode.text = it }
                        publishBinding.pubfragSwBroadcast.isEnabled = true
                        publishBinding.pubfragSwBroadcast.setTextColor(
                            ContextCompat.getColor(
                                requireContext(),
                                R.color.black
                            )
                        )

                    }
                }
            }
        })




        //getAllMode()

    }


    // list of modes(Pedestrian, General Vehicle, Emergency Vehicle)
    private fun getAllMode() {

        travelModeViewModel!!.allTravelMode.observe(requireActivity()) { travelmode ->
            ///if any thing change the update the UI
            travelModeAdapter?.setDeveloperList(travelmode as ArrayList<TravelMode>)

        }
    }

    // method for publishing PSM
    fun callpublishPSM(
        mlatitude: Latitude,
        mlontitude: Longitude,
        mheading: Heading,
        mspeed: Speed,
        registeredId: Int
    ) {

        val bb: ByteBuffer = ByteBuffer.allocate(4)
        bb.putInt(registeredId)
        publishPSMMessage(
            mlatitude,
            mlontitude,
            mspeed,
            mheading,
            registeredId.toString(),
            bb.array()
        )

    }

    fun createPSMdata(
        latitude: Latitude,
        longitude: Longitude,
        speed: Speed,
        heading: Heading,
        clientid: String
    ): PSMResponse {
        val bb: ByteBuffer = ByteBuffer.allocate(4)
        bb.putInt(clientid.toInt())
        var psmresponse = PSMResponse()
        psmresponse.messageFrame.messageId = 33
        var psm = psmresponse.messageFrame.value.personalSafetyMessage
        psm.msgCnt = 1
        psm.id = String.format("%08X", clientid.toInt())
        psm.secMark = 0
        psm.basicType = PSMResponse.BasicTypevalues.unavailable.toString()
        psm.position.lat = latitude.intValue()
        psm.position.mylong = longitude.intValue()
        psm.speed = speed.intValue()
        psm.heading = heading.intValue()
        psmresponse.messageFrame.value.personalSafetyMessage = psm
        return psmresponse
    }

    fun createEVAData(
        latitude: Latitude,
        longitude: Longitude,
        speed: Speed,
        heading: Heading,
        clientid: String
    ): EVAResponse {
        val bb: ByteBuffer = ByteBuffer.allocate(4)
        bb.putInt(clientid.toInt())
        var evaresponse = EVAResponse()
        evaresponse.messageFrame.messageId = "33"
        var eva = evaresponse.messageFrame.value.emergencyVehicleAlert
        eva.id = String.format("%08X", clientid.toInt())
        eva.rsaMsg.typeEvent = "9729"
        eva.rsaMsg.position.lat = latitude.intValue().toString()
        eva.rsaMsg.position.mylong = longitude.intValue().toString()
        eva.rsaMsg.heading = heading.intValue().toString()
        evaresponse.messageFrame.value.emergencyVehicleAlert = eva
        return evaresponse
    }

    fun createRSAdata(
        latitude: Latitude,
        longitude: Longitude,
        speed: Speed,
        heading: Heading,
        clientid: String
    ): RSAResponse {
        val bb: ByteBuffer = ByteBuffer.allocate(4)
        bb.putInt(clientid.toInt())
        var rsaresponse = RSAResponse()
        rsaresponse.messageFrame.messageId = "33"
        var rsaMsg = rsaresponse.messageFrame.value.roadSideAlert
        rsaMsg.typeEvent = "9729"
        rsaMsg.position.lat = latitude.intValue().toString()
        rsaMsg.position.mylong = longitude.intValue().toString()
        rsaMsg.heading = heading.intValue().toString()
        rsaresponse.messageFrame.value.roadSideAlert = rsaMsg
        return rsaresponse
    }

    fun createBSMData(
        mlatitude: Latitude,
        mlontitude: Longitude,
        mheading: Heading,
        mspeed: Speed,
        vehicleid: Int
    ): BSMResponse {
        val bb: ByteBuffer = ByteBuffer.allocate(4)
        bb.putInt(vehicleid)
        var bsmresponse = BSMResponse()
        bsmresponse.messageFrame.messageId = "20"
        var bsm = bsmresponse.messageFrame.value.basicSafetyMessage
        bsm.coreData.msgCnt = "1"
        bsm.coreData.id = String.format("%08X", vehicleid)
        bsm.coreData.secMark = "19000"
        bsm.coreData.lat = mlatitude.intValue().toString()
        bsm.coreData.mylong = mlontitude.intValue().toString()
        bsm.coreData.elev = "49499"
        var transmap =
            mapOf<BSMResponse.TransmissionValues, String>(BSMResponse.TransmissionValues.neutral to "")
        bsm.coreData.transmission = transmap
        bsm.coreData.speed = mspeed.intValue().toString()
        bsm.coreData.heading = mheading.intValue().toString()
        bsm.coreData.angle = "-74"
        bsm.coreData.accuracy.orientation = "0"
        bsm.coreData.accuracy.semiMajor = "0"
        bsm.coreData.accuracy.semiMinor = "0"
        bsm.coreData.accelSet.lat = "0"
        bsm.coreData.accelSet.lat = "0"
        bsm.coreData.accelSet.mylong = "0"
        bsm.coreData.accelSet.vert = "0"
        bsm.coreData.accelSet.yaw = "0"
        bsm.coreData.brakes.auxBrakes =
            mapOf<BSMResponse.AbsValues, String>(BSMResponse.AbsValues.unavailable to "")
        bsm.coreData.brakes.abs =
            mapOf<BSMResponse.AbsValues, String>(BSMResponse.AbsValues.unavailable to "")
        bsm.coreData.brakes.scs =
            mapOf<BSMResponse.AbsValues, String>(BSMResponse.AbsValues.unavailable to "")
        bsm.coreData.brakes.brakeBoost =
            mapOf<BSMResponse.AbsValues, String>(BSMResponse.AbsValues.unavailable to "")
        bsm.coreData.brakes.traction =
            mapOf<BSMResponse.AbsValues, String>(BSMResponse.AbsValues.unavailable to "")
        bsm.coreData.brakes.wheelBrakes = "10000"
        bsm.coreData.size.length = "2361"
        bsm.coreData.size.width = "130"
        bsmresponse.messageFrame.value.basicSafetyMessage = bsm
        return bsmresponse
    }

    fun publishSPAT(registeredId: Int) {

        val spat = SPATUPEREncoder().spatMessage

        if (spat.isEmpty()) {
            return
        }

        try {
            val routedMsg = RoutedMsgOuterClass.RoutedMsg.newBuilder()
                .setTime(Timestamp.newBuilder().build())
                .setMsgBytes(
                    ByteString.copyFrom(
                        SPATUPEREncoder().spatMessage
                    )
                )
                .build()
            Log.d(
                TAG,
                "publishSPATMessage: $/SW/NA/VZ/$registeredId/UPER/SPAT"
            )

            client.publish(
                "$pub_topic/SW/NA/VZ/$registeredId/UPER/SPAT",
                routedMsg.toByteArray(),
                qos,
                false

            )
        } catch (e: Exception) {
            Log.d(TAG, "Publishing SPAT: MqttException " + e.message)
            e.printStackTrace()
        }

    }

    // method for publishing BSM
    fun callpublishBSM(
        mlatitude: Latitude,
        mlontitude: Longitude,
        mheading: Heading,
        mspeed: Speed,
        registeredId: Int
    ) {

        Log.d(TAG, "callpublish: " + Integer.toOctalString(registeredId))
        val bb: ByteBuffer = ByteBuffer.allocate(4)
        bb.putInt(registeredId)

        val bsm = BSMUPEREncoder().getBSMMessage(
            mlatitude,
            mlontitude,
            mheading,
            mspeed,
            bb.array()
        )
        if (bsm.isEmpty()) {
//            Toast.makeText(requireContext(), "encoded failed", Toast.LENGTH_SHORT).show()
            return
        }
        try {
            val millis = System.currentTimeMillis()
            val timestamp = Timestamp.newBuilder().setSeconds(millis / 1000)
                .setNanos((millis % 1000 * 1000000).toInt()).build()
            val routedMsg = RoutedMsgOuterClass.RoutedMsg.newBuilder()
                .setTime(timestamp)
                .setPosition(
                    RoutedMsgOuterClass.Position.newBuilder()
                        .setLongitude(mlontitude.intValue())
                        .setLatitude(mlatitude.intValue())
                )
                .setMsgBytes(
                    ByteString.copyFrom(
                        bsm
                    )
                )
                .build()
            Log.d(
                TAG,
                "publishBSMMessage: $/$registeredId/UPER/BSM"
            )

            client.publish(
                "$pub_topic/VEH/TRUCK/VZ/$registeredId/UPER/BSM",
                routedMsg.toByteArray(),
                qos,
                false
            )
        } catch (e: Exception) {
            Log.d(TAG, "Publishing BSM: MqttException " + e.message)
            e.printStackTrace()
        }
    }

    // method for publishing RSA
    private fun publishRSAMessage(
        latitude: Latitude,
        longitude: Longitude,
        speed: Speed,
        heading: Heading,
        clientid: Int
    ) {

        val rsa = RSAUPEREncoder().getRSAMessage(
            latitude,
            longitude,
            heading,
            speed
        )
        if (rsa.isEmpty()) {
//            Toast.makeText(requireContext(), "encoded failed", Toast.LENGTH_SHORT).show()
            return
        }


//        Log.d(TAG, "callpublish: "+Integer.toOctalString(clientid))

        val millis = System.currentTimeMillis()
        val timestamp = Timestamp.newBuilder().setSeconds(millis / 1000)
            .setNanos((millis % 1000 * 1000000).toInt()).build()
        try {
            val routedMsg = RoutedMsgOuterClass.RoutedMsg.newBuilder()

                .setTime(timestamp)
                .setPosition(
                    RoutedMsgOuterClass.Position.newBuilder()
                        .setLongitude(longitude.intValue())
                        .setLatitude(latitude.intValue())
                )
                .setMsgBytes(
                    ByteString.copyFrom(
                        rsa
                    )
                )
                .build()

            client.publish(
                "$pub_topic/SW/NA/VZ/$clientid/UPER/RSA",
                routedMsg.toByteArray(),
                qos,
                false
            )

        } catch (e: Exception) {
            Log.d(TAG, "Publishing RSA: MqttException " + e.message)
            e.printStackTrace()
        }
        Log.d(TAG, "mqtt RSA published called")
        Log.d(TAG, "pub_topic-> $")
//        Toast.makeText(this@SecondActivity, "RSA Data Published.", Toast.LENGTH_SHORT).show()
    }

    // method for publishing EVA
    private fun publishEVAMessage(
        latitude: Latitude,
        longitude: Longitude,
        speed: Speed,
        heading: Heading,
        clientid: Int
    ) {


        val bb: ByteBuffer = ByteBuffer.allocate(4)
        bb.putInt(clientid)

        val eva = EVAUPEREncoder().getEVAMessage(
            RSAUPEREncoder.create_RSA(
                latitude,
                longitude,
                heading,
                speed
            ), bb.array()
        )

        if (eva.isEmpty()) {
//            Toast.makeText(requireContext(), "encoded failed", Toast.LENGTH_SHORT).show()
            return
        }

        val millis = System.currentTimeMillis()
        val timestamp = Timestamp.newBuilder().setSeconds(millis / 1000)
            .setNanos((millis % 1000 * 1000000).toInt()).build()
        try {
            val routedMsg = RoutedMsgOuterClass.RoutedMsg.newBuilder()
                .setTime(timestamp)
                .setPosition(
                    RoutedMsgOuterClass.Position.newBuilder()
                        .setLongitude(longitude.intValue())
                        .setLatitude(latitude.intValue())
                )
                .setMsgBytes(
                    ByteString.copyFrom(
                        eva
                    )
                )
                .build()

            client.publish(
                "$pub_topic/SW/NA/VZ/$clientid/UPER/EVA",
                routedMsg.toByteArray(),
                qos,
                false

            )
        } catch (e: Exception) {
            Log.d(TAG, "Publishing EVA: MqttException " + e.message)
            e.printStackTrace()
        }
        Log.d(TAG, "mqtt EVA published called")
        Log.d(TAG, "pub_topic-> $/SW/NA/VZ/$clientid/UPER/EVA")
//        Toast.makeText(this@SecondActivity, "EVA Data Published.", Toast.LENGTH_SHORT).show()
    }


    // Starting Background Service
    private fun startBackgroundService() {

        latLngService = LatLngService()
        serviceintent = Intent(mcontext, latLngService.javaClass)
        serviceintent.setPackage(mcontext.packageName)
        mcontext.startService(serviceintent)

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


    // publishing PSM
    private fun publishPSMMessage(
        latitude: Latitude,
        longitude: Longitude,
        speed: Speed,
        heading: Heading,
        clientid: String,
        temporaryID: ByteArray
    ) {

        val psm = PSMUPEREncoder().getPSMMessage(
            latitude,
            longitude,
            heading,
            speed,
            temporaryID
        )
        if (psm.isEmpty()) {
//            Toast.makeText(requireContext(), "encoded failed", Toast.LENGTH_SHORT).show()
            return
        }

        try {
            val millis = System.currentTimeMillis()
            val timestamp = Timestamp.newBuilder().setSeconds(millis / 1000)
                .setNanos((millis % 1000 * 1000000).toInt()).build()
            val routedMsg = RoutedMsgOuterClass.RoutedMsg.newBuilder()
                .setTime(timestamp)
                .setPosition(
                    RoutedMsgOuterClass.Position.newBuilder()
                        .setLongitude(longitude.intValue())
                        .setLatitude(latitude.intValue())
                )
                .setMsgBytes(
                    ByteString.copyFrom(
                        psm
                    )
                )

                .build()

            Log.d(
                TAG,

                "publishPSMMessage: /$clientid/UPER/PSM"
            )
            client.publish(
                "$pub_topic/SW/NA/VZ/$clientid/UPER/PSM",
                routedMsg.toByteArray(),
                qos,
                false
            )
        } catch (e: Exception) {
            Log.d(TAG, "Publishing PSM: MqttException " + e.message)
            e.printStackTrace()
        }
        Log.d(TAG, "mqtt published called")
        Log.d(TAG, "pub_topic-> $")

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

    private fun setUpConnectionOptions(username: String, password: String): MqttConnectOptions {
        val connOpts = MqttConnectOptions()
        connOpts.isCleanSession = true
        connOpts.userName = username
        connOpts.password = password.toCharArray()
        connOpts.isAutomaticReconnect = true
//        connOpts.serverURIs = arrayOf(viewModel.mqttUrl)
//        connOpts.keepAliveInterval = 15
        connOpts.connectionTimeout = 3
        return connOpts
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("#########", "onDestroyView: ")
        LocalBroadcastManager.getInstance(requireContext()).unregisterReceiver(
            mMessageReceiver
        )
//        Toast.makeText(mcontext,"destroyed",Toast.LENGTH_SHORT).show()
        client.disconnect()
        //  mcontext.stopService(Intent(mcontext, LatLngService::class.java))
        //  fusedLocationProviderClient.removeLocationUpdates(locationCallback)

        publishBinding.pubfragSwLocation.isChecked = false
        publishBinding.pubfragSwBroadcast.isChecked = false
    }

    private fun connectMQTT(id: String) {

        try {
            val connOpts = setUpConnectionOptions(MqttUtils.username, MqttUtils().getPassword())
            client.connect(connOpts, mcontext, object : IMqttActionListener {
                override fun onSuccess(asyncActionToken: IMqttToken?) {
                    Log.d(TAG, "onSuccess: Connection Success")
//                    Toast.makeText(mcontext, "Connection Success", Toast.LENGTH_SHORT).show()
                    userSession.putUserId(id)

                }

                override fun onFailure(asyncActionToken: IMqttToken?, exception: Throwable?) {
                    Log.d(TAG, "onFailure: Connection Failure")
//                    Toast.makeText(mcontext, "Connection Failure", Toast.LENGTH_SHORT).show()

                }

            })
        } catch (e: MqttException) {
            e.printStackTrace()
        }
        client.setCallback(object : MqttCallback {
            override fun connectionLost(cause: Throwable) {
                Log.d(TAG, "connectionLost: $cause")
                client.reconnect()
            }

            override fun messageArrived(topic: String, message: MqttMessage) {
                Log.d(TAG, "onMessageArrived: Topic  =====> $topic")
                Log.d(TAG, "onMessageArrived: Arrived message  ======> $message")
            }

            override fun deliveryComplete(token: IMqttDeliveryToken) {
                Log.d(TAG, "mqtt deliveryComplete: ")
            }
        })
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

        val locationManager: LocationManager =
            requireActivity().getSystemService(AppCompatActivity.LOCATION_SERVICE) as LocationManager

        return locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER) ||
                locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER)
    }

    private fun getLocationUpdates() {

        fusedLocationProviderClient =
            LocationServices.getFusedLocationProviderClient(requireContext())

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
                    var city = address.locality
                    var state = address.adminArea
                    var country = address.countryName
                    var postalCode = address.postalCode
                    var knownName = address.featureName
                    publishBinding.tvCurraddress.text = fulladdress

                } else {
                    fulladdress = "Location not found"
                    publishBinding.tvCurraddress.text = fulladdress
                }
            } else {
                fulladdress = "Location not found"
                publishBinding.tvCurraddress.text = fulladdress
            }
            // }
        } catch (ex: Exception) {

            ex.printStackTrace()
        }
    }


}