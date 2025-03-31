package Tema8.Biblioteca2;

import java.util.Comparator;

class ComparadorPorAño implements Comparator<Publicacion> {
    @Override
    public int compare(Publicacion p1, Publicacion p2) {
        return Integer.compare(p2.getAñoPublicacion(), p1.getAñoPublicacion());
    }
}

