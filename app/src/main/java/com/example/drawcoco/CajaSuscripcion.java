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

public class CajaSuscripcion{
    String titulo, precio, descripcion;

    /**
     * Constructor de la clase CajaSuscripcion
     * @param titulo de la suscripcion
     * @param precio de la suscripcion
     * @param descripcion de la suscripcion
     */
    public CajaSuscripcion(String titulo, String precio, String descripcion) {
        this.titulo=titulo;
        this.descripcion=descripcion;
        this.precio=precio;
    }

    /**
     * Getter del titulo
     * @return String
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Setter del titulo
     * @param titulo String
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Getter del precio
     * @return String
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * Setter del precio
     * @param precio String
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    /**
     * Getter de la descripcion
     * @return String
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Setter de la descripcion
     * @param descripcion String
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
