package Tema8.VideoJuego;

import java.util.Comparator;

class ComparadorPorNombre implements Comparator<Participante> {
    @Override
    public int compare(Participante p1, Participante p2) {
        return p1.getNombre().compareToIgnoreCase(p2.getNombre());
    }
}

