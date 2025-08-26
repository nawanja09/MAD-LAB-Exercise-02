package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import android.widget.SimpleAdapter
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

    class DoctorDetailsActivity : AppCompatActivity() {
        private val doctorDetails1 = arrayOf(
            mapOf(
                "line1" to "Doctor Name: A.M.S.Perera",
                "line2" to "Hospital Address: Colombo",
                "line3" to "Exp: 5 yrs",
                "line4" to "Mobile No: 071 5678342",
                "line5" to "Rs.600"
            ),
            mapOf(
                "line1" to "Doctor Name: K.D.Sunil",
                "line2" to "Hospital Address: Kandy",
                "line3" to "Exp: 10 yrs",
                "line4" to "Mobile No: 071 5678672",
                "line5" to "Rs.900"
            ),
        )

        // Define other doctorDetails arrays similarly

        private lateinit var doctorDetails: Array<Map<String, String>>

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_doctor_details)

            val tv: TextView = findViewById(R.id.textViewDDTitle)
            val btn: Button = findViewById(R.id.buttonDDBack)

            val intent: Intent = intent
            val title: String? = intent.getStringExtra("title")
            tv.text = title

            doctorDetails = when (title) {
                "Family Physicians" -> doctorDetails1
                // Add other cases similarly
                else -> doctorDetails1 // Default to doctorDetails1
            }

            // Create a list view of doctor details
            val listView = findViewById<ListView>(R.id.listViewDD)
            val adapter = SimpleAdapter(
                this,
                doctorDetails.toList(),
                R.layout.list_item_doctor_details,
                arrayOf("line1", "line2", "line3", "line4", "line5"),
                intArrayOf(R.id.line_a, R.id.line_b, R.id.line_c, R.id.line_d, R.id.line_e)
            )
            listView.adapter = adapter

            btn.setOnClickListener {
                startActivity(Intent(this@DoctorDetailsActivity, FindDoctorActivity::class.java))
            }
        }

}