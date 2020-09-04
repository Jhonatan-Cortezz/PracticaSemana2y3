package com.jac.practicasemana3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Agenda extends AppCompatActivity implements View.OnClickListener {

    EditText edt1, edt2;
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);
        setTitle("Agenda SharedPreferences");

        edt1 = findViewById(R.id.edtNombre);
        edt2 = findViewById(R.id.edtDatos);
        btn1 = findViewById(R.id.btnGuardar);
        btn2 = findViewById(R.id.btnRecuperar);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnGuardar:
                String nombre = edt1.getText().toString();
                String datos = edt2.getText().toString();
                if (nombre.length() == 0){
                    edt1.setError("Campo requerido");
                } else if (datos.length() == 0){
                    edt2.setError("Campo requerido");
                } else {
                    SharedPreferences preferencias = getSharedPreferences("agenda", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = preferencias.edit();
                    editor.putString(nombre, datos);
                    editor.commit();
                    Toast.makeText(this, "Datos Guardados", Toast.LENGTH_LONG).show();
                    break;
                }

            case R.id.btnRecuperar:
                String name = edt1.getText().toString();
                SharedPreferences prefe = getSharedPreferences("agenda", Context.MODE_PRIVATE);
                String d = prefe.getString(name, "");
                if (d.length() == 0){
                    Toast.makeText(this, "Escriba un nombre que este guardado", Toast.LENGTH_LONG).show();
                } else {
                    edt2.setText(d);
                }
                break;
        }
    }
}