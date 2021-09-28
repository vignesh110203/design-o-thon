package com.example.studentdashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class new_request : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_request)

        var create: TextView = findViewById(R.id.textView5)
        create.setOnClickListener {
            val intent = Intent(this, details::class.java)
            startActivity(intent)
        }
    }
    }
