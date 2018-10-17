package com.example.irobot.kotlinclass.Anko

import android.graphics.Color
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import com.example.irobot.kotlinclass.R.color.colorAccent
import com.example.irobot.kotlinclass.R
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class AnkoMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        AnkoMainActivityUI().setContentView(this)
    }
}

class AnkoMainActivityUI : AnkoComponent<AnkoMainActivity> {
    override fun createView(ui: AnkoContext<AnkoMainActivity>) = with(ui){
        verticalLayout{
            padding = dip(10)

            val name = editText {
                hint = "What's your name?"
            }

            button("Say Hello"){
                    backgroundColor = ContextCompat.getColor(context, colorAccent)
                    textColor = Color.WHITE

                    onClick { toast("Hello, ${name.text}!") }
                }.lparams(width= matchParent){
                    topMargin = dip(20)
                }
            button("Show Alert"){
                    backgroundColor = ContextCompat.getColor(context, colorAccent)
                    textColor = Color.WHITE
                    onClick {
                        alert("Happy Coding!", "Hello, ${name.text}!") {
                            yesButton { toast("Oh…") }
                            noButton {}
                        }.show()
                    }
                }.lparams(width = matchParent){
                    topMargin = dip(5)
                }
            button("Show Selector"){
                    backgroundColor = ContextCompat.getColor(context, colorAccent)
                    textColor = Color.WHITE

                    onClick {
                        val club = listOf("Barcelona", "Real Madrid", "Bayern Munchen", "Liverpool")
                        selector("Hello, ${name.text}! What's football club do you love?", club) { _, i ->
                            toast("So you love ${club[i]}, right?")
                        }
                    }
                }.lparams(width = matchParent){
                    topMargin = dip(5)
                }

        }
    }

}
