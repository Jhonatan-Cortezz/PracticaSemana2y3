package com.jac.practicasemana3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ImageButtonActivity extends AppCompatActivity {
    TextView textView;
    ImageButton imt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_button);

        imt = findViewById(R.id.imageButton);
        textView = findViewById(R.id.txtImage);

        imt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Llamando");
            }
        });

    }
}