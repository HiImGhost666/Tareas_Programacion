package Tema8.Biblioteca;

import java.util.Comparator;

public class ComparaAutor implements Comparator<LibroFisico> {
    @Override
    public int compare(LibroFisico libro1, LibroFisico libro2){
        return libro1.AUTOR.compareToIgnoreCase(libro2.AUTOR);
    }
}
