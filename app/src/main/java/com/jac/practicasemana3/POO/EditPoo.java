package com.jac.practicasemana3.POO;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.jac.practicasemana3.R;

public class EditPoo extends AppCompatActivity implements View.OnClickListener {
    EditText edtOne, edtTwo;
    Button btnVerificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_poo);
        setTitle("Verificando clave !=0 POO");

        edtOne = findViewById(R.id.edtCorreoP);
        edtTwo = findViewById(R.id.textPasswordP);
        btnVerificar = findViewById(R.id.botonRevisarP);

        btnVerificar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String clave = edtTwo.getText().toString();
        if (clave.length() == 0){
            Toast notificacion = Toast.makeText(this, "La clave no puede quedar vacia", Toast.LENGTH_LONG);
            notificacion.show();
        } else {
            Toast notificacion = Toast.makeText(this, "Excelente la clave no esta vacia", Toast.LENGTH_LONG);
            notificacion.show();
        }

    }
}