import com.aluracursos.screenmatch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {
        Pelicula Pelicula1 = new Pelicula();

        Pelicula1.setNombre("Terminator");
        Pelicula1.setFechaDeLanzamiento(1984);
        Pelicula1.setDuracionEnMinutos(108);
        Pelicula1.setIncluidoEnElPlan(true);

        Pelicula1.evalua(7.8);
        Pelicula1.evalua(10);
        Pelicula1.evalua(9.8);

        Pelicula1.muestraFichaTecnica();

        System.out.println("Total de evaluaciones: " + Pelicula1.getTotalDeLasEvaluaciones());
        System.out.println("Calificación: " + Pelicula1.calculaMedia());

        String nombrePelicula = Pelicula1.getNombre();
        System.out.println("Nombre: " + nombrePelicula);
    }
}