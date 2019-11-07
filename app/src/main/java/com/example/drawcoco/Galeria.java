package com.example.drawcoco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.GridView;
import android.widget.TextView;

import com.example.drawcoco.adaptadores.AdapterImagenGaleria;
import com.example.drawcoco.clases.Creador;
import com.example.drawcoco.clases.Imagenes;

import java.util.ArrayList;

public class Galeria extends AppCompatActivity {

    TextView nombreArtista;
    ArrayList<Imagenes> arrayListImagenes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);

        nombreArtista = this.findViewById(R.id.nombreArtista);

        Creador artista1 = (Creador) getIntent().getExtras().getSerializable("artista1");
        Creador artista2 = (Creador) getIntent().getExtras().getSerializable("artista2");

        nombreArtista.setText(artista1.getNickname());


        AdapterImagenGaleria adapterGaleria = new AdapterImagenGaleria(this, artista1.getImagenesArrayList());
        GridView grid = findViewById(R.id.gridViewGaleriaImagenes);
        grid.setAdapter(adapterGaleria);

    }
}
