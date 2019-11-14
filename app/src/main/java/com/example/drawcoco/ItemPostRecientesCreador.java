package com.example.drawcoco;

import android.net.Uri;

import java.net.URI;

public class ItemPostRecientesCreador {
    private String imagenURI;
    private String titulo;
    public ItemPostRecientesCreador(String imagen, String titulo){
        this.imagenURI =imagen;
        this.titulo=titulo;
    }

    public Uri getImagenURI() {
        Uri imagenUri=Uri.parse(imagenURI);
        return imagenUri;
    }

    public void setImagenURI(String imagenURI) {
        this.imagenURI = imagenURI;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
