package org.iesvdm.ejercicioAnotaciones.contexto;

import org.iesvdm.ejercicioAnotaciones.Empresa;
import org.iesvdm.ejercicioAnotaciones.TipoEmpleado;
import org.iesvdm.ejercicioAnotaciones.annotation.EmpleadoAnnotation;
import org.iesvdm.ejercicioAnotaciones.empleados.Directivo;
import org.iesvdm.ejercicioAnotaciones.empleados.EmpleadoEjercicio;
import org.iesvdm.ejercicioAnotaciones.empleados.Operario;

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
//                    empleados.add(new Directivo()
//                            .setNombre(empleadoAnnotation.nombre())
//                            .setCodDespacho(empleadoAnnotation.codDespacho()) /
//                            // .setCodDespacho(empleadoAnnotation.codDespacho()) ----->  preguntar al profe
//                            .setApellidos(empleadoAnnotation.apellidos())
//                            .setDni(empleadoAnnotation.dni())
//                            .setTelefono(empleadoAnnotation.telefono())
//                            .setDireccion(empleadoAnnotation.direccion()));

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
