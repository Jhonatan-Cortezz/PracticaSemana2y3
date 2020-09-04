package com.jac.practicasemana3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SharedActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edtShared;
    Button btnVerificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared);
        setTitle("Guardar correo SharedPreferences");

        edtShared = findViewById(R.id.sharedId);
        btnVerificar = findViewById(R.id.btnShared);
        SharedPreferences prefe = getSharedPreferences("datos", Context.MODE_PRIVATE);
        edtShared.setText(prefe.getString("mail", ""));

        btnVerificar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (edtShared.getText().toString().length() == 0){
            edtShared.setError("Ingrese la direccion de un email");
        } else {
            SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = preferencias.edit();
            editor.putString("mail", edtShared.getText().toString());
            editor.commit();
            finish();
        }
    }
}