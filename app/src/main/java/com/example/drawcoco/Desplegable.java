package com.example.drawcoco;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.drawcoco.clases.Creador;

public class Desplegable extends AppCompatActivity {
    private TextView nick;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desplegable);
        nick=findViewById(R.id.textViewNombreUsuarioDesplegable);

        Creador artista1 = (Creador) getIntent().getExtras().getSerializable("artista1");
        nick.setText(artista1.getNickname());
    }
}
