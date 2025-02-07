package Tema7.Material;

public class Pelicula extends Material{

    public enum Clasificacion{
        A,B,C,D
    }
    private int duracion;
    private String director;
    private Clasificacion clasificacion;

    public Pelicula(String titulo, String autor, int añoPublicacion, int duracion, String director, Clasificacion clasificacion) {
        super(titulo, autor, añoPublicacion);
        this.duracion = duracion;
        this.director = director;
        this.clasificacion = clasificacion;
    }

    public void mostrarDetallesPelicula(){
        System.out.println("Duracion: " + duracion);
        System.out.println("Director: " + director);
        System.out.println("Clasificacion: " + clasificacion);
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }
}
