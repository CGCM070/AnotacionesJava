package org.iesvdm.ejercicioAnotaciones.empleados;

public class Operario extends EmpleadoEjercicio {
    private int codTaller;

    public int getCodTaller() {
        return codTaller;
    }

    public Operario setCodTaller(int codTaller) {
        this.codTaller = codTaller;
        return this;
    }

    @Override
    public String toString() {
        return "Operario{" +
                "codTaller=" + codTaller +
                '}' + super.toString();
    }
}