package com.example.studentdashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class otp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp)
        var otp : Button = findViewById(R.id.otp)
        otp.setOnClickListener {
            val intent = Intent(this, request::class.java)
            startActivity(intent)
        }
    }
}
