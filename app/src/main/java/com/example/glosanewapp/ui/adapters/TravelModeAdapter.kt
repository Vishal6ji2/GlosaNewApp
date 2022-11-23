package com.example.glosanewapp.ui.adapters

import android.content.res.Resources
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.glosanewapp.R
import com.example.glosanewapp.databinding.CustomModeLayoutBinding
import com.example.glosanewapp.network.model.TravelMode


class TravelModeAdapter : RecyclerView.Adapter<TravelModeAdapter.RecyclerViewViewHolder>() {

    private var travelModeList : ArrayList<TravelMode>? = null

/*
    private var hasInitParentDimensions = false
    private var maxImageWidth: Int = 0
    private var maxImageHeight: Int = 0
    private var maxImageAspectRatio: Float = 1f
*/

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewViewHolder {




        val customModeLayoutBinding = DataBindingUtil.inflate<CustomModeLayoutBinding>(
            LayoutInflater.from(parent.context),
            R.layout.custom_mode_layout, parent, false
        )

        /*if (!hasInitParentDimensions) {
            maxImageWidth = parent.width
            maxImageHeight = parent.height
            maxImageAspectRatio = maxImageWidth.toFloat() / maxImageHeight.toFloat()
            hasInitParentDimensions = true
        }*/

/*
        val displayWidth: Int = Resources.getSystem().displayMetrics.widthPixels
        customModeLayoutBinding.customModeLayout.layoutParams.width = displayWidth - dpToPx(16) * 4
*/

        return RecyclerViewViewHolder(customModeLayoutBinding)
    }

    private fun dpToPx(dp: Int): Int {
        return TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP,
            dp.toFloat(),
            Resources.getSystem().displayMetrics
        ).toInt()
    }

    override fun onBindViewHolder(holder: RecyclerViewViewHolder, position: Int) {
        val currentMode = travelModeList!![position]

        holder.customModeLayoutBinding.travelmode = currentMode


/*        val imageAspectRatio = currentMode.aspectRatio



        val targetImageWidth: Int =
            if (imageAspectRatio < maxImageAspectRatio) {
                // Tall image: height = max, width adjusts
                (maxImageHeight * imageAspectRatio).roundToInt()
            } else {
                // Wide image: width = max
                maxImageWidth
            }



        holder.itemView.layoutParams = RecyclerView.LayoutParams(
            targetImageWidth,
            RecyclerView.LayoutParams.MATCH_PARENT
        )
*/

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

    inner class RecyclerViewViewHolder(var customModeLayoutBinding: CustomModeLayoutBinding) :
        RecyclerView.ViewHolder(customModeLayoutBinding.root) {

    }

}