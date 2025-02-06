package Tema7.SistemaDeReservaDeVuelos;

public class AgenciaViajes {
    private Vuelo[] vuelos;
    private Reserva[] reservas;
    private int numVuelos;
    private int numReservas;

    public AgenciaViajes(int capacidadVuelos, int capacidadReservas){
        vuelos = new Vuelo[capacidadVuelos];
        reservas = new Reserva[capacidadReservas];
        numVuelos = 0;
        numReservas = 0;
    }

    public void agregarVuelo(Vuelo v){
        if (numVuelos < vuelos.length) {
            vuelos[numVuelos] = v;
            numVuelos++;
            System.out.println("✅ Vuelo " + v.getCodigoVuelo() + " agregado.");
        } else {
            System.out.println("❌ No se pueden agregar más vuelos, capacidad máxima alcanzada.");
        }
    }

    public void realizarReserva(Pasajero p, Vuelo v) {
        if (v.disponibilidad()) {
            if (numReservas < reservas.length) {
                Reserva reserva = new Reserva(p, v);
                reserva.confirmarReserva();
                reservas[numReservas] = reserva;
                numReservas++;
            } else {
                System.out.println("❌ No se pueden agregar más reservas, capacidad máxima alcanzada.");
            }
        } else {
            System.out.println("❌ No se puede realizar la reserva. No hay plazas disponibles en el vuelo " + v.getCodigoVuelo());
        }
    }

    public void mostrarVuelosDisponibles() {
        System.out.println("\n✈️ Vuelos disponibles:");
        boolean hayVuelosDisponibles = false;
        for (int i = 0; i < numVuelos; i++) {
            if (vuelos[i].disponibilidad()) {
                vuelos[i].mostrarInformacion();
                hayVuelosDisponibles = true;
            }
        }
        if (!hayVuelosDisponibles) {
            System.out.println("❌ No hay vuelos disponibles.");
        }
    }
}
