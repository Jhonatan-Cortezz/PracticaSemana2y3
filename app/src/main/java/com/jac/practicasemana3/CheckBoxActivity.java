package com.jac.practicasemana3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class CheckBoxActivity extends AppCompatActivity {
    EditText edt1, edt2;
    Button btOperar;
    CheckBox chk1, chk2;
    TextView tvRes;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        edt1 = findViewById(R.id.edtN1);
        edt2 = findViewById(R.id.edtN2);
        btOperar = findViewById(R.id.btnOperar);
        chk1 = findViewById(R.id.checkbox1);
        chk2 = findViewById(R.id.checkbox2);
        tvRes = findViewById(R.id.res);

        btOperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(edt1.getText().toString());
                double b = Double.parseDouble(edt2.getText().toString());
                if (chk1.isChecked() == true){
                    double s = a + b;
                    result = "La suma es: " + s;
                }
                if (chk2.isChecked() == true){
                    double r = a - b;
                    result = result + " La resta es: " + r;
                }

                tvRes.setText(result);

            }
        });

    }
}