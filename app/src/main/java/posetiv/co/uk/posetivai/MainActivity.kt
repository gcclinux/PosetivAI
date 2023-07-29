package posetiv.co.uk.posetivai

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.webkit.WebView


class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val webView = findViewById<View>(R.id.webview) as WebView
        val webSettings = webView.settings
        webSettings.javaScriptEnabled = true
        webView.loadUrl("https://www.chatbase.co/chatbot-iframe/3T1ychFuP9L0kGUgsYo7R")
    } // Other methods and variables specific to the MainActivity can follow here
}