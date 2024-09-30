package com.annotation.annotations.Institute.ejercicioAnotaciones.annotation;

import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface EmpleadosValues {
    EmpleadoAnnotation[] value();
}
