package com.jac.practicasemana3.Ejercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.jac.practicasemana3.R;

import java.util.ArrayList;
import java.util.List;

public class VistaOpciones extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lst;
    List<String> menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_opciones);
        setTitle("Ejercicios Propuestos");

        lst = findViewById(R.id.lstEjercicios);

        menu = new ArrayList<>();
        menu.add("Problema propuesto 1: verificar clave abc123");
        menu.add("Problema propuesto 2: números ramdom");

        ArrayAdapter adapter = new ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                menu
        );

        lst.setAdapter(adapter);

        lst.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String posicion = menu.get(i);

        if (posicion.equals("Problema propuesto 1: verificar clave abc123")){
            Intent intent = new Intent(this, Clave.class);
            startActivity(intent);
            //action
        } else if (posicion.equals("Problema propuesto 2: números ramdom")){
            //action
            Intent intent = new Intent(this, NumeroRamdom.class);
            startActivity(intent);
        }
    }
}