package Tema8.Vehiculo;

import java.util.Arrays;

public class VehiculoMain {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = {
                new Vehiculo("Toyota", "Corolla", 180),
                new Vehiculo("Ford", "Mustang", 250),
                new Vehiculo("BMW", "M3", 240),
                new Vehiculo("Audi", "A4", 220)
        };

        // Ordenar por velocidad máxima (Comparable)
        Arrays.sort(vehiculos);
        System.out.println("Ordenados por velocidad máxima:");
        for (Vehiculo v : vehiculos) {
            System.out.println(v);
        }

        // Ordenar por marca (Comparator)
        Arrays.sort(vehiculos, new ComparadorPorMarca());
        System.out.println("\nOrdenados por marca:");
        for (Vehiculo v : vehiculos) {
            System.out.println(v);
        }
    }
}
