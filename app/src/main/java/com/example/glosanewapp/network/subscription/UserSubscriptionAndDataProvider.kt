package com.example.glosanewapp.network.subscription

import android.content.Context
import android.os.Build
import android.util.Log
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData

import j2735.dsrc.*
import com.example.glosanewapp.listeners.SubscriptionDataListener
import com.example.glosanewapp.ui.fragments.SubscribeFragment
import com.example.glosanewapp.util.*
import com.example.glosanewapp.util.protobuf.RoutedMsgOuterClass
import com.example.glosanewapp.network.UserSession
import com.example.glosanewapp.util.JERDecoderUtils.PSMResponse
import com.google.gson.Gson
import com.google.protobuf.Timestamp
import info.mqtt.android.service.MqttAndroidClient
import info.mqtt.android.service.QoS
import org.eclipse.paho.client.mqttv3.*
import java.io.ByteArrayInputStream

class UserSubscriptionAndDataProvider constructor(context: Context,val fragment: Fragment) {
    private lateinit var mContext: Context
    private lateinit var mClient: MqttAndroidClient
    private lateinit var mListener: SubscriptionDataListener
    private var livedata: MutableLiveData<PersonalSafetyMessage> = MutableLiveData()
    private var livedataeva: MutableLiveData<EmergencyVehicleAlert> = MutableLiveData()
    lateinit var  userSession: UserSession
    val gson= Gson()
    fun getlivedata(): MutableLiveData<PersonalSafetyMessage> {

        return livedata

    }

    fun getlivedataeva(): MutableLiveData<EmergencyVehicleAlert> {

        return livedataeva

    }


    fun publishBSMMessage(
        latitude: Latitude,
        longitude: Longitude,
        speed: Speed,
        heading: Heading,
        clientid: String,
        temporaryID: ByteArray
    ) {
        try {
            val routedMsg = RoutedMsgOuterClass.RoutedMsg.newBuilder()
                .setTime(Timestamp.newBuilder().build())
                .setPosition(
                    RoutedMsgOuterClass.Position.newBuilder()
                        .setLongitude(longitude.intValue())
                        .setLatitude(latitude.intValue())
                )
                /* .setMsgBytes(
                     ByteString.copyFrom(
                         BSMEncoder().getBSMMessage(
                             latitude,
                             longitude,
                             heading,
                             speed,
                             temporaryID
                         )
                     )
                 )*/
                .build()
            Log.d(
                TAG,
                "publishPSMMessage: " + PUB_TOPIC + "/" + clientid + "/UPER/BSM" + routedMsg.toByteArray() + QOS + false
            )
            mClient!!.publish(
                PUB_TOPIC + "/" + clientid + "/UPER/BSM",
                routedMsg.toByteArray(),
                QOS,
                false
            )
        } catch (e: Exception) {
            Log.d(TAG, "Publishing BSM: MqttException " + e.message)
            e.printStackTrace()
        }
        Log.d(TAG, "mqtt BSM published called")
        Log.d(TAG, "pub_topic-> $PUB_TOPIC")
//        Toast.makeText(mContext, "BSM data published.", Toast.LENGTH_SHORT).show()
    }

    init {
        mContext = context
        userSession = UserSession(mContext)
        Log.d(TAG,"Init block context::::"+mContext)
    }

    companion object {
        private const val TAG = "UserSubscription"
//        private const val VERSION_MQTT_SERVER_URL = "tcp://Mqtt.vzmode.br2dev.dltdemo.io:1883"

        private val VERSION_MQTT_SERVER_URL = "tcp://mqtt.vzmode-br.dltdemo.io:1883"
        private const val USER_NAME = "user3"
        private const val PASSWORD = "dfFg7sEX52BQ"
        private const val SUB_TOPIC = "REGIONAL/DYN/4/+/+/+/+/+/+/+/+/+/+/VZ/+/#"
 //       private const val SUB_TOPIC = "REGIONAL/DYN/4/#"            //Regional topic to get all kind of data
//       private const val SUB_TOPIC = "VZCV2X/3/IN/+/+/VZ/+/+/#"     //IN Topic for getting direct data
        private const val PUB_TOPIC = "VZCV2X/3/IN/SW/NA/VZ"
        private const val QOS = 1
    }


