package com.jac.practicasemana3.Ejercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.jac.practicasemana3.R;

public class NumeroRamdom extends AppCompatActivity implements View.OnClickListener {
    EditText numero;
    Button btnAdivina;
    TextView vistaPuntos;
    private int num;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero_ramdom);
        numero = findViewById(R.id.ramdom);
        btnAdivina = findViewById(R.id.btnAdv);
        vistaPuntos = findViewById(R.id.puntaje);

        num = (int) (Math.random()*50);
        String cad = String.valueOf(num);

        Toast not = Toast.makeText(this, cad, Toast.LENGTH_LONG);
        not.show();

        //clase sharedPreferences
        SharedPreferences prefe = getSharedPreferences("datos", Context.MODE_PRIVATE);
        String v = String.valueOf(prefe.getInt("puntos", 0));
        vistaPuntos.setText(v);

        btnAdivina.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String ingreso = numero.getText().toString();
        int n = Integer.parseInt(ingreso);

        if (numero.getText().toString().length() == 0){
            numero.setError("Escriba el numero que vio");
        } else if (n > num){
            Toast not = Toast.makeText(this, "El numero ingresado es mayor", Toast.LENGTH_LONG);
            not.show();
        } else if (n < num){
            Toast not = Toast.makeText(this, "EL numero ingresado es menor", Toast.LENGTH_LONG);
            not.show();
        } else if (n == num){
            Toast not = Toast.makeText(this, "Acertaste tienes 1 punto", Toast.LENGTH_LONG);
            not.show();
            int puntajes = Integer.parseInt(vistaPuntos.getText().toString());
            puntajes++;
            vistaPuntos.setText(String.valueOf(puntajes));
            numero.setText("");
            SharedPreferences preferencias =getSharedPreferences("datos", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = preferencias.edit();
            editor.putInt("puntos", puntajes);
            editor.commit();
        }
    }
}