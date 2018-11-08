package com.example.irobot.kotlinclass.Anko

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import org.jetbrains.anko.dip
import org.jetbrains.anko.padding
import org.jetbrains.anko.verticalLayout

class LoginActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        verticalLayout(){
            padding = dip(10)
            gravity = Gravity.CENTER_HORIZONTAL
        }
    }
}