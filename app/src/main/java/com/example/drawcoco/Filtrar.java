package com.example.drawcoco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;

public class Filtrar extends AppCompatActivity {
    Spinner eligecategoria = (Spinner) findViewById(R.id.eligecategoria);
    CheckBox gratuitas=(CheckBox)findViewById(R.id.gratuitas);
    CheckBox menor=(CheckBox)findViewById(R.id.menorprecio);
    CheckBox mayor=(CheckBox)findViewById(R.id.mayorprecio);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filtrar);
        String[] datos = new String[] {"Paisajes", "Animales", "Personas"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, datos);
        eligecategoria.setAdapter(adapter);
         if(gratuitas.isChecked()){
            menor.setEnabled(false);
            mayor.setEnabled(false);
         }

    }

}
