package com.aluracursos.streamberry.principal;
import com.aluracursos.streamberry.modelos.Pelicula;
import com.aluracursos.streamberry.modelos.Serie;
import com.aluracursos.streamberry.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalConListas {
    public static void main(String[] args) {
        var terminator = new Pelicula("Terminator", 1984);
        terminator.evalua(9);
        var matrix = new Pelicula("The Matrix",1999);
        matrix.evalua(6);
        var seniorAnillos1 = new Pelicula("El Señor de los Anillos: La Comunidad del Anillo",2001);
        seniorAnillos1.evalua(10);
        var dark = new Serie("Dark", 2017);

        ArrayList<Titulo> titulosVistos = new ArrayList<>();
        titulosVistos.add(terminator);
        titulosVistos.add(matrix);
        titulosVistos.add(seniorAnillos1);
        titulosVistos.add(dark);

        for (Titulo item : titulosVistos) {
            System.out.println("Nombre del título: " + item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion()>3) {
                System.out.println("Clasificación de la pelicula: " + pelicula.getClasificacion());
            }
        }

        //titulosVistos.forEach(System.out::println);

        ArrayList<String>listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Bill Skarsgård");
        listaDeArtistas.add("Nicole Kidman");
        listaDeArtistas.add("Brad Pitt");
        listaDeArtistas.add("Dakota Fanning");
        listaDeArtistas.add("Denzel Washington");

        System.out.println("Lista de artistas NO ordenada: " + listaDeArtistas);
        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas ordenada: " + listaDeArtistas);

        System.out.println("Lista de títulos vistos NO ordenados: " + titulosVistos);
        Collections.sort(titulosVistos);
        System.out.println("Lista de títulos vistos ordenados: " + titulosVistos);


    }
}
