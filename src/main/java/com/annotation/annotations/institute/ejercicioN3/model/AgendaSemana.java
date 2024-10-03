package com.annotation.annotations.institute.ejercicioN3.model;

import com.annotation.annotations.institute.ejercicioN3.annotation.TareaAnnotation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TareaAnnotation(tituloTarea = "Tarea 1", descripcion = "Descripcion 1", diaDeLaSemana = "Lunes", hora = "10:00")
public class AgendaSemana {
    private List<Tarea> tareas;
}
