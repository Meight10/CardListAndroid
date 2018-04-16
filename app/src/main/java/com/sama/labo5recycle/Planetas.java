package com.sama.labo5recycle;

/**
 * Created by uca on 04-16-18.
 */

public class Planetas {

    private String nombre;
    private String descripcion;
    private int id;

    public Planetas(String nombre, String descripcion, int id) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setId(int id) {
        this.id = id;
    }
}
