package com.example.glosanewapp.viewmodel

import androidx.lifecycle.ViewModel

class LiveFeedsViewModel : ViewModel() {
    var id: Int? = null
    var distance: Int = 0
    var type: String? = null
    var streetName: String? = null
    var datatime: Long = 0L
    var latitude: String? = null
    var longitude: String? = null
    var speed: String? = null
    var direction: String? = null
}