package org.iesvdm.annotation.ejerciciosN1;


import org.iesvdm.annotation.ejerciciosN1.contexto.CargadorDeContexto;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa()
                .setNombre("Empresa 1")
                .setEmpleados(new CargadorDeContexto().cargarEmpleados());
        System.out.println(empresa);

    }

}
