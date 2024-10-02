package com.annotation.annotations.institute.ejercicioN2.contexto;

import com.annotation.annotations.institute.ejercicioN2.Empresa2;
import com.annotation.annotations.institute.ejercicioN2.annotation.DirectivoAnnotation;
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

    public List<Directivo2> listaDeDirectivos() {
        List<Directivo2> listaDirectivo = new ArrayList<>();

        for (DirectivoAnnotation directivoAnnotation : directivoValuesList()) {
            Directivo2 directivo2 = new Directivo2();
            directivo2.setNombre(directivoAnnotation.nombre());
            directivo2.setApellidos(directivoAnnotation.apellidos());
            directivo2.setDireccion(directivoAnnotation.direccion());
            directivo2.setDni(directivoAnnotation.dni());
            directivo2.setCodDespacho(directivoAnnotation.codDespacho());
            listaDirectivo.add(directivo2);
        }
        return listaDirectivo;
    }

    public List<Tecnico2> listaDeTecnicos() {
        List<Tecnico2> listaTecnico = new ArrayList<>();

        for (TecnicoAnnotation tecnicoAnnotation : tecnicoAnnotationList()) {
            Tecnico2 tecnico2 = new Tecnico2();
            tecnico2.setNombre(tecnicoAnnotation.nombre());
            tecnico2.setApellidos(tecnicoAnnotation.apellidos());
            tecnico2.setPerfil(tecnicoAnnotation.perfil());
            tecnico2.setDni(tecnicoAnnotation.dni());
            tecnico2.setDireccion(tecnicoAnnotation.direccion());
            tecnico2.setTelefono(tecnicoAnnotation.telefono());
            listaTecnico.add(tecnico2);
        }
        return listaTecnico;
    }

    public List<Oficial2> listaDeOficiales() {

        List<Oficial2> listaOficial = new ArrayList<>();
        for (OficialAnnotation oficialAnnotation : oficialAnnotaionList()) {
            Oficial2 oficial2 = new Oficial2();
            oficial2.setNombre(oficialAnnotation.nombre());
            oficial2.setApellidos(oficialAnnotation.apellidos());
            oficial2.setDireccion(oficialAnnotation.direccion());
            oficial2.setDni(oficialAnnotation.dni());
            oficial2.setCategoria(oficialAnnotation.categoria());
            oficial2.setTelefono(oficialAnnotation.telefono());
            listaOficial.add(oficial2);
        }
        return listaOficial;
    }

    public List<EmpleadoEjercicio2> cargarEmpresa2() {
        List<EmpleadoEjercicio2> empleados = new ArrayList<>();
        empleados.addAll(listaDeDirectivos());
        empleados.addAll(listaDeOficiales());
        empleados.addAll(listaDeTecnicos());
        return empleados;
    }
}