package com.example.xml_transition

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DisplayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val userName = intent.getStringExtra("USER_NAME")
        val userAge = intent.getStringExtra("USER_AGE")

        val messageTextView = findViewById<TextView>(R.id.textViewMessage)
        val backButton = findViewById<Button>(R.id.buttonBack)

        messageTextView.text = "Добро пожаловать, $userName. Ваш возраст: $userAge"

        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}