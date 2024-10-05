package org.iesvdm.annotation.ejerciciosN1.empleados;

public class Directivo extends EmpleadoEjercicio {
    private int codDespacho;

    public int getCodDespacho() {
        return codDespacho;
    }



    public Directivo setCodDespacho(int codDespacho) {
        this.codDespacho = codDespacho;
        return this;
    }

    @Override
    public String toString() {
        return "Directivo{" +
                "codDespacho=" + codDespacho +
                '}' + super.toString();
    }
}