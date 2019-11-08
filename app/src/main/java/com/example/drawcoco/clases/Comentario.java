package com.example.drawcoco.clases;

import java.time.LocalDateTime;

public class Comentario {
    private Personas usuario;
    private String contenido;
    private LocalDateTime fecha;
    private int puntuacion;

    /**
     * Constructor completo de la clase Comentario
     * @param usuario Usuario del Comentario
     * @param contenido Texto que contiene el Comentario
     * @param fecha Fecha del Comentario
     * @param puntuacion Puntuacion del Comentario
     */
    public Comentario(Personas usuario, String contenido, LocalDateTime fecha, int puntuacion) {
        this.usuario = usuario;
        this.contenido = contenido;
        this.fecha = fecha;
        this.puntuacion = puntuacion;
    }

    /**
     * Getter usuario del comentario
     * @return un objeto de tipo Persona
     */
    public Personas getUsuario() {
        return usuario;
    }

    /**
     * Setter usuario del comentario
     * @param usuario Persona con el nuevo valor del usuario
     */
    public void setUsuario(Personas usuario) {
        this.usuario = usuario;
    }

    /**
     * Getter contenido del comentario
     * @return un objeto de tipo String
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * Setter contenido del comentario
     * @param contenido String con el valor del titulo
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    /**
     * Getter fecha del comentario
     * @return un objeto de tipo LocalDateTime
     */
    public LocalDateTime getFecha() {
        return fecha;
    }

    /**
     * Setter fecha del comentario
     * @param fecha LocalDateTime con el nuevo valor de la fecha
     */
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    /**
     * Getter puntuacion del comentario
     * @return un objeto de tipo int
     */
    public int getPuntuacion() {
        return puntuacion;
    }

    /**
     * Setter puntuacion del comentario
     * @param puntuacion int con el valor de la puntuacion
     */
    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
}
