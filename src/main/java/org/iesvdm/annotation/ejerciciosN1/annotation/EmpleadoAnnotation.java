package org.iesvdm.annotation.ejerciciosN1.annotation;

import org.iesvdm.annotation.ejerciciosN1.enumerado.TipoEmpleado;

import java.lang.annotation.*;

/**
 * Anotación para definir las propiedades de un empleado.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(EmpleadosValues.class)
@Documented
public @interface EmpleadoAnnotation {
    /**
     * Nombre del empleado.
     *
     * @return el nombre del empleado.
     */
    String nombre();

    /**
     * Apellidos del empleado.
     *
     * @return los apellidos del empleado.
     */
    String apellidos();

    /**
     * Dirección del empleado. Por defecto es "Calle Falsa 123".
     *
     * @return la dirección del empleado.
     */
    String direccion() default "Calle Falsa 123";

    /**
     * DNI del empleado.
     *
     * @return el DNI del empleado.
     */
    String dni();

    /**
     * Teléfono del empleado.
     *
     * @return el teléfono del empleado.
     */
    int telefono();

    /**
     * Tipo de empleado.
     *
     * @return el tipo de empleado.
     */
    TipoEmpleado clase();

    /**
     * Código de despacho del empleado. Por defecto es 2.
     *
     * @return el código de despacho del empleado.
     */
    int codDespacho() default 2;

    /**
     * Código de taller del empleado. Por defecto es 0.
     *
     * @return el código de taller del empleado.
     */
    int codTaller() default 0;

    /**
     * Perfil del empleado.
     *
     * @return el perfil del empleado.
     */
    String perfil() default "";

    /**
     * Categoría del empleado.
     *
     * @return la categoría del empleado.
     */
    int categoria() default 0;
}