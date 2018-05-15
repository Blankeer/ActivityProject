package com.blanke.activityproject

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.blanke.activityproject.launchmode.ModeOneActivity
import com.blanke.activityproject.lifecycle.OneActivity
import com.blanke.activityproject.restore.RestoreActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bu_lifecycle?.setOnClickListener {
            startActivity(Intent(this, OneActivity::class.java))
        }
        bu_restore?.setOnClickListener {
            startActivity(Intent(this, RestoreActivity::class.java))
        }
        bu_launchmode?.setOnClickListener {
            startActivity(Intent(this@MainActivity, ModeOneActivity::class.java))
        }
    }
}
