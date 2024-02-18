package com.broadcastRevDemo.custombroadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.broadcastRevDemo.R

class CustomBroadcastActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_broadcast)
    }

    override fun onStart() {
        super.onStart()
        val intentFilter = IntentFilter()
        intentFilter.addAction("com.start")
        intentFilter.addAction("com.stop")
        registerReceiver(customReceiver,intentFilter)
    }

    private val customReceiver: BroadcastReceiver = object : BroadcastReceiver(){
        override fun onReceive(p0: Context?, p1: Intent?) {
            when(p1?.action){
                "com.start" -> Toast.makeText(p0,"Start",Toast.LENGTH_SHORT).show()
                "com.stop" -> Toast.makeText(p0,"Stop",Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun startBroadcast(view: View) {
        val intent = Intent()
        intent.action = "com.start"
        sendBroadcast(intent)
    }

    fun stopBroadcast(view: View) {
        val intent = Intent()
        intent.action = "com.stop"
        sendBroadcast(intent)
    }
}