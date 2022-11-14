package com.example.glosanewapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.glosanewapp.network.model.TravelMode
import com.example.glosanewapp.repository.TravelModeRepository

class TravelModeViewModel : ViewModel() {

    private val travelModeRepository : TravelModeRepository = TravelModeRepository()

    val allTravelMode: LiveData<List<TravelMode>>
        get() = travelModeRepository.getTravelModeData()

}