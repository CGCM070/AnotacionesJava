package com.annotation.annotations.institute.ejercicioN3.contexto;

import com.annotation.annotations.institute.ejercicioN3.annotation.TareaAnnotation;
import com.annotation.annotations.institute.ejercicioN3.model.AgendaSemana;
import com.annotation.annotations.institute.ejercicioN3.model.Tarea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CargadorDeContexto {

    public static List<TareaAnnotation> tareaAnnotationList() {
        return Arrays.asList(AgendaSemana.class.getAnnotation(TareaAnnotation.class));
    }

    public List<Tarea> cargarTareas() {
        List<Tarea> tareas = new ArrayList<>();
        for (TareaAnnotation tareaAnnotation : tareaAnnotationList()) {
            Tarea tarea = new Tarea();
            tarea.setTituloTarea(tareaAnnotation.tituloTarea());
            tarea.setDescripcion(tareaAnnotation.descripcion());
            tarea.setDiaDeLaSemana(tareaAnnotation.diaDeLaSemana());
            tarea.setHora(tareaAnnotation.hora());
            tareas.add(tarea);
        }
        return tareas;
    }
}
