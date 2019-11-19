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
    private ArrayList<ItemPostRecientesCreador>itemList; //ArrayList con los items totales a cargar
    public AdapterPostRecientesCreador(ArrayList<ItemPostRecientesCreador>itemsPost){
        this.itemList=itemsPost;
    };

    /**
     * Constructor del viewHolder al crearse por primera vez
     * @param parent
     * @param viewType
     * @return
     */
    @NonNull
    @Override
    public PostRecientesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_post_recientes_creador, parent, false);
        PostRecientesViewHolder pvh= new PostRecientesViewHolder(v);
        return pvh;
    }

    /**
     * Constructor del viewHolder
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(@NonNull PostRecientesViewHolder holder, int position) {
        ItemPostRecientesCreador objetoActual=itemList.get(position);
        holder.imagen.setImageURI(objetoActual.getImagenURI());
        holder.titulo.setText(objetoActual.getTitulo());
    }

    /**
     * Getter con el numero de items totales a cargar
     * @return
     */
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
