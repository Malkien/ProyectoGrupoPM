package com.example.drawcoco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Filtrar extends AppCompatActivity {
    Spinner eligecategoria = (Spinner) findViewById(R.id.eligecategoria);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filtrar);
        String[] datos = new String[] {"Paisajes", "Animales", "Personas"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, datos);
        eligecategoria.setAdapter(adapter);
    }

}
