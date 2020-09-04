package com.jac.practicasemana3.POO;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.jac.practicasemana3.R;

public class SpinnerPoo extends AppCompatActivity implements View.OnClickListener {
    EditText edt1, edt2;
    Button btnCal;
    Spinner spinner;
    TextView rst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_poo);
        setTitle("Spinner con POO");

        edt1 = findViewById(R.id.txtN1P);
        edt2 = findViewById(R.id.txtN2P);
        btnCal = findViewById(R.id.botonCalcularP);
        spinner = findViewById(R.id.selectP);
        rst = findViewById(R.id.resultadoP);

        String[] opciones = {"Sumar", "Restar", "Multiplicar", "Dividir"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                opciones
        );
        spinner.setAdapter(adapter);

        btnCal.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        OperacionesChechBox spin = new OperacionesChechBox();
        if (edt1.getText().toString().length() == 0){
            edt1.setError("Campo obligatorio");
        } else if (edt2.getText().toString().length() == 0){
            edt2.setError("Campo obligatorio");
        } else {
            spin.setNum1(Double.parseDouble(edt1.getText().toString()));
            spin.setNum2(Double.parseDouble(edt2.getText().toString()));
            String select = spinner.getSelectedItem().toString();
            if (select.equals("Sumar")){
                double s = spin.sumar();
                String resu = String.valueOf(s);
                rst.setText(resu);
            } else if (select.equals("Restar")){
                double s = spin.restar();
                String resu = String.valueOf(s);
                rst.setText(resu);
            } else if (select.equals("Multiplicar")){
                double s = spin.multiplicar();
                String resu = String.valueOf(s);
                rst.setText(resu);
            } else if (select.equals("Dividir")){
                double s = spin.dividir();
                String resu = String.valueOf(s);
                rst.setText(resu);
            }
        }
    }
}