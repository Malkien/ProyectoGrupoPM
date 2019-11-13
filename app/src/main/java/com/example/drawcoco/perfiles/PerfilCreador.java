package com.example.drawcoco.perfiles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.drawcoco.CajaSuscripcion;
import com.example.drawcoco.R;
import com.example.drawcoco.adapters.AdapterSuscripcion;
import com.example.drawcoco.clases.Creador;

import java.util.ArrayList;

public class PerfilCreador extends AppCompatActivity {
    private TextView nickCreador, descripcionBreve, descripcionCompleta, tituloPost;
    private ImageView imagenPost;
    private RecyclerView recyclerViewSuscripcion;
    private RecyclerView.Adapter adapterSuscripcion;
    private RecyclerView.LayoutManager managerSuscripcion;
    private Creador artista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_creador);
        artista = (Creador) getIntent().getExtras().getSerializable("artista1");

        //Enlace de los componentes de la activity con las variables java
        nickCreador=findViewById(R.id.textViewNombrePerfil);
        descripcionBreve=findViewById(R.id.textViewDescripcionBreve);
        descripcionCompleta=findViewById(R.id.textViewDescripcionCompleta);
        tituloPost=findViewById(R.id.textViewTituloPost1);
        imagenPost=findViewById(R.id.imageViewPost1);

        //aplicar valores a los componentes de la activity
        nickCreador.setText(artista.getNickname());
        descripcionCompleta.setText(artista.getDescripcionCompleta());
        descripcionBreve.setText(artista.getDescripcionBreve());
        tituloPost.setText(artista.getImagenArrayList().get(0).getTitulo());
        imagenPost.setImageURI(Uri.parse(artista.getImagenArrayList().get(0).getRuta()));
        //declarar el RecyclerView, Manager, y adapter para las caja de suscripción
        recyclerViewSuscripcion=findViewById(R.id.recycleViewSuscripciones);
        recyclerViewSuscripcion.setHasFixedSize(true);//Con esto se autoAjusta
        managerSuscripcion=new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);//LinearLayoutManager.HORIZONTAL ¡SCROLL HORIZONTAL!
        //Añadimos al arrayList los objetos que queremos meter en el RecyclerView
        ArrayList<CajaSuscripcion> tipoSuscripcion=new ArrayList<>();
        for(int i=0; i<artista.getSuscripciones().size();i++){
            CajaSuscripcion cajaSuscripcion1=new CajaSuscripcion(artista.getSuscripciones().get(i).getTitulo(), artista.getSuscripciones().get(i).getPrecio()+"€", artista.getSuscripciones().get(i).getDescripcion());
            tipoSuscripcion.add(cajaSuscripcion1);
        }
        adapterSuscripcion=new AdapterSuscripcion(tipoSuscripcion);
        recyclerViewSuscripcion.setLayoutManager(managerSuscripcion);
        recyclerViewSuscripcion.setAdapter(adapterSuscripcion);

    }
}
