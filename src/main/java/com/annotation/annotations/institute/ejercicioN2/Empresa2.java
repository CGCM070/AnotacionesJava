package com.annotation.annotations.institute.ejercicioN2;

import com.annotation.annotations.institute.ejercicioN2.annotation.DirectivoAnnotation;
import com.annotation.annotations.institute.ejercicioN2.annotation.OficialAnnotation;
import com.annotation.annotations.institute.ejercicioN2.annotation.TecnicoAnnotation;
import com.annotation.annotations.institute.ejercicioN2.empleados.EmpleadoEjercicio2;

import java.util.ArrayList;
import java.util.List;

@DirectivoAnnotation(nombre = "Cesar", apellidos = "Castillo", dni = "123123X", codDespacho = 2, telefono = 000000)
@OficialAnnotation(dni = "123123O", apellidos = "apellido1", nombre = "Oficial1", telefono = 7777, categoria = "CAT1")
@TecnicoAnnotation(nombre = "tecnico", apellidos = "apellido2", direccion = "calle3", dni = "18923Y", telefono = 000, perfil = "Perfil1")
public class Empresa2 {

    private String nombre;
    List<EmpleadoEjercicio2> empleados = new ArrayList<>();


    public List<EmpleadoEjercicio2> getEmpleados() {
        return empleados;
    }

    public Empresa2 setEmpleados(List<EmpleadoEjercicio2> empleados) {
        this.empleados = empleados;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Empresa2 setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    @Override
    public String toString() {
        return "Empresa2{" +
                "empleados=" + empleados +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
