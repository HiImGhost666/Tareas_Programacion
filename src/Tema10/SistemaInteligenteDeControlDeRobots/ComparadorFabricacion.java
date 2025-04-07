package Tema10.SistemaInteligenteDeControlDeRobots;

import java.util.Comparator;

public class ComparadorFabricacion implements Comparator<Robot> {
    @Override
    public int compare(Robot o1, Robot o2) {
        return Integer.compare(o2.getAñoFabricacion(), o1.getAñoFabricacion());
    }
}
