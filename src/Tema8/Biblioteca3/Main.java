package Tema8.Biblioteca3;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(10, 5);

        // 📖 Agregar libros y revistas
        biblioteca.añadirPublicacion(new Libro("El Quijote", "Cervantes", 1605, 863));
        biblioteca.añadirPublicacion(new Libro("1984", "Orwell", 1949, 328));
        biblioteca.añadirPublicacion(new Revista("National Geographic", "Varios", 2023, 345));
        biblioteca.añadirPublicacion(new Libro("Harry Potter", "J.K. Rowling", 1997, 450));

        // 👤 Registrar usuarios
        Usuario u1 = new Usuario("Pedro");
        Usuario u2 = new Usuario("Laura");
        Usuario u3 = new Usuario("Carlos");

        biblioteca.registrarUsuario(u1);
        biblioteca.registrarUsuario(u2);
        biblioteca.registrarUsuario(u3);

        // 📌 Mostrar publicaciones antes de ordenar
        System.out.println("\n📚 Publicaciones sin ordenar:");
        biblioteca.listarPublicaciones();

        // 🔍 Ordenar publicaciones por año
        biblioteca.ordenarPorAño();
        System.out.println("\n📅 Publicaciones ordenadas por año:");
        biblioteca.listarPublicaciones();

        // 🔍 Ordenar por título
        biblioteca.ordenarPorTitulo();
        System.out.println("\n🔠 Publicaciones ordenadas por título:");
        biblioteca.listarPublicaciones();

        // 🔍 Ordenar por autor
        biblioteca.ordenarPorAutor();
        System.out.println("\n✍️ Publicaciones ordenadas por autor:");
        biblioteca.listarPublicaciones();

        // 📥 Simulación de préstamos
        u1.realizarPrestamo();
        u1.realizarPrestamo();
        u2.realizarPrestamo();
        u3.realizarPrestamo();
        u3.realizarPrestamo();
        u3.realizarPrestamo();

        // 📊 Mostrar ranking de usuarios según préstamos
        System.out.println("\n🏆 Ranking de usuarios por préstamos:");
        biblioteca.mostrarRankingUsuarios();
    }
}
