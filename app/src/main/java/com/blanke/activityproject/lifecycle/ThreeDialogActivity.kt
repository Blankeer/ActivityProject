package com.blanke.activityproject.lifecycle

import android.os.Bundle
import com.blanke.activityproject.R

class ThreeDialogActivity : BaseLifecycleActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three_dialog)
    }
}
