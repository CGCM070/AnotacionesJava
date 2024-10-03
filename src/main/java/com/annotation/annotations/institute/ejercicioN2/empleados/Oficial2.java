package com.annotation.annotations.institute.ejercicioN2.empleados;

public class Oficial2 extends Opererio2 {
    public String categoria;

    public String getCategoria() {
        return categoria;
    }

    public Oficial2 setCategoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    @Override
    public String toString() {
        return "Oficial2{" +
                "categoria='" + categoria + '\'' +
                "} "+super.toString();
    }
}
