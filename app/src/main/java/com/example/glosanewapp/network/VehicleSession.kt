package com.example.glosanewapp.network

import android.content.Context
import android.content.SharedPreferences

class VehicleSession(context: Context) {

    private val sharedPreferences : SharedPreferences = context.getSharedPreferences("Vehiclesession",Context.MODE_PRIVATE)
    private val editor = sharedPreferences.edit()
    private val Vehicle_ID_KEY = "Vehicle_id"
    private val IS_Vehicle_REGISTERED = "isVehReg"


    fun putVehicleId(Vehicleid: String){

        editor.putBoolean(IS_Vehicle_REGISTERED,true)
        editor.putString(Vehicle_ID_KEY, Vehicleid)
        editor.apply()
    }

    fun getVehicleId(): String? {
        return sharedPreferences.getString(Vehicle_ID_KEY, null)
    }

    fun checkVehicleLogin(): Boolean {
        return sharedPreferences.getBoolean(IS_Vehicle_REGISTERED, false)
    }


}