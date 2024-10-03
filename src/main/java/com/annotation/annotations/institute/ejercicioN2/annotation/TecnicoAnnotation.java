package com.annotation.annotations.institute.ejercicioN2.annotation;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(TecnicoValues.class)
@Documented
public @interface TecnicoAnnotation {
    EmplaedoEjer2Annotation[] value();
    OperarioAnnotation operarioValue();
    String perfil();
}
