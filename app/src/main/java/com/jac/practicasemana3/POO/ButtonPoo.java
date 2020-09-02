package com.jac.practicasemana3.POO;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.jac.practicasemana3.R;

public class ButtonPoo extends AppCompatActivity implements View.OnClickListener {
    EditText edtNum1, edtNum2;
    Button btnSumar;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_poo);
        setTitle("Evento Click con POO");
        edtNum1 = findViewById(R.id.edtPrimerValorPOO);
        edtNum2 = findViewById(R.id.edtSegundoValorPOO);
        btnSumar = findViewById(R.id.btnSumarPOO);
        txtResult = findViewById(R.id.txtResultadoPOO);
        btnSumar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        BotonSuma suma = new BotonSuma();
        suma.setNumero1(Double.parseDouble(edtNum1.getText().toString()));
        suma.setNumero2(Double.parseDouble(edtNum2.getText().toString()));

        double res = suma.sumar();
        txtResult.setText(String.format("%.2f", res));
    }
}