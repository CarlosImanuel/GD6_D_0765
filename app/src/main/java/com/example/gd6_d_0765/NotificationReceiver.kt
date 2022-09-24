package com.example.gd6_d_0765

import android.content.Context
import android.widget.Toast
import android.content.Intent
import android.content.BroadcastReceiver

class NotificationReceiver : BroadcastReceiver(){
    override fun onReceive(context: Context, intent: Intent) {
        val message = intent.getStringExtra("toastMessage")
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}