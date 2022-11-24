package com.example.glosanewapp.ui.fragments

import android.Manifest
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Address
import android.location.Geocoder
import android.location.Location
import android.location.LocationManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Looper
import android.provider.Settings
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.glosanewapp.R
import com.example.glosanewapp.databinding.FragmentHomeBinding
import com.example.glosanewapp.network.UserSession
import com.example.glosanewapp.network.model.MqttUtils
import com.example.glosanewapp.ui.activity.LoginActivity
import com.example.glosanewapp.viewmodel.HomeFragmentViewModel
import com.google.android.gms.location.*
import java.util.*


class HomeFragment : Fragment() {

    val TAG = "HomeFragment"

    private lateinit var homeBinding: FragmentHomeBinding
    private lateinit var mcontext: Context
    private lateinit var homeFragmentViewModel: HomeFragmentViewModel

    private lateinit var fusedLocationProviderClient: FusedLocationProviderClient
    private lateinit var locationCallback: LocationCallback
    private lateinit var locationRequest: LocationRequest


    lateinit var builder: AlertDialog.Builder
    lateinit var alertDialog: AlertDialog

    lateinit var userSession: UserSession


    private var globallocation: Location? = null


    override fun onAttach(context: Context) {
        super.onAttach(context)
        mcontext = context
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for requireActivity() fragment

        homeBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        fusedLocationProviderClient =
            LocationServices.getFusedLocationProviderClient(requireContext())

        homeFragmentViewModel =
            ViewModelProvider(requireActivity())[HomeFragmentViewModel::class.java]

        homeBinding.viewmodel = homeFragmentViewModel
        homeBinding.executePendingBindings()



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

        userSession = UserSession(requireContext())


        homeBinding.homefragLogoutimg.setOnClickListener {
            openLogoutDialog()

        }
        initViews()


        return homeBinding.root
    }

    override fun onStart() {
        super.onStart()
        getCurrentLocation()
    }

    override fun onDestroy() {
        super.onDestroy()
        fusedLocationProviderClient.removeLocationUpdates(locationCallback)
    }

    private fun openLogoutDialog() {


        MqttUtils().setUserName("user3")
        MqttUtils().setPassword("dfFg7sEX52BQ")
        MqttUtils().setRegisterUrl("http://reg.vzmode-br.dltdemo.io:80/")
        MqttUtils().setMqttUrl("tcp://mqtt.vzmode-br.dltdemo.io:1883")


        builder = AlertDialog.Builder(requireContext())
        alertDialog = builder.create()

        if (!alertDialog.isShowing) {
            builder.setMessage("Do you need to Logout?")

            builder.setTitle("LogOut")

            builder.setCancelable(false)

            builder.setPositiveButton(
                "No"
            ) { dialog: DialogInterface?, _: Int ->
                // If user click no then dialog box is canceled.
                dialog?.cancel()
            }

            builder.setNegativeButton("Yes") { _: DialogInterface, _: Int ->

                // When the user click yes button then app will close
                userSession.clearSession()
                startActivity(Intent(requireActivity(), LoginActivity::class.java))
                requireActivity().finish()

            }
            alertDialog = builder.create()

            alertDialog.show()

        }
    }

    private fun initViews() {

        val userSession = UserSession(requireContext())

        homeBinding.homefragTvId.text =
            "ID: " + String.format("%08X", userSession.getUserId()!!.toInt())

        homeBinding.homefragPublishlayout.setOnClickListener {
            findNavController().navigate(R.id.action_home_to_publish)
        }
        homeBinding.homefragSubscribelayout.setOnClickListener {
            findNavController().navigate(R.id.action_home_to_subscribe)

        }


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
                if(ActivityCompat.checkSelfPermission(
                        requireContext(),
                        Manifest.permission.ACCESS_BACKGROUND_LOCATION
                    ) != PackageManager.PERMISSION_GRANTED){
                    Log.d(TAG, "getCurrentLocation: ")
                    dialogForBackgroundPermissionLocation()
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
                Manifest.permission.ACCESS_COARSE_LOCATION,
                Manifest.permission.ACCESS_BACKGROUND_LOCATION
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
                Log.d(TAG, "onRequestPermissionsResult: ")
                getCurrentLocation()

            } else {
                dialogForBackgroundPermissionLocation()
                Toast.makeText(requireContext(), "Permission Denied", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun dialogForBackgroundPermissionLocation() {

        val builder = AlertDialog.Builder(requireContext())
        var alertDialog = builder.create()

        if (!alertDialog.isShowing) {
            builder.setMessage("This app requires background location access for better results. Please enable location permission to \"Allow all the time \"inside settings page")

            builder.setTitle("Alert")

            builder.setCancelable(false)

            builder.setNegativeButton("Continue") { _: DialogInterface, _: Int ->

                // When the user click yes button then app will close

                var bundle = Bundle()
                bundle.putString("pointer_location", "Allow all the time")
                val i = Intent()
                i.action = Settings.ACTION_APPLICATION_DETAILS_SETTINGS
                i.addCategory(Intent.CATEGORY_DEFAULT)
                i.putExtras(bundle)
                i.data = Uri.parse("package:" + mcontext.packageName)

                mcontext.startActivity(i)

            }
            alertDialog = builder.create()
            alertDialog.setCanceledOnTouchOutside(false)
            alertDialog.show()
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
                    var city = address.getLocality()
                    var state = address.getAdminArea()
                    var country = address.getCountryName()
                    var postalCode = address.getPostalCode()
                    var knownName = address.getFeatureName()
                    homeBinding.homefragCurraddress.text = fulladdress

                } else {
                    fulladdress = "Location not found"
                    homeBinding.homefragCurraddress.text = fulladdress
                }
            } else {
                fulladdress = "Location not found"
                homeBinding.homefragCurraddress.text = fulladdress
            }
            // }
        } catch (ex: Exception) {

            ex.printStackTrace()
        }
    }

}