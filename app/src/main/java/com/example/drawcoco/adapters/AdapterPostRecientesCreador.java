package com.example.drawcoco.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.drawcoco.ItemPostRecientesCreador;
import com.example.drawcoco.R;

import java.util.ArrayList;

public class AdapterPostRecientesCreador extends RecyclerView.Adapter<AdapterPostRecientesCreador.PostRecientesViewHolder> {
    private ArrayList<ItemPostRecientesCreador>itemList;
    public AdapterPostRecientesCreador(ArrayList<ItemPostRecientesCreador>itemsPost){
        this.itemList=itemsPost;
    };
    @NonNull
    @Override
    public PostRecientesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_post_recientes_creador, parent, false);
        PostRecientesViewHolder pvh= new PostRecientesViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(@NonNull PostRecientesViewHolder holder, int position) {
        ItemPostRecientesCreador objetoActual=itemList.get(position);
        holder.imagen.setImageURI(objetoActual.getImagenURI());
        holder.titulo.setText(objetoActual.getTitulo());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    /**
     * Clase View Holder
     */
    public static class PostRecientesViewHolder extends RecyclerView.ViewHolder{
        public TextView titulo;
        public ImageView imagen;
        /**
         * Constructor del ViewHolder
         * @param itemView
         */
        public PostRecientesViewHolder(@NonNull View itemView) {
            super(itemView);
            this.titulo=itemView.findViewById(R.id.textViewTituloPostReciente);
            this.imagen=itemView.findViewById(R.id.imageViewPostReciente);
        }
    }
}
