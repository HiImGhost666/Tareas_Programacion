package Tema8.Biblioteca2;

class Libro implements Publicacion, Comparable<Libro> {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String genero;
    private boolean prestado;

    public Libro(String titulo, String autor, int año, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = año;
        this.genero = genero;
        this.prestado = false;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAñoPublicacion() { return añoPublicacion; }
    public String getGenero() { return genero; }
    public boolean isPrestado() { return prestado; }

    public void prestar() { prestado = true; }
    public void devolver() { prestado = false; }

    public void mostrarInfo() {
        System.out.println("📖 Libro: " + titulo + " | Autor: " + autor + " | Año: " + añoPublicacion +
                " | Género: " + genero + " | Prestado: " + (prestado ? "Sí" : "No"));
    }

    @Override
    public int compareTo(Libro otro) {
        return this.titulo.compareToIgnoreCase(otro.titulo);
    }
}
