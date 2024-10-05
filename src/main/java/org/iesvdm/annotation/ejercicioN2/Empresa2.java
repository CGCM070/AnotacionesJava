package org.iesvdm.annotation.ejercicioN2;


import org.iesvdm.annotation.ejercicioN2.annotation.*;
import org.iesvdm.annotation.ejercicioN2.empleados.EmpleadoEjercicio2;

import java.util.ArrayList;
import java.util.List;

@DirectivoAnnotation(
        value = {
                @EmplaedoEjer2Annotation(
                        nombre = "directivo1",
                        apellidos = "apellido1",
                        direccion = "calle, 123",
                        dni = "12341X",
                        telefono = "0000"
                )
        },
        codDespacho = 1234
)
@OficialAnnotation(
        value = {
                @EmplaedoEjer2Annotation(
                        nombre = "oficial1",
                        apellidos = "apellido1",
                        direccion = "calle, 123",
                        dni = "12341X",
                        telefono = "0000"
                )
        },
        operarioValue = @OperarioAnnotation(
                codTaller = 1
        ),
        categoria = "categoria1"
)
@TecnicoAnnotation(
        value = {
                @EmplaedoEjer2Annotation(
                        nombre = "tecnico1",
                        apellidos = "apellido1",
                        direccion = "calle, 123",
                        dni = "12341X",
                        telefono = "0000"
                )
        },
        operarioValue =
        @OperarioAnnotation(
                codTaller = 2
        )
        ,
        perfil = "perfil1"
)
/**
 * La clase Empresa2 representa una empresa con diferentes tipos de empleados anotados.
 * Utiliza varias anotaciones personalizadas para definir directivos, oficiales y técnicos.
 */
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
                ", nombre Empresa='" + nombre + '\'' +
                "empleados=" + empleados +
                '}';
    }
}
