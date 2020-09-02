package com.jac.practicasemana3.POO;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jac.practicasemana3.R;

public class AboutPoo extends AppCompatActivity implements View.OnClickListener {
    Button btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_poo);
        setTitle("Acerca de");

        btnSalir = findViewById(R.id.botonSalirP);

        btnSalir.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        finish();
    }
}