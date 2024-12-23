package com.example.mathematics_project

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        val button1 = findViewById<Button>(R.id.btn1)
        val button2 = findViewById<Button>(R.id.btn2)
        val button3 = findViewById<Button>(R.id.btn3)
        val button4 = findViewById<Button>(R.id.btn4)
        val ib1 = findViewById<ImageButton>(R.id.imageButton1)
        val ib2 = findViewById<ImageButton>(R.id.imageButton2)
        val ib3 = findViewById<ImageButton>(R.id.imageButton3)
        val text=findViewById<TextView>(R.id.txt1)
        var t=intent.extras?.getString("name").toString()
        text.text=t
        button1.setOnClickListener {
            startActivity(Intent(this,MainActivity4::class.java))
        }
        button2.setOnClickListener {
            startActivity(Intent(this,MainActivity5::class.java))
        }
        button3.setOnClickListener {
            startActivity(Intent(this,MainActivity6::class.java))
        }
        button4.setOnClickListener {
            startActivity(Intent(this,MainActivity7::class.java))
        }
        ib1.setOnClickListener{
            startActivity(Intent(this,MainActivity3::class.java))
        }
        ib2.setOnClickListener{
            startActivity(Intent(this,MainActivity8::class.java))
        }
        ib3.setOnClickListener{
            startActivity(Intent(this,MainActivity9::class.java).putExtra("namy",text.text.toString()))
        }
    }
}