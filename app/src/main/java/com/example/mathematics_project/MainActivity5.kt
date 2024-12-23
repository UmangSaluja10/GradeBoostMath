package com.example.mathematics_project

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main5)
        val wv =findViewById<WebView>(R.id.webView)
        wv.loadUrl("https://www.khanacademy.org/math/ncert-class-10")
        wv.settings.javaScriptEnabled=true
        wv.webViewClient= WebViewClient()
    }
}