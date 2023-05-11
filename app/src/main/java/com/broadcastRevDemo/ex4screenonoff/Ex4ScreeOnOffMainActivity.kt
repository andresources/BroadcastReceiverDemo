package com.broadcastRevDemo.ex4screenonoff

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.broadcastRevDemo.R

class Ex4ScreeOnOffMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex4_scree_on_off_main)
        val intent:Intent = Intent(this,MyService::class.java)
        startService(intent)
    }
}