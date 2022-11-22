package com.example.glosanewapp.ui.activity

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.glosanewapp.databinding.ActivityLoginBinding
import com.example.glosanewapp.network.model.MqttUtils

import com.example.glosanewapp.viewmodel.LoginActivityViewModel
import com.example.glosanewapp.network.UserSession
import info.mqtt.android.service.MqttAndroidClient
import org.eclipse.paho.client.mqttv3.*

class LoginActivity : AppCompatActivity() {

    var TAG = "LoginActivity"


    private lateinit var binding: ActivityLoginBinding

    private lateinit var userSession: UserSession

    lateinit var viewModel: LoginActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        userSession = UserSession(this)

        viewModel = ViewModelProvider(this)[LoginActivityViewModel::class.java]
        binding.viewmodel = viewModel
        binding.executePendingBindings()

        binding.loginEtUsername.text = Editable.Factory.getInstance().newEditable("user3")
        binding.loginEtPassword.text = Editable.Factory.getInstance().newEditable("dfFg7sEX52BQ")
        binding.loginEtRegurl.text = Editable.Factory.getInstance().newEditable("http://reg.vzmode-br.dltdemo.io:80/")
        binding.loginEtMqtturl.text = Editable.Factory.getInstance().newEditable("tcp://mqtt.vzmode-br.dltdemo.io:1883")

        if (userSession.checkLogin()){
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        initViews()
    }

    private fun initViews() {

        binding.loginBtnConnect.setOnClickListener {
            val msg = viewModel.isValid()
            if (msg == "Login Successfully") {
                callApi()
            }else{
                Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun callApi() {
        viewModel.getRegister()?.observe(this) {
//            Toast.makeText(this, it.iD.toString(), Toast.LENGTH_SHORT).show()


            /*myMqttClient.connectMQTT(this,it.iD.toString(),
                viewModel.mqttUrl.toString(), viewModel.userName.toString(), viewModel.password.toString()
            )*/
            connectMQTT(it.iD.toString())

        }
    }

    private fun setUpConnectionOptions(username: String, password: String): MqttConnectOptions {
        val connOpts = MqttConnectOptions()
        connOpts.isCleanSession = true
        connOpts.userName = username
        connOpts.password = password.toCharArray()
        connOpts.isAutomaticReconnect = true
        connOpts.serverURIs = arrayOf(viewModel.mqttUrl)
        connOpts.keepAliveInterval = 15
        connOpts.connectionTimeout = 30
        return connOpts
    }

    private fun connectMQTT(id: String)
    {

        val client = MqttAndroidClient(this, viewModel.mqttUrl.toString(), id)
            try {
                val connOpts = setUpConnectionOptions(viewModel.userName.toString(), viewModel.password.toString())
                client.connect(connOpts, null, object : IMqttActionListener {
                    override fun onSuccess(asyncActionToken: IMqttToken?) {
                        Log.d(TAG, "onSuccess: Connection Success")

                        Toast.makeText(this@LoginActivity, "Connection Success", Toast.LENGTH_SHORT).show()

                        MqttUtils().setUserName(viewModel.userName.toString())
                        MqttUtils().setPassword(viewModel.password.toString())
                        MqttUtils().setRegisterUrl(viewModel.registrationUrl.toString())
                        MqttUtils().setMqttUrl(viewModel.mqttUrl.toString())

                        userSession.putUserId(id)

                        startActivity(Intent(this@LoginActivity, MainActivity::class.java))
                        finish()
                    }

                    override fun onFailure(asyncActionToken: IMqttToken?, exception: Throwable?) {
                        Log.d(TAG, "onFailure: Connection Failure")
                        Toast.makeText(this@LoginActivity, "Connection Failure", Toast.LENGTH_SHORT)
                            .show()
                    }

                })
            } catch (e: MqttException) {
                e.printStackTrace()
            }
        }


}