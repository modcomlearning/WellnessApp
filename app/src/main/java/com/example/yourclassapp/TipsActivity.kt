package com.example.yourclassapp

import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Locale

class TipsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tips)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val text = findViewById<TextView>(R.id.texttip1)
        val button = findViewById<Button>(R.id.buttontip1)

        val tts = TextToSpeech(applicationContext, null)
        button.setOnClickListener {
            val textfromtextview = text.text.toString()
            tts.speak(textfromtextview, TextToSpeech.QUEUE_FLUSH, null, null)
        }//end listner
    }


}