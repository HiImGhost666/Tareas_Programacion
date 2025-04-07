package Tema10.GestionDeVehiculos;

import java.util.Comparator;

public class ComparadorPorAño implements Comparator<Vehiculo> {
    public int compare(Vehiculo o1, Vehiculo o2) {
        return Integer.compare(o1.getAño(), o2.getAño());
    }
}
