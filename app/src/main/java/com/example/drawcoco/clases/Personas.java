package com.example.drawcoco.clases;

import java.io.Serializable;

public class Personas implements Serializable {
    private String nickname;
    private String nombre;
    private String apellidos;
    private String mail;
    private String contraseña;
    private Genero genero;
    private float dinero;


    public Personas(String nickname, String nombre, String apellidos, String mail, String contraseña, Genero genero, float dinero) {
        this.nickname = nickname;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.mail = mail;
        this.contraseña = contraseña;
        this.genero = genero;
        this.dinero = dinero;
    }

    public enum Genero {
        HOMBRE,
        MUJER
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }
}
