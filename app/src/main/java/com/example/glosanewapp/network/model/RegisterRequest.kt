package com.example.glosanewapp.network.model

import com.google.gson.annotations.SerializedName

data class RegisterRequest(

	@field:SerializedName("ClientInformation")
	val clientInformation: ClientInformation? = null
)

data class ClientInformation(

	@field:SerializedName("EntityType")
	val entityType: String? = null,

	@field:SerializedName("VendorID")
	val vendorID: String? = null,

	@field:SerializedName("EntitySubtype")
	val entitySubtype: String? = null
)
