package Tema8.Vehiculo;

public class Moto extends Vehiculo implements Conducible{
    private String tipo;

    public Moto(String marca, String modelo, int velocidadMax, String tipo) {
        super(marca, modelo, velocidadMax);
        this.tipo = tipo;
    }

    @Override
    public void acelerar(int velocidad) {
        System.out.println("Acelerando a " + velocidad + " km/h");
    }

    @Override
    public String toString() {
        return super.toString() + "Moto{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
