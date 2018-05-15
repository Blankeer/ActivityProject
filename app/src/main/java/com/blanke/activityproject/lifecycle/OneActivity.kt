package com.blanke.activityproject.lifecycle

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AlertDialog
import com.blanke.activityproject.R
import kotlinx.android.synthetic.main.activity_one.*

class OneActivity : BaseLifecycleActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)
        bu_jump_two?.setOnClickListener {
            startActivity(Intent(this, TwoActivity::class.java))
        }
        bu_dialog?.setOnClickListener {
            AlertDialog.Builder(this@OneActivity)
                    .setTitle("test")
                    .setMessage("test msg")
                    .setNegativeButton("ok", null)
                    .show()
        }
        bu_dialog_activity?.setOnClickListener {
            startActivity(Intent(this, ThreeDialogActivity::class.java))
        }
    }

}
