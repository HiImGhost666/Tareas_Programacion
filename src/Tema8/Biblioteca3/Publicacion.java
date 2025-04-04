package Tema8.Biblioteca3;

class Publicacion {
    protected String titulo;
    protected String autor;
    protected int añoPublicacion;

    public Publicacion(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAñoPublicacion() { return añoPublicacion; }

    public void mostrarDetalles() {
        System.out.println(titulo + " - " + autor + " (" + añoPublicacion + ")");
    }
}