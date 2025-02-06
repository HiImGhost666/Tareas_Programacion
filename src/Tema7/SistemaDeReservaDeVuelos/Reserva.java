package Tema7.SistemaDeReservaDeVuelos;

public class Reserva {
    private Pasajero pasajero;
    private Vuelo vuelo;

    public Reserva(Pasajero pasajero, Vuelo vuelo) {
        this.pasajero = pasajero;
        this.vuelo = vuelo;
    }

    public void confirmarReserva() {
        if (vuelo.disponibilidad()) {
            vuelo.incrementarReservas();
            System.out.println("✅ Reserva confirmada para " + pasajero.getNombre() + " en el vuelo " + vuelo.getCodigoVuelo());
        } else {
            System.out.println("❌ No hay plazas disponibles en el vuelo " + vuelo.getCodigoVuelo());
        }
    }
}
