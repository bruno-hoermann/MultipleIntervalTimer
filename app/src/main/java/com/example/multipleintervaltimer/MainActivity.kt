package com.example.multipleintervaltimer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.androchef.happytimer.countdowntimer.HappyTimer

class MainActivity : AppCompatActivity() {

    private val timer = HappyTimer(60)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onDestroy() {
        super.onDestroy()
        //Stop Timer
        timer.stop()
    }
}