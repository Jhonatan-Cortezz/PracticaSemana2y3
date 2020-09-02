package com.jac.practicasemana3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.jac.practicasemana3.POO.AgendaPoo;
import com.jac.practicasemana3.POO.ButtonPoo;
import com.jac.practicasemana3.POO.CheckboxPoo;
import com.jac.practicasemana3.POO.EditPoo;
import com.jac.practicasemana3.POO.ImagePoo;
import com.jac.practicasemana3.POO.IntParametros;
import com.jac.practicasemana3.POO.IntentPoo;
import com.jac.practicasemana3.POO.ListViewPoo;
import com.jac.practicasemana3.POO.RadioPoo;
import com.jac.practicasemana3.POO.SharedPoo;
import com.jac.practicasemana3.POO.SpinnerPoo;
import com.jac.practicasemana3.POO.ToastPoo;

import java.util.ArrayList;
import java.util.List;

public class PooActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listaPoo;
    List<String> taskPoo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poo);
        setTitle("Ejercicios resueltos con POO");

        listaPoo = findViewById(R.id.lstEjerciciPoo);

        taskPoo = new ArrayList<>();
        taskPoo.add("Ejercicio 1: Button POO");
        taskPoo.add("Ejercicio 2: RadioGroup POO");
        taskPoo.add("Ejercicio 3: CheckBox POO");
        taskPoo.add("Ejercicio 4: Spinner POO");
        taskPoo.add("Ejercicio 5: ListView POO");
        taskPoo.add("Ejercicio 6: ImageButton POO");
        taskPoo.add("Ejercicio 7: Toast POO");
        taskPoo.add("Ejercicio 8: EditText POO");
        taskPoo.add("Ejercicio 9: Intent POO");
        taskPoo.add("Ejercicio 10: Intent con parametros POO");
        taskPoo.add("Ejercicio 11: SharedPreferences POO");
        taskPoo.add("Ejercicio 12: SharedPreferences Agenda POO");

        ArrayAdapter adapter = new ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                taskPoo
        );

        listaPoo.setAdapter(adapter);

        listaPoo.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String posicion = taskPoo.get(i);

        //pendiente de programar todos los intent a cada activity de las tareas
        if (posicion.equals("Ejercicio 1: Button POO")){
            Intent intent = new Intent(this, ButtonPoo.class);
            startActivity(intent);
        } else if (posicion.equals("Ejercicio 2: RadioGroup POO")){
            Intent intent = new Intent(this, RadioPoo.class);
            startActivity(intent);
        } else if (posicion.equals("Ejercicio 3: CheckBox POO")){
            Intent intent = new Intent(this, CheckboxPoo.class);
            startActivity(intent);
        } else if (posicion.equals("Ejercicio 4: Spinner POO")){
            Intent intent = new Intent(this, SpinnerPoo.class);
            startActivity(intent);
        } else if (posicion.equals("Ejercicio 5: ListView POO")){
            Intent intent = new Intent(this, ListViewPoo.class);
            startActivity(intent);
        } else if (posicion.equals("Ejercicio 6: ImageButton POO")){
            Intent intent = new Intent(this, ImagePoo.class);
            startActivity(intent);
        } else if (posicion.equals("Ejercicio 7: Toast POO")){
            Intent intent = new Intent(this, ToastPoo.class);
            startActivity(intent);
        } else if (posicion.equals("Ejercicio 8: EditText POO")){
            Intent intent = new Intent(this, EditPoo.class);
            startActivity(intent);
        } else if (posicion.equals("Ejercicio 9: Intent POO")){
            Intent intent = new Intent(this, IntentPoo.class);
            startActivity(intent);
        } else if (posicion.equals("Ejercicio 10: Intent con parametros POO")){
            Intent intent = new Intent(this, IntParametros.class);
            startActivity(intent);
        } else if (posicion.equals("Ejercicio 11: SharedPreferences POO")){
            Intent intent = new Intent(this, SharedPoo.class);
            startActivity(intent);
        } else if (posicion.equals("Ejercicio 12: SharedPreferences Agenda POO")){
            Intent intent = new Intent(this, AgendaPoo.class);
            startActivity(intent);
        }
    }
}