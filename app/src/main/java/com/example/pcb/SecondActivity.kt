package com.example.pcb

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val actionBar = supportActionBar
        actionBar!!.title = "Second Activity"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }

}