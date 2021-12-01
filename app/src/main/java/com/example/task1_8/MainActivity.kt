package com.example.task1_8

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickRed = findViewById<TextView>(R.id.textRed)
        val clickBlue = findViewById<TextView>(R.id.textBlue)
        val clickGreen = findViewById<TextView>(R.id.textGreen)
        val resultText = findViewById<TextView>(R.id.textRezult)


        clickRed.setOnClickListener {
            resultText.text = "${clickRed.text.toString().lowercase().replaceFirstChar { it.uppercase() }} was clicked"
            resultText.setTextColor(Color.parseColor("#ed1c43"))
        }
        clickBlue.setOnClickListener {
            resultText.text = "${clickBlue.text.toString().lowercase().replaceFirstChar { it.uppercase() }} was clicked"
            resultText.setTextColor(Color.parseColor("#3f48ca"))

        }
        clickGreen.setOnClickListener {
            resultText.text = "${clickGreen.text.toString().lowercase().replaceFirstChar { it.uppercase() }} was clicked"
            resultText.setTextColor(Color.parseColor("#22b162"))
        }
    }
}