package Tema8.Vehiculo;

public class Coche extends Vehiculo implements Conducible{


    private int numPuertas;

    public Coche(String marca, String modelo, int velocidadMax, int numPuertas) {
        super(marca, modelo, velocidadMax);
        this.numPuertas = numPuertas;
    }

    @Override
    public void acelerar(int velocidad) {
        System.out.println("El coche acelera a " + velocidad + " km/h");
    }

    @Override
    public String toString() {
        return super.toString() + "Coche{" +
                "numPuertas=" + numPuertas +
                '}';
    }
}
