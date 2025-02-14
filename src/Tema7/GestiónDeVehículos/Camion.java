package Tema7.GestiónDeVehículos;

public class Camion extends Vehiculo{
    private double capacidadCarga;
    private int numeroEjes;

    public Camion(String marca, String modelo, int añoFabricacion, double precio, double capacidadCarga, int numeroEjes) {
        super(marca, modelo, añoFabricacion, precio);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }

    public Camion(String marca, String modelo, int añoFabricacion, double capacidadCarga, int numeroEjes) {
        super(marca, modelo, añoFabricacion);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
        this.precio = 0;
    }


    public double calcularMantenimiento(){
        return (numeroEjes * 300) + (capacidadCarga * 50);
    }

    @Override
    public String toString() {
        return super.toString() + " - Carga: " + capacidadCarga + "T - Ejes: " + numeroEjes;
    }
}
