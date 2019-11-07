package com.example.drawcoco.clases;

import android.media.Image;

import java.time.LocalDateTime;

public class Comentario {
    private String nombre;
    private String comentario;
    private Image icono;
    private LocalDateTime fecha;
    private int estrellas;
    public Comentario(String nombre, String comentario, LocalDateTime fecha, int estrellas) {//Añadir imagen cuando sea la hora de la verdad
        this.nombre = nombre;
        this.comentario = comentario;
        this.fecha = fecha;
        this.estrellas = estrellas;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Image getIcono() {
        return icono;
    }

    public void setIcono(Image icono) {
        this.icono = icono;
    }
}
