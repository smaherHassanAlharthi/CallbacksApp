package com.smaher.callbacksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val btn3 = findViewById<Button>(R.id.buttonActivity1)
        btn3.setOnClickListener(object :  View.OnClickListener {
            override fun onClick(v: View?) {

                val intent = Intent(this@MainActivity3,MainActivity::class.java)
                startActivity(intent)
            }
        })
    }
}