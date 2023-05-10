package com.broadcastRevDemo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tv:TextView
    private lateinit var myBroadcastReceiver: MyBroadcastReceiver
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.tv)
        myBroadcastReceiver = MyBroadcastReceiver()
        val intentFilter = IntentFilter()
        intentFilter.addAction("START")
        intentFilter.addAction("STOP")
        intentFilter.addAction("PAUSE")
        intentFilter.addAction("RESUME")
        registerReceiver(myBroadcastReceiver,intentFilter)
    }

    fun fSend(view: View) {
        sendBroadcast(Intent("STOP"))
    }
    inner class MyBroadcastReceiver : BroadcastReceiver(){
        override fun onReceive(context: Context?, intent: Intent?) {
            intent.let {
                when(it?.action){
                    "START" ->{
                        tv.setText("Action : START")
                    }
                    "STOP" ->{
                        tv.setText("Action : STOP")
                    }
                    "PAUSE" ->{
                        tv.setText("Action : PAUSE")
                    }
                    "RESUME" ->{
                        tv.setText("Action : RESUME")
                    }
                }
            }

        }
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(myBroadcastReceiver)
    }
}