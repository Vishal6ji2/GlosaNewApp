package com.example.glosanewapp.ui.fragments

import android.app.ActivityManager

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.location.Location
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment

import androidx.lifecycle.ViewModelProvider
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SnapHelper
import com.example.glosanewapp.R
import com.example.glosanewapp.databinding.FragmentPublishBinding
import com.example.glosanewapp.network.model.MqttUtils
import com.example.glosanewapp.network.model.TravelMode
import com.example.glosanewapp.services.LatLngService
import com.example.glosanewapp.ui.adapters.TravelModeAdapter
import com.example.glosanewapp.util.*
import com.example.glosanewapp.util.protobuf.RoutedMsgOuterClass

import com.example.glosanewapp.viewmodel.PublishFragmentViewModel
import com.example.glosanewapp.viewmodel.TravelModeViewModel
import com.example.latlngapp.network.UserSession
import com.google.protobuf.ByteString
import com.google.protobuf.Timestamp
import info.mqtt.android.service.MqttAndroidClient
import j2735.dsrc.Heading
import j2735.dsrc.Latitude
import j2735.dsrc.Longitude
import j2735.dsrc.Speed
import org.eclipse.paho.client.mqttv3.*
import java.nio.ByteBuffer

class PublishFragment : Fragment() {

    private val pub_topic = "VZCV2X/3/IN"
    private val qos = 1

    lateinit var mcontext: Context

    var pos = 0

    lateinit var client: MqttAndroidClient

    var travelModeViewModel: TravelModeViewModel? = null
    private var travelModeAdapter: TravelModeAdapter? = null


//    var publishFragmentViewModel: PublishFragmentViewModel? = null

    lateinit var globalLocation: Location
    var heading: Int = 0

    private lateinit var userSession: UserSession

    private lateinit var serviceintent: Intent
    var latLngService = LatLngService()

    private val TAG = "PublishFragment"

    private lateinit var publishBinding: FragmentPublishBinding


    private val mMessageReceiver: BroadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent) {
            // Get extra data included in the Intent
            globalLocation = intent.getParcelableExtra("location") ?: Location("")
            heading = intent.getIntExtra("heading", 0)

            val mlatitude = Latitude()
            mlatitude.setValue((globalLocation.latitude * 10000000).toLong().toInt())
            val mlongitude = Longitude()
            mlongitude.setValue((globalLocation.longitude * 10000000).toLong().toInt())
            val mheading = Heading()
            mheading.setValue(heading)
            val mspeed = Speed()
            mspeed.setValue(globalLocation.speed.toInt())

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

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        publishBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_publish, container, false)

        userSession = UserSession(mcontext)

        client = MqttAndroidClient(mcontext, MqttUtils().getMqttUrl(), userSession.getUserId().toString())
