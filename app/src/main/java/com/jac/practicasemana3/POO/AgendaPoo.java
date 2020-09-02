package com.jac.practicasemana3.POO;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.jac.practicasemana3.R;

public class AgendaPoo extends AppCompatActivity implements View.OnClickListener {
    EditText edt1, edt2;
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda_poo);
        setTitle("Agenda POO");

        edt1 = findViewById(R.id.edtNombreP);
        edt2 = findViewById(R.id.edtDatosP);
        btn1 = findViewById(R.id.btnGuardarP);
        btn2 = findViewById(R.id.btnRecuperarP);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        DatosAgenda data = new DatosAgenda();
        switch (view.getId()){
            case R.id.btnGuardarP:
                data.setNombre(edt1.getText().toString());
                data.setDatos(edt2.getText().toString());
                SharedPreferences preferencias = getSharedPreferences("agenda", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = preferencias.edit();
                editor.putString(data.getNombre(), data.getDatos());
                editor.commit();
                Toast.makeText(this, "Datos Guardados", Toast.LENGTH_LONG).show();
                break;

            case R.id.btnRecuperarP:
                data.setNombre(edt1.getText().toString());
                SharedPreferences prefe = getSharedPreferences("agenda", Context.MODE_PRIVATE);
                String d = prefe.getString(data.getNombre(), "");
                if (d.length() == 0){
                    Toast.makeText(this, "No existe el nombre en la agenda", Toast.LENGTH_LONG).show();
                } else {
                    edt2.setText(d);
                }
                break;
        }
    }
}