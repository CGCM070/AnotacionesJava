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


    public static List<TecnicoAnnotation> tecnicoAnnotationList() {
        return Arrays.asList(Empresa2.class.getAnnotationsByType(TecnicoAnnotation.class));
    }

    public static List<OficialAnnotation> oficialAnnotaionList() {
        return Arrays.asList(Empresa2.class.getAnnotationsByType(OficialAnnotation.class));
    }

    public static List<DirectivoAnnotation> directivoValuesList() {
        return Arrays.asList(Empresa2.class.getAnnotationsByType(DirectivoAnnotation.class));
    }

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
                oficial2List.add(oficial2);
            }
        }
        return oficial2List;
    }

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
                tecnico2List.add(tecnico2);
            }
        }
        return tecnico2List;
    }

    public List<EmpleadoEjercicio2> cargarEmpleados2() {
        List<EmpleadoEjercicio2> empleados = new ArrayList<>();
        empleados.addAll(listDirectivos());
        empleados.addAll(oficial2List());
        empleados.addAll(tecnico2List());
        return empleados;
    }
}