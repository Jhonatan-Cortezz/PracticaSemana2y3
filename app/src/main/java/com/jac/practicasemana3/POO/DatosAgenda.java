package com.jac.practicasemana3.POO;

public class DatosAgenda {
    private String nombre;
    private String datos;

    public DatosAgenda() {
    }

    public DatosAgenda(String nombre, String datos) {
        this.nombre = nombre;
        this.datos = datos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }
}
