package com.bootcamp.retoTecnico.model;

import java.util.Date;

public class Persona {
    private String nombre;
    private String genero;
    private String ubicacion;
    private String correo;
    private Date fechaNacimiento;
    private String urlFoto;

    // Constructor privado
    private Persona(Builder builder) {
        this.nombre = builder.nombre;
        this.genero = builder.genero;
        this.ubicacion = builder.ubicacion;
        this.correo = builder.correo;
        this.fechaNacimiento = builder.fechaNacimiento;
        this.urlFoto = builder.urlFoto;
    }

    // Getters (opcionalmente puedes agregarlos aquí)
    public String getNombre() { return nombre; }
    public String getGenero() { return genero; }
    public String getUbicacion() { return ubicacion; }
    public String getCorreo() { return correo; }
    public Date getFechaNacimiento() { return fechaNacimiento; }
    public String getUrlFoto() { return urlFoto; }

    // Builder
    public static class Builder {
        private String nombre;
        private String genero;
        private String ubicacion;
        private String correo;
        private Date fechaNacimiento;
        private String urlFoto;

        public Builder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder genero(String genero) {
            this.genero = genero;
            return this;
        }

        public Builder ubicacion(String ubicacion) {
            this.ubicacion = ubicacion;
            return this;
        }

        public Builder correo(String correo) {
            this.correo = correo;
            return this;
        }

        public Builder fechaNacimiento(Date fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
            return this;
        }

        public Builder urlFoto(String urlFoto) {
            this.urlFoto = urlFoto;
            return this;
        }

        public Persona build() {
            return new Persona(this);
        }
    }
}