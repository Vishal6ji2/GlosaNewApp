package com.example.glosanewapp.viewmodel

import android.util.Log
import android.widget.CompoundButton
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PublishFragmentViewModel : ViewModel() {

    private val TAG = "PUBLISHVIEWMODEL"

    var selectedMode : String? = null

    val broadcastChecked: MutableLiveData<Boolean> = MutableLiveData()

    val locationSharedChecked: MutableLiveData<Boolean> = MutableLiveData()

    fun executeOnLocationStatusChanged(switch: CompoundButton, isChecked: Boolean) {
        Log.d(TAG, "executeOnLocationStatusChanged: $isChecked")
    }

    fun executeOnBroadcastStatusChanged(switch: CompoundButton, isChecked: Boolean) {
        Log.d(TAG, "executeOnBroadcastStatusChanged: $isChecked")
    }
}