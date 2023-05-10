package com.broadcastRevDemo.ex2manifest

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyCustomBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context,"send", Toast.LENGTH_LONG).show()
        MyCustomBroadcastReceiverActivity.myData.value = "Hello from receiver>>>>"
    }
}