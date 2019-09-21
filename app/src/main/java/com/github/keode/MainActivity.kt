package com.github.keode

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
                        onClick { ui.owner.startActivity(SettingsActivity::class) }
                    }.lparams { alignParentEnd() }
                }
            }
            verticalLayout {
                padding = dip(5)
                button("Directory Configuration") {
                    onClick { ui.owner.startActivity(DirectoryConfigurationActivity::class) }
                }
                button("Schedule Configuration") {
                    onClick { ui.owner.startActivity(ScheduleConfigurationActivity::class) }
                }
                button("Categorization") {
                    onClick { ui.owner.startActivity(CategorizationActivity::class) }
                }
            }.lparams(width = matchParent, height = matchParent)
        }

    }
}
