package com.example.glosanewapp.viewmodel

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class SubscriptionFragmentViewModel : ViewModel() {
    
    val TAG = "SUBSCRIBEVIEWMODEL"

    val registerId: String? = null
    var redlight:ObservableField<Boolean> = ObservableField(false)
    var greenlight:ObservableField<Boolean> = ObservableField(false)
    val cityName: String? = null
}