package Tema7.Vehiculo_RepasoExamen;

public class Main {
    public static void main(String[] args) {
        // Crear un concesionario con capacidad para 3 vehículos
        Concesionario concesionario = new Concesionario(3);

        // Crear algunos vehículos
        Coche coche1 = new Coche("Toyota", "Corolla", 2022, 25000, 4, false);
        Coche coche2 = new Coche("Tesla", "Model S", 2023, 60000, 4, true);
        Moto moto1 = new Moto("Honda", "CBR600", 2021, 12000, 600, false);

        // Agregar vehículos con append()
        concesionario.append(coche1);
        concesionario.append(coche2);
        System.out.println(concesionario);

        // Crear un nuevo concesionario usando añadir() sin modificar el original
        Concesionario concesionarioNuevo = concesionario.añadir(moto1);
        System.out.println("Concesionario original:");
        System.out.println(concesionario);

        System.out.println("Nuevo concesionario con la moto añadida:");
        System.out.println(concesionarioNuevo);
    }
}
