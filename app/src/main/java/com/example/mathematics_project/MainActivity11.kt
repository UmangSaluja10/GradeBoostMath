package com.example.mathematics_project

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main11)
        val wv =findViewById<WebView>(R.id.webView)
        wv.loadUrl("https://www.linkedin.com/in/sparsh-singhal-9a5814328?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app")
        wv.settings.javaScriptEnabled=true
        wv.webViewClient= WebViewClient()
    }
}