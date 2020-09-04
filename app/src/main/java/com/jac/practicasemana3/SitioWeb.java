package com.jac.practicasemana3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class SitioWeb extends AppCompatActivity {
    WebView vistaWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitio_web);
        setTitle("Sitio Web");

        vistaWeb = findViewById(R.id.sitioWeb);

        Bundle bundle = getIntent().getExtras();
        String dato = bundle.getString("direccion");
        vistaWeb.loadUrl("http://"+dato);
    }

    public void finalizar(View v){
        finish();
    }
}