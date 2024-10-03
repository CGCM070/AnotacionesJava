package com.annotation.annotations.institute.ejercicioN2.empleados;


import java.util.Objects;

public class EmpleadoEjercicio2 {

    private String nombre;
    private String apellidos;
    private String direccion;
    private String dni;
    private String telefono;


    public EmpleadoEjercicio2() {
    }

    public String getApellidos() {
        return apellidos;
    }

    public EmpleadoEjercicio2 setApellidos(String apellidos) {
        this.apellidos = apellidos;
        return this;
    }

    public String getDireccion() {
        return direccion;
    }

    public EmpleadoEjercicio2 setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public String getDni() {
        return dni;
    }

    public EmpleadoEjercicio2 setDni(String dni) {
        this.dni = dni;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public EmpleadoEjercicio2 setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getTelefono() {
        return telefono;
    }

    public EmpleadoEjercicio2 setTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmpleadoEjercicio2 that = (EmpleadoEjercicio2) o;
        return Objects.equals(dni, that.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    @Override
    public String toString() {
        return "EmpleadoEjercicio2{" +
                ", nombre='" + nombre + '\'' +
                "apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", dni='" + dni + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
