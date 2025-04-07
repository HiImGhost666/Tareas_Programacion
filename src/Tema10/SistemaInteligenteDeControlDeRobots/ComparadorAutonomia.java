package Tema10.SistemaInteligenteDeControlDeRobots;

import java.util.Comparator;

public class ComparadorAutonomia implements Comparator<Robot> {

    @Override
    public int compare(Robot o1, Robot o2) {
        return Double.compare(o2.calcularAutonomia(), o1.calcularAutonomia());
    }
}
