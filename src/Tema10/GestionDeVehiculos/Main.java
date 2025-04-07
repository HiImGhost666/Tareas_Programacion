package Tema10.GestionDeVehiculos;

public class Main {
    public static void main(String[] args) {
        Concesionario concesionario = new Concesionario(10);

        Coche c1 = new Coche("Toyota", "Corolla", 2020, 15000);
        Coche c2 = new Coche("Honda", "Civic", 2018, 12000);
        Coche c3 = new Coche("Ford", "Focus", 2022, 18000);

        BicicletaElectrica b1 = new BicicletaElectrica("Xiaomi", "MiBike", 2021, 900);
        BicicletaElectrica b2 = new BicicletaElectrica("Specialized", "Turbo", 2019, 2500);

        Vehiculo[] todos = {c1, c2, c3, b1, b2};
        for (Vehiculo v : todos) {
            concesionario.agregarVehiculo(v);
        }

        for (Vehiculo v : todos) {
            if (v != null) {
                Motorizable m = (Motorizable) v;
                m.encenderMotor();
                System.out.println("Encendido: " + m.estaEncendido());
                m.apagarMotor();
                System.out.println("Apagado: " + m.estaEncendido());
                System.out.println("Consumo estimado (50km): " + m.calcularConsumo(50) + "%");
            }
        }

        concesionario.guardarCatalogo();
        concesionario.cargarCatalogo();

        System.out.println("\nOrdenado por precio:");
        concesionario.ordenarPorPrecio();
        concesionario.mostrarTodos();

        System.out.println("\nOrdenado por año:");
        concesionario.ordenarPorAño();
        concesionario.mostrarTodos();
    }
}
