package com.annotation.annotations.institute.ejercicioN3;

import com.annotation.annotations.institute.ejercicioN3.contexto.CargadorDeContexto;
import com.annotation.annotations.institute.ejercicioN3.model.AgendaSemana;

public class Main {
    public static void main(String[] args) {
        // Creamos una instancia de AgendaSemana utilizando el constructor del patrón Builder
        AgendaSemana agendaSemana = AgendaSemana.builder()
                .tareas(new CargadorDeContexto().cargarTareas())
                .build();
        System.out.println(agendaSemana);
    }
}
