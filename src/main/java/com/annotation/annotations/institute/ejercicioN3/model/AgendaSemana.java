package com.annotation.annotations.institute.ejercicioN3.model;

import com.annotation.annotations.institute.ejercicioN3.annotation.TareaAnnotation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * La clase AgendaSemana representa una agenda semanal que contiene una lista de tareas.
 * Utiliza anotaciones de Lombok para generar código y una anotación personalizada para definir una tarea.
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TareaAnnotation(tituloTarea = "Tarea 1", descripcion = "Descripcion 1", diaDeLaSemana = "Lunes", hora = "10:00")
public class AgendaSemana {
    /**
     * Lista de tareas de la agenda semanal.
     */
    private List<Tarea> tareas;
}
