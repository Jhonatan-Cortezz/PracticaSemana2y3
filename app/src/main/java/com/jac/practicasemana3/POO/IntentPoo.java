package com.jac.practicasemana3.POO;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jac.practicasemana3.AcercaDe;
import com.jac.practicasemana3.R;

public class IntentPoo extends AppCompatActivity implements View.OnClickListener {
    Button btbAceraDe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_poo);
        setTitle("Intent con POO");

        btbAceraDe = findViewById(R.id.btnAcercaDeP);

        btbAceraDe.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, AboutPoo.class);
        startActivity(intent);
    }
}