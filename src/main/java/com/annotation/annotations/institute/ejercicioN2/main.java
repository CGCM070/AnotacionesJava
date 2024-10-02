package com.annotation.annotations.institute.ejercicioN2;

import com.annotation.annotations.institute.ejercicioN2.contexto.CargadorDeContexto2;

public class main {
    public static void main(String[] args) {

        Empresa2 empresa2 = new Empresa2()
                .setNombre("DSI")
                .setEmpleados(new CargadorDeContexto2().cargarEmpresa2());

        System.out.println(empresa2);
        System.out.println("Agregar + super ToString para ver los detalles de los empleados");
    }
}
