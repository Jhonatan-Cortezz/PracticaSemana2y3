package com.jac.practicasemana3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListViewActivity extends AppCompatActivity {
    String[] paises = {"Argentina", "Chile", "Paraguay", "Bolivia", "Peru", "Ecuador", "Brasil", "Colombia", "Venezuela", "Uruguay"};
    String[] habitantes = {"4000000", "7000000", "12000000", "8790000", "3900000", "2890000", "45800000", "7000000", "1000000", "2000000"};

    TextView tv1;
    ListView lst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        tv1 = findViewById(R.id.largo);
        lst = findViewById(R.id.lista);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                paises
        );

        lst.setAdapter(adapter);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                tv1.setText("Poblacion de " + lst.getItemAtPosition(i) + " es " + habitantes[i]);
            }
        });
    }
}