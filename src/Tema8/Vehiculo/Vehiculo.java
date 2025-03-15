package Tema8.Vehiculo;

public class Vehiculo implements Comparable<Vehiculo> {


    private String marca;
    private String modelo;
    private int velocidadMax;

    public Vehiculo(String marca, String modelo, int velocidadMax) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMax = velocidadMax;
    }

    @Override
    public int compareTo(Vehiculo o) {
        return this.velocidadMax - o.velocidadMax;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " - Velocidad: " + velocidadMax + " km/h";

    }
}
