package com.aluracursos.streamberry.calculos;

import com.aluracursos.streamberry.modelos.Clasificacion;

public class FiltroRecomendacion {
    public void filtra(Clasificacion clasificacion) {
        if (clasificacion.getClasificacion() >= 4) {
            System.out.println("Muy bien evaluado en este momento.");
        } else if (clasificacion.getClasificacion() >= 2) {
            System.out.println("Popular en este momento.");
        } else {
            System.out.println("Colócalo en tu lista para verlo después.");
        }
    }

}
