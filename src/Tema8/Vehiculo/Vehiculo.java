package Tema8.Vehiculo;

public class Vehiculo implements Comparable<Vehiculo> {
    private static final String CODIGO_QR = "ABC-123"; // Constante privada
    private String marca;
    private String modelo;
    private int velocidadMaxima;

    public Vehiculo(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getVelocidadMaxima() { return velocidadMaxima; }

    @Override
    public int compareTo(Vehiculo otro) {
        return this.velocidadMaxima - otro.velocidadMaxima; // Ordenar por velocidad máxima
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " - Velocidad: " + velocidadMaxima + " km/h";
    }
}
