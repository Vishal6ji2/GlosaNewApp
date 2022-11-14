package com.example.glosanewapp.repository

import androidx.lifecycle.MutableLiveData
import com.example.glosanewapp.R
import com.example.glosanewapp.network.model.TravelMode

class TravelModeRepository {

    private var travelModeList = ArrayList<TravelMode>()

    private val liveTravelModeData = MutableLiveData<List<TravelMode>>()


    fun getTravelModeData(): MutableLiveData<List<TravelMode>>{
        if (travelModeList.isNotEmpty()) travelModeList.clear()

        val travelMode1 = TravelMode("Pedestrian", "I'm Pedestrian So Please take care of me", R.drawable.ic_pedestrianicon)
        val travelMode2 = TravelMode("General Vehicle", "I'm general vehicle,So Please take care of me", R.drawable.caricon)
        val travelMode3 = TravelMode("Emergency Vehicle", "I'm Emergency Vehicle, So Please take care of me", R.drawable.caricon)

        travelModeList.add(travelMode1)
        travelModeList.add(travelMode2)
        travelModeList.add(travelMode3)

        liveTravelModeData.value = travelModeList

        return liveTravelModeData
    }
}