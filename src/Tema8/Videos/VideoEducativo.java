package Tema8.Videos;

public class VideoEducativo implements RecursoEducativo, Descargable, Comparable<VideoEducativo> {
    private String titulo;
    private String autor;
    private double duracion;
    private boolean subtitulos;
    private String calidad;
    private String formato;
    private String[] idiomasSubtitulos;
    private int totalIdiomas;

    public VideoEducativo(String titulo, String autor, double duracion, boolean subtitulos, String calidad, String formato) {
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.subtitulos = subtitulos;
        this.calidad = calidad;
        this.formato = formato;
        this.idiomasSubtitulos = new String[10]; // Máximo 10 idiomas
        this.totalIdiomas = 0;
    }

    public void añadirSubtitulos(String idioma) {
        if (totalIdiomas < idiomasSubtitulos.length) {
            idiomasSubtitulos[totalIdiomas++] = idioma;
        } else {
            System.out.println("No se pueden añadir más idiomas.");
        }
    }

    public void mostrarSubtitulos() {
        System.out.print("Idiomas disponibles: ");
        for (int i = 0; i < totalIdiomas; i++) {
            System.out.print(idiomasSubtitulos[i] + " ");
        }
        System.out.println();
    }

    @Override
    public String getTitulo() { return titulo; }

    @Override
    public void setTitulo(String titulo) { this.titulo = titulo; }

    @Override
    public String getAutor() { return autor; }

    @Override
    public double getDuracion() { return duracion; }

    @Override
    public void mostrarDetalles() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Duración: " + duracion + " minutos");
        System.out.println("Calidad: " + calidad);
        System.out.println("Formato: " + formato);
        mostrarSubtitulos();
    }

    @Override
    public String prepararDescarga() {
        return "Descargando '" + titulo + "' en formato " + formato + " y calidad " + calidad + "...";
    }

    @Override
    public boolean comprobarEspacio(double espacioDisponible) {
        return espacioDisponible >= TAMAÑO_MAXIMO;
    }

    @Override
    public int compareTo(VideoEducativo otro) {
        return Double.compare(this.duracion, otro.duracion);
    }
}
