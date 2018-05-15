package com.blanke.activityproject.restore

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.blanke.activityproject.R
import com.blanke.activityproject.lifecycle.BaseLifecycleActivity
import com.blanke.activityproject.lifecycle.TwoActivity
import kotlinx.android.synthetic.main.activity_restore.*

class RestoreActivity : BaseLifecycleActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restore)
        bu_jump_two?.setOnClickListener {
            startActivity(Intent(this, TwoActivity::class.java))
        }
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        Log.d(this.javaClass.simpleName, "onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(this.javaClass.simpleName, "onRestoreInstanceState savedInstanceState = $savedInstanceState")
    }
}
