package Tema8.Biblioteca2;

class Revista implements Publicacion {
    private String titulo;
    private String editor;
    private int añoPublicacion;
    private int numeroEdicion;

    public Revista(String titulo, String editor, int año, int numeroEdicion) {
        this.titulo = titulo;
        this.editor = editor;
        this.añoPublicacion = año;
        this.numeroEdicion = numeroEdicion;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return editor; }
    public int getAñoPublicacion() { return añoPublicacion; }

    public void mostrarInfo() {
        System.out.println("📰 Revista: " + titulo + " | Editor: " + editor + " | Año: " + añoPublicacion +
                " | Edición Nº: " + numeroEdicion);
    }
}
