package com.example.glosanewapp.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.ScaleAnimation
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

        when (position) {
            0 -> {
                holder.customModeLayoutBinding.customModeModeimg.setImageResource(R.drawable.ic_pedestrian)
            }
            1 -> {
                holder.customModeLayoutBinding.customModeModeimg.setImageResource(R.drawable.ic_generalvehicle)
            }
            else -> {
                holder.customModeLayoutBinding.customModeModeimg.setImageResource(R.drawable.ic_emergency)
            }
        }

    }

    override fun getItemCount(): Int {
        return travelModeList!!.size
    }

    fun setDeveloperList(travelModeList: ArrayList<TravelMode>) {
        this.travelModeList = travelModeList
        notifyDataSetChanged()
    }

    private fun setScaleAnimation(view: View) {
        val anim = ScaleAnimation(
            0.0f,
            1.0f,
            0.0f,
            1.0f,
            Animation.RELATIVE_TO_SELF,
            0.5f,
            Animation.RELATIVE_TO_SELF,
            0.5f
        )
        anim.duration = 1000
        view.startAnimation(anim)
    }


    inner class RecyclerViewViewHolder(var customModeLayoutBinding: CustomModeLayoutBinding) :
        RecyclerView.ViewHolder(customModeLayoutBinding.root) {

    }

}