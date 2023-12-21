package com.example.prac3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView: TextView = findViewById(R.id.textView)
        var imageButton: ImageButton = findViewById(R.id.imageButton2)
        var ed = findViewById<EditText>(R.id.editTextText)


        imageButton.setOnClickListener {
            if(ed.text.isEmpty()) {
                textView.text = "Hello, my frend"
            }
            else
            {
                textView.text = "Фуррион передает привет тебе, " + ed.text
            }
        }
    }

}