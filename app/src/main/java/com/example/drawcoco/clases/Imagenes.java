package com.example.drawcoco.clases;

import java.io.Serializable;

public class Imagenes implements Serializable {
    private String nombre;
    private String descripcion;
    private int precio;
    private String ruta;

    public Imagenes(String nombre, String descripcion, int precio, String ruta) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.ruta = ruta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
}
