package com.github.keode

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
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
                padding = dip(5)
                textView("Keode") { textSize = 24F }
                relativeLayout {
                    button("Settings") {
                        onClick { ui.owner.startActivity(Intent(ui.owner, SettingsActivity::class.java)) }
                    }.lparams { alignParentEnd() }
                }
            }
            relativeLayout {
                textView("Under construction").lparams { centerInParent() }
            }.lparams(width = matchParent, height = matchParent)
        }

    }
}
