package com.jac.practicasemana3.POO;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.jac.practicasemana3.R;

public class SharedPoo extends AppCompatActivity implements View.OnClickListener {
    EditText edtShared;
    Button btnVerificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_poo);
        setTitle("SharedPreferences POO");

        edtShared = findViewById(R.id.sharedIdP);
        btnVerificar = findViewById(R.id.btnSharedP);
        SharedPreferences prefe = getSharedPreferences("datos", Context.MODE_PRIVATE);
        edtShared.setText(prefe.getString("mail", ""));

        btnVerificar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferencias.edit();
        editor.putString("mail", edtShared.getText().toString());
        editor.commit();
        finish();
    }
}