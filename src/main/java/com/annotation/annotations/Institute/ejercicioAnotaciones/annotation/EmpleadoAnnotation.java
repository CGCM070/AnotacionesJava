package org.iesvdm.ejercicioAnotaciones.annotation;


import org.iesvdm.ejercicioAnotaciones.TipoEmpleado;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(EmpleadosValues.class)
@Documented
public @interface EmpleadoAnnotation {
    String nombre();
    String apellidos();
    String direccion() default "Calle Falsa 123";
    String dni();
    int telefono();
    TipoEmpleado clase();
    int codDespacho() default 2;
    int codTaller() default 0;
    String perfil() default "";
    int categoria() default 0;

}
