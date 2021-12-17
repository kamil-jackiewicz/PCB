package com.example.pcb

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class cpuActivity_amd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cpu_amd)
        val actionBar = supportActionBar
        actionBar!!.title = "AMD"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}