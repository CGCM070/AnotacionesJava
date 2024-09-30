package org.iesvdm.ejercicioAnotaciones.empleados;

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