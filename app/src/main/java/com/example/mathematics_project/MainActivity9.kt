package com.example.mathematics_project

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main9)
        val btn1 =findViewById<ImageButton>(R.id.imageBtn1)
        val btn2 =findViewById<ImageButton>(R.id.imageBtn2)
        val btn3 =findViewById<ImageButton>(R.id.imageBtn3)
        val ib1 = findViewById<ImageButton>(R.id.imageButton1)
        val ib2 = findViewById<ImageButton>(R.id.imageButton2)
        val ib3 = findViewById<ImageButton>(R.id.imageButton3)
        val txt2=findViewById<TextView>(R.id.text)
        var tt=intent.extras?.getString("namy").toString()
        txt2.text=tt
        ib1.setOnClickListener{
            startActivity(Intent(this,MainActivity3::class.java))
        }
        ib2.setOnClickListener{
            startActivity(Intent(this,MainActivity8::class.java))
        }
        ib3.setOnClickListener{
            startActivity(Intent(this,MainActivity9::class.java))
        }
        btn1.setOnClickListener{
            startActivity(Intent(this,MainActivity10::class.java))
        }
        btn2.setOnClickListener{
            startActivity(Intent(this,MainActivity11::class.java))
        }
        btn3.setOnClickListener{
            startActivity(Intent(this,MainActivity12::class.java))
        }
    }
}