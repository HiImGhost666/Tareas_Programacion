package Tema8.Vehiculo;

import java.util.Comparator;

public class ComparadorPorMarca implements Comparator<Vehiculo> {
    @Override
    public int compare(Vehiculo v1, Vehiculo v2) {
        return v1.getMarca().compareToIgnoreCase(v2.getMarca());
    }
}

// Ordenar por modelo
class ComparadorPorModelo implements Comparator<Vehiculo> {
    @Override
    public int compare(Vehiculo v1, Vehiculo v2) {
        return v1.getModelo().compareToIgnoreCase(v2.getModelo());
    }
}
