package com.example.pcb

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class fanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fan)
        val actionBar = supportActionBar
        actionBar!!.title = "Chłodzenie"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}