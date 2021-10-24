package com.example.pcb

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class psuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_psu)
        val actionBar = supportActionBar
        actionBar!!.title = "PSU"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}