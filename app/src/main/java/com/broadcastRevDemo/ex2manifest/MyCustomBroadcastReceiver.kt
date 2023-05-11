package com.broadcastRevDemo.ex2manifest

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class MyCustomBroadcastReceiver : BroadcastReceiver() {
    var str = ""
    override fun onReceive(context: Context?, intent: Intent?) {

        intent.let {
            when(it?.action){
                "com.demo.start" -> str = "Player is started"
                "com.demo.stop" -> str = "Player is stopped"
            }
        }
        MyCustomBroadcastReceiverActivity.myData.value = "Value : ${str}"
    }
}