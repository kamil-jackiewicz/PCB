package com.example.pcb

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val actionBar = supportActionBar
        actionBar!!.title = "Second Activity"
        actionBar.setDisplayHomeAsUpEnabled(true)

        val secondActivity: Button = findViewById(R.id.cpu_button)
        secondActivity.setOnClickListener {
            val Intent = Intent(this, cpuActivity::class.java)
            startActivity(Intent)
        }
    }
}