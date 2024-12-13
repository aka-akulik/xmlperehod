package com.example.xml_transition

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameEditText = findViewById<EditText>(R.id.editTextName)
        val ageEditText = findViewById<EditText>(R.id.editTextAge)
        val continueButton = findViewById<Button>(R.id.buttonContinue)

        continueButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val age = ageEditText.text.toString()

            if (name.isNotEmpty() && age.isNotEmpty()) {
                val intent = Intent(this, DisplayActivity::class.java).apply {
                    putExtra("USER_NAME", name)
                    putExtra("USER_AGE", age)
                }
                startActivity(intent)
            } else {
                nameEditText.error = "Введите имя"
                ageEditText.error = "Введите возраст"
            }
        }
    }
}