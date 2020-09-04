package com.jac.practicasemana3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AcercaDe extends AppCompatActivity implements View.OnClickListener {
    Button btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);
        setTitle("Acerca de");

        btnSalir = findViewById(R.id.botonSalir);

        btnSalir.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        finish();
    }
}