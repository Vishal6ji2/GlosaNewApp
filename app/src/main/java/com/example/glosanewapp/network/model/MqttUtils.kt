package com.example.glosanewapp.network.model

class MqttUtils {

    fun setUserName(username: String){
        Companion.username = username
    }

    @JvmName("setPassword1")
    fun setPassword(password: String){
        Companion.password = password
    }
    fun setRegisterUrl(registerUrl: String){
        Companion.registrationUrl = registerUrl
    }
    @JvmName("setMqttUrl1")
    fun setMqttUrl(mqttUrl: String){
        Companion.mqttUrl = mqttUrl
    }

    companion object {
        var username :String = "user3"
        var password:String = "dfFg7sEX52BQ"
        var registrationUrl:String = "http://reg.vzmode-br.dltdemo.io:80/"
        var mqttUrl:String = "tcp://mqtt.vzmode-br.dltdemo.io:1883"
    }

    fun getUserName():String{
        return username
    }

    fun getPassword():String{
        return password
    }

    fun getRegisterUrl():String{
        return registrationUrl
    }

    fun getMqttUrl():String{
        return mqttUrl
    }

}