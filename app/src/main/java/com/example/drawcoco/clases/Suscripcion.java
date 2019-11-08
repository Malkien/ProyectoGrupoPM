package com.example.drawcoco.clases;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Suscripcion extends ElementosAComprar implements Serializable {
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;

    /**
     * Constructor completo de la clase Suscripcion
     * @param titulo Titulo de la suscripción, hereda de elementoAComprar
     * @param descripcion Descripción de la suscripción, hereda de elementoAComprar
     * @param precio Precio de la suscripción, hereda de elementoAComprar
     * @param fechaInicio Fecha de inicio de la suscripción
     * @param fechaFin Fecha de fin de la suscripción
     */
    public Suscripcion(String titulo, String descripcion, float precio, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
        super(titulo, descripcion, precio);
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    /**
     * Getter fecha de inicio de la suscripción
     * @return un objeto de tipo LocalDateTime
     */
    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Setter fecha de inicio de la suscripción
     * @param fechaInicio LocalDateTime con el nuevo valor de la fecha de inicio
     */
    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * Getter fecha de fin de la suscripción
     * @return un objeto de tipo LocalDateTime
     */
    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    /**
     * Setter fecha de fin de la suscripción
     * @param fechaFin  LocalDateTime con el nuevo valor de la fecha de fin
     */
    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }
}
