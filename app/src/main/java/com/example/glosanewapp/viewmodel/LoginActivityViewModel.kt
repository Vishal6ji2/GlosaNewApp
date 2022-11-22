package com.example.glosanewapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.glosanewapp.network.model.ClientInformation
import com.example.glosanewapp.network.model.RegisterRequest
import com.example.glosanewapp.network.model.RegisterResponse
import com.example.glosanewapp.repository.LoginRepository
import info.mqtt.android.service.MqttAndroidClient


class LoginActivityViewModel : ViewModel() {


    var userName: String? = null
    var password: String? = null
    var registrationUrl: String? = null
    var mqttUrl: String? = null

    var registerIdData: MutableLiveData<RegisterResponse>? = null


    fun getRegister(): LiveData<RegisterResponse>? {

        val registerRequest = RegisterRequest(ClientInformation("SW", "VZ", "NA"))

        registerIdData = LoginRepository.getRegisterApiCall(registerRequest)
        return registerIdData
    }

    fun isValid(): String {
        if (userName?.equals("user3") == false) {
            return "Invalid User"
        } else if (password?.equals("dfFg7sEX52BQ") == false) {
            return "Invalid Password"
        } else if (registrationUrl?.equals("http://reg.vzmode-br.dltdemo.io:80/") == false) {
            return "Invalid Registration Url"
        } else if (mqttUrl?.equals("tcp://mqtt.vzmode-br.dltdemo.io:1883") == false) {
            return "Invalid Mqtt Url"
        }
        return "Login Successfully"
    }

}