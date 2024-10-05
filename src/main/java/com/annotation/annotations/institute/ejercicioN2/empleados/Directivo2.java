package com.annotation.annotations.institute.ejercicioN2.empleados;
/**
 * La clase Directivo2 extiende de EmpleadoEjercicio2 y representa a un directivo con un código de despacho.
 */
public class Directivo2  extends  EmpleadoEjercicio2{
    private int codDespacho;

    public int getCodDespacho() {
        return codDespacho;
    }

    public Directivo2 setCodDespacho(int codDespacho) {
        this.codDespacho = codDespacho;
        return this;
    }

    @Override
    public String toString() {
        return "Directivo2{" +
                "codDespacho=" + codDespacho +
                "} "+super.toString();
    }
}
