package Tema8.Biblioteca2;

public class Main {
    public static void main(String[] args) {
        // 📚 Crear biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // 🔹 Agregar libros al catálogo
        biblioteca.agregarPublicacion(new Libro("El Quijote", "Cervantes", 1605, "Novela"));
        biblioteca.agregarPublicacion(new Libro("1984", "George Orwell", 1949, "Distopía"));
        biblioteca.agregarPublicacion(new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, "Realismo mágico"));
        biblioteca.agregarPublicacion(new Libro("Dune", "Frank Herbert", 1965, "Ciencia ficción"));

        // 🔹 Agregar revistas
        biblioteca.agregarPublicacion(new Revista("National Geographic", "NG", 2023, 320));
        biblioteca.agregarPublicacion(new Revista("Scientific American", "Springer", 2021, 298));

        // 🔹 Agregar periódicos
        biblioteca.agregarPublicacion(new Periodico("The Times", "John Wither", 2024, "UK"));
        biblioteca.agregarPublicacion(new Periodico("El País", "Carlos Peña", 2024, "España"));

        // 🧑‍🎓 Crear usuarios (Estudiantes y Profesores)
        Usuario estudiante1 = new Estudiante("Carlos Pérez", 101, "Ingeniería");
        Usuario estudiante2 = new Estudiante("Lucía Gómez", 102, "Medicina");
        Usuario profesor1 = new Profesor("Dr. Ramón Fernández", 201, "Física Cuántica");
        Usuario profesor2 = new Profesor("Marta Jiménez", 202, "Historia");

        // 🔹 Registrar usuarios en la biblioteca
        biblioteca.registrarUsuario(estudiante1);
        biblioteca.registrarUsuario(estudiante2);
        biblioteca.registrarUsuario(profesor1);
        biblioteca.registrarUsuario(profesor2);

        // 📜 Listar el catálogo
        biblioteca.listarCatalogo();

        // 🔍 Buscar usuario y mostrar su información
        Usuario usuarioEncontrado = biblioteca.buscarUsuario(102);
        if (usuarioEncontrado != null) {
            System.out.println("\n✅ Usuario encontrado:");
            usuarioEncontrado.mostrarInfo();
        } else {
            System.out.println("\n❌ Usuario no encontrado.");
        }

        // 📖 Préstamo de libros
        System.out.println("\n🎯 Préstamos de libros:");
        biblioteca.prestarLibro("1984", 101);
        biblioteca.prestarLibro("El Quijote", 102);
        biblioteca.prestarLibro("Dune", 201);

        // 📖 Intentar prestar un libro ya prestado
        biblioteca.prestarLibro("Dune", 202);

        // 📖 Devolución de libros
        System.out.println("\n🔄 Devolución de libros:");
        biblioteca.devolverLibro("1984", 101);
        biblioteca.devolverLibro("Dune", 201);

        // 🔄 Intentar devolver un libro que no está prestado
        biblioteca.devolverLibro("Cien años de soledad", 102);

        // 🔍 Ordenar publicaciones por año de publicación (usando Comparator)
        System.out.println("\n📊 Ordenando publicaciones por año:");
        biblioteca.ordenarPorAño();

        // 🏆 Mostrar ranking de usuarios con más préstamos
        System.out.println("\n🏆 Ranking de usuarios más activos:");
        biblioteca.mostrarRankingUsuarios();
    }
}
