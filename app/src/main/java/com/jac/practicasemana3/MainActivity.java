package com.jac.practicasemana3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayoutCompat capUno, capDos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        capUno =(LinearLayoutCompat) findViewById(R.id.capaUno);
        capDos =(LinearLayoutCompat) findViewById(R.id.capaDos);

        capUno.setOnClickListener(this);
        capDos.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.capaUno:
                Intent capOne = new Intent(this, GuiaAtivity.class );
                startActivity(capOne);
                break;

            case R.id.capaDos:
                Intent capTwo = new Intent(this, PooActivity.class );
                startActivity(capTwo);
        }
    }
}