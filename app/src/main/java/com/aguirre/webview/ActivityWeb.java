package com.aguirre.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityWeb extends AppCompatActivity {

    WebView wb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        wb1 = findViewById(R.id.wb1);

        String URL = getIntent().getStringExtra("sitioWeb");
        wb1.setWebViewClient(new WebViewClient());
        wb1.loadUrl("https://"+URL);
    }

    public void cerrar(View view){
        finish();
    }

}