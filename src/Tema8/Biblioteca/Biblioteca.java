package Tema8.Biblioteca;

import java.util.Arrays;

public class Biblioteca {
    private LibroFisico[] libros;

    public Biblioteca() {
        this.libros = new LibroFisico[0]; // Inicializamos el vector sin elementos
    }

    public void add(LibroFisico libro) {
        // Crear un nuevo array con espacio para un nuevo libro
        LibroFisico[] nuevoCatalogo = new LibroFisico[libros.length + 1];

        // Copiar los libros existentes
        for (int i = 0; i < libros.length; i++) {
            nuevoCatalogo[i] = libros[i];
        }

        // Agregar el nuevo libro
        nuevoCatalogo[libros.length] = libro;

        // Reemplazar el array original con el nuevo
        libros = nuevoCatalogo;

        System.out.println("Libro añadido a la biblioteca: " + libro.getTITULO());
    }

    public void listado() {
        if (libros.length == 0) {
            System.out.println("La biblioteca no tiene libros.");
        } else {
            System.out.println("Listado de libros en la biblioteca:");
            System.out.println(Arrays.deepToString(libros));
        }
    }

    // Ordenar por precio (de menor a mayor)
    public void ordenarPorPrecio() {
        Arrays.sort(libros); // Usa compareTo() de LibroFisico
    }

    // Ordenar por autor (A-Z)
    public void ordenarPorAutor() {
        Arrays.sort(libros, new ComparaAutor());
    }

    // Ordenar por autor (Z-A)
    public void ordenarPorAutorInverso() {
        Arrays.sort(libros, new ComparaAutor().reversed());
    }

}
