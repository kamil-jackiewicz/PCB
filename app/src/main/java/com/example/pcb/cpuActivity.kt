package com.example.pcb

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class cpuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cpu)
        val actionBar = supportActionBar
        actionBar!!.title = "CPU"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}