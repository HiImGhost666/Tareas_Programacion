package Tema7.Vehiculos;

public class Coche extends Vehiculo {
    private int numeroPuertas;

    public Coche(String marca, String modelo, int anio, int numeroPuertas) {
        super(marca, modelo, anio);
        this.numeroPuertas = numeroPuertas;
    }

    public void mostrarInformacionCoche() {
        mostrarInformacion();
        System.out.println("Número de puertas: " + numeroPuertas);
    }
}
