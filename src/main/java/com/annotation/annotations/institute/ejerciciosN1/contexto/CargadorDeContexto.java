package com.annotation.annotations.institute.ejerciciosN1.contexto;


import com.annotation.annotations.institute.ejerciciosN1.Empresa;
import com.annotation.annotations.institute.ejerciciosN1.annotation.EmpleadoAnnotation;
import com.annotation.annotations.institute.ejerciciosN1.empleados.Directivo;
import com.annotation.annotations.institute.ejerciciosN1.empleados.EmpleadoEjercicio;
import com.annotation.annotations.institute.ejerciciosN1.empleados.Operario;
import com.annotation.annotations.institute.ejerciciosN1.enumerado.TipoEmpleado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CargadorDeContexto {

    public static List<EmpleadoAnnotation> valoresDeEmpleadoAnnotation() {
        return Arrays.asList(Empresa.class.getAnnotationsByType(EmpleadoAnnotation.class));
    }

    public List<EmpleadoEjercicio> cargarEmpleados() {
        List<EmpleadoEjercicio> empleados = new ArrayList<>();

        for (EmpleadoAnnotation empleadoAnnotation : valoresDeEmpleadoAnnotation()) {
            TipoEmpleado tipoEmpleado = empleadoAnnotation.clase();
            switch (tipoEmpleado) {
                case DIRECTIVO:
                    Directivo directivo = new Directivo();
                    directivo.setNombre(empleadoAnnotation.nombre());
                    directivo.setCodDespacho(empleadoAnnotation.codDespacho());
                    directivo.setApellidos(empleadoAnnotation.apellidos());
                    directivo.setDni(empleadoAnnotation.dni());
                    directivo.setTelefono(empleadoAnnotation.telefono());
                    directivo.setDireccion(empleadoAnnotation.direccion());
                    empleados.add(directivo);
                break;


                case OPERARIO:
                    Operario operario = new Operario();
                    operario.setNombre(empleadoAnnotation.nombre());
                    operario.setCodTaller(empleadoAnnotation.codTaller());
                    operario.setApellidos(empleadoAnnotation.apellidos());
                    operario.setDni(empleadoAnnotation.dni());
                    operario.setTelefono(empleadoAnnotation.telefono());
                    operario.setDireccion(empleadoAnnotation.direccion());
                    empleados.add(operario);
                    break;
                case GENERICO:
                default:
                    EmpleadoEjercicio empleado = new EmpleadoEjercicio()
                            .setNombre(empleadoAnnotation.nombre())
                            .setApellidos(empleadoAnnotation.apellidos())
                            .setDni(empleadoAnnotation.dni())
                            .setTelefono(empleadoAnnotation.telefono())
                            .setDireccion(empleadoAnnotation.direccion());
                    empleados.add(empleado);
                    break;
            }
        }
        return empleados;
    }

}
