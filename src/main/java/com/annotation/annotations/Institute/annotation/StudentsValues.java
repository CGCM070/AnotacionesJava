package com.annotation.annotations.Institute.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface StudentsValues {
    StudentAnnotation[] value();
}
