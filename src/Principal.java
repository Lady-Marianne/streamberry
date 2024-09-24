import com.aluracursos.streamberry.calculos.CalculadoraDeTiempo;
import com.aluracursos.streamberry.calculos.FiltroRecomendacion;
import com.aluracursos.streamberry.modelos.Episodio;
import com.aluracursos.streamberry.modelos.Pelicula;
import com.aluracursos.streamberry.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula terminator = new Pelicula();
        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();

        terminator.setNombre("Terminator");
        terminator.setFechaDeLanzamiento(1984);
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

        Serie dark = new Serie();
        Episodio episodio = new Episodio();

        dark.setNombre("Dark");
        dark.setFechaDeLanzamiento(2017);
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

        Pelicula matrix = new Pelicula();
        matrix.setNombre("The Matrix");
        matrix.setFechaDeLanzamiento(1999);
        matrix.setDuracionEnMinutos(136);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(terminator);
        calculadora.incluye(dark);
        calculadora.incluye(matrix);

        System.out.println("\n************************************************************");
        System.out.println("\nTiempo total para ver tus títulos favoritos: "
                + calculadora.getTiempoTotal() + " minutos.");

    }

}