package com.example.mathematics_project

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main10)
        val wv =findViewById<WebView>(R.id.webView)
        wv.loadUrl("https://www.linkedin.com/in/umang-saluja-295294322")
        wv.settings.javaScriptEnabled=true
        wv.webViewClient= WebViewClient()
    }
}