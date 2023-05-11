package com.broadcastRevDemo.ex4screenonoff

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class ScreenOnOffBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context,"Screen ON/OFF", Toast.LENGTH_LONG).show()
    }
}