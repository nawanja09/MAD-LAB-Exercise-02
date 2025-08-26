package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class FindDoctorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_doctor)

        val exit: CardView = findViewById(R.id.cardFDBack)
        exit.setOnClickListener {
            startActivity(Intent(this@FindDoctorActivity, HomeActivity::class.java))
        }

        val familyphysician: CardView = findViewById(R.id.cardFDFamilyPhysician)
        familyphysician.setOnClickListener {
            val intent = Intent(this@FindDoctorActivity, DoctorDetailsActivity::class.java)
            intent.putExtra("title", "Family Physician")
            startActivity(intent)
        }

        val dietician: CardView = findViewById(R.id.cardFDDietician)
        dietician.setOnClickListener {
            val intent = Intent(this@FindDoctorActivity, DoctorDetailsActivity::class.java)
            intent.putExtra("title", "dietician")
            startActivity(intent)
        }

        val dentist: CardView = findViewById(R.id.cardFDDentist)
        dentist.setOnClickListener {
            val intent = Intent(this@FindDoctorActivity, DoctorDetailsActivity::class.java)
            intent.putExtra("title", "Dentist")
            startActivity(intent)
        }

        val surgeon: CardView = findViewById(R.id.cardFDSurgeon)
        surgeon.setOnClickListener {
            val intent = Intent(this@FindDoctorActivity, DoctorDetailsActivity::class.java)
            intent.putExtra("title", "Surgeon")
            startActivity(intent)
        }

        val cardiologists: CardView = findViewById(R.id.cardFDCardiologists)
        cardiologists.setOnClickListener {
            val intent = Intent(this@FindDoctorActivity, DoctorDetailsActivity::class.java)
            intent.putExtra("title", "cardiologists")
            startActivity(intent)
        }
    }
}