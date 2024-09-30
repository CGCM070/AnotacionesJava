package org.iesvdm.annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface StudentsValues {
    StudentAnnotation[] value();
}
