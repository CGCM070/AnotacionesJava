package org.iesvdm.annotation.ejerciciosN1.empleados;

public class Oficial extends Operario{
public String categoria;

    public String getCategoria() {
        return categoria;
    }

    public Oficial setCategoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    @Override
    public String toString() {
        return "Oficial{" +
                "categoria='" + categoria + '\'' +
                '}'+super.toString();
    }
}
