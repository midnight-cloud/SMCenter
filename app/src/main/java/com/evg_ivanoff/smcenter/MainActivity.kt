package com.evg_ivanoff.smcenter

import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var webViewMain: WebView
    private val urlMain = "https://smcentr.su/"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webViewMain = findViewById(R.id.webViewMain)
        webViewMain.webViewClient = ThisWebViewClient()
        webViewMain.settings.setJavaScriptEnabled(true)

        webViewMain.loadUrl(urlMain)
    }

    override fun onBackPressed() {
        if (webViewMain.canGoBack())
            webViewMain.goBack()
        else
            super.onBackPressed()
    }

}