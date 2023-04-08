package com.bolsadeideas.springboot.app.springbootweb.models;

public class Usuario {
    private String nombre;
    private String apellido;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }
}
