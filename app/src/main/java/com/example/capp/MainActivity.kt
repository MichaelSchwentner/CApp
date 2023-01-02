package com.example.capp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val title = findViewById<TextView>(R.id.title_text)
        val counterText = findViewById<TextView>(R.id.textView)
        var button = findViewById<Button>(R.id.counterButton_button)
        var goodJob = findViewById<TextView>(R.id.goodJob_text)
        var smiley = findViewById<ImageView>(R.id.smiley_image)
        smiley.visibility = View.INVISIBLE

        var counter =10
        counterText.text = counter.toString()

        button.setOnClickListener {
            counter --
            counterText.text = counter.toString()

            if (counter==0) {
                counter = 11
                goodJob.text = "Good Job"
                counterText.text = ""
                smiley.visibility = View.VISIBLE
            } else{
                goodJob.text = ""
                smiley.visibility = View.INVISIBLE
            }

        }

    }
}