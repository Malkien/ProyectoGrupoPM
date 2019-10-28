package com.example.drawcoco.clases;

public class Cliente extends Personas {

    public Cliente(String nickname, String nombre, String apellidos, String mail, String contraseña, Genero genero, float dinero) {
        super(nickname, nombre, apellidos, mail, contraseña, genero, dinero);
    }

    public Cliente(String nickname, String nombre, String apellidos, String mail, String descripcion, String contraseña, Genero genero, float dinero) {
        super(nickname, nombre, apellidos, mail, descripcion, contraseña, genero, dinero);
    }
}
