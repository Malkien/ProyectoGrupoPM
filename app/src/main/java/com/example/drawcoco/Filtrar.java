package com.example.drawcoco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;

//En este Activity filtraremos las busquedas de nuestros usuarios, por categoria y precio.
public class Filtrar extends AppCompatActivity {

    Spinner eligecategoria ;
    CheckBox gratuitas;
    CheckBox menor;
    CheckBox mayor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filtrar);

        eligecategoria=findViewById(R.id.eligecategoria);
        gratuitas=findViewById(R.id.gratuitas);
        menor=findViewById(R.id.menorprecio);
        mayor=findViewById(R.id.mayorprecio);

        //Cargamos el spinner con las categorias por las que buscaremos las obras
        String[] datos = new String[] {"Paisajes", "Animales", "Personas"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, datos);
        eligecategoria.setAdapter(adapter);


    }


    public void filtrar(View view) {
        Intent intentGaleria=new Intent(this, MainActivity.class);
        this.startActivity(intentGaleria);
    }

}
