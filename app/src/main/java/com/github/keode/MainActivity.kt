package com.github.keode

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        MainActivityUI().setContentView(this)
    }
}

class MainActivityUI : AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        verticalLayout {
            toolbar {
                backgroundColor = Color.parseColor("#008577")
                padding = dip(3)
                textView("Keode") {
                    textSize = 24F
                }
                relativeLayout {
                    button("Settings") {
                        onClick { alert("Under construction").show() }
                    }.lparams { alignParentEnd() }
                }
            }
        }
    }
}
