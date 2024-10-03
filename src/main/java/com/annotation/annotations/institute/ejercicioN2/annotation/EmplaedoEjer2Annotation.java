package com.annotation.annotations.institute.ejercicioN2.annotation;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

public @interface EmplaedoEjer2Annotation {
    String nombre();
    String apellidos();
    String direccion() default "Calle Falsa 123";
    String dni();
    int telefono();
}
