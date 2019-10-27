package com.example.drawcoco;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.fonts.Font;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Ajustes extends AppCompatActivity {
    Spinner fuente = (Spinner) findViewById(R.id.eligefuente);
    Spinner idioma = (Spinner) findViewById(R.id.eligeidioma);
    Spinner tamanoFuente=(Spinner)findViewById(R.id.eligetamano);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajustes);

        String[] letras = new String[] {"Courier", "SanSerif", "TimesNewRoman"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, letras);
        fuente.setAdapter(adapter);

        String[] pais = new String[] {"Español", "Ingles"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, pais);
        idioma.setAdapter(adapter2);

        String[] tamano = new String[] {"8","10","12","14","16","18","20","22","24","26","28","30","32","34"};
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, tamano);
        tamanoFuente.setAdapter(adapter3);
    }
}
