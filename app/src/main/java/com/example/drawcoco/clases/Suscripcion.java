package com.example.drawcoco.clases;

public class Suscripcion {
    private String titulo;
    private float precio;
    private String descripcion;

    /**
     * Constructor de la clase Suscripcion
     * @param titulo //Titulo de la suscripción
     * @param precio //Precio de la suscripción
     * @param descripcion //Descripción de la suscripcion
     */
    public Suscripcion(String titulo, float precio, String descripcion) {
        this.titulo = titulo;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    /**
     * Getter del titulo de la suscripcion
     * @return un objeto de tipo String
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Setter del titulo de la suscripcion
     * @param titulo String con el valor del titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Getter del precio de la suscripcion
     * @return objeto de tipo float
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Setter del precio de la suscripcion
     * @param precio Float con el nuevo valor del precio
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * Getter de la descripcion de la suscripcion
     * @return objeto de tipo String
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Setter de la descripcion de la suscripcion
     * @param descripcion String con el nuevo valor de la descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
