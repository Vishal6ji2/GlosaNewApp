package com.example.glosanewapp.network

import com.example.glosanewapp.network.model.RegisterRequest
import com.example.glosanewapp.network.model.RegisterResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiInterface {

    @POST("registration")
    fun registration(@Body registerRequest: RegisterRequest) : Call<RegisterResponse>


}