package com.example.mathematics_project

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        val edt= findViewById<EditText>(R.id.editTextTextEmailAddress)
        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
        startActivity(Intent(this,MainActivity3::class.java).putExtra("name",edt.text.toString()))
        }
    }
}