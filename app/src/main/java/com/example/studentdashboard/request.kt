package com.example.studentdashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class request : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_request)
        var newReq: Button = findViewById(R.id.newReq)
        newReq.setOnClickListener {
            val intent = Intent(this, new_request::class.java)
            startActivity(intent)
        }

            var createNew: Button = findViewById(R.id.createNew)
            createNew.setOnClickListener {
                val intent = Intent(this, create_new::class.java)
                startActivity(intent)
            }
    }
}