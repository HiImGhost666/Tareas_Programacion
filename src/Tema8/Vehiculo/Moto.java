package Tema8.Vehiculo;

public class Moto extends Vehiculo{
    private String tipo;

    public Moto(String marca, String modelo, int velocidadMaxima, String tipo) {
        super(marca, modelo, velocidadMaxima);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + " - Tipo: " + tipo;
    }
}
