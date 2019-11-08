package com.example.drawcoco.clases;

import java.io.Serializable;

public abstract class ElementosAComprar implements Serializable {
    private String titulo;
    private String descripcion;
    private float precio;

    /**
     * Constructor completo de la clase ElementosAComprar
     * @param titulo Titulo del elementoAComprar
     * @param descripcion Descripción del elementoAComprar
     * @param precio Precio del elementoAComprar
     */
    public ElementosAComprar(String titulo, String descripcion, float precio) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    /**
     * Constructor vacio, principalmente para crear imagen de cabecera o de perfil.
     *
     */
    public ElementosAComprar(){
    }

    /**
     * Getter del titulo del elementoAComprar
     * @return un objeto de tipo String
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Setter del titulo del elementoAComprar
     * @param titulo String con el valor del titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Getter de la descripcion del elementoAComprar
     * @return objeto de tipo String
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Setter de la descripcion del elementoAComprar
     * @param descripcion String con el nuevo valor de la descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Getter del precio del elementoAComprar
     * @return objeto de tipo float
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Setter del precio del elementoAComprar
     * @param precio Float con el nuevo valor del precio
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
