package com.example.glosanewapp.services


import android.Manifest
import android.R

import android.app.*
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Color
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.location.Location
import android.os.Build
import android.os.IBinder
import android.os.Looper
import android.util.Log
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.google.android.gms.location.*

import com.google.android.gms.location.LocationRequest.create
import com.google.android.gms.location.Priority.PRIORITY_HIGH_ACCURACY
import kotlin.math.roundToInt

class LatLngService: Service(), SensorEventListener {

    var TAG = "LatLngService"

    var mAzimuth = 0
    lateinit var mSensorManager: SensorManager
    private var mRotationV: Sensor? = null
    private  var mAccelerometer: Sensor? = null
    private  var mMagnetometer: Sensor? = null
    var haveSensor = false
    var haveSensor2: Boolean = false
    var rMat = FloatArray(9)
    var orientation = FloatArray(3)
    private val mLastAccelerometer = FloatArray(3)
    private val mLastMagnetometer = FloatArray(3)
    private var mLastAccelerometerSet = false
    private var mLastMagnetometerSet = false


    private lateinit var fusedLocationProviderClient: FusedLocationProviderClient
    private var globallocation: Location? = null



    private val locationRequest:LocationRequest = create().apply {
        interval = 1500
        fastestInterval = 1000
        priority = PRIORITY_HIGH_ACCURACY
    }


    private var locationCallback:LocationCallback = object : LocationCallback() {
        override fun onLocationResult(locationResult: LocationResult) {
           val locationlist = locationResult.locations
            if (locationlist.isNotEmpty()){
                val location = locationlist.last()
                globallocation = location

                val intent = Intent("GPSLocationUpdates")

                intent.putExtra("heading",mAzimuth)
                intent.putExtra("location",location)
                LocalBroadcastManager.getInstance(this@LatLngService).sendBroadcast(intent)

                Log.d(TAG, "onLocationResult: "+location.latitude)
            }
        }
    }

    override fun onBind(intent: Intent?): IBinder? {

        Log.d(TAG,"bind")
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {


        Log.d(TAG,"starting")
       return START_REDELIVER_INTENT
    }

    override fun onTaskRemoved(rootIntent: Intent?) {

        Log.d(TAG, "onTaskRemoved: ")
//        client = MqttAndroidClient(this, verizon_mqtt_server_url, cliendid.toString())
//        disconnect()
//        client.disconnect()
        super.onTaskRemoved(rootIntent)
//        Log.d("taskremoved", "onTaskRemoved: ")
    }

    override fun onCreate() {
        super.onCreate()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val chan = NotificationChannel(

                "MyChannelId2",
                "My Foreground Service",
                NotificationManager.IMPORTANCE_HIGH
            )
            chan.lightColor = Color.BLUE
            chan.lockscreenVisibility = Notification.VISIBILITY_SECRET
            val manager =
                (getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager)
            manager.createNotificationChannel(chan)
            val notificationBuilder: Notification.Builder = Notification.Builder(
                this, "MyChannelId2"
            )
            val notification: Notification = notificationBuilder.setOngoing(true)
                .setSmallIcon(R.mipmap.sym_def_app_icon)
                .setContentTitle("App is running on foreground")
                .setPriority(Notification.PRIORITY_LOW)
                .setCategory(Notification.CATEGORY_SERVICE)
                .setChannelId("MyChannelId2")
                .build()
            startForeground(1, notification)
        }
        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(applicationContext)
        mSensorManager = getSystemService(SENSOR_SERVICE) as SensorManager

        sensorstart()

        if (ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_BACKGROUND_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            return
        }
        fusedLocationProviderClient.requestLocationUpdates( locationRequest, locationCallback, Looper.getMainLooper() )
    }


    override fun onDestroy() {
        super.onDestroy()

        Log.d(TAG, "onDestroy: ")
        fusedLocationProviderClient.removeLocationUpdates(locationCallback)
    }

    private fun sensorstart() {
        if (mSensorManager.getDefaultSensor(Sensor.TYPE_ROTATION_VECTOR) == null) {
            if ((mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER) == null) || (mSensorManager.getDefaultSensor(
                    Sensor.TYPE_MAGNETIC_FIELD
                ) == null)
            ) {
//                Toast.makeText(this, "Direction isn't working", Toast.LENGTH_SHORT).show()
            } else {
                mAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)
                mMagnetometer = mSensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD)
                haveSensor = mSensorManager.registerListener(this, mAccelerometer, SensorManager.SENSOR_DELAY_UI)
                haveSensor2 = mSensorManager.registerListener(this, mMagnetometer, SensorManager.SENSOR_DELAY_UI)
            }
        } else {
            mRotationV = mSensorManager.getDefaultSensor(Sensor.TYPE_ROTATION_VECTOR)
            haveSensor =
                mSensorManager.registerListener(this, mRotationV, SensorManager.SENSOR_DELAY_UI)
        }
    }

    override fun onSensorChanged(event: SensorEvent?) {

        if (event!!.sensor.type == Sensor.TYPE_ROTATION_VECTOR) {
            SensorManager.getRotationMatrixFromVector(rMat, event.values)
            mAzimuth = (Math.toDegrees(
                SensorManager.getOrientation(rMat, orientation)[0]
                    .toDouble()
            ) + 360).toInt() % 360
        }

        if (event.sensor.type == Sensor.TYPE_ACCELEROMETER) {
            System.arraycopy(event.values, 0, mLastAccelerometer, 0, event.values.size)
            mLastAccelerometerSet = true
        } else if (event.sensor.type == Sensor.TYPE_MAGNETIC_FIELD) {
            System.arraycopy(event.values, 0, mLastMagnetometer, 0, event.values.size)
            mLastMagnetometerSet = true
        }
        if (mLastAccelerometerSet && mLastMagnetometerSet) {
            SensorManager.getRotationMatrix(rMat, null, mLastAccelerometer, mLastMagnetometer)
            SensorManager.getOrientation(rMat, orientation)
            mAzimuth = (Math.toDegrees(
                SensorManager.getOrientation(rMat, orientation)[0]
                    .toDouble()
            ) + 360).toInt() % 360
        }

        mAzimuth = mAzimuth.toFloat().roundToInt()

        var where = "NW"


        if (mAzimuth !in 11..349) where = "N"
        if (mAzimuth in 281..349) where = "NW"
        if (mAzimuth in 261..280) where = "W"
        if (mAzimuth in 191..260) where = "SW"
        if (mAzimuth in 171..190) where = "S"
        if (mAzimuth in 101..170) where = "SE"
        if (mAzimuth in 81..100) where = "E"
        if (mAzimuth in 11..80) where = "NE"

         "$mAzimuth° $where"
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {

        // this is unused currently
    }

}