    fun connectClient(listener: SubscriptionDataListener) {
        mListener = listener
        try {
            Log.d(TAG, "connectClient: ")
            mClient = MqttAndroidClient(
                mContext,
                VERSION_MQTT_SERVER_URL,
                userSession.getUserId().toString()
            )
            val connOpts = getConnectionOptions(USER_NAME, PASSWORD)
            registerConnectionListener()
            if (connOpts != null) {
                mClient.connect(connOpts, null, object : IMqttActionListener {
                    override fun onSuccess(asyncActionToken: IMqttToken) {

//                        Log.d(TAG, "Connection success")
                        val disconnectedBufferOptions = DisconnectedBufferOptions()
                        disconnectedBufferOptions.isBufferEnabled = true
                        disconnectedBufferOptions.bufferSize = 100
                        disconnectedBufferOptions.isPersistBuffer = false
                        disconnectedBufferOptions.isDeleteOldestMessages = false
                        mClient.setBufferOpts(disconnectedBufferOptions)
                        subscribeUser()
                        // ( mContext as MainScreenActivity).startbackgroundservice()

                        //startBackgroundService()

                    }

                    override fun onFailure(asyncActionToken: IMqttToken?, exception: Throwable?) {
//                        Toast.makeText(mContext, "Failed to connect", Toast.LENGTH_SHORT).show()
                        Log.d("#####error", "onFailure: ${exception?.localizedMessage}")
                    }
                })
            }

        } catch (e: MqttException) {
            e.printStackTrace();

//            Utils.printErrorLog(TAG, "MqttException::::" + e.message)

        }
    }


