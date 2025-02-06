package Tema7.Vehiculos;

public class MainVehiculos {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla", 2020, 4);
        Moto moto = new Moto("Honda", "CBR500R", 2021, false);

        System.out.println("Información del coche:");
        coche.mostrarInformacionCoche();

        System.out.println();

        System.out.println("Información de la moto:");
        moto.mostrarInformacionMoto();
    }
}
