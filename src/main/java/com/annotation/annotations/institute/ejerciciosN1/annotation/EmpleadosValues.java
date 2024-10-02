package com.annotation.annotations.institute.ejerciciosN1.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface EmpleadosValues {
EmpleadoAnnotation [] value();

}
