package Tema8.Biblioteca;

import Tema8.Biblioteca.LibroFisico;

import java.util.Comparator;

public class ComparaAutor implements Comparator<LibroFisico> {
    @Override
    public int compare(LibroFisico l1, LibroFisico l2) {
        return l1.getAUTOR().compareToIgnoreCase(l2.getAUTOR()); // Orden alfabético por autor
    }
}