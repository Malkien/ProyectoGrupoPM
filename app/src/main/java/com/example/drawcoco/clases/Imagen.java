package com.example.drawcoco.clases;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Imagen extends ElementosAComprar implements Serializable {

    private LocalDateTime fechaSubida;
    private String ruta;
    private ArrayList<String> arrayTags;
    private Creador creador;
    private Boolean gratis;
    private Suscripcion suscripcionAsignada;

    /**
     * Constructor completo de la clase Imagen
     * @param titulo Titulo de la imagen, hereda de elementoAComprar
     * @param descripcion Descripción de la imagen, hereda de elementoAComprar
     * @param precio Precio de la imagen, hereda de elementoAComprar
     * @param fechaSubida Fecha de subida de la imagen
     * @param ruta Ruta de archivo de la imagen
     * @param arrayTags ArrayList de tags de la imagen
     * @param creador Creador de la imagen
     * @param gratis Boolean de la imagen para indicar si es gratuita o no (gratis = true, pago = false)
     * @param suscripcionAsignada Suscripcion contenedora de la imagen
     */
    public Imagen(String titulo, String descripcion, float precio, LocalDateTime fechaSubida,
                  String ruta, ArrayList<String> arrayTags, Creador creador, Boolean gratis, Suscripcion suscripcionAsignada) {
        super(titulo, descripcion, precio);
        this.fechaSubida = fechaSubida;
        this.ruta = ruta;
        this.arrayTags = arrayTags;
        this.creador = creador;
        this.gratis = gratis;
        this.suscripcionAsignada = suscripcionAsignada;
    }

    /**
     * Getter fechaSubida de la imagen
     * @return un objeto de tipo LocalDateTime
     */
    public LocalDateTime getFechaSubida() {
        return fechaSubida;
    }

    /**
     * Setter fechaSubida de la imagen
     * @param fechaSubida LocalDateTime con el nuevo valor de la fecha
     */
    public void setFechaSubida(LocalDateTime fechaSubida) {
        this.fechaSubida = fechaSubida;
    }

    /**
     * Getter ruta de la imagen
     * @return un objeto de tipo String
     */
    public String getRuta() {
        return ruta;
    }

    /**
     * Setter ruta de la imagen
     * @param ruta String con el valor de la ruta
     */
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    /**
     * Getter tags de la imagen
     * @return un objeto Collection tipo ArrayList de la imagen
     */
    public ArrayList<String> getArrayTags() {
        return arrayTags;
    }

    /**
     * Setter tags de la imagen
     * @param arrayTags ArrayList con los diferentes tags de la imagen
     */
    public void setArrayTags(ArrayList<String> arrayTags) {
        this.arrayTags = arrayTags;
    }

    /**
     * Getter creador de la imagen
     * @return un objeto de tipo Creador
     */
    public Creador getCreador() {
        return creador;
    }

    /**
     * Setter creador de la imagen
     * @param creador Creador con el nuevo valor del creador
     */
    public void setCreador(Creador creador) {
        this.creador = creador;
    }

    /**
     * Getter gratis de la imagen
     * @return un objeto de tipo Boolean (gratis si es true, de pago si es false)
     */
    public Boolean getGratis() {
        return gratis;
    }

    /**
     * Setter gratis de la imagen
     * @param gratis Boolean con el nuevo valor.
     */
    public void setGratis(Boolean gratis) {
        this.gratis = gratis;
    }

    /**
     * Getter suscripcion asignada de la imagen
     * @return un objeto de tipo Suscripcion
     */
    public Suscripcion getSuscripcionAsignada() {
        return suscripcionAsignada;
    }

    /**
     * Setter suscripcion de la imagen
     * @param suscripcionAsignada Suscripcion con el nuevo valor
     */
    public void setSuscripcionAsignada(Suscripcion suscripcionAsignada) {
        this.suscripcionAsignada = suscripcionAsignada;
    }
}
