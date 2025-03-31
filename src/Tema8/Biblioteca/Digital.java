package Tema8.Biblioteca;

public interface Digital extends Libro{

    public static final String ENLACE_WEB = "www.letraslaberinto.es";
    void descargar();
    void comentar(String comentario);
    void verPaginaWeb();
}
