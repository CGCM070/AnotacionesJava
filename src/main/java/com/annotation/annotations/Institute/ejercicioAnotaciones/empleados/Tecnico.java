package com.annotation.annotations.Institute.ejercicioAnotaciones.empleados;

public class Tecnico extends Operario {
public String perfil;


    public String getPerfil() {
        return perfil;
    }

    public Tecnico setPerfil(String perfil) {
        this.perfil = perfil;
        return this;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "perfil='" + perfil + '\'' +
                '}'+super.toString();
    }
}
