import com.aluracursos.streamberry.calculos.CalculadoraDeTiempo;
import com.aluracursos.streamberry.calculos.FiltroRecomendacion;
import com.aluracursos.streamberry.modelos.Episodio;
import com.aluracursos.streamberry.modelos.Pelicula;
import com.aluracursos.streamberry.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        System.out.println("\n******************************");
        System.out.println("******** STREAMBERRY *********");
        System.out.println("******************************");

        Pelicula terminator = new Pelicula("Terminator", "1984");
        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();

        terminator.setDuracionEnMinutos(108);
        terminator.setIncluidoEnElPlan(false);

        terminator.evalua(7.8);
        terminator.evalua(10);
        terminator.evalua(9.8);

        terminator.muestraFichaTecnica();

        System.out.println("Total de evaluaciones: " + terminator.getTotalDeLasEvaluaciones());
        System.out.println("Calificación: " + terminator.calculaMedia());
        filtroRecomendacion.filtra(terminator);
        System.out.println("\n****************************************************************");

        Serie dark = new Serie("Dark", 2017);
        Episodio episodio = new Episodio();
        dark.setIncluidoEnElPlan(true);
        dark.setTemporadas(3);
        dark.setMinutosPorEpisodio(53);
        dark.setEpisodiosPorTemporada(8);

        dark.muestraFichaTecnica();
        System.out.println("Cantidad de temporadas: " + dark.getTemporadas());
        System.out.println(("Episodios por temporada: " + dark.getEpisodiosPorTemporada()));
        System.out.println("Duración de cada capítulo (promedio): " + dark.getMinutosPorEpisodio() + " minutos.");

        episodio.setNumero(1);
        episodio.setNombre("Secretos");
        episodio.setSerie(dark);
        episodio.setTotalVisualizaciones(300);
        System.out.println("Episodio " + episodio.getNumero() + ": " + episodio.getNombre());
        filtroRecomendacion.filtra(episodio);

        Pelicula matrix = new Pelicula("The Matrix",1999);
        matrix.setDuracionEnMinutos(136);

        var seniorAnillos1 = new Pelicula("El Señor de los Anillos: La Comunidad del Anillo",2001);
        matrix.setDuracionEnMinutos(178);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(terminator);
        calculadora.incluye(dark);
        calculadora.incluye(matrix);
        calculadora.incluye(seniorAnillos1);

        System.out.println("\n************************************************************");
        System.out.println("\nTiempo total para ver tus títulos favoritos: "
                + calculadora.getTiempoTotal() + " minutos.");

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(terminator);
        listaDePeliculas.add(matrix);
        listaDePeliculas.add(seniorAnillos1);

        System.out.println("\nTamaño de la lista: " + listaDePeliculas.size());
        System.out.println("La primera película es: " + listaDePeliculas.get(0).getNombre());
        System.out.println(listaDePeliculas.toString());
        System.out.println(listaDePeliculas.get(0));
        System.out.println("toString de la película: " + listaDePeliculas.get(0).toString());

    }

}