//        publishFragmentViewModel = ViewModelProvider(this)[PublishFragmentViewModel::class.java]

        /*publishBinding.viewmodel = publishFragmentViewModel
        publishBinding.executePendingBindings()*/

        // bind RecyclerView
        initRecyclerView()

        publishBinding.pubfragSwLocation.setOnCheckedChangeListener { _, isChecked ->
            val message = if (isChecked) "Sharing On " else "Sharing Off"

            if (isChecked) {

                Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()

                startBackgroundService()

            } else {

                requireContext().stopService(Intent(requireContext(), LatLngService::class.java))

                Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
            }
        }

        publishBinding.pubfragSwBroadcast.setOnClickListener {

            if (publishBinding.pubfragSwBroadcast.isChecked && pos == 2) {
                // send rsa data
                val mlatitude = Latitude()
                mlatitude.setValue((globalLocation.latitude * 10000000).toLong().toInt())
                val mlongitude = Longitude()
                mlongitude.setValue((globalLocation.longitude * 10000000).toLong().toInt())
                val mheading = Heading()
                mheading.setValue(heading)
                val mspeed = Speed()
                mspeed.setValue(globalLocation.speed.toInt())

                publishRSAMessage(
                    mlatitude,
                    mlongitude,
                    mspeed,
                    mheading,
                    userSession.getUserId()!!.toInt()
                )
                Toast.makeText(requireContext(), "RSA published", Toast.LENGTH_SHORT).show()
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

    // Modes set to Recyclerview
    private fun initRecyclerView() {
        val recyclerView = publishBinding.pubfragRecyclerview
        recyclerView.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        recyclerView.setHasFixedSize(true)

        travelModeViewModel = ViewModelProvider(this)[TravelModeViewModel::class.java]

        //init the Custom adataper
        travelModeAdapter = TravelModeAdapter()
        //set the CustomAdapter
        recyclerView.adapter = travelModeAdapter
        val snapHelper: SnapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(recyclerView)

        recyclerView.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
                if (newState == RecyclerView.SCROLL_STATE_IDLE) {
                    pos =
                        (recyclerView.layoutManager as LinearLayoutManager?)!!.findFirstCompletelyVisibleItemPosition()

//                    Toast.makeText(requireContext(), pos.toString(), Toast.LENGTH_SHORT).show()
                    if (pos == 0) {
                        "Pedestrian".also { publishBinding.pubfragTvSelectedmode.text = it }
                        publishBinding.pubfragSwBroadcast.isEnabled = false

                    } else if (pos == 1) {
                        "General Vehicle".also { publishBinding.pubfragTvSelectedmode.text = it }
                        publishBinding.pubfragSwBroadcast.isEnabled = false

                    } else if (pos == 2) {
                        "Emergency Vehicle".also { publishBinding.pubfragTvSelectedmode.text = it }
                        publishBinding.pubfragSwBroadcast.isEnabled = true

                    }
                }
            }
        })



        getAllMode()

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

    fun publishSPAT(registeredId: Int) {

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
        try {
            val routedMsg = RoutedMsgOuterClass.RoutedMsg.newBuilder()
                .setTime(Timestamp.newBuilder().build())
                .setPosition(
                    RoutedMsgOuterClass.Position.newBuilder()
                        .setLongitude(mlontitude.intValue())
                        .setLatitude(mlatitude.intValue())
                )
                .setMsgBytes(
                    ByteString.copyFrom(
                        BSMUPEREncoder().getBSMMessage(
                            mlatitude,
                            mlontitude,
                            mheading,
                            mspeed,
                            bb.array()
                        )
                    )
                )
                .build()
            Log.d(
                TAG,
                "publishBSMMessage: $/$registeredId/UPER/BSM"
            )

            client.publish(
                "$pub_topic/$registeredId/UPER/BSM",
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


//        Log.d(TAG, "callpublish: "+Integer.toOctalString(clientid))

        val millis = System.currentTimeMillis()
        val timestamp = Timestamp.newBuilder().setSeconds(millis / 1000)
            .setNanos((millis % 1000 * 1000000).toInt()).build()
        try {
            val routedMsg = RoutedMsgOuterClass.RoutedMsg.newBuilder()
                .setTime(timestamp)
                .setMsgBytes(
                    ByteString.copyFrom(
                        RSAUPEREncoder().getRSAMessage(
                            latitude,
                            longitude,
                            heading,
                            speed
                        )
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


        Log.d(TAG, "callpublish: " + Integer.toOctalString(clientid))
        val bb: ByteBuffer = ByteBuffer.allocate(4)
        bb.putInt(clientid)
        val millis = System.currentTimeMillis()
        val timestamp = Timestamp.newBuilder().setSeconds(millis / 1000)
            .setNanos((millis % 1000 * 1000000).toInt()).build()
        try {
            val routedMsg = RoutedMsgOuterClass.RoutedMsg.newBuilder()
                .setTime(timestamp)
                .setMsgBytes(
                    ByteString.copyFrom(
                        EVAUPEREncoder().getEVAMessage(
                            RSAUPEREncoder.create_RSA(
                                latitude,
                                longitude,
                                heading,
                                speed
                            ), bb.array()
                        )
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


    // publishing PSM
    private fun publishPSMMessage(
        latitude: Latitude,
        longitude: Longitude,
        speed: Speed,
        heading: Heading,
        clientid: String,
        temporaryID: ByteArray
    ) {
        try {
            val routedMsg = RoutedMsgOuterClass.RoutedMsg.newBuilder()
//                .setTime(Timestamp)
                .setPosition(
                    RoutedMsgOuterClass.Position.newBuilder()
                        .setLongitude(longitude.intValue())
                        .setLatitude(latitude.intValue())
                )
                .setMsgBytes(
                    ByteString.copyFrom(
                        PSMUPEREncoder().getPSMMessage(
                            latitude,
                            longitude,
                            heading,
                            speed,
                            temporaryID
                        )
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
        LocalBroadcastManager.getInstance(requireContext()).unregisterReceiver(
            mMessageReceiver
        )
    }

    private fun setUpConnectionOptions(username: String, password: String): MqttConnectOptions {
        val connOpts = MqttConnectOptions()
        connOpts.isCleanSession = true
        connOpts.userName = username
        connOpts.password = password.toCharArray()
        connOpts.isAutomaticReconnect = true
//        connOpts.serverURIs = arrayOf(viewModel.mqttUrl)
        connOpts.keepAliveInterval = 15
        connOpts.connectionTimeout = 30
        return connOpts
    }

    private fun connectMQTT(id: String) {

        try {
            val connOpts = setUpConnectionOptions(MqttUtils.username, MqttUtils().getPassword())
            client.connect(connOpts, mcontext, object : IMqttActionListener {
                override fun onSuccess(asyncActionToken: IMqttToken?) {
                    Log.d(TAG, "onSuccess: Connection Success")
                    Toast.makeText(mcontext, "Connection Success", Toast.LENGTH_SHORT)
                        .show()
                    userSession.putUserId(id)

                }

                override fun onFailure(asyncActionToken: IMqttToken?, exception: Throwable?) {
                    Log.d(TAG, "onFailure: Connection Failure")
                    Toast.makeText(mcontext, "Connection Failure", Toast.LENGTH_SHORT)
                        .show()
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
}