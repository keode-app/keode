package com.github.keode

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.jetbrains.anko.*

class CategorizationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        CategorizationActivityUI().setContentView(this)
    }
}

class CategorizationActivityUI : AnkoComponent<CategorizationActivity> {
    override fun createView(ui: AnkoContext<CategorizationActivity>) = with(ui) {
        relativeLayout {
            textView("CategorizationActivity is under construction").lparams { centerInParent() }
        }
    }
}