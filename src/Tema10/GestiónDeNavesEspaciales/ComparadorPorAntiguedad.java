package Tema10.GestiónDeNavesEspaciales;

import java.util.Comparator;

public class ComparadorPorAntiguedad implements Comparator<Nave> {


    @Override
    public int compare(Nave o1, Nave o2) {
        return Integer.compare(o1.getAñoFabricacion(), o1.getAñoFabricacion());

    }
}
