package com.aguirre.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et_Web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_Web = findViewById(R.id.txtWeb);
    }

    public void Buscar(View view){
        Intent i = new Intent(this, ActivityWeb.class);
        i.putExtra("sitioWeb", et_Web.getText().toString());
        startActivity(i);
    }
}