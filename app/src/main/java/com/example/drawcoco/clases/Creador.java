package com.example.drawcoco.clases;

import java.util.ArrayList;

public class Creador extends Personas{

    private int suscriptores;
    private ArrayList<Imagenes> imagenesArrayList;
    private ArrayList<Suscripcion> suscripciones;



    public Creador(String nickname, String nombre, String apellidos, String mail, String contraseña, Genero genero, float dinero, int suscriptores) {
        super(nickname, nombre, apellidos, mail, contraseña, genero, dinero);
        this.suscriptores = suscriptores;
    }

    public Creador(String nickname, String nombre, String apellidos, String mail, String descripcion, String contraseña, Genero genero, float dinero, int suscriptores) {
        super(nickname, nombre, apellidos, mail, descripcion, contraseña, genero, dinero);
        this.suscriptores = suscriptores;
        this.imagenesArrayList = imagenesArrayList;
    }

    public Creador(String nickname, String nombre, String apellidos, String mail, String descripcion, String contraseña, Genero genero, float dinero, int suscriptores, ArrayList<Imagenes> imagenesArrayList) {
        super(nickname, nombre, apellidos, mail, descripcion, contraseña, genero, dinero);
        this.suscriptores = suscriptores;
        this.imagenesArrayList = imagenesArrayList;
    }

    public int getSuscriptores() {
        return suscriptores;
    }

    public void setSuscriptores(int suscriptores) {
        this.suscriptores = suscriptores;
    }

    public ArrayList<Imagenes> getImagenesArrayList() {
        return imagenesArrayList;
    }

    public void setImagenesArrayList(ArrayList<Imagenes> imagenesArrayList) {
        this.imagenesArrayList = imagenesArrayList;
    }

    public ArrayList<Suscripcion> getSuscripciones() {
        return suscripciones;
    }

    public void setSuscripciones(ArrayList<Suscripcion> suscripciones) {
        this.suscripciones = suscripciones;
    }
}
