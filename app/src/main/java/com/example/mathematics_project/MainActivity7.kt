package com.example.mathematics_project

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main7)
        val wv =findViewById<WebView>(R.id.webView)
        wv.loadUrl("https://www.selfstudys.com/books/cbse-sample-paper/english/12th/mathematics/25103")
        wv.settings.javaScriptEnabled=true
        wv.webViewClient= WebViewClient()
    }
}