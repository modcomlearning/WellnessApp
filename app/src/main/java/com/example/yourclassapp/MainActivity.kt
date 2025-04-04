package com.example.yourclassapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }//end

        //Find View By ID   -  Diets Button
        val diets = findViewById<Button>(R.id.diets)
        //Set Listener
        diets.setOnClickListener {
             val diet_intent = Intent(applicationContext, DietActivity::class.java)
             startActivity(diet_intent)
        }

        //Find View By ID -  Exercise Button
        val exercises = findViewById<Button>(R.id.exercises)
        //Set Listener
        exercises.setOnClickListener {
            val exercises_intent = Intent(applicationContext, ExerciseActivity::class.java)
            startActivity(exercises_intent)
        }


        //Find View By ID -  Tips Button
        val tips = findViewById<Button>(R.id.tips)
        //Set Listener
        tips.setOnClickListener {
            val tips_intent = Intent(applicationContext, TipsActivity::class.java)
            startActivity(tips_intent)
        }
    }
}