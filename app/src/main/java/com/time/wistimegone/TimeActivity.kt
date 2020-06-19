package com.time.wistimegone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// only one activity in this project
class TimeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time)
    }
}