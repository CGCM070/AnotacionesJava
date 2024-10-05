package org.iesvdm.annotation.ejercicioN3;

import org.iesvdm.annotation.ejercicioN3.contexto.CargadorDeContexto;
import org.iesvdm.annotation.ejercicioN3.model.AgendaSemana;

public class Main {
    public static void main(String[] args) {
        // Creamos una instancia de AgendaSemana utilizando el constructor del patrón Builder
        AgendaSemana agendaSemana = AgendaSemana.builder()
                .tareas(new CargadorDeContexto().cargarTareas())
                .build();
        System.out.println(agendaSemana);
    }
}
