package com.example.drawcoco.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.drawcoco.CajaSuscripcion;
import com.example.drawcoco.R;

import java.util.ArrayList;

public class AdapterSuscripcion extends RecyclerView.Adapter<AdapterSuscripcion.SuscripcionViewHolder> {
    private ArrayList<CajaSuscripcion>arrayItems;
    @NonNull
    @Override
    public SuscripcionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_caja_suscripcion, parent, false);
        SuscripcionViewHolder svh=new SuscripcionViewHolder(v);
        return svh;
    }

    public AdapterSuscripcion(ArrayList<CajaSuscripcion>listCajas){
        arrayItems=listCajas;
    }
    @Override
    public void onBindViewHolder(@NonNull SuscripcionViewHolder holder, int position) {
        CajaSuscripcion objetoActual=arrayItems.get(position);
        holder.titulo.setText(objetoActual.getTitulo());
        holder.precio.setText(objetoActual.getPrecio());
        holder.descripcion.setText((objetoActual.getDescripcion()));
        //holder.botonSuscribirse.setText(objetoActual.getBoton().getText());

    }

    @Override
    public int getItemCount() {
        return arrayItems.size();
    }

    /**
     * Clase del View Holder
     */
    public static class SuscripcionViewHolder extends RecyclerView.ViewHolder{
        public TextView titulo, precio, descripcion;
        public Button botonSuscribirse;

        /**
         * Contructor del ViewHolder
         * @param itemView
         */
        public SuscripcionViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo= itemView.findViewById(R.id.textViewTituloSuscripcion);
            precio= itemView.findViewById(R.id.textViewPrecioSuscripcion);
            descripcion=itemView.findViewById(R.id.textViewDescripcionSuscripcion);
            botonSuscribirse=itemView.findViewById(R.id.buttonSuscribirse);
        }
    }
}
