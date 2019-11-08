package com.example.drawcoco.clases;

import java.util.ArrayList;

public class Cliente extends Personas {

    private ArrayList<Creador> creadoresSeguido;

    /**
     * Constructor para la clase Cliente con todos sus atributos
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
     * @param creadoresSeguido agrupa los creadores a los que sigue o esta suscrito el cliente
     */
    public Cliente(String nickname, String nombre, String apellidos, String email, String descripcionBreve, String contraseña, Genero genero, float dinero, Imagen imagenPerfil, Imagen imagenCabecera, ArrayList<Creador> creadoresSeguido) {
        super(nickname, nombre, apellidos, email, descripcionBreve, contraseña, genero, dinero, imagenPerfil, imagenCabecera);
        this.creadoresSeguido = creadoresSeguido;
    }

    /**
     * Getter de la variable creadoresSeguidos
     * @return ArrayList de la clase Creador con todos los creadores a los que sigue el cliente
     */
    public ArrayList<Creador> getCreadoresSeguido() {
        return creadoresSeguido;
    }

    /**
     * Setter de la variable creadoresSeguidos
     * @param creadoresSeguido ArrayList de la clase Creador
     */
    public void setCreadoresSeguido(ArrayList<Creador> creadoresSeguido) {
        this.creadoresSeguido = creadoresSeguido;
    }
}
