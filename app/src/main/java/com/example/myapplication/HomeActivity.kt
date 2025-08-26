package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val exit: CardView = findViewById(R.id.cardExit)
        exit.setOnClickListener {
            startActivity(Intent(this@HomeActivity, RegisterActivity::class.java))
        }

        val findDoctor: CardView = findViewById(R.id.cardFindDoctor)
        findDoctor.setOnClickListener {
            startActivity(Intent(this@HomeActivity, FindDoctorActivity::class.java))
        }
        val findDoctor1: CardView = findViewById(R.id.cardLabTest)
        findDoctor1.setOnClickListener {
            startActivity(Intent(this@HomeActivity, UserProfileActivity::class.java))
        }
    }
}