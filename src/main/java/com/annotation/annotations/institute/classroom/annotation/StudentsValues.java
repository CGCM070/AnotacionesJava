package com.annotation.annotations.institute.classroom.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface StudentsValues {
    StudentAnnotation[] value();
}
