package com.jac.practicasemana3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntentParametros extends AppCompatActivity implements View.OnClickListener {
    EditText url;
    Button btnUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_parametros);

        url = findViewById(R.id.edtUrl);
        btnUrl = findViewById(R.id.botonUrl);

        btnUrl.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(this, SitioWeb.class);
        i.putExtra("direccion", url.getText().toString());
        startActivity(i);
    }
}