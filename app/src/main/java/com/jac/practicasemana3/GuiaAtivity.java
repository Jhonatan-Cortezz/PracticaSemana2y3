package com.jac.practicasemana3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class GuiaAtivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listaTareas;
    List<String> elementosLstTareas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guia_ativity);
        setTitle("Ejercicios segun guía práctica");

        listaTareas = (ListView) findViewById(R.id.lstEjerciciosGuia);

        elementosLstTareas = new ArrayList<>();
        elementosLstTareas.add("Ejercicio 1: Button");
        elementosLstTareas.add("Ejercicio 2: RadioGroup");
        elementosLstTareas.add("Ejercicio 3: CheckBox");
        elementosLstTareas.add("Ejercicio 4: Spinner");
        elementosLstTareas.add("Ejercicio 5: ListView");
        elementosLstTareas.add("Ejercicio 6: ImageButton");
        elementosLstTareas.add("Ejercicio 7: Toast");
        elementosLstTareas.add("Ejercicio 8: EditText");
        elementosLstTareas.add("Ejercicio 9: Intent");
        elementosLstTareas.add("Ejercicio 10: Intent con parametros");
        elementosLstTareas.add("Ejercicio 11: SharedPreferences");
        elementosLstTareas.add("Ejercicio 12: SharedPreferences Agenda");

        //adaptador
        ArrayAdapter adapter = new ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                elementosLstTareas
        );

        //vinculacion al adapter
        listaTareas.setAdapter(adapter);

        //evento click
        listaTareas.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        String posicion = elementosLstTareas.get(i);

        //pendiente de programar todos los intent a cada activity de las tareas
        if (posicion.equals("Ejercicio 1: Button")){
            Intent intent = new Intent(this, ButtonTask.class);
            startActivity(intent);
        } else if (posicion.equals("Ejercicio 2: RadioGroup")){
            Intent intent = new Intent(this, RadioGrup.class);
            startActivity(intent);
        } else if (posicion.equals("Ejercicio 3: CheckBox")){
            Intent intent = new Intent(this, CheckBoxActivity.class);
            startActivity(intent);
        } else if (posicion.equals("Ejercicio 4: Spinner")){
            Intent intent = new Intent(this, SpinnerActivity.class);
            startActivity(intent);
        } else if (posicion.equals("Ejercicio 5: ListView")){
            Intent intent = new Intent(this, ListViewActivity.class);
            startActivity(intent);
        } else if (posicion.equals("Ejercicio 6: ImageButton")){
            Intent intent = new Intent(this, ImageButtonActivity.class);
            startActivity(intent);
        } else if (posicion.equals("Ejercicio 7: Toast")){
            Intent intent = new Intent(this, ToastActivity.class);
            startActivity(intent);
        } else if (posicion.equals("Ejercicio 8: EditText")){
            Intent intent = new Intent(this, EditTextActivity.class);
            startActivity(intent);
        } else if (posicion.equals("Ejercicio 9: Intent")){
            Intent intent = new Intent(this, IntentActivity.class);
            startActivity(intent);
        } else if (posicion.equals("Ejercicio 10: Intent con parametros")){
            Intent intent = new Intent(this, IntentParametros.class);
            startActivity(intent);
        } else if (posicion.equals("Ejercicio 11: SharedPreferences")){
            Intent intent = new Intent(this, SharedActivity.class);
            startActivity(intent);
        } else if (posicion.equals("Ejercicio 12: SharedPreferences Agenda")){
            Intent intent = new Intent(this, Agenda.class);
            startActivity(intent);
        }

    }
}