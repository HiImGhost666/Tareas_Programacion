package Tema8.Videos;

public interface Descargable extends RecursoEducativo{
    Double TAMAÑO_MAXIMO = 500.0; //MB

    String prepararDescarga();
    boolean comprobarEspacio(double espacioDisponible);
}
