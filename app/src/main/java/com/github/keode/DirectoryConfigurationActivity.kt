package com.github.keode

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.jetbrains.anko.*

class DirectoryConfigurationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        DirectoryConfigurationActivityUI().setContentView(this)
    }
}

class DirectoryConfigurationActivityUI : AnkoComponent<DirectoryConfigurationActivity> {
    override fun createView(ui: AnkoContext<DirectoryConfigurationActivity>) = with(ui) {
        relativeLayout {
            textView("DirectoryConfigurationActivity is under construction").lparams { centerInParent() }
        }
    }
}