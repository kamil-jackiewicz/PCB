package com.example.pcb

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val secondActivity: Button = findViewById(R.id.start_button)
        secondActivity.setOnClickListener {
           val Intent = Intent(this, SecondActivity::class.java)
            startActivity(Intent)
        }
    }
}