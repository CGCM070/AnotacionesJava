package com.annotation.annotations.institute.ejerciciosN1.empleados;

import java.util.Objects;
/**
 * EmpleadoEjercicio
 * clase que representa un empleado
 * Contiene los atributos comunes para todos los empleados
 *
 */

public class EmpleadoEjercicio  {

private String nombre;
private String apellidos;
private String direccion;
private String dni;
private  int telefono;

    public EmpleadoEjercicio() {
    }
    public String getApellidos() {
        return apellidos;
    }
    public EmpleadoEjercicio setApellidos(String apellidos) {
        this.apellidos = apellidos;
        return this;
    }

    public String getDireccion() {
        return direccion;
    }

    public EmpleadoEjercicio setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public String getDni() {
        return dni;
    }

    public EmpleadoEjercicio setDni(String dni) {
        this.dni = dni;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public EmpleadoEjercicio setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }


    public int getTelefono() {
        return telefono;
    }

    public EmpleadoEjercicio setTelefono(int telefono) {
        this.telefono = telefono;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmpleadoEjercicio that = (EmpleadoEjercicio) o;
        return Objects.equals(dni, that.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    @Override
    public String toString() {
        return "EmpleadoEjercicio{" +
                "apellidos='" + apellidos + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", dni='" + dni + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
