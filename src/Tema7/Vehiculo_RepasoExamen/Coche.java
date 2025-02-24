package Tema7.Vehiculo_RepasoExamen;

public class Coche extends Vehiculo {
    private int puertas;
    private boolean esElectrico;

    public Coche(String marca, String modelo, int año, double precio, int puertas, boolean esElectrico) {
        super(marca, modelo, año, precio);
        this.puertas = puertas;
        this.esElectrico = esElectrico;
    }

    @Override
    public String toString(){
        return (super.toString() + "tengo " + puertas + " puertas y " + (esElectrico ? "soy electrico" : "no soy electrico"));
    }

    @Override
    public Coche clone(){
        Coche clon = new Coche(this.getMarca(),this.getModelo(), this.getAño(), this.getPrecio(),this.puertas, this.esElectrico);
        return clon;
    }
}
