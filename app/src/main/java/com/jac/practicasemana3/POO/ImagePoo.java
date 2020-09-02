package com.jac.practicasemana3.POO;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.jac.practicasemana3.R;

public class ImagePoo extends AppCompatActivity {
    TextView textView;
    ImageButton imt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_poo);
        setTitle("ImageButton POO");

        imt = findViewById(R.id.imageButtonP);
        textView = findViewById(R.id.txtImageP);

        imt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Llamando...");
            }
        });
    }
}