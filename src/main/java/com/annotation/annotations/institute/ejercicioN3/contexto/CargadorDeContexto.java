package com.annotation.annotations.institute.ejercicioN3.contexto;

import com.annotation.annotations.institute.ejercicioN3.annotation.TareaAnnotation;
import com.annotation.annotations.institute.ejercicioN3.model.AgendaSemana;
import com.annotation.annotations.institute.ejercicioN3.model.Tarea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CargadorDeContexto {

    /**
     * Método que retorna una lista de TareaAnnotation.
     *
     * @return List<TareaAnnotation>
     */
    public static List<TareaAnnotation> tareaAnnotationList() {
        return Arrays.asList(AgendaSemana.class.getAnnotation(TareaAnnotation.class));
    }

    /**
     * Método que retorna una lista de Tareas.
     *
     * @return List<Tarea>
     */
    public List<Tarea> cargarTareas() {
        List<Tarea> tareas = new ArrayList<>();
        for (TareaAnnotation tareaAnnotation : tareaAnnotationList()) {
            Tarea tarea2 = Tarea.builder()
                    .tituloTarea("Tarea 2")
                    .descripcion("Descripcion 2")
                    .diaDeLaSemana("Martes")
                    .hora("11:00")
                    .build();
            tareas.add(tarea2);
        }
        return tareas;
    }
}
