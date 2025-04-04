package Tema8.Biblioteca2;

import java.util.Comparator;

class ComparadorPorAño implements Comparator<Publicacion> {
    @Override
    public int compare(Publicacion p1, Publicacion p2) {
        if (p1 == null) return 1;  // Los null van al final
        if (p2 == null) return -1;
        return Integer.compare(p1.getAñoPublicacion(), p2.getAñoPublicacion());
    }
}

