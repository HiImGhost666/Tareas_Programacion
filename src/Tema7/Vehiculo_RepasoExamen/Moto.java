package Tema7.Vehiculo_RepasoExamen;

public class Moto extends Vehiculo{
    private int cilindrada;
    private boolean tieneSidecar;

    public Moto(String marca, String modelo, int año, double precio, int cilindrada, boolean tieneSidecar) {
        super(marca, modelo, año, precio);
        this.cilindrada = cilindrada;
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public String toString(){
        return (super.toString() + "€, tengo " + cilindrada + " cilindrada y " + (tieneSidecar ? "tengo sidecar." : "no tengo sidecar."));
    }

    @Override
    public Moto clone(){
        Moto clon = new Moto(this.getMarca(),this.getModelo(), this.getAño(), this.getPrecio(),this.cilindrada, this.tieneSidecar);
        return clon;
    }
}
