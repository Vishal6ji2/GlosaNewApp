package com.example.glosanewapp.listeners

interface SubscriptionDataListener {
    fun notifyDataReceived(isPublisherData: Boolean, dataDispatchedTime: String)
}