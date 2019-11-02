package com.example.drawcoco;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.drawcoco.clases.Creador;

public class Galeria extends AppCompatActivity {

    TextView nombreArtista, tituloDibujo1, tituloDibujo2, tituloDibujo3, tituloDibujo4, categoria1, categoria2, categoria3, categoria4;
    ImageView dibujo1, dibujo2, dibujo3, dibujo4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);

        nombreArtista = this.findViewById(R.id.nombreArtista);
        tituloDibujo1= this.findViewById(R.id.tituloGaleriaDibujo1);
        tituloDibujo2= this.findViewById(R.id.tituloGaleriaDibujo2);
        tituloDibujo3= this.findViewById(R.id.tituloGaleriaDibujo3);
        tituloDibujo4= this.findViewById(R.id.tituloGaleriaDibujo4);
        dibujo1= this.findViewById(R.id.dibujoGaleria1);
        dibujo2= this.findViewById(R.id.dibujoGaleria2);
        dibujo3= this.findViewById(R.id.dibujoGaleria3);
        dibujo4= this.findViewById(R.id.dibujoGaleria4);
        categoria1= this.findViewById(R.id.categoriaGaleriaDibujo1);
        categoria2= this.findViewById(R.id.categoriaGaleriaDibujo2);
        categoria3= this.findViewById(R.id.categoriaGaleriaDibujo3);
        categoria4= this.findViewById(R.id.categoriaGaleriaDibujo4);

        Creador artista1 = (Creador) getIntent().getExtras().getSerializable("artista1");
        Creador artista2 = (Creador) getIntent().getExtras().getSerializable("artista2");

        nombreArtista.setText(artista1.getNickname());

        tituloDibujo1.setText(artista1.getImagenesArrayList().get(0).getNombre());
        tituloDibujo2.setText(artista1.getImagenesArrayList().get(1).getNombre());
        tituloDibujo3.setText(artista1.getImagenesArrayList().get(2).getNombre());
        tituloDibujo4.setText(artista2.getImagenesArrayList().get(2).getNombre());

        dibujo1.setImageURI(Uri.parse(artista1.getImagenesArrayList().get(0).getRuta()));
        dibujo2.setImageURI(Uri.parse(artista1.getImagenesArrayList().get(1).getRuta()));
        dibujo3.setImageURI(Uri.parse(artista1.getImagenesArrayList().get(2).getRuta()));
        dibujo4.setImageURI(Uri.parse(artista2.getImagenesArrayList().get(2).getRuta()));

        categoria1.setText(artista1.getImagenesArrayList().get(0).getCategoria());
        categoria2.setText(artista1.getImagenesArrayList().get(1).getCategoria());
        categoria3.setText(artista1.getImagenesArrayList().get(2).getCategoria());
        categoria4.setText(artista2.getImagenesArrayList().get(2).getCategoria());
    }
}
