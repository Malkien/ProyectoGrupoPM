package com.example.drawcoco;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;

//En este Activity filtraremos las busquedas de nuestros usuarios, por categoria y precio.
public class Filtrar extends AppCompatActivity {

    Spinner eligeCategoriaFiltrar ;
    CheckBox gratuitasFiltrar;
    CheckBox menorFiltrar;
    CheckBox mayorFiltrar;
    private Context contexto;
    private Button botonFiltrar;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filtrar);
        botonFiltrar=findViewById(R.id.btnFiltrar);
        eligeCategoriaFiltrar=findViewById(R.id.eligeCategoria);
        gratuitasFiltrar=findViewById(R.id.gratuitas);
        menorFiltrar=findViewById(R.id.menorprecio);
        mayorFiltrar=findViewById(R.id.mayorprecio);
        contexto=this;

        //Cargamos el spinner con las categorias por las que buscaremos las obras
        String[] datos = new String[] {"Paisajes", "Animales", "Personas"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, datos);
        eligeCategoriaFiltrar.setAdapter(adapter);

        botonFiltrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGaleria=new Intent(contexto,Coordinador.class);
                contexto.startActivity(intentGaleria);
            }
        });
    }
}
