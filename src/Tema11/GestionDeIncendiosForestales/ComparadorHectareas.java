package Tema11.GestionDeIncendiosForestales;

import java.util.Comparator;

public class ComparadorHectareas implements Comparator<Provocado> {
    @Override
    public int compare(Provocado p1, Provocado p2) {
        return Integer.compare(p2.getHectareasAfectadas(), p1.getHectareasAfectadas());
    }
}
