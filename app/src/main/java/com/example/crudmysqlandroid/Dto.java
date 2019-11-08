package com.example.crudmysqlandroid;


import java.io.Serializable;

//Para enviar objetos entre actividades (Como parámetro) se coloca el "implements Serializable"
public class Dto implements Serializable {
    int codigo;
    String descripcion;
    double precio;


    public Dto() {
    }


    public Dto(int codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }


}
