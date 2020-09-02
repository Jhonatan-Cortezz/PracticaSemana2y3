package com.jac.practicasemana3.Ejercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.jac.practicasemana3.R;

public class Clave extends AppCompatActivity implements View.OnClickListener {
    EditText clave;
    Button verificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clave);
        setTitle("Verificando si clave == abc123");

        clave = findViewById(R.id.edtClave);
        verificar = findViewById(R.id.btnVerificar);

        verificar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (clave.getText().toString().length() == 0){
            clave.setError("Complete este campo");
        } else if (!(clave.getText().toString().equals("abc123"))){
            clave.setError("Clave incorrecta");
        } else {
            Intent intent = new Intent(this, Mensaje.class);
            startActivity(intent);
        }
    }
}