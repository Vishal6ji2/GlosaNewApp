package com.example.glosanewapp.util

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import androidx.core.content.ContextCompat


class PermissionUtils(val context: Context) {
    private val permission =
        ContextCompat.checkSelfPermission(context, Manifest.permission.WRITE_EXTERNAL_STORAGE)
    private val permission2 =
        ContextCompat.checkSelfPermission(context, Manifest.permission.READ_EXTERNAL_STORAGE)
    private val permission3 = ContextCompat.checkSelfPermission(context, Manifest.permission.CAMERA)
    private val locationPermissionFine =
        ContextCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION)
    private val locationPermissionCross =
        ContextCompat.checkSelfPermission(context, Manifest.permission.ACCESS_COARSE_LOCATION)

    fun permisstionCheck(): Boolean {
        return if (permission != PackageManager.PERMISSION_GRANTED) false
        else if (permission2 != PackageManager.PERMISSION_GRANTED) false
        else permission3 == PackageManager.PERMISSION_GRANTED
    }

    fun checkLocationPermission(): Boolean {
        return locationPermissionFine == PackageManager.PERMISSION_GRANTED && locationPermissionCross == PackageManager.PERMISSION_GRANTED
    }

}