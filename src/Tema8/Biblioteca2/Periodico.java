package Tema8.Biblioteca2;

public class Periodico implements Publicacion {
    private String titulo;
    private String editor;
    private int añoPublicacion;
    private String pais;

    public Periodico(String titulo, String editor, int año, String pais) {
        this.titulo = titulo;
        this.editor = editor;
        this.añoPublicacion = año;
        this.pais = pais;
    }

    @Override
    public String getTitulo() {
        return null;
    }

    @Override
    public String getAutor() {
        return null;
    }

    @Override
    public int getAñoPublicacion() {
        return 0;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("📰 Periódico: " + getTitulo() + " | Autor: " + getAutor() +
                " | Año: " + getAñoPublicacion() + " | País: " + pais);
    }
}

