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

    Spinner eligeCategoriaFiltrar ;
    CheckBox gratuitasFiltrar;
    CheckBox menorFiltrar;
    CheckBox mayorFiltrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filtrar);

        eligeCategoriaFiltrar=findViewById(R.id.eligeCategoria);
        gratuitasFiltrar=findViewById(R.id.gratuitas);
        menorFiltrar=findViewById(R.id.menorprecio);
        mayorFiltrar=findViewById(R.id.mayorprecio);

        //Cargamos el spinner con las categorias por las que buscaremos las obras
        String[] datos = new String[] {"Paisajes", "Animales", "Personas"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, datos);
        eligeCategoriaFiltrar.setAdapter(adapter);


    }

    public void filtrar(View view) {
        Intent intentGaleria=new Intent(this,Galeria.class);
        this.startActivity(intentGaleria);
    }

}
