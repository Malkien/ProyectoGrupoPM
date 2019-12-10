package com.example.drawcoco.perfiles;

import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.drawcoco.CajaSuscripcion;
import com.example.drawcoco.ItemPostRecientesCreador;
import com.example.drawcoco.R;
import com.example.drawcoco.adapters.AdapterPostRecientesCreador;
import com.example.drawcoco.adapters.AdapterSuscripcion;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class PerfilCreador extends Fragment {
    private TextView nickCreador, descripcionBreve, descripcionCompleta;
    private RecyclerView recyclerViewSuscripcion, recyclerViewPostRecientes;
    private RecyclerView.Adapter adapterSuscripcion, adapterPostRecientes;
    private RecyclerView.LayoutManager managerSuscripcion, managerPostRecientes;
    private FloatingActionButton agregar;
    private Activity activity;
    private static final int PERMISO_GALERIA=2;

    public PerfilCreador(Activity act){
        activity=act;
    }
    //private Creador artista
    @Override
    public View onCreateView(LayoutInflater inflater , ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.activity_perfil_creador, container, false);

        //artista = (Creador) getIntent().getExtras().getSerializable("artista1");//cargamos el creador que hay en el main

        //Enlace de los componentes de la activity con las variables java
        nickCreador=view.findViewById(R.id.textViewNombrePerfil);
        descripcionBreve=view.findViewById(R.id.textViewDescripcionBreve);
        descripcionCompleta=view.findViewById(R.id.textViewDescripcionCompleta);
        agregar=view.findViewById(R.id.floatingActionButtonCreador);

        //aplicar valores a los componentes de la activity
        nickCreador.setText("Nick");
        descripcionCompleta.setText("Me gusta pintar sin salirme, aunque aveces me salgo");
        descripcionBreve.setText("Me gusta pintar sin salirme");
        //declarar el RecyclerView, Manager, y adapter para las caja de suscripción
        recyclerViewSuscripcion=view.findViewById(R.id.recycleViewSuscripciones);
        recyclerViewSuscripcion.setHasFixedSize(true);//Con esto se autoAjusta
        managerSuscripcion=new LinearLayoutManager(getActivity().getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);//LinearLayoutManager.HORIZONTAL ¡SCROLL HORIZONTAL!
        //Añadimos al arrayList los objetos que queremos meter en el RecyclerView
        ArrayList<CajaSuscripcion> tipoSuscripcion=new ArrayList<>();
        /*
        for(int i=0; i<variablesPruebas.artista1.getSuscripciones().size();i++){//nos carga todos los tipos de suscripcion declarados en la variable artista
            CajaSuscripcion cajaSuscripcion1=new CajaSuscripcion(variablesPruebas.artista1.getSuscripciones().get(i).getTitulo(), variablesPruebas.artista1.getSuscripciones().get(i).getPrecio()+"€", variablesPruebas.artista1.getSuscripciones().get(i).getDescripcion());
            tipoSuscripcion.add(cajaSuscripcion1);
        }
         */
        tipoSuscripcion.add(new CajaSuscripcion("Bronce", "5€", "Suscripcion de bronce"));
        tipoSuscripcion.add(new CajaSuscripcion("Plata", "10€", "Suscripcion de Plata"));
        adapterSuscripcion=new AdapterSuscripcion(tipoSuscripcion);
        //Enlazamos el manager y el adapter con el recyclerView
        recyclerViewSuscripcion.setLayoutManager(managerSuscripcion);
        recyclerViewSuscripcion.setAdapter(adapterSuscripcion);

        //Recycler Post Recientes
        ArrayList<ItemPostRecientesCreador> postRecientes=new ArrayList<>();//declaramos el ArrayList en el que meteremos los items a cargar
        //Cargamos todos los postRecientes en el arrayList que tenga el creador
        /*
        for (int i=0;i<variablesPruebas.artista1.getImagenArrayList().size()||i<1;i++){
            ItemPostRecientesCreador item=new ItemPostRecientesCreador(variablesPruebas.artista1.getImagenArrayList().get(i).getRuta(),variablesPruebas.artista1.getImagenArrayList().get(i).getTitulo());
            postRecientes.add(item);
        }
        */
        postRecientes.add(new ItemPostRecientesCreador("android.resource://" + view.getContext().getPackageName() + "/" + R.drawable.pollodorado, "Imagen 1"));
        postRecientes.add(new ItemPostRecientesCreador("android.resource://" + view.getContext().getPackageName() + "/" + R.drawable.polloazul, "Imagen 2"));
        //declaramos el recyclerView, manager y adapter
        recyclerViewPostRecientes=view.findViewById(R.id.recyclerPostRecientes);
        recyclerViewPostRecientes.setHasFixedSize(true);//Con esto se autoAjusta
        managerPostRecientes=new LinearLayoutManager(view.getContext());
        adapterPostRecientes=new AdapterPostRecientesCreador(postRecientes);
        //enlazamos el manager y el adapter con el recyclerView
        recyclerViewPostRecientes.setLayoutManager(managerPostRecientes);
        recyclerViewPostRecientes.setAdapter(adapterPostRecientes);

        /**
         *
         * Evento del boton flotante "agregar" para pedir acceso al almacenamiento externo
         */
        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ActivityCompat.checkSelfPermission(view.getContext(), Manifest.permission.READ_EXTERNAL_STORAGE)!= PackageManager.PERMISSION_GRANTED){
                    if (ActivityCompat.shouldShowRequestPermissionRationale(
                            activity, Manifest.permission.READ_EXTERNAL_STORAGE)) {//Se hace segunda comprobacion, para que cuando se instale la aplicacion te pida los permisos,
                        // si no directamente te recuerda como que no y que no quieres que se muestre mas
                        ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, PERMISO_GALERIA);

                    } else {
                        Toast.makeText(view.getContext(), "Subir imagen", Toast.LENGTH_LONG).show();
                    }

                }else{
                    Toast.makeText(view.getContext(), "Subir imagen", Toast.LENGTH_LONG).show();
                }
            }
        });

        return view;
    }
}
