package com.example.drawcoco.perfiles;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.drawcoco.CajaSuscripcion;
import com.example.drawcoco.R;
import com.example.drawcoco.clases.Creador;

public class PerfilCreador extends AppCompatActivity {
    private TextView nickCreador, descripcionBreve, descripcionCompleta, tituloPost;
    private ImageView imagenPost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_creador);
        Creador artista = (Creador) getIntent().getExtras().getSerializable("artista1");
        //Enlace de los componentes de la activity con las variables java
        nickCreador=findViewById(R.id.textViewNombrePerfil);
        descripcionBreve=findViewById(R.id.textViewDescripcionBreve);
        descripcionCompleta=findViewById(R.id.textViewDescripcionCompleta);
        tituloPost=findViewById(R.id.textViewTituloPost1);
        imagenPost=findViewById(R.id.imageViewPost1);

        nickCreador.setText(artista.getNickname());
        descripcionCompleta.setText(artista.getDescripcionCompleta());
        descripcionBreve.setText(artista.getDescripcionBreve());
        tituloPost.setText(artista.getImagenArrayList().get(0).getTitulo());
        imagenPost.setImageURI(Uri.parse(artista.getImagenArrayList().get(0).getRuta()));

        CajaSuscripcion cajaSuscripcion=new CajaSuscripcion(this, artista);
        GridView gridSuscripcion= this.findViewById(R.id.espacioSuscripciones);
        gridSuscripcion.setAdapter(cajaSuscripcion);
    }
}
