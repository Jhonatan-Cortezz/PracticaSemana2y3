package com.jac.practicasemana3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;

public class Acerca extends AppCompatActivity implements View.OnClickListener {
    TextView link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca);
        setTitle("Sobre Mi");

        link = findViewById(R.id.codigoApp);
        SpannableString content = new SpannableString(link.getText());
        content.setSpan(new UnderlineSpan(), 0, link.length(), 0);
        link.setText(content);

        link.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://github.com/Jhonatan-Cortezz/PracticaSemana2y3"));
        startActivity(intent);
    }
}