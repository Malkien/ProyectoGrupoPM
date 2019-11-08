package com.example.drawcoco.clases;

import java.util.ArrayList;

public class Creador extends Personas{

    private int suscriptores;
    private ArrayList<Imagen> imagenArrayList;
    private ArrayList<Suscripcion> suscripciones;

    public Creador(String nickname, String nombre, String apellidos, String mail, String contraseña, Genero genero, float dinero, int suscriptores) {
        super(nickname, nombre, apellidos, mail, contraseña, genero, dinero);
        this.suscriptores = suscriptores;
    }

    public Creador(String nickname, String nombre, String apellidos, String mail, String descripcion, String contraseña, Genero genero, float dinero, int suscriptores) {
        super(nickname, nombre, apellidos, mail, descripcion, contraseña, genero, dinero);
        this.suscriptores = suscriptores;
        this.imagenArrayList = imagenArrayList;
    }

    public Creador(String nickname, String nombre, String apellidos, String mail, String descripcion, String contraseña, Genero genero, float dinero, int suscriptores, ArrayList<Imagen> imagenArrayList) {
        super(nickname, nombre, apellidos, mail, descripcion, contraseña, genero, dinero);
        this.suscriptores = suscriptores;
        this.imagenArrayList = imagenArrayList;
    }

    public int getSuscriptores() {
        return suscriptores;
    }

    public void setSuscriptores(int suscriptores) {
        this.suscriptores = suscriptores;
    }

    public ArrayList<Imagen> getImagenArrayList() {
        return imagenArrayList;
    }

    public void setImagenArrayList(ArrayList<Imagen> imagenArrayList) {
        this.imagenArrayList = imagenArrayList;
    }

    public ArrayList<Suscripcion> getSuscripciones() {
        return suscripciones;
    }

    public void setSuscripciones(ArrayList<Suscripcion> suscripciones) {
        this.suscripciones = suscripciones;
    }
}
