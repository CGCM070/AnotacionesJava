package com.annotation.annotations.institute.classroom.annotation;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(StudentsValues.class)
@Documented
public @interface StudentAnnotation {
    String name();
    String lastName();
    String dateOfBirth();
    int currentCourse();
    String nameOfCourse();
}
