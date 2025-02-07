package Tema7.Material;

public class MaterialMain {
    public static void main(String[] args) {
        // Crear objetos de las subclases
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, 432, "Novela", true);
        Libro libro2 = new Libro("1984", "George Orwell", 1949, 328, "Ciencia Ficción", false);

        Revista revista1 = new Revista("National Geographic", "Varios", 2023, 120, "Ciencia", true);
        Revista revista2 = new Revista("Vogue", "Anna Wintour", 2023, 80, "Moda", false);

        Pelicula pelicula1 = new Pelicula("El Padrino", "Francis Ford Coppola", 1972, 175, "Francis Ford Coppola", Pelicula.Clasificacion.A);
        Pelicula pelicula2 = new Pelicula("Titanic", "James Cameron", 1997, 195, "James Cameron", Pelicula.Clasificacion.B);
        // Mostrar detalles de los materiales
        System.out.println("=== Detalles de los Libros ===");
        libro1.mostrarDetallesLibro();
        libro2.mostrarDetallesLibro();

        System.out.println("\n=== Detalles de las Revistas ===");
        revista1.mostrarDetallesRevista();
        revista2.mostrarDetallesRevista();

        System.out.println("\n=== Detalles de las Películas ===");
        pelicula1.mostrarDetallesPelicula();
        pelicula2.mostrarDetallesPelicula();

        // Prestar materiales
        System.out.println("\n=== Préstamo de Materiales ===");
        libro1.prestar("Juan Pérez");
        revista1.prestar("Ana Gómez");
        pelicula1.prestar("Carlos López");

        // Mostrar historial de préstamos
        System.out.println("\n=== Historial de Préstamos ===");
        libro1.mostrarHistorialPrestamos();
        revista1.mostrarHistorialPrestamos();
        pelicula1.mostrarHistorialPrestamos();

        // Devolver materiales
        System.out.println("\n=== Devolución de Materiales ===");
        libro1.devolver("Juan Pérez");
        revista1.devolver("Ana Gómez");
        pelicula1.devolver("Carlos López");

        // Mostrar estado de disponibilidad después de la devolución
        System.out.println("\n=== Estado de Disponibilidad ===");
        System.out.println("Libro 1 disponible: " + libro1.isDisponible());
        System.out.println("Revista 1 disponible: " + revista1.isDisponible());
        System.out.println("Película 1 disponible: " + pelicula1.isDisponible());

        // Mostrar historial de préstamos después de la devolución
        System.out.println("\n=== Historial de Préstamos después de la Devolución ===");
        libro1.mostrarHistorialPrestamos();
        revista1.mostrarHistorialPrestamos();
        pelicula1.mostrarHistorialPrestamos();
    }
}
