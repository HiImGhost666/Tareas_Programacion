package Tema8.Videos;

public class Main {
    public static void main(String[] args) {
        GestorRecursos gestor = new GestorRecursos();

        VideoEducativo video1 = new VideoEducativo("POO en Java", "Profesor A", 95.0, true, "1080p", "mp4");
        video1.añadirSubtitulos("Español");
        video1.añadirSubtitulos("Inglés");

        VideoEducativo video2 = new VideoEducativo("Patrones de Diseño", "Profesor B", 180.0, false, "720p", "avi");
        VideoEducativo video3 = new VideoEducativo("POO en Java", "Profesor A", 95.0, true, "1080p", "mp4");

        gestor.añadirRecurso(video1);
        gestor.añadirRecurso(video2);
        gestor.añadirRecurso(video3);

        System.out.println("\n--- Listado de Videos ---");
        gestor.listarVideosDisponibles();

        System.out.println("\n--- Buscar por Autor: 'Profesor A' ---");
        RecursoEducativo[] encontrados = gestor.buscarPorAutor("Profesor A");
        for (RecursoEducativo r : encontrados) {
            r.mostrarDetalles();
            System.out.println("----------------------");
        }

        System.out.println("\n--- Ordenando por duración (Comparable) ---");
        gestor.ordenarRecursos(null);
        gestor.listarVideosDisponibles();

        System.out.println("\n--- Ordenando por título (Comparator) ---");
        gestor.ordenarRecursos(new ComparadorPorTitulo());
        gestor.listarVideosDisponibles();

        System.out.println("\n--- Descargando Video 1 ---");
        gestor.descargarRecurso(0);
    }
}
