package com.example.drawcoco.perfiles;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.drawcoco.R;
import com.example.drawcoco.clases.Creador;
import com.example.drawcoco.clases.Suscripcion;

import java.util.ArrayList;

public class PerfilCreador extends AppCompatActivity {
    private TextView nickCreador, descripcionBreve, descripcionCompleta, tituloPost;
    private ImageView imagenPost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_creador);
        //Enlace de los componentes de la activity con las variables java
        nickCreador=findViewById(R.id.textViewNombrePerfil);
        descripcionBreve=findViewById(R.id.textViewDescripcionBreve);
        descripcionCompleta=findViewById(R.id.textViewDescripcionCompleta);
        tituloPost=findViewById(R.id.textViewTituloPost1);
        imagenPost=findViewById(R.id.imageViewPost1);

        Creador artista1 = (Creador) getIntent().getExtras().getSerializable("artista1");
        nickCreador.setText(artista1.getNickname());
        descripcionCompleta.setText(artista1.getDescripcionCompleta());
        descripcionBreve.setText(artista1.getDescripcionCompleta());
        tituloPost.setText(artista1.getImagenesArrayList().get(0).getNombre());
        imagenPost.setImageURI(Uri.parse(artista1.getImagenesArrayList().get(0).getRuta()));
    }
}
