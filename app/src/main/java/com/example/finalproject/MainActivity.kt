package com.example.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    //all checkboxes for each page just need to check or uncheck
   val checkbox1 = checkbox(this)
    val checkbox2 = checkbox(this)
    val checkbox3 = checkbox(this)
    val checkbox4 = checkbox(this)
    val checkbox5 = checkbox(this)
    val checkbox6 = checkbox(this)
    val checkbox7 = checkbox(this)
    val checkbox8 = checkbox(this)
    val checkbox9 = checkbox(this)
    val checkbox10 = checkbox(this)
    val checkbox11 = checkbox(this)
//all text boxes are simple edit text boxes that are added via kotlin screen

    btnneedsnlbut.setOnClickListener {
        val intent = Intent(this, nl::class.kotlin)
        // start new list activity
        startActivity(intent)}
        btnlightsneedsbut.setOnClickListener {
            val intent = Intent(this, dmneeds::class.kotlin)
            // start needs dark mode
            startActivity(intent)}
            btnneedsplbut.setOnClickListener {
                val intent = Intent(this, pl::class.kotlin)
                // previous list activity
                startActivity(intent)}
                btnneedsnlbut.setOnClickListener {
                    val intent = Intent(this, nl::class.kotlin)
                    // start home activity
                    startActivity(intent)}
}
