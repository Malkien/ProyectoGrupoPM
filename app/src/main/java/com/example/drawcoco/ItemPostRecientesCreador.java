package com.example.drawcoco;

import android.net.Uri;

import java.net.URI;

public class ItemPostRecientesCreador {
    private String imagenURI;
    private String titulo;

    /**
     * Constructor de las clase ItemPostRecientesCreador
     * @param imagen del Post
     * @param titulo del post
     */
    public ItemPostRecientesCreador(String imagen, String titulo){
        this.imagenURI =imagen;
        this.titulo=titulo;
    }

    /**
     * getter de la imagen del post
     * @return Uri
     */
    public Uri getImagenURI() {
        Uri imagenUri=Uri.parse(imagenURI);
        return imagenUri;
    }

    /**
     * Setter de la imagen del post
     * @param imagenURI String
     */
    public void setImagenURI(String imagenURI) {
        this.imagenURI = imagenURI;
    }

    /**
     * Getter del titulo del post
     * @return String
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Setter del titulo del post
     * @param titulo String
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
