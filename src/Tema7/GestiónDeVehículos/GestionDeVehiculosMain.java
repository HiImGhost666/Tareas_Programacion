package Tema7.GestiónDeVehículos;

public class GestionDeVehiculosMain {
    public static void main(String[] args) {

        // Crear instancias de diferentes tipos de vehículos
        Coche coche1 = new Coche("Tesla", "Model S", 2022, 60000, 4, true);
        Coche coche2 = new Coche("Ford", "Focus", 2018, 20000, 4, false);

        Moto moto1 = new Moto("Yamaha", "MT-07", 2020, 8000, 700, false);
        Moto moto2 = new Moto("Harley-Davidson", "Softail", 2019, 15000, 1200, true);

        Camion camion1 = new Camion("Volvo", "FH16", 2015, 90000, 3, 20);
        Camion camion2 = new Camion("Scania", "R500", 2021, 110000, 4, 30);

        // Almacenar los vehículos en un array de tipo Vehículo
        Vehiculo[] vehiculos = {coche1, coche2, moto1, moto2, camion1, camion2};

        // Recorrer el array e imprimir la información de cada vehículo
        for (Vehiculo v : vehiculos) {
            System.out.println(v.toString());
            System.out.println("Costo anual de mantenimiento: " + v.calcularMantenimiento() + "€\n");
        }
    }
}
