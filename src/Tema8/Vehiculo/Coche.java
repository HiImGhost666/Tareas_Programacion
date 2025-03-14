package Tema8.Vehiculo;

public class Coche extends Vehiculo{
    private int numPuertas;

    public Coche(String marca, String modelo, int velocidadMaxima, int numPuertas) {
        super(marca, modelo, velocidadMaxima);
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return super.toString() + " - Puertas: " + numPuertas;
    }
}
