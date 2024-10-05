package com.annotation.annotations.institute.ejercicioN3.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * TareaValues es una anotación que contiene un Array de TareaAnnotation.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface TareaValues {
    TareaAnnotation[] value();
}
