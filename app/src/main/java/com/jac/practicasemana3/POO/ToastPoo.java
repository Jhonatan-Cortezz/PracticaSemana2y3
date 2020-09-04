package com.jac.practicasemana3.POO;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.jac.practicasemana3.R;

public class ToastPoo extends AppCompatActivity implements View.OnClickListener {
    EditText edtAd;
    Button btnAdiv;
    int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_poo);
        setTitle("Toast con POO");

        edtAd = findViewById(R.id.edtAdivinaP);
        btnAdiv = findViewById(R.id.btnAdP);
        num = (int) (Math.random() * 100001);
        String cadena = String.valueOf(num);
        Toast notificacion = Toast.makeText(this, cadena, Toast.LENGTH_LONG);
        notificacion.show();

        btnAdiv.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String valorIngresado = edtAd.getText().toString();
        if (valorIngresado.length() == 0){
            edtAd.setError("Ingrese el numero que vio");
        } else {
            int valo = Integer.parseInt(valorIngresado);
            if (valo == num){
                Toast notificacion = Toast.makeText(this, "Muy bien recordaste el numero mostrado", Toast.LENGTH_LONG);
                notificacion.show();
            } else {
                Toast notificacion = Toast.makeText(this, "Numero equivocado", Toast.LENGTH_LONG);
                notificacion.show();
            }
        }
    }
}