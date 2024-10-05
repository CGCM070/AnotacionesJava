package com.annotation.annotations.institute.ejercicioN3.annotation;

import java.lang.annotation.*;

/**
 * TareaAnnotation es una anotación que contiene los atributos de una tarea.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(TareaValues.class)
public @interface TareaAnnotation {
    String tituloTarea();
    String descripcion();
    String diaDeLaSemana();
    String hora();

}
