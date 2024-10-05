package org.iesvdm.annotation.ejercicioN2.empleados;

public class Opererio2 extends EmpleadoEjercicio2 {
    private int codTaller;

    public int getCodTaller() {
        return codTaller;
    }

    public Opererio2 setCodTaller(int codTaller) {
        this.codTaller = codTaller;
        return this;
    }

    @Override
    public String toString() {
        return "Opererio2{" +
                "codTaller=" + codTaller +
                "} " +super.toString();
    }
}
