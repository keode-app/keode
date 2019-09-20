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
                padding = dip(3)
                title = "Keode"
                backgroundColor = Color.parseColor("#008577")
                relativeLayout {
                    button("Settings") {
                        onClick {
                            alert("Under construction").show()
                        }
                    }.lparams {
                        alignParentEnd()
                    }
                }
            }
        }
    }
}
