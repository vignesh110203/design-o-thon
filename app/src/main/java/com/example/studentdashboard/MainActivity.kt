package com.example.studentdashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var loginBtn : Button = findViewById(R.id.loginBtn)
        loginBtn.setOnClickListener{
            val intent = Intent ( this,otp::class.java)
            startActivity(intent)
        }
    }
}