    private fun registerConnectionListener() {

        mClient.setCallback(object : MqttCallbackExtended {
            override fun connectComplete(reconnect: Boolean, serverURI: String) {


//                Utils.showToastMessage(mContext, "connection completed")
//                Log.d(TAG, "connection completed")
            }

            override fun connectionLost(cause: Throwable?) {
//                Utils.showToastMessage(mContext, "connection lost");
//                Log.d(TAG, "connectionLost::::" + cause?.message)
            }

            override fun messageArrived(topic: String, message: MqttMessage) {
                //if(!topic.contains("EMULATOR"))

                Log.d(
                    TAG,
                    "messageArrived topic ${topic}::::message::${
                        message.payload.decodeToString().replace("", "")
                    }"
                )

                /*  if(!topic.contains("EMULATOR"))
                  Log.d(TAG, "messageArrived topic ${topic}::::message::${message}")*/
                //Toast.makeText(mContext,"messageArrived topic ${topic}::::message::${message}",Toast.LENGTH_SHORT).show()
                try {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O && topic.contains("PSM") && !topic.contains(
                            "EMULATOR"
                        )
                    ) {
                        onMessageArrivedroutedMessagePSM(topic, message)


                    } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O && topic.contains("EVA") && !topic.contains(
                            "EMULATOR"
                        )
                    ) {
                        onMessageArrivedroutedMessageEVA(topic, message)
                    } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O && topic.contains("RSA") && !topic.contains(
                            "EMULATOR"
                        )
                    ) {
                         onMessageArrivedroutedMessageRSA(topic, message)
                    } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O && topic.contains("SPAT") && !topic.contains(
                            "EMULATOR"
                        )
                    ) {
                        onMessageArrivedroutedMessageSPAT(topic, message)
                    }
                    else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O && topic.contains("BSM") && !topic.contains(
                            "EMULATOR"
                        )
                    ) {
                        onMessageArrivedroutedMessageBSM(topic, message)
                    }
                    else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O && topic.contains("MAP") && !topic.contains(
                            "EMULATOR"
                        )
                    ) {
                        onMessageArrivedroutedMessageMAP(topic, message)
                    }
                } catch (e: Exception) {
//                    Utils.printErrorLog(TAG, "messageArrived Exception::: ${e.message}")
                }


            }


            override fun deliveryComplete(token: IMqttDeliveryToken) {

//                Utils.showToastMessage(mContext, "deliveryComplete")
//                Log.d(TAG, "deliveryComplete::::" + token)
            }
        })

    }

    private fun onMessageArrivedroutedMessageMAP(topic: String, message: MqttMessage) {


        if (topic.contains("UPER/MAP")) {
            val outboundMsg: RoutedMsgOuterClass.OutboundMsg =
                RoutedMsgOuterClass.OutboundMsg.parseFrom(message.payload)
            val mapDecoder = MapDataUPERDecoder()
            println("Message Topic REGIONAL: Decoding...EVA $topic")
            val map = mapDecoder.decodeMap(
                ByteArrayInputStream(
                    outboundMsg.getMsgBytes().toByteArray()
                )
            )

            (fragment as SubscribeFragment).calculatediff( map.intersections.elements.get(0).refPoint.lat.intValue(),   map.intersections.elements.get(0).refPoint._long.intValue())
            // map.intersections.elements.get(0).refPoint.lat.intValue()
            // Log.d(TAG, "onMessageArrivedroutedMessageEVA: "+eva.timeStamp)
            // (mContext as MainScreenActivity).playsound()
            //livedata.postValue(psm)
        }


    }

    private fun onMessageArrivedroutedMessageBSM(topic: String, message: MqttMessage) {
        try {

            if (topic.contains("UPER/BSM")) {
                val outboundMsg: RoutedMsgOuterClass.OutboundMsg =
                    RoutedMsgOuterClass.OutboundMsg.parseFrom(message.payload)
                val psmDecoder = BSMUPERDecoder()
                println("Message Topic REGIONAL: Decoding...EVA $topic")
                val bsm = psmDecoder.decodeBSM(
                    ByteArrayInputStream(
                        outboundMsg.getMsgBytes().toByteArray()
                    )
                )
                //livedatabsm.postValue(bsm)
                // Log.d(TAG, "onMessageArrivedroutedMessageEVA: "+eva.timeStamp)

               // (mContext as MainScreenActivity).playsound()
                //livedata.postValue(psm)
            }
            else if (topic.contains("JER/BSM")) {
                /*val outboundMsg: RoutedMsgOuterClass.OutboundMsg =
                    RoutedMsgOuterClass.OutboundMsg.parseFrom(message.payload)
                val psmDecoder = BSMJERDecoder()
                println("Message Topic REGIONAL: Decoding...EVA $topic")
                val rsa = psmDecoder.decodeBSM(
                    ByteArrayInputStream(
                        outboundMsg.getMsgBytes().toByteArray()
                    )
                )*/
                // Log.d(TAG, "onMessageArrivedroutedMessageEVA: "+eva.timeStamp)

               // (mContext as MainScreenActivity).playsound()
                //livedata.postValue(psm)
            }
        } catch (e: java.lang.Exception) {
            Log.d(TAG, "Message Topic REGIONAL: --->BSM Exception: " + e.message)
            Log.d(TAG, "Message Topic REGIONAL: --->BSM Exception:Topic $topic")
        }
    }

    private fun onMessageArrivedroutedMessageRSA(topic: String, message: MqttMessage) {
        try {

            if (topic.contains("UPER/RSA")) {
                val outboundMsg: RoutedMsgOuterClass.OutboundMsg =
                    RoutedMsgOuterClass.OutboundMsg.parseFrom(message.payload)
                val psmDecoder = RSAUPERDecoder()
                println("Message Topic REGIONAL: Decoding...EVA $topic")
                val rsa = psmDecoder.decodeRSA(
                    ByteArrayInputStream(
                        outboundMsg.getMsgBytes().toByteArray()
                    )
                )
                // Log.d(TAG, "onMessageArrivedroutedMessageEVA: "+eva.timeStamp)

                (fragment as SubscribeFragment).playsound()
                //livedata.postValue(psm)
            }
            else if (topic.contains("JER/RSA")) {
                /*val outboundMsg: RoutedMsgOuterClass.OutboundMsg =
                    RoutedMsgOuterClass.OutboundMsg.parseFrom(message.payload)
                val psmDecoder = RSAJERDecoder()
                println("Message Topic REGIONAL: Decoding...EVA $topic")
                val rsa = psmDecoder.decodeRSA(
                    ByteArrayInputStream(
                        outboundMsg.getMsgBytes().toByteArray()
                    )
                )
                // Log.d(TAG, "onMessageArrivedroutedMessageEVA: "+eva.timeStamp)

                (mContext as SubscribeFragment).playsound()*/
                //livedata.postValue(psm)
            }
        } catch (e: java.lang.Exception) {
            Log.d(TAG, "Message Topic REGIONAL: --->EVA Exception: " + e.message)
            Log.d(TAG, "Message Topic REGIONAL: --->EVA Exception:Topic $topic")
        }
    }


    private fun onMessageArrivedroutedMessageEVA(topic: String, message: MqttMessage) {
        try {
            if (topic.contains("UPER/EVA")) {
                val outboundMsg: RoutedMsgOuterClass.OutboundMsg =
                    RoutedMsgOuterClass.OutboundMsg.parseFrom(message.payload)
                val psmDecoder = EVAUPERDecoder()
                println("Message Topic REGIONAL: Decoding...EVA $topic")
                val eva = psmDecoder.decodeJEREVA(
                    ByteArrayInputStream(
                        outboundMsg.getMsgBytes().toByteArray()
                    )
                )
                Log.d(TAG, "onMessageArrivedroutedMessageEVA: " + eva.timeStamp)

               // (mContext as MainScreenActivity).playsound()
                livedataeva.postValue(eva)
            }
              else if (topic.contains("JER/EVA")) {
                /*  val outboundMsg: RoutedMsgOuterClass.OutboundMsg =
                      RoutedMsgOuterClass.OutboundMsg.parseFrom(message.payload)
                  val psmDecoder = EVAJERDecoder()
                  println("Message Topic REGIONAL: Decoding...EVA $topic")
                  val eva = psmDecoder.decodeJEREVA(
                      ByteArrayInputStream(
                          outboundMsg.getMsgBytes().toByteArray()
                      )
                  )*/
                  //Log.d(TAG, "onMessageArrivedroutedMessageEVA: " + eva.timeStamp)

                  //( mContext as MainScreenActivity).playsound()
                  //livedata.postValue(psm)
              }
        } catch (e: java.lang.Exception) {
            Log.d(TAG, "Message Topic REGIONAL: --->EVA Exception: " + e.message)
            Log.d(TAG, "Message Topic REGIONAL: --->EVA Exception:Topic $topic")
        }
    }


    private fun onMessageArrivedroutedMessagePSM(topic: String, message: MqttMessage) {
        try {
            if (topic.contains("UPER/PSM")) {
                val outboundMsg: RoutedMsgOuterClass.OutboundMsg =
                    RoutedMsgOuterClass.OutboundMsg.parseFrom(message.payload)
                val psmDecoder = PSMUPERDecoder()
                println("Message Topic REGIONAL: Decoding...PSM $topic")
                val psm = psmDecoder.decodePSM(
                    ByteArrayInputStream(
                        outboundMsg.getMsgBytes().toByteArray()
                    )
                )
                livedata.postValue(psm)
            } else if (topic.contains("JER/PSM")) {
                /*val outboundMsg: RoutedMsgOuterClass.OutboundMsg =
                    RoutedMsgOuterClass.OutboundMsg.parseFrom(message.payload)
                val psmDecoder = PSMJERDecoder()
                println("Message Topic REGIONAL: Decoding...PSM $topic")
                println("###DATA ${outboundMsg.getMsgBytes()}")
                val psm = psmDecoder.decodePSM(
                    ByteArrayInputStream(
                        outboundMsg.getMsgBytes().toByteArray()
                    )
                )*/
              /*  val json = message.payload.decodeToString().substring(message.payload.decodeToString().indexOf("\"")-1,message.payload.decodeToString().lastIndexOf("}")+1).trim()

                val psmresponse = gson.fromJson(json, PSMResponse::class.java)
                val psm =psmresponse.messageFrame.value.personalSafetyMessage

                Log.d(TAG, "onMessageArrived_routedMessagePSM: ${gson.toJson(psm).toString()}")
                livedata.postValue(psm)*/
            }
        } catch (e: java.lang.Exception) {
            Log.d(TAG, "Message Topic REGIONAL: --->PSM Exception: " + e.message)
            Log.d(TAG, "Message Topic REGIONAL: --->PSM Exception:Topic $topic")
        }
    }

    private fun onMessageArrivedroutedMessageSPAT(topic: String, message: MqttMessage) {
        try {
            if (topic.contains("UPER/SPAT")) {
                val outboundMsg: RoutedMsgOuterClass.OutboundMsg =
                    RoutedMsgOuterClass.OutboundMsg.parseFrom(message.payload)
                println("encoded spat" + message)
                val spatDecoder = SPATUPERDecoder()
                println("Message Topic REGIONAL: Decoding...SPAT $topic")
                val spat = spatDecoder.decodeSPAT(
                    ByteArrayInputStream(
                        outboundMsg.getMsgBytes().toByteArray()
                    )
                )
                processdata(spat)

                //livedata.postValue(psm)
            }
            /*  else  if (topic.contains("JER/SPAT")) {
                  val outboundMsg: RoutedMsgOuterClass.OutboundMsg =
                      RoutedMsgOuterClass.OutboundMsg.parseFrom(message.payload)
                  println("encoded spat" + message)
                  val spatDecoder = SPATJERDecoder()
                  println("Message Topic REGIONAL: Decoding...SPAT $topic")
                  val spat = spatDecoder.decodeSPAT(
                      ByteArrayInputStream(
                          outboundMsg.getMsgBytes().toByteArray()
                      )
                  )
                  processdata(spat)
                  //livedata.postValue(psm)
              }*/
        } catch (e: java.lang.Exception) {
            Log.d(TAG, "Message Topic REGIONAL: --->PSM Exception: " + e.message)
            Log.d(TAG, "Message Topic REGIONAL: --->PSM Exception:Topic $topic")
        }
    }


    private fun processdata(spat: SPAT) {

//                Log.d(TAG, "onMessageArrivedroutedMessageSPAT: ${spat.timeStamp}")
        Log.d(
            TAG,
            "onMessageArrivedroutedMessageSPAT: " + spat.intersections.elements.get(0).name
        )
        for (item in spat.intersections.elements.get(0).states.elements) {

            if (item.getSignalGroup().intValue() == 2) {

                for (item2 in item.state_time_speed.elements) {
                    if (item2.getEventState() == MovementPhaseState.stop_Then_Proceed || item2.getEventState() == MovementPhaseState.stop_And_Remain) {
                        (fragment as SubscribeFragment).updatelight(
                            true,
                            spat.intersections.elements.get(0).name.stringValue()
                        )
                        (fragment as SubscribeFragment).savetime(false,item2.timing.minEndTime,item2.timing.nextTime,item2.speeds.elements[0].speed)
                        break
                    } else if (item2.getEventState() == MovementPhaseState.pre_Movement || item2.getEventState() == MovementPhaseState.permissive_Movement_Allowed || item2.getEventState() == MovementPhaseState.protected_Movement_Allowed) {
                        (fragment as SubscribeFragment).updatelight(
                            false,
                            spat.intersections.elements.get(0).name.stringValue()
                        )
                        (fragment as SubscribeFragment).savetime(true,item2.timing.minEndTime,item2.timing.nextTime,item2.speeds.elements[0].speed)
                        break
                    }
                }

            }
        }
    }




    /*private fun getRegisteredClientID(): Int {
        return Utils.readIntFromPreferences(mContext, Utils.KEY_CLIENT_ID)
    }*/


    private fun getConnectionOptions(username: String, password: String): MqttConnectOptions? {
        val connOpts = MqttConnectOptions()
        connOpts.isCleanSession = true
        connOpts.isAutomaticReconnect = true
        connOpts.userName = username
        connOpts.password = password.toCharArray()
        return connOpts
    }

    fun subscribeUser() {
        try {
            mClient.subscribe(SUB_TOPIC, QoS.AtMostOnce.value, null, object : IMqttActionListener {
                override fun onSuccess(asyncActionToken: IMqttToken) {

                    Log.d(TAG, "User subscription was success")
//                    Toast.makeText(mContext, "Subscribed!.", Toast.LENGTH_SHORT).show()
                }

                override fun onFailure(asyncActionToken: IMqttToken?, exception: Throwable?) {
                    Log.d(TAG, "subscribe::MqttException:" + exception?.message)
                }
            })

        } catch (e: MqttException) {
            e.printStackTrace();
        }
    }

    fun disconnectConnection() {
        try {
            mClient.disconnect()

//            Log.d(TAG, "disconnectConnection")
        } catch (e: MqttException) {
            e.printStackTrace();
//            Log.d(TAG, "disconnectConnection MqttException:::" + e.message)
        }

    }
}