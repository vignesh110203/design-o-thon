package com.example.studentdashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class create_new : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_new)

        var Create: Button = findViewById(R.id.Create)
        Create.setOnClickListener {
            val intent = Intent(this, end::class.java)
            startActivity(intent)
        }
    }
}