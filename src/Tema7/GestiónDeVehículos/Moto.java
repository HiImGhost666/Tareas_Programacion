package Tema7.GestiónDeVehículos;

public class Moto extends Vehiculo{
    private int cilindrada;
    private boolean tieneSidecar;

    public Moto(String marca, String modelo, int añoFabricacion, double precio, int cilindrada, boolean tieneSidecar) {
        super(marca, modelo, añoFabricacion, precio);
        this.cilindrada = cilindrada;
        this.tieneSidecar = tieneSidecar;
    }

    public Moto(String marca, String modelo, int añoFabricacion, int cilindrada, boolean tieneSidecar) {
        super(marca, modelo, añoFabricacion);
        this.cilindrada = cilindrada;
        this.tieneSidecar = tieneSidecar;
        this.precio = 0;
    }


    public double calcularMantenimiento(){
        return tieneSidecar ? 300 : 150;
    }

    @Override
    public String toString() {
        return super.toString() + " - Cilindrada: " + cilindrada + " - Sidecar: " + tieneSidecar;
    }
}
