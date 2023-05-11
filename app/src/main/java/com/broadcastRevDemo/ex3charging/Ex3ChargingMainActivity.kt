package com.broadcastRevDemo.ex3charging

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.broadcastRevDemo.R

class Ex3ChargingMainActivity : AppCompatActivity() {
    lateinit var myReceiver: ChargingBroadcastReceiver
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex3_charging_main)
        Log.i("MT","onCreate")
    }

    override fun onStart() {
        super.onStart()
        myReceiver = ChargingBroadcastReceiver()
        val intentFilter = IntentFilter()
        intentFilter.addAction(Intent.ACTION_POWER_CONNECTED)//ACTION_POWER_CONNECTED
        intentFilter.addAction(Intent.ACTION_POWER_DISCONNECTED)
        registerReceiver(myReceiver,intentFilter)
        Log.i("MT","onStart")
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(myReceiver)
        Log.i("MT","onStop")
    }
}