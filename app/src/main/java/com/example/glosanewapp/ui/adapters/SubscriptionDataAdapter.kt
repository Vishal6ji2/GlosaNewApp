package com.example.glosanewapp.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.glosanewapp.R
import com.example.glosanewapp.viewmodel.LiveFeedsViewModel

class SubscriptionDataAdapter(context: Context?, data: ArrayList<LiveFeedsViewModel>) :
    RecyclerView.Adapter<SubscriptionDataAdapter.ViewHolder>() {
    private var mData: List<LiveFeedsViewModel>
    private val mInflater: LayoutInflater
    private var mClickListener: ItemClickListener? = null

    init {
        mData = data
    }

    fun refreshAdapter(data: List<LiveFeedsViewModel>) {
        mData = data
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = mInflater.inflate(R.layout.custom_live_layout, parent, false)
        return ViewHolder(view)
    }

    // binds the data to the TextView in each row
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.img.setImageResource(if(mData[position].type.equals("eva")) R.drawable.emergencyicon else R.drawable.pedicon)
        holder.title.text=if(mData[position].type.equals("eva")) "Emergency is moving " else "Pedestrian is moving"
        holder.streetName_tv.text = mData[position].streetName
        holder.latlng_tv.text = mData[position].latitude+", "+mData[position].longitude
        holder.speed_tv.text = mData[position].speed
        holder.direction_tv.text = mData[position].direction
    }

    // total number of rows
    override fun getItemCount(): Int {
        return mData.size
    }

    // stores and recycles views as they are scrolled off screen
    inner class ViewHolder internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {
        var streetName_tv: TextView
        var latlng_tv: TextView
        var speed_tv: TextView
        var direction_tv: TextView
        var title: TextView
        var img:ImageView

        override fun onClick(view: View) {
            if (mClickListener != null) mClickListener!!.onItemClick(view, adapterPosition)
        }

        init {
            title = itemView.findViewById(R.id.custom_live_tvmoving)
            img = itemView.findViewById(R.id.custom_live_imgtype)
            streetName_tv = itemView.findViewById(R.id.custom_live_tv_streetname)
            latlng_tv = itemView.findViewById(R.id.custom_live_tv_latlng)
            speed_tv = itemView.findViewById(R.id.custom_live_tv_speed)
            direction_tv = itemView.findViewById(R.id.custom_live_tv_direction)
            itemView.setOnClickListener(this)
        }
    }

    /* // convenience method for getting data at click position
    String getItem(int id) {
        return mData.get(id);
    }*/
    // allows clicks events to be caught
    fun setClickListener(itemClickListener: ItemClickListener?) {
        mClickListener = itemClickListener
    }

    // parent activity will implement this method to respond to click events
    interface ItemClickListener {
        fun onItemClick(view: View?, position: Int)
    }

    // data is passed into the constructor
    init {
        mInflater = LayoutInflater.from(context)
        mData = data
    }
}