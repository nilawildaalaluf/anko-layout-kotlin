package com.example.irobot.kotlinclass


import android.graphics.Typeface
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.widget.ImageView
import org.jetbrains.anko.*

class DetailActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var clubName = intent.getStringExtra("name")
        var clubDescription = intent.getStringExtra("desc")
        val clubImage = intent.getIntExtra("image", 0)


        verticalLayout{
            padding = dip(16)

            imageView(clubImage){}
                    .lparams(width = wrapContent, height = 200) {
                        padding = dip(20)
                        gravity = Gravity.CENTER_HORIZONTAL
                    }
            textView(clubName){
                textSize = 20f
                gravity = Gravity.CENTER_HORIZONTAL
                typeface = Typeface.DEFAULT_BOLD
            }.lparams(width = matchParent, height = wrapContent){
                topMargin = dip(30)
            }

            textView(clubDescription){
                typeface = Typeface.SANS_SERIF
            }.lparams(width = matchParent, height = wrapContent){
                topMargin = dip(10)
            }
        }


    }
}