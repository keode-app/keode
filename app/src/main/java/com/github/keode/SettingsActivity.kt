package com.github.keode

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.jetbrains.anko.*

class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        SettingsActivityUI().setContentView(this)
    }
}

class SettingsActivityUI : AnkoComponent<SettingsActivity> {
    override fun createView(ui: AnkoContext<SettingsActivity>) = with(ui) {
        relativeLayout {
            textView("Under construction").lparams { centerInParent() }
        }
    }
}