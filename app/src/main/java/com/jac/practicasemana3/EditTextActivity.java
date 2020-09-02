package com.jac.practicasemana3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditTextActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edtOne, edtTwo;
    Button btnVerificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        edtOne = findViewById(R.id.edtCorreo);
        edtTwo = findViewById(R.id.textPassword);
        btnVerificar = findViewById(R.id.botonRevisar);

        btnVerificar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String clave = edtTwo.getText().toString();
        if (clave.length() == 0){
            Toast notificacion = Toast.makeText(this, "La clave no puede quedar vacia", Toast.LENGTH_LONG);
            notificacion.show();
        }
    }
}