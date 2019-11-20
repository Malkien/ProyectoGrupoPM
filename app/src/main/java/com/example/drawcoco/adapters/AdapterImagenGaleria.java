package com.example.drawcoco.adapters;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.drawcoco.R;
import com.example.drawcoco.clases.Imagen;

import java.util.ArrayList;

public class AdapterImagenGaleria extends BaseAdapter {
    private Context contexto;
    private ArrayList<Imagen> arrayListaImagenes;

    public AdapterImagenGaleria (Context contexto, ArrayList<Imagen> arrayListaImagenes) {
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
            convertView = inflater.inflate(R.layout.activity_adapter_galeria, null);
        }

        TextView titulo = convertView.findViewById(R.id.tituloGaleriaDibujo);
        titulo.setText(arrayListaImagenes.get(position).getTitulo());
        TextView tag = convertView.findViewById(R.id.categoriaGaleriaDibujo);
        tag.setText(arrayListaImagenes.get(position).getArrayTags().get(0));
        ImageView imagen = convertView.findViewById(R.id.dibujoGaleria);
        imagen.setImageURI(Uri.parse(arrayListaImagenes.get(position).getRuta()));

        //Boton añadidos a las imagenes
        imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos un AlertDialog e incluimos dentro de este un ImageView con algunas propiedades para que al
                //pulsar en la imagen aparezca esta a mayor tamaño.
                AlertDialog.Builder builder = new AlertDialog.Builder(contexto);
                ImageView imageView = new ImageView(contexto);
                imageView.setImageURI(Uri.parse(arrayListaImagenes.get(position).getRuta()));
                imageView.setAdjustViewBounds(true);
                builder.setView(imageView);
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        return convertView;

    }
}
