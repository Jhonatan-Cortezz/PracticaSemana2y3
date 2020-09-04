package com.jac.practicasemana3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ButtonTask extends AppCompatActivity {
    EditText valor1, valor2;
    Button btnSumar;
    TextView resultado;
    double total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_task);
        setTitle("Evento click Button");

        valor1 = (EditText) findViewById(R.id.edtPrimerValor);
        valor2 = (EditText) findViewById(R.id.edtSegundoValor);
        btnSumar = (Button) findViewById(R.id.btnSumar);
        resultado = (TextView) findViewById(R.id.txtResultado);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (valor1.getText().toString().length() == 0){
                    valor1.setError("Campo requerido");
                } else if (valor2.getText().toString().length() == 0){
                    valor2.setError("Campo requerido");
                } else {
                    double n1 = Double.parseDouble(valor1.getText().toString());
                    double n2 = Double.parseDouble(valor2.getText().toString());
                    total = n1 + n2;

                    String result = String.valueOf(total);
                    resultado.setText(result);
                }
            }
        });
    }
}