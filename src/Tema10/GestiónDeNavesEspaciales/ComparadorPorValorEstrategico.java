package Tema10.GestiónDeNavesEspaciales;

import java.util.Comparator;

public class ComparadorPorValorEstrategico implements Comparator<Nave> {

    @Override
    public int compare(Nave o1, Nave o2) {
        return Double.compare(o2.calcularValorEstrategico(), o1.calcularValorEstrategico());
    }
}
