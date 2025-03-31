package Tema8.VideoJuego;

import java.util.Comparator;

class ComparadorPorEdad implements Comparator<Jugador> {
    @Override
    public int compare(Jugador j1, Jugador j2) {
        return Integer.compare(j1.getEdad(), j2.getEdad());
    }
}
