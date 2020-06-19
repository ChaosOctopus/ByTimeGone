package com.time.wistimegone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.time.wistimegone.databinding.ActivityTimeBinding

/**
 * @author yangping
 */
// only one activity in this project
class TimeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ActivityTimeBinding>(this,R.layout.activity_time)
    }
}