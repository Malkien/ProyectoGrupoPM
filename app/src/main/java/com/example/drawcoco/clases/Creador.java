package com.example.drawcoco.clases;

public class Creador extends Personas{

    private int suscriptores;

    public Creador(String nickname, String nombre, String apellidos, String mail, String contraseña, Genero genero, float dinero, int suscriptores) {
        super(nickname, nombre, apellidos, mail, contraseña, genero, dinero);
        this.suscriptores = suscriptores;
    }

    public int getSuscriptores() {
        return suscriptores;
    }

    public void setSuscriptores(int suscriptores) {
        this.suscriptores = suscriptores;
    }
}
