package com.example.pcb

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class gpuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gpu)
        val actionBar = supportActionBar
        actionBar!!.title = "GPU"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}