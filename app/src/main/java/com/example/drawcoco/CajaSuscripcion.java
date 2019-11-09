package com.example.drawcoco;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.drawcoco.clases.Creador;

public class CajaSuscripcion extends BaseAdapter {
    private Context contexto;
    private Creador creador;

    public CajaSuscripcion(Context contexto, Creador creador) {
        this.contexto = contexto;
        this.creador = creador;
    }

    @Override
    public int getCount() {
        return creador.getSuscripciones().size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater=((Activity)contexto).getLayoutInflater();
        if(view==null){
            view=inflater.inflate(R.layout.activity_caja_suscripcion, null);
        }
        TextView titulo=view.findViewById(R.id.textViewTituloSuscripcion);
        titulo.setText(creador.getSuscripciones().get(i).getTitulo());
        TextView precio=view.findViewById(R.id.textViewPrecioSuscripcion);
        precio.setText(creador.getSuscripciones().get(i).getPrecio()+"€");
        TextView descripcion=view.findViewById(R.id.textViewDescripcionSuscripcion);
        descripcion.setText(creador.getSuscripciones().get(i).getDescripcion());
        Button boton=view.findViewById(R.id.buttonSuscribirse);
        //El boton de suscribirse aun no hace nada
        return view;
    }
}
