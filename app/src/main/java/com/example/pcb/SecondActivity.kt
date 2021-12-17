package com.example.pcb

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Button
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SwitchCompat

class SecondActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val actionBar = supportActionBar
        actionBar!!.title = "Wybierz komponent"
        actionBar.setDisplayHomeAsUpEnabled(true)

        val secondActivity_cpu: Button = findViewById(R.id.cpu_button)
        secondActivity_cpu.setOnClickListener {
            val Intent = Intent(this, cpuActivity::class.java)
            startActivity(Intent)
        }
        val secondActivity_gpu: Button = findViewById(R.id.gpu_button)
        secondActivity_gpu.setOnClickListener {
            val Intent = Intent(this, gpuActivity::class.java)
            startActivity(Intent)
        }
        val secondActivity_mobo: Button = findViewById(R.id.mobo_button)
        secondActivity_mobo.setOnClickListener {
            val Intent = Intent(this, moboActivity::class.java)
            startActivity(Intent)
        }
        val secondActivity_ram: Button = findViewById(R.id.ram_button)
        secondActivity_ram.setOnClickListener {
            val Intent = Intent(this, ramActivity::class.java)
            startActivity(Intent)
        }
        val secondActivity_psu: Button = findViewById(R.id.psu_button)
        secondActivity_psu.setOnClickListener {
            val Intent = Intent(this, psuActivity::class.java)
            startActivity(Intent)
        }
        val secondActivity_tower: Button = findViewById(R.id.tower_button)
        secondActivity_tower.setOnClickListener {
            val Intent = Intent(this, towerActivity::class.java)
            startActivity(Intent)
        }
        val secondActivity_disk: Button = findViewById(R.id.disk_button)
        secondActivity_disk.setOnClickListener {
            val Intent = Intent(this, diskActivity::class.java)
            startActivity(Intent)
        }
        val secondActivity_fan: Button = findViewById(R.id.fan_button)
        secondActivity_fan.setOnClickListener {
            val Intent = Intent(this, fanActivity::class.java)
            startActivity(Intent)
        }
        var flag = true;
        val switch_cpu_bar = findViewById<SwitchCompat>(R.id.switch_intel_amd)
        val button_cpu_color = findViewById<Button>(R.id.cpu_button)
        switch_cpu_bar.setOnClickListener {
            if (flag) {
                button_cpu_color.backgroundTintList = getColorStateList(android.R.color.holo_purple)
                flag = false
            }else{
                button_cpu_color.backgroundTintList = getColorStateList(android.R.color.holo_green_dark)
                flag = true
            }
        }
    }
}