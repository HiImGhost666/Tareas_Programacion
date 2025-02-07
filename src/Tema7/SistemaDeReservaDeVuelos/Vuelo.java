package Tema7.SistemaDeReservaDeVuelos;

public class Vuelo {
    private String codigoVuelo;
    private String origen;
    private String destino;
    private int capacidadMaxima;
    private int reservasActuales;

    public Vuelo(String codigoVuelo, String origen, String destino, int capacidadMaxima) {
        this.codigoVuelo = codigoVuelo;
        this.origen = origen;
        this.destino = destino;
        this.capacidadMaxima = capacidadMaxima;
        this.reservasActuales = 0;
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public boolean disponibilidad() {
        return reservasActuales < capacidadMaxima;
    }

    public void incrementarReservas() {
        if (disponibilidad()) {
            reservasActuales++;
        }
    }

    public void mostrarInformacion() {
        System.out.println("Vuelo " + codigoVuelo + " de " + origen + " a " + destino);
        System.out.println("Capacidad máxima: " + capacidadMaxima);
        System.out.println("Reservas actuales: " + reservasActuales);
    }
}
