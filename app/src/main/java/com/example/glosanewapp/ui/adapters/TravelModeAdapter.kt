package com.example.glosanewapp.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.glosanewapp.R
import com.example.glosanewapp.databinding.CustomModeLayoutBinding
import com.example.glosanewapp.network.model.TravelMode

class TravelModeAdapter : RecyclerView.Adapter<TravelModeAdapter.RecyclerViewViewHolder>() {

    private var travelModeList : ArrayList<TravelMode>? = null



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewViewHolder {

        val customModeLayoutBinding = DataBindingUtil.inflate<CustomModeLayoutBinding>(
            LayoutInflater.from(parent.context),
            R.layout.custom_mode_layout, parent, false
        )

        return RecyclerViewViewHolder(customModeLayoutBinding)
    }

    override fun onBindViewHolder(holder: RecyclerViewViewHolder, position: Int) {
        val currentMode = travelModeList!![position]

        holder.customModeLayoutBinding.travelmode = currentMode
    }

    override fun getItemCount(): Int {
        return travelModeList!!.size
    }

    fun setDeveloperList(travelModeList: ArrayList<TravelMode>) {
        this.travelModeList = travelModeList
        notifyDataSetChanged()
    }

    inner class RecyclerViewViewHolder(var customModeLayoutBinding: CustomModeLayoutBinding) :
        RecyclerView.ViewHolder(customModeLayoutBinding.root) {
//        var imgView_icon: ImageView

    }


}