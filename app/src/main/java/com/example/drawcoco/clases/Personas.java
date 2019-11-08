package com.example.drawcoco.clases;

import android.media.Image;

import java.io.Serializable;

public abstract class Personas implements Serializable {
    private String nickname;
    private String nombre;
    private String apellidos;
    private String email;
    private String descripcionBreve;
    private String contraseña;
    private Genero genero;
    private float dinero;
    private Imagen imagenPerfil;
    private Imagen imagenCabecera;

    /**
     * Constructor de la clase Persona con todos sus atributos NO instanciable
     * @param nickname Nick de la Persona
     * @param nombre Nombre de la Persona
     * @param apellidos Apellidos de la Persona
     * @param email Email de la Persona
     * @param descripcionBreve Descripción breve de la Persona, Max 150 caracteres
     * @param contraseña Contraseña de la Persona
     * @param genero Genero de la Persona, True hombre/False Mujer
     * @param dinero Dinero que posee la Persona
     * @param imagenPerfil Foto actual que la Persona muestra en su perfil
     * @param imagenCabecera Imagen actual que la Persona muestra en la cabecera del perfil
     */
    public Personas(String nickname, String nombre, String apellidos, String email, String descripcionBreve, String contraseña, Genero genero, float dinero, Imagen imagenPerfil, Imagen imagenCabecera) {
        this.nickname = nickname;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.descripcionBreve = descripcionBreve;
        this.contraseña = contraseña;
        this.genero = genero;
        this.dinero = dinero;
        this.imagenPerfil = imagenPerfil;
        this.imagenCabecera = imagenCabecera;
    }

    /**
     * Getter de la variable nickname
     * @return Objeto de la clase String con el valor del nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Setter de la variable nickname
     * @param nickname Objeto de la clase String con el nuevo valor para la variable nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * Getter de la variable nombre
     * @return Objeto de la clase String con el valor del nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter de la variable nombre
     * @param nombre Objeto de la clase String con el nuevo valor para la variable nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter de la variable apellidos
     * @return Objeto de la clase String con el valor de la variable apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Setter de la variable appellidos
     * @param apellidos Objeto de la clase String con el nuevo valor de la variable apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Getter de la variable mail
     * @return Objeto de la clase String con el valor de la variable mail
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter de la variable mail
     * @param email Objeto de la clase String con el nuevo valor de la variable mail
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter de la variable descripcionBreve
     * @return Objeto de la clase String con el valor de la variable descripcionBreve
     */
    public String getDescripcionBreve() {
        return descripcionBreve;
    }

    /**
     * Setter de la variable descripcionBreve
     * @param descripcionBreve Objeto de la clase String con el nuevo valor para la variable descripcionBreve
     */
    public void setDescripcionBreve(String descripcionBreve) {
        this.descripcionBreve = descripcionBreve;
    }

    /**
     * Getter de la variable contraseña
     * @return Objeto de la clase String con el valor de la variable contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Setter de la variable contraseña
     * @param contraseña Objeto de la clase String con el nuevo valor de la variable contraseña
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * Getter de la variable genero
     * @return Objeto de la clase Enum (HOMBRE, MUJER) con el valor de la variable genero
     */
    public Genero getGenero() {
        return genero;
    }

    /**
     * Setter de la variable genero
     * @param genero Objeto de la clase Enum (HOMBRE, MUJER) con el nuevo valor para la variable genero
     */
    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    /**
     * Getter de la variable dinero
     * @return Objeto de la clase Float con el valor de la variable dinero
     */
    public float getDinero() {
        return dinero;
    }

    /**
     * Setter de la variable dinero
     * @param dinero Objeto de la clase Float con el nuevo valor para la variable dinero
     */
    public void setDinero(float dinero) {
        this.dinero = dinero;
    }

    /**
     * Getter de la variable imagenPerfil
     * @return Objeto de la clase Imagen con el valor de la variable imagenPerfil
     */
    public Imagen getImagenPerfil() {
        return imagenPerfil;
    }

    /**
     * Setter de la variable imagenPerfil
     * @param imagenPerfil Objeto de la clase Imagen con el nuevo valor para la variable imagenPerfil
     */
    public void setImagenPerfil(Imagen imagenPerfil) {
        this.imagenPerfil = imagenPerfil;
    }

    /**
     * Getter de la variable imagenCabecera
     * @return Objeto de la clase Imagen con el valor de la variable imagenCabecera
     */
    public Imagen getImagenCabecera() {
        return imagenCabecera;
    }

    /**
     * Setter de la variable imagenCabecera
     * @param imagenCabecera Objeto de la clase Imagen con el nuevo valor para la varieble imagenCabecera
     */
    public void setImagenCabecera(Imagen imagenCabecera) {
        this.imagenCabecera = imagenCabecera;
    }

    /**
     * Constructor del enum Genero
     * Puede ser HOMBRE o MUJER
     */
    public enum Genero {
        HOMBRE,
        MUJER
    }

}
