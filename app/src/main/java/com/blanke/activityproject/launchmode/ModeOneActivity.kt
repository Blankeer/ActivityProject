package com.blanke.activityproject.launchmode

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.blanke.activityproject.R
import kotlinx.android.synthetic.main.activity_mode_one.*

class ModeOneActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mode_one)
        bu_mode_one?.setOnClickListener {
            val intent = Intent(this@ModeOneActivity, ModeOneActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }
        bu_mode_two?.setOnClickListener {
            startActivity(Intent(this@ModeOneActivity, ModeOneActivity::class.java))
        }
    }
}
