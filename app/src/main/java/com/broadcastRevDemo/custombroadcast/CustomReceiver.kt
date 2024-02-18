package com.broadcastRevDemo.custombroadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class CustomReceiver : BroadcastReceiver(){
    override fun onReceive(p0: Context?, p1: Intent?) {
        Toast.makeText(p0,"Helol",Toast.LENGTH_SHORT).show()
    }
}