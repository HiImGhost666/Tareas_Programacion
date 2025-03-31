package Tema8.Videos;

import java.util.Comparator;

public class ComparadorPorTitulo implements Comparator<RecursoEducativo> {
    @Override
    public int compare(RecursoEducativo r1, RecursoEducativo r2) {
        return r1.getTitulo().compareToIgnoreCase(r2.getTitulo());
    }
}
