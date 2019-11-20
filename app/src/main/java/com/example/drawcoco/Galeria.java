package com.example.drawcoco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.GridView;
import android.widget.TextView;

import com.example.drawcoco.adapters.AdapterImagenGaleria;
import com.example.drawcoco.clases.Creador;

public class Galeria extends AppCompatActivity {

    TextView nombreArtista;
    AdapterImagenGaleria adapterGaleria;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);

        nombreArtista = this.findViewById(R.id.nombreArtistaGaleria);

        Creador artista1 = (Creador) getIntent().getExtras().getSerializable("artista1");

        nombreArtista.setText(artista1.getNickname());

        //Llamamos al adapter de galeria para rellenar el GridView con las imagenes del artista seleccionado.
        adapterGaleria = new AdapterImagenGaleria(this,artista1.getImagenArrayList());
        GridView grid = findViewById(R.id.gridViewGaleria);
        grid.setAdapter(adapterGaleria);

    }

    //Boton que nos lleva a la activity_filtrar.
    public void botonGaleriaFiltrar(View view) {
        Intent irAFiltrar = new Intent(this, Filtrar.class);
        startActivity(irAFiltrar);
    }
}
