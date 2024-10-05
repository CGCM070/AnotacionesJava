package org.iesvdm.annotation.ejerciciosN1.contexto;


import org.iesvdm.annotation.ejerciciosN1.Empresa;
import org.iesvdm.annotation.ejerciciosN1.annotation.EmpleadoAnnotation;
import org.iesvdm.annotation.ejerciciosN1.empleados.Directivo;
import org.iesvdm.annotation.ejerciciosN1.empleados.EmpleadoEjercicio;
import org.iesvdm.annotation.ejerciciosN1.empleados.Operario;
import org.iesvdm.annotation.ejerciciosN1.enumerado.TipoEmpleado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Clase responsable de cargar el contexto de los empleados basándose en anotaciones.
 */
public class CargadorDeContexto {

    /**
     * Recupera una lista de instancias de EmpleadoAnnotation de la clase Empresa.
     *
     * @return una lista de instancias de EmpleadoAnnotation.
     */
    public static List<EmpleadoAnnotation> valoresDeEmpleadoAnnotation() {
        return Arrays.asList(Empresa.class.getAnnotationsByType(EmpleadoAnnotation.class));
    }

    /**
     * Carga empleados basándose en las anotaciones presentes en la clase Empresa.
     *
     * @return una lista de instancias de EmpleadoEjercicio pobladas con datos de las anotaciones.
     */
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
