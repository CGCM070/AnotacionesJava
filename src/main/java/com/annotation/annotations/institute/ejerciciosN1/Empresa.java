package com.annotation.annotations.institute.ejerciciosN1;

import com.annotation.annotations.institute.ejerciciosN1.annotation.EmpleadoAnnotation;
import com.annotation.annotations.institute.ejerciciosN1.empleados.EmpleadoEjercicio;
import com.annotation.annotations.institute.ejerciciosN1.enumerado.TipoEmpleado;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una empresa y contiene una lista de empleados.
 * Utiliza anotaciones para definir los empleados.
 */

@EmpleadoAnnotation(nombre = "Juan", apellidos = "Garcia", dni = "12345678A", telefono = 123456789, clase = TipoEmpleado.DIRECTIVO, codDespacho = 1)
@EmpleadoAnnotation(nombre = "Pepe", apellidos = "Martinez", dni = "12345678B", telefono = 123456789, direccion = "Calle 1", clase = TipoEmpleado.OPERARIO, codTaller = 2)
@EmpleadoAnnotation(nombre = "Maria", apellidos = "Lopez", dni = "12345678C", telefono = 123456789, direccion = "Calle 2", clase = TipoEmpleado.OPERARIO, codTaller = 3)
@EmpleadoAnnotation(nombre = "Ana", apellidos = "Gonzalez", dni = "12345678D", telefono = 123456789, direccion = "Calle 3", clase = TipoEmpleado.GENERICO)

public class Empresa {

    private String nombre;
    private List<EmpleadoEjercicio> empleados = new ArrayList<EmpleadoEjercicio>();

    public Empresa() {
    }


    public List<EmpleadoEjercicio> getEmpleados() {
        return empleados;
    }

    public Empresa setEmpleados(List<EmpleadoEjercicio> empleados) {
        this.empleados = empleados;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Empresa setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }


    @Override
    public String toString() {
        return "Empresa{" +
                "empleados=" + empleados +
                ", nombre='" + nombre + '\'' +
                '}' + super.toString();
    }


}
