package com.example.glosanewapp.network

import android.content.Context
import android.content.SharedPreferences
import androidx.fragment.app.Fragment

class UserSession(context: Context) {

    private val sharedPreferences : SharedPreferences = context.getSharedPreferences("usersession",Context.MODE_PRIVATE)
    private val editor = sharedPreferences.edit()
    private val USER_ID_KEY = "user_id"
    private val IS_USER_REGISTERED = "isUserReg"


    fun putUserId(userId: String){

        editor.putBoolean(IS_USER_REGISTERED,true)
        editor.putString(USER_ID_KEY, userId)
        editor.apply()
    }

    fun getUserId(): String? {
        return sharedPreferences.getString(USER_ID_KEY, null)
    }

    fun checkLogin(): Boolean {
        return sharedPreferences.getBoolean(IS_USER_REGISTERED, false)
    }

    fun clearSession() {
        editor.clear()
        editor.apply()
    }


}