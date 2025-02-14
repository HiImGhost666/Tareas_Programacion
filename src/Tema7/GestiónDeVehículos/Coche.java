package Tema7.GestiónDeVehículos;

public class Coche extends Vehiculo{
    private int numeroPuertas;
    private boolean esElectrico;

    public Coche(String marca, String modelo, int añoFabricacion, double precio, int numeroPuertas, boolean esElectrico) {
        super(marca, modelo, añoFabricacion, precio);
        this.numeroPuertas = numeroPuertas;
        this.esElectrico = esElectrico;
    }

    public Coche(String marca, String modelo, int añoFabricacion, int numeroPuertas, boolean esElectrico) {
        super(marca, modelo, añoFabricacion);
        this.numeroPuertas = numeroPuertas;
        this.esElectrico = esElectrico;
        this.precio = 0;
    }

    public double calcularMantenimiento(){
        return esElectrico ? 200 : 500;
    }


    @Override
    public String toString() {
        return super.toString() + " - Puertas: " + numeroPuertas + " - Eléctrico: " + esElectrico;
    }
}
