package org.iesvdm.annotation.ejercicioN2.annotation;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface EmpleadoEjerc2Value {
    EmplaedoEjer2Annotation[] value();
}
