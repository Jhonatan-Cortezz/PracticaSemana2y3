package com.jac.practicasemana3.POO;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.jac.practicasemana3.R;

public class CheckboxPoo extends AppCompatActivity implements View.OnClickListener {
    EditText edt1, edt2;
    CheckBox chk1, chk2;
    Button btnOperar;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox_poo);
        setTitle("CheckBox con POO");
        edt1 = findViewById(R.id.edtN1P);
        edt2 = findViewById(R.id.edtN2P);
        chk1 = findViewById(R.id.checkbox1P);
        chk2 = findViewById(R.id.checkbox2P);
        btnOperar = findViewById(R.id.btnOperarP);
        result = findViewById(R.id.resP);

        btnOperar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String r = "";
        if (edt1.getText().toString().length() == 0){
            edt1.setError("Complete este campo");
        } else if (edt2.getText().toString().length() == 0){
            edt2.setError("Complete este campo");
        } else {
            OperacionesChechBox oper = new OperacionesChechBox();
            oper.setNum1(Double.parseDouble(edt1.getText().toString()));
            oper.setNum2(Double.parseDouble(edt2.getText().toString()));

            if (chk1.isChecked() == true){
                r = "La suma es: " + oper.sumar();
            }
            if (chk2.isChecked() == true){
                r = r + " La resta es: " + oper.restar();
            }

            result.setText(r);
        }
    }
}