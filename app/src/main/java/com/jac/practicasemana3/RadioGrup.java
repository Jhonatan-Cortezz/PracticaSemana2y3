package com.jac.practicasemana3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class RadioGrup extends AppCompatActivity {
    EditText edtNumero1, edtNumero2;
    Button btnSumar;
    RadioButton rdSumar, rdRestar;
    TextView tvResultado;
    double suma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_grup);
        setTitle("RadioGrup eventos");

        edtNumero1 =(EditText) findViewById(R.id.edtNum1);
        edtNumero2 = findViewById(R.id.edtNum2);
        btnSumar = findViewById(R.id.btnSum);
        rdSumar = findViewById(R.id.radioBtSumar);
        rdRestar = findViewById(R.id.radioBtRestar);
        tvResultado = findViewById(R.id.txtRes);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtNumero1.getText().toString().length() == 0){
                    edtNumero1.setError("Complete este campo");
                } else if (edtNumero2.getText().toString().length() == 0){
                    edtNumero2.setError("Complete este campo");
                } else {
                    double n1 = Double.parseDouble(edtNumero1.getText().toString());
                    double n2 = Double.parseDouble(edtNumero2.getText().toString());

                    if (rdRestar.isChecked() == true){
                        suma = n1 + n2;
                        String res = String.valueOf(suma);
                        tvResultado.setText(res);
                    } else if (rdSumar.isChecked() == true){
                        suma = n1 - n2;
                        String res = String.valueOf(suma);
                        tvResultado.setText(res);
                    }
                }
            }
        });
    }
}