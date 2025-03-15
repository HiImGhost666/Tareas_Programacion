package Tema8.Vehiculo;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = {
                new Coche("Toyota", "Corolla", 180, 4),
                new Coche("Ford", "Mustang", 250, 2),
                new Moto("BMW", "M3", 240, "Deportiva"),
                new Moto("Audi", "A4", 220, "Scooter")
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

        // Ordenar por modelo (Comparator)
        Arrays.sort(vehiculos, new ComparadorPorModelo());
        System.out.println("\nOrdenados por modelo:");
        for (Vehiculo v : vehiculos) {
            System.out.println(v);
        }
    }
}
