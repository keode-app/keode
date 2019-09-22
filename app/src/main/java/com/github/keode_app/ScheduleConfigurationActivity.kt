package com.github.keode_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.jetbrains.anko.*

class ScheduleConfigurationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ScheduleConfigurationActivityUI().setContentView(this)
    }
}

class ScheduleConfigurationActivityUI : AnkoComponent<ScheduleConfigurationActivity> {
    override fun createView(ui: AnkoContext<ScheduleConfigurationActivity>) = with(ui) {
        relativeLayout {
            textView("ScheduleConfigurationActivity is under construction").lparams { centerInParent() }
        }
    }
}