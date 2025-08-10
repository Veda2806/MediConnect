package com.example.healthcare;

import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class ChatbotActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatbot);

        // 🧭 Setup Toolbar with Back Button
        Toolbar toolbar = findViewById(R.id.toolbarChatbot);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);  // Show back arrow
        }

        // 🌐 Setup WebView
        WebView webView = findViewById(R.id.webViewChatbot);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://agent.jotform.com/0196586e612b7231805969746402835ec464");
    }

    // 🔙 Handle Back Arrow Press
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish(); // Close this activity and return
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
