package org.iesvdm.annotation.ejercicioN2;

import org.iesvdm.annotation.ejercicioN2.contexto.CargadorDeContexto2;

public class Main {
    public static void main(String[] args) {

        Empresa2 empresa2 = new Empresa2()
                .setNombre("DSI")
                .setEmpleados(new CargadorDeContexto2().cargarEmpleados2());
        System.out.println(empresa2);
    }
}
