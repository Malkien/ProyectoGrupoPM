package com.example.drawcoco.adapters;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.drawcoco.R;
import com.example.drawcoco.clases.Imagenes;

import java.util.ArrayList;

public class AdapterImagenGaleria extends BaseAdapter {
    private Context contexto;
    private ArrayList<Imagenes> arrayListaImagenes;

    public AdapterImagenGaleria (Context contexto, ArrayList<Imagenes> arrayListaImagenes) {
        this.contexto = contexto;
        this.arrayListaImagenes= arrayListaImagenes;
    }

    public int getCount() {
        return arrayListaImagenes.size();
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=((Activity) contexto).getLayoutInflater();
        if(convertView==null){
            convertView = inflater.inflate(R.layout.forma_imagen_galeria, null);
        }

        TextView titulo = convertView.findViewById(R.id.tituloGaleriaDibujo);
        titulo.setText(arrayListaImagenes.get(position).getNombre());
        TextView tag = convertView.findViewById(R.id.categoriaGaleriaDibujo);
        tag.setText(arrayListaImagenes.get(position).getCategoria());
        ImageView imagen = convertView.findViewById(R.id.dibujoGaleria);
        imagen.setImageURI(Uri.parse(arrayListaImagenes.get(position).getRuta()));

        return convertView;
    }
}
