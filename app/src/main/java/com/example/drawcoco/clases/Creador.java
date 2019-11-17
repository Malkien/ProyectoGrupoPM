package com.example.drawcoco.clases;

import java.util.ArrayList;

public class Creador extends Personas{

    private int suscriptores;
    private ArrayList<Imagen> imagenArrayList;
    private ArrayList<Suscripcion> suscripciones;
    private String descripcionCompleta;

    /**
     * Constructor de la clase Creador con todos los atributos
     * @param nickname
     * @param nombre
     * @param apellidos
     * @param email
     * @param descripcionBreve
     * @param contraseña
     * @param genero
     * @param dinero
     * @param imagenPerfil
     * @param imagenCabecera
     * @param suscriptores int con el Numero de suscriptores actuales
     * @param imagenArrayList ArrayList con todas las imagenes que ha subido el creador
     * @param suscripciones ArrayList de suscripciones con los tipos de suscripciones que tiene establecido el creador
     * @param descripcionCompleta String con la suscripcion completa del creador
     */
    public Creador(String nickname, String nombre, String apellidos, String email, String descripcionBreve, String contraseña, Genero genero, float dinero, Imagen imagenPerfil, Imagen imagenCabecera, int suscriptores, ArrayList<Imagen> imagenArrayList, ArrayList<Suscripcion> suscripciones, String descripcionCompleta) {
        super(nickname, nombre, apellidos, email, descripcionBreve, contraseña, genero, dinero, imagenPerfil, imagenCabecera);
        this.suscriptores = suscriptores;
        this.imagenArrayList = imagenArrayList;
        this.suscripciones = suscripciones;
        this.descripcionCompleta = descripcionCompleta;
    }

    /**
     * Getter de la variable suscriptores
     * @return objeto de la clase Integer con el numero de suscriptores actuales
     */
    public int getSuscriptores() {
        return suscriptores;
    }

    /**
     * Setter de la variable suscriptores
     * @param suscriptores Objeto de la clase Integer con el nuevo valor para la variable suscriptores
     */
    public void setSuscriptores(int suscriptores) {
        this.suscriptores = suscriptores;
    }

    /**
     * Getter de la variable imagenArrayList
     * @return Un arrayList de la clase Imagen con todas las imagenes del creador
     */
    public ArrayList<Imagen> getImagenArrayList() {
        return imagenArrayList;
    }

    /**
     * Setter de la variable imagenArrayList
     * @param imagenArrayList arrayList de la clase Imagen
     */
    public void setImagenArrayList(ArrayList<Imagen> imagenArrayList) {
        this.imagenArrayList = imagenArrayList;
    }

    /**
     * Getter de la variable suscripciones
     * @return Un arrayList de la clase suscripcion con los tipos de suscripciones que tiene el creador
     */
    public ArrayList<Suscripcion> getSuscripciones() {
        return suscripciones;
    }

    /**
     * Setter de la variable suscripciones
     * @param suscripciones ArrayList de la clase Suscripcion
     */
    public void setSuscripciones(ArrayList<Suscripcion> suscripciones) {
        this.suscripciones = suscripciones;
    }

    /**
     * Getter de la variable descripcionCompleta
     * @return Objetos de la clase String con el valor de la variable descripcionCompleta
     */
    public String getDescripcionCompleta() {
        return descripcionCompleta;
    }

    /**
     * Setter de la variable descripcionCompleta
     * @param descripcionCompleta Objeto de la clase String con el nuevo valor para la variable descripcionCompleta
     */
    public void setDescripcionCompleta(String descripcionCompleta) {
        this.descripcionCompleta = descripcionCompleta;
    }
}
