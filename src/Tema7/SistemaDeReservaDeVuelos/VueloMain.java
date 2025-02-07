package Tema7.SistemaDeReservaDeVuelos;

public class VueloMain {
    public static void main(String[] args) {
        // Crear vuelos
        Vuelo vuelo1 = new Vuelo("AB123", "Madrid", "Barcelona", 2);
        Vuelo vuelo2 = new Vuelo("CD456", "Valencia", "Sevilla", 1);

        // Crear agencia de viajes
        AgenciaViajes agencia = new AgenciaViajes(5, 5); // Capacidad para 5 vuelos y 5 reservas
        agencia.agregarVuelo(vuelo1);
        agencia.agregarVuelo(vuelo2);

        // Crear pasajeros
        Pasajero pasajero1 = new Pasajero("Juan Pérez", "12345678A");
        Pasajero pasajero2 = new Pasajero("Ana Gómez", "87654321B");
        Pasajero pasajero3 = new Pasajero("Carlos López", "11223344C");

        // Realizar reservas
        agencia.realizarReserva(pasajero1, vuelo1);
        agencia.realizarReserva(pasajero2, vuelo1);
        agencia.realizarReserva(pasajero3, vuelo1); // No debería poder reservarse, ya está lleno

        agencia.realizarReserva(pasajero3, vuelo2); // Este vuelo tiene una plaza
        agencia.realizarReserva(pasajero3, vuelo2); // No debería poder reservarse, ya está lleno

        // Mostrar vuelos disponibles
        agencia.mostrarVuelosDisponibles();
    }
}
