package com.example.glosanewapp.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.glosanewapp.network.RetrofitClient
import com.example.glosanewapp.network.model.RegisterRequest
import com.example.glosanewapp.network.model.RegisterResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object LoginRepository {

    val responseData = MutableLiveData<RegisterResponse>()

    fun getRegisterApiCall(registerRequest: RegisterRequest): MutableLiveData<RegisterResponse> {

        val call = RetrofitClient.apiInterface.registration(registerRequest)

        call.enqueue(object : Callback<RegisterResponse> {
            override fun onFailure(call: Call<RegisterResponse>, t: Throwable) {
                Log.v("DEBUG : ", t.message.toString())
            }

            override fun onResponse(
                call: Call<RegisterResponse>,
                response: Response<RegisterResponse>
            ) {
                Log.v("DEBUG : ", response.body().toString())

                val data = response.body()
                data.let {
                    responseData.value = it
                }
            }
        })

        return responseData
    }
}