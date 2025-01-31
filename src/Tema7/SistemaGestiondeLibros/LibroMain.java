package Tema7.SistemaGestiondeLibros;

public class LibroMain {
    public static void main(String[] args) {
        Libro libro1 = new Libro("1984", "George Orwell", 1949);
        libro1.mostrarInfo();

        System.out.println("\nIntentando prestar el libro...");
        libro1.prestarLibro(); // Debería prestarlo con éxito

        System.out.println("\nIntentando prestar el libro nuevamente...");
        libro1.prestarLibro(); // No debería poder prestarlo otra vez

        System.out.println("\nDevolviendo el libro...");
        libro1.devolverLibro(); // Debería marcarlo como disponible

        System.out.println("\nEstado final del libro:");
        libro1.mostrarInfo();
    }
}
