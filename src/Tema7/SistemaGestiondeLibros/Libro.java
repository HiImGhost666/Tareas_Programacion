package Tema7.SistemaGestiondeLibros;

public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private boolean disponible;


    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.disponible = true;
    }

    public void prestarLibro(){
        if (disponible) {
            disponible = false;
            System.out.println("El libro \"" + titulo + "\" ha sido prestado.");
        } else{
            System.out.println("El libro \"" + titulo + "\" no está disponible.");
        }
    }

    public void devolverLibro(){
        if(!disponible){
            disponible = true;
            System.out.println("El libro \"" + titulo + "\" ha sido devuelto.");
        } else {
            System.out.println("El libro \"" + titulo + "\" ya estaba disponible.");
        }
    }


    public void mostrarInfo() {

        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + añoPublicacion);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));

    }




}


