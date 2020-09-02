package com.jac.practicasemana3.POO;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import com.jac.practicasemana3.R;

public class Web extends AppCompatActivity {
    WebView vistaWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        setTitle("Sitio web POO");

        vistaWeb = findViewById(R.id.sitioWebP);

        Bundle bundle = getIntent().getExtras();
        String dato = bundle.getString("direccion");
        vistaWeb.loadUrl("http://" + dato);
    }

    public void finalizar(View v){
        finish();
    }
}