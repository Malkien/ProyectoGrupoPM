package com.example.drawcoco;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

import com.example.drawcoco.adapters.AdapterImagenGaleria;
import com.example.drawcoco.clases.Imagen;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Galeria extends Fragment {

    TextView nombreArtista;

    @Override
    public View onCreateView(LayoutInflater inflater , ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.activity_galeria, container, false);


        nombreArtista = view.findViewById(R.id.nombreArtistaGaleria);

        /////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////INFORMACION NECESARIA; HAZ LO QUE QUIERAS CON ELLO/////////
        /////////////////////////////////////////////////////////////////////////////////////
        ArrayList<String> arrayTags1 = new ArrayList<>();
        arrayTags1.add("Infantil");
        arrayTags1.add("Bonito");

        ArrayList<String> arrayTags2 = new ArrayList<>();
        arrayTags2.add("Sexy");
        arrayTags2.add("Hot");
        ArrayList<Imagen> galeriaArtista1=new ArrayList<Imagen>();
        galeriaArtista1 = new ArrayList<Imagen>();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            galeriaArtista1.add(new Imagen("Pollo Dorado", "Un pollo bonito", 50, LocalDateTime.now(), "android.resource://" + view.getContext().getPackageName() + "/" + R.drawable.pollodorado, arrayTags1, null, true, null));
            galeriaArtista1.add(new Imagen("Poring", "Esta blandito", 12, LocalDateTime.now(), "android.resource://" + view.getContext().getPackageName() + "/" + R.drawable.poi, arrayTags1, null, true, null));
            galeriaArtista1.add(new Imagen("Bunny", "Conejita Sexy", 100, LocalDateTime.now(), "android.resource://" + view.getContext().getPackageName() + "/" + R.drawable.bunny, arrayTags2, null, true, null));
        }

        nombreArtista.setText(galeriaArtista1.get(0).getTitulo());
        ////////////////////////////////////////////////////
        ////////////////////////////////////////////////////

        //Llamamos al adapter de galeria para rellenar el GridView con las imagenes del artista seleccionado.
        AdapterImagenGaleria adapterGaleria = new AdapterImagenGaleria(view.getContext(),galeriaArtista1);//te he dejado el array de imagenes
        GridView grid = view.findViewById(R.id.gridViewGaleria);
        grid.setAdapter(adapterGaleria);
        return view;
    }

    //Boton que nos lleva a la activity_filtrar.
    public void botonGaleriaFiltrar(View view) {
        Intent irAFiltrar = new Intent(view.getContext(), Filtrar.class);
        startActivity(irAFiltrar);
    }
}
