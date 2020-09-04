package com.jac.practicasemana3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.jac.practicasemana3.Ejercicios.VistaOpciones;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayoutCompat capUno, capDos, capaTres;
    ImageView cap1, cap2, cap3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Practica semana 2 y 3");

        capUno =(LinearLayoutCompat) findViewById(R.id.capaUno);
        capDos =(LinearLayoutCompat) findViewById(R.id.capaDos);
        capaTres = findViewById(R.id.capa3);

        capUno.setOnClickListener(this);
        capDos.setOnClickListener(this);
        capaTres.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int d = item.getItemId();

        if (d == R.id.acercaDe){
            //aca el intent
            Intent intent = new Intent(this, Acerca.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
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
                break;

            case R.id.capa3:
                Intent capThre = new Intent(this, VistaOpciones.class);
                startActivity(capThre);
                break;
        }

    }
}