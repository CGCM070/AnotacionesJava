package com.annotation.annotations.institute.ejercicioN2.empleados;

public class Tecnico2  extends Opererio2{
    public String perfil;

    public String getPerfil() {
        return perfil;
    }

    public Tecnico2 setPerfil(String perfil) {
        this.perfil = perfil;
        return this;
    }

    @Override
    public String toString() {
        return "Tecnico2{" +
                "perfil='" + perfil + '\'' +
                "} "+super.toString();
    }
}
