package Tema8.Vehiculo;

import java.util.Comparator;

public class ComparadorPorMarca implements Comparator<Vehiculo> {
    @Override
    public int compare(Vehiculo o1, Vehiculo o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}
