import Tema8.Biblioteca.Biblioteca;
import Tema8.Biblioteca.LibroDigital;
import Tema8.Biblioteca.LibroFisico;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // 1. Crear 4 objetos "LibroFisico"
        LibroFisico libro1 = new LibroFisico("001", "El Quijote", "Cervantes", 863,25, 3, 6, 8);
        LibroFisico libro2 = new LibroFisico("002", "1984", "Orwell", 328, 43, 2, 5, 7);
        LibroFisico libro3 = new LibroFisico("003", "Cien años de soledad", "García Márquez", 471, 11, 4, 7, 9);
        LibroFisico libro4 = new LibroFisico("004", "Orgullo y prejuicio", "Austen", 432, 65, 1, 4, 6);


        // 2. Crear un "LibroDigitalizado" a partir de un "LibroFisico"
        LibroDigital libroDigital = new LibroDigital(libro1, "QR1234ABC", 863);

        // 3. Crear una "Biblioteca" y añadir los 4 libros físicos creados
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.add(libro1);
        biblioteca.add(libro2);
        biblioteca.add(libro3);
        biblioteca.add(libro4);

        // 4. Comprobar que funciona el método "toString"
        System.out.println("\nListado de libros en la biblioteca:");
        biblioteca.listado();

        // 5. Ordenación por precio (Comparable)
        System.out.println("\nOrden por precio (de menor a mayor):");
        biblioteca.ordenarPorPrecio();
        biblioteca.listado();

        // 6. Ordenación por autor (Comparator)
        System.out.println("\nOrden por autor (alfabético):");
        biblioteca.ordenarPorAutor();
        biblioteca.listado();

        // 7. Ordenación por autor (alfabético inverso)
        System.out.println("\nOrden por autor (alfabético inverso):");
        biblioteca.ordenarPorAutorInverso();
        biblioteca.listado();

        // 8. Uso de 10 métodos distintos
        System.out.println("\nUso de métodos:");
        libro1.verPresentacion();
        libro2.verPresentacion();
        libroDigital.verPresentacion();
        libroDigital.descargar();
        libroDigital.verPaginaWeb();
        libroDigital.comentar("Me encantó esta versión digital.");
        libroDigital.comentar("Muy práctico para llevarlo en el móvil.");
        libro1.comprar();
        libro3.comprar();
        libro4.comprar();
    }
}
