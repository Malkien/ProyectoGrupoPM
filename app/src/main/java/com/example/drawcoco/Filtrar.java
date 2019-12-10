package com.example.drawcoco;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;

//En este Activity filtraremos las busquedas de nuestros usuarios, por categoria y precio.
public class Filtrar extends Fragment {

    Spinner eligeCategoriaFiltrar ;
    CheckBox gratuitasFiltrar;
    CheckBox menorFiltrar;
    CheckBox mayorFiltrar;
    private Button botonFiltrar;


    @Override
    public View onCreateView(LayoutInflater inflater , ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        final View view = inflater.inflate(R.layout.activity_ajustes, container, false);
        botonFiltrar=view.findViewById(R.id.btnFiltrar);
        eligeCategoriaFiltrar=view.findViewById(R.id.eligeCategoria);
        gratuitasFiltrar=view.findViewById(R.id.gratuitas);
        menorFiltrar=view.findViewById(R.id.menorprecio);
        mayorFiltrar=view.findViewById(R.id.mayorprecio);

        //Cargamos el spinner con las categorias por las que buscaremos las obras
        String[] datos = new String[] {"Paisajes", "Animales", "Personas"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(view.getContext(),
                android.R.layout.simple_spinner_item, datos);
        eligeCategoriaFiltrar.setAdapter(adapter);

        botonFiltrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentGaleria=new Intent(view.getContext(),Desplegable.class);
                ((Activity)(view.getContext())).startActivity(intentGaleria);
            }
        });
        return view;
    }



}
