package com.jac.practicasemana3.POO;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.jac.practicasemana3.R;
import com.jac.practicasemana3.SitioWeb;

public class IntParametros extends AppCompatActivity implements View.OnClickListener {
    EditText url;
    Button btnUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_int_parametros);
        setTitle("Intent con parametros POO");

        url = findViewById(R.id.edtUrlP);
        btnUrl = findViewById(R.id.botonUrlP);

        btnUrl.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(this, Web.class);
        i.putExtra("direccion", url.getText().toString());
        startActivity(i);

    }
}