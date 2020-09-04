package com.jac.practicasemana3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class SpinnerActivity extends AppCompatActivity {
    EditText edt1, edt2;
    Button btnCal;
    Spinner spinner;
    TextView rst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        setTitle("Spinner los select");

        edt1 = findViewById(R.id.txtN1);
        edt2 = findViewById(R.id.txtN2);
        btnCal = findViewById(R.id.botonCalcular);
        spinner = findViewById(R.id.select);
        rst = findViewById(R.id.resultado);

        String[] opciones = {"Sumar", "Restar", "Multiplicar", "Dividir"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                opciones
        );
        spinner.setAdapter(adapter);

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edt1.getText().toString().length() == 0){
                    edt1.setError("Complete este campo");
                } else if (edt2.getText().toString().length() == 0){
                    edt2.setError("Complete este campo");
                } else{
                    double n1 = Double.parseDouble(edt1.getText().toString());
                    double n2 = Double.parseDouble(edt2.getText().toString());
                    String select = spinner.getSelectedItem().toString();
                    if (select.equals("Sumar")){
                        double s = n1 + n2;
                        String resu = String.valueOf(s);
                        rst.setText(resu);
                    } else if (select.equals("Restar")){
                        double s = n1 - n2;
                        String resu = String.valueOf(s);
                        rst.setText(resu);
                    } else if (select.equals("Multiplicar")){
                        double s = n1 * n2;
                        String resu = String.valueOf(s);
                        rst.setText(resu);
                    } else if (select.equals("Dividir")){
                        double s = n1 / n2;
                        String resu = String.valueOf(s);
                        rst.setText(resu);
                    }
                }
            }
        });
    }
}