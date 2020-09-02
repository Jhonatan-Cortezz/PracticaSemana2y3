package com.jac.practicasemana3.POO;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.jac.practicasemana3.R;

public class RadioPoo extends AppCompatActivity implements View.OnClickListener {
    EditText edt1, edt2;
    RadioButton rd1, rd2;
    Button operar;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_poo);
        setTitle("RaioButtons con POO");

        edt1 = findViewById(R.id.edtNum1POO);
        edt2 = findViewById(R.id.edtNum2POO);
        rd1 = findViewById(R.id.radioBtRestarPOO);
        rd2 = findViewById(R.id.radioBtSumarPOO);
        operar = findViewById(R.id.btnSumPOO);
        resultado = findViewById(R.id.txtResPOO);

        operar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        RadioSuma sum = new RadioSuma();
        sum.setNum1(Double.parseDouble(edt1.getText().toString()));
        sum.setNum2(Double.parseDouble(edt2.getText().toString()));
        double res;
        if (rd1.isChecked() == true){
            res = sum.sumar();
            String parseo = String.valueOf(res);
            resultado.setText(parseo);
        } else if (rd2.isChecked() == true){
            res = sum.restar();
            String parse = String.valueOf(res);
            resultado.setText(parse);
        }
    }
}