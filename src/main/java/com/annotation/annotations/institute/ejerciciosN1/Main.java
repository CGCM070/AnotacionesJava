package com.annotation.annotations.institute.ejerciciosN1;


import com.annotation.annotations.institute.ejerciciosN1.contexto.CargadorDeContexto;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa()
                .setNombre("Empresa 1")
                .setEmpleados(new CargadorDeContexto().cargarEmpleados());
        System.out.println(empresa);

    }

}
