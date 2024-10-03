package com.annotation.annotations.institute.ejerciciosN1.annotation;

import java.lang.annotation.*;

/**
 * Contenedor para múltiples anotaciones de EmpleadoAnnotation.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface EmpleadosValues {
    /**
     * Array de anotaciones EmpleadoAnnotation.
     *
     * @return el array de anotaciones EmpleadoAnnotation.
     */
    EmpleadoAnnotation[] value();

}
