package com.annotation.annotations.institute.ejercicioN3.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Tarea {
    private String tituloTarea;
    private String descripcion;
    private String diaDeLaSemana;
    private String hora;
}
