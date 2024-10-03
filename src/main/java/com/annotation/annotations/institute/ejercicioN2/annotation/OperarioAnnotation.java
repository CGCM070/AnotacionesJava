package com.annotation.annotations.institute.ejercicioN2.annotation;


import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface OperarioAnnotation {
    int codTaller();
}
