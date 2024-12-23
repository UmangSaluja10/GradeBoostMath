package com.example.mathematics_project

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        Handler().postDelayed({
            startActivity(Intent(this,MainActivity2::class.java))
            finish()
        }, 2000)
        val im = findViewById<ImageView>(R.id.image)
        im.alpha= 0f
        im.animate().setDuration(2000).alpha(1f).withEndAction{
            startActivity(Intent(this,MainActivity2::class.java))
            overridePendingTransition(androidx.appcompat.R.anim.abc_fade_in,androidx.appcompat.R.anim.abc_grow_fade_in_from_bottom)
            finish()
        }
        }
    }
