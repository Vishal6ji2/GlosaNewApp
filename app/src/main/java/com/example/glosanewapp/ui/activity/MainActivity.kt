package com.example.glosanewapp.ui.activity


import android.Manifest
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.glosanewapp.R
import com.example.glosanewapp.databinding.ActivityMainBinding
import com.example.glosanewapp.ui.fragments.HomeFragment
import com.example.glosanewapp.viewmodel.MainActivityViewModel


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var navController: NavController


    lateinit var mainActivityViewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        mainActivityViewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]

        binding.viewmodel = mainActivityViewModel
        binding.executePendingBindings()

        initViews()

//        throw RuntimeException("Test Crash") // Force a crash


    }

    private fun checkOverlayPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (!Settings.canDrawOverlays(this)) {
                val intent = Intent(
                    Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
                    Uri.parse("package:$packageName")
                )
                startActivityForResult(intent, ACTION_MANAGE_OVERLAY_PERMISSION_REQUEST_CODE)
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == ACTION_MANAGE_OVERLAY_PERMISSION_REQUEST_CODE) {
            if (if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    !Settings.canDrawOverlays(this)
                } else {
                    TODO("VERSION.SDK_INT < M")
                }
            ) {
                // You don't have permission
                checkOverlayPermission()
            } else {
                // Do as per your logic
            }

        }
    }

    companion object {
        const val ACTION_MANAGE_OVERLAY_PERMISSION_REQUEST_CODE = 5469
    }
    private fun initViews() {

        navController = this.findNavController( R.id.navhostfragment);
        binding.mainBnv.setupWithNavController(navController)

    }





}