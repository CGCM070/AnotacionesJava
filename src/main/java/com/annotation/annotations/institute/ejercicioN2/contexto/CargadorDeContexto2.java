package com.annotation.annotations.institute.ejercicioN2.contexto;

import com.annotation.annotations.institute.ejercicioN2.Empresa2;
import com.annotation.annotations.institute.ejercicioN2.annotation.DirectivoAnnotation;
import com.annotation.annotations.institute.ejercicioN2.annotation.EmplaedoEjer2Annotation;
import com.annotation.annotations.institute.ejercicioN2.annotation.OficialAnnotation;
import com.annotation.annotations.institute.ejercicioN2.annotation.TecnicoAnnotation;
import com.annotation.annotations.institute.ejercicioN2.empleados.Directivo2;
import com.annotation.annotations.institute.ejercicioN2.empleados.EmpleadoEjercicio2;
import com.annotation.annotations.institute.ejercicioN2.empleados.Oficial2;
import com.annotation.annotations.institute.ejercicioN2.empleados.Tecnico2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CargadorDeContexto2 {

    /**
     * Obtiene una lista de anotaciones de tipo TecnicoAnnotation de la clase Empresa2.
     *
     * @return una lista de TecnicoAnnotation.
     */
    public static List<TecnicoAnnotation> tecnicoAnnotationList() {
        return Arrays.asList(Empresa2.class.getAnnotationsByType(TecnicoAnnotation.class));
    }

    /**
     * Obtiene una lista de anotaciones de tipo OficialAnnotation de la clase Empresa2.
     *
     * @return una lista de OficialAnnotation.
     */
    public static List<OficialAnnotation> oficialAnnotaionList() {
        return Arrays.asList(Empresa2.class.getAnnotationsByType(OficialAnnotation.class));
    }

    /**
     * Obtiene una lista de anotaciones de tipo DirectivoAnnotation de la clase Empresa2.
     *
     * @return una lista de DirectivoAnnotation.
     */
    public static List<DirectivoAnnotation> directivoValuesList() {
        return Arrays.asList(Empresa2.class.getAnnotationsByType(DirectivoAnnotation.class));
    }

    /**
     * Carga una lista de objetos Directivo2 a partir de las anotaciones DirectivoAnnotation.
     *
     * @return una lista de Directivo2.
     */
    public List<Directivo2> listDirectivos() {
        List<Directivo2> directivo2List = new ArrayList<>();
        for (DirectivoAnnotation directivoAnnotation : directivoValuesList()) {
            for (EmplaedoEjer2Annotation emplaedoEjer2Annotation : directivoAnnotation.value()) {
                Directivo2 directivo2 = new Directivo2();
                directivo2.setNombre(emplaedoEjer2Annotation.nombre());
                directivo2.setApellidos(emplaedoEjer2Annotation.apellidos());
                directivo2.setDireccion(emplaedoEjer2Annotation.direccion());
                directivo2.setDni(emplaedoEjer2Annotation.dni());
                directivo2.setTelefono(emplaedoEjer2Annotation.telefono());
                directivo2.setCodDespacho(directivoAnnotation.codDespacho());
                directivo2List.add(directivo2);
            }
        }
        return directivo2List;
    }

    /**
     * Carga una lista de objetos Oficial2 a partir de las anotaciones OficialAnnotation.
     *
     * @return una lista de Oficial2.
     */
    public List<Oficial2> oficial2List() {
        List<Oficial2> oficial2List = new ArrayList<>();
        for (OficialAnnotation oficialAnnotation : oficialAnnotaionList()) {
            for (EmplaedoEjer2Annotation emplaedoEjer2Annotation : oficialAnnotation.value()) {
                Oficial2 oficial2 = new Oficial2();
                oficial2.setNombre(emplaedoEjer2Annotation.nombre());
                oficial2.setApellidos(emplaedoEjer2Annotation.apellidos());
                oficial2.setDireccion(emplaedoEjer2Annotation.direccion());
                oficial2.setDni(emplaedoEjer2Annotation.dni());
                oficial2.setTelefono(emplaedoEjer2Annotation.telefono());
                oficial2.setCategoria(oficialAnnotation.categoria());
                oficial2.setCodTaller(oficialAnnotation.operarioValue().codTaller());
                oficial2List.add(oficial2);
            }
        }
        return oficial2List;
    }

    /**
     * Carga una lista de objetos Tecnico2 a partir de las anotaciones TecnicoAnnotation.
     *
     * @return una lista de Tecnico2.
     */
    public List<Tecnico2> tecnico2List() {
        List<Tecnico2> tecnico2List = new ArrayList<>();
        for (TecnicoAnnotation tecnicoAnnotation : tecnicoAnnotationList()) {
            for (EmplaedoEjer2Annotation emplaedoEjer2Annotation : tecnicoAnnotation.value()) {
                Tecnico2 tecnico2 = new Tecnico2();
                tecnico2.setNombre(emplaedoEjer2Annotation.nombre());
                tecnico2.setApellidos(emplaedoEjer2Annotation.apellidos());
                tecnico2.setDireccion(emplaedoEjer2Annotation.direccion());
                tecnico2.setDni(emplaedoEjer2Annotation.dni());
                tecnico2.setTelefono(emplaedoEjer2Annotation.telefono());
                tecnico2.setPerfil(tecnicoAnnotation.perfil());
                tecnico2.setCodTaller(tecnicoAnnotation.operarioValue().codTaller());
                tecnico2List.add(tecnico2);
            }
        }
        return tecnico2List;
    }

    /**
     * Carga una lista de todos los empleados (Directivo2, Oficial2, Tecnico2).
     *
     * @return una lista de EmpleadoEjercicio2.
     */
    public List<EmpleadoEjercicio2> cargarEmpleados2() {
        List<EmpleadoEjercicio2> empleados = new ArrayList<>();
        empleados.addAll(listDirectivos());
        empleados.addAll(oficial2List());
        empleados.addAll(tecnico2List());
        return empleados;
    }
}