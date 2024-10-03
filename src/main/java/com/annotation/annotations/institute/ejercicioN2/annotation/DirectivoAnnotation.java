package com.annotation.annotations.institute.ejercicioN2.annotation;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(DirectivoValues.class)
@Documented
public @interface DirectivoAnnotation {
    EmplaedoEjer2Annotation[] value();

    int codDespacho();

}
