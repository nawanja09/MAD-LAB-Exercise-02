package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

            button = findViewById(R.id.button)
            button.setOnClickListener {
                openHomeActivity()
            }
        }

        private fun openHomeActivity() {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
}