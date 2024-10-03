package com.annotation.annotations.institute.ejercicioN2.annotation;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(OficialValues.class)
@Documented
public @interface OficialAnnotation {
    EmplaedoEjer2Annotation [] value();
    OperarioAnnotation operarioValue();
    String categoria();
}
