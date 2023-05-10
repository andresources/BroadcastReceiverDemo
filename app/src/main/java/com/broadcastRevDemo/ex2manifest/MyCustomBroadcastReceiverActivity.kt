package com.broadcastRevDemo.ex2manifest

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import com.broadcastRevDemo.MainActivity
import com.broadcastRevDemo.R

class MyCustomBroadcastReceiverActivity : AppCompatActivity()  {
    companion object{
        val myData = MutableLiveData<String>()
    }
    private lateinit var tv: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)
        tv = findViewById(R.id.tv)
        myData.observe(this,{
            tv.setText(it)
        })
    }

    fun fSend(view: View) {
        val intentF = Intent(this,MyCustomBroadcastReceiver::class.java).apply {
            action = "myaction1"
        }
        sendBroadcast(intentF)
    }
}