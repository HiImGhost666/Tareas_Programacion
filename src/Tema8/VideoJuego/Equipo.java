package Tema8.VideoJuego;

class Equipo implements Participante {
    private String nombre;
    private Jugador[] jugadores;
    private int totalJugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new Jugador[5]; // Máximo 5 jugadores
        this.totalJugadores = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPuntuacion() {
        double total = 0;
        for (int i = 0; i < totalJugadores; i++) {
            total += jugadores[i].getPuntuacion();
        }
        return total;
    }

    public void añadirJugador(Jugador j) {
        if (totalJugadores < 5) {
            jugadores[totalJugadores++] = j;
        } else {
            System.out.println("Equipo lleno.");
        }
    }

    public Jugador obtenerMejorJugador() {
        if (totalJugadores == 0) return null;
        Jugador mejor = jugadores[0];
        for (int i = 1; i < totalJugadores; i++) {
            if (jugadores[i].getPuntuacion() > mejor.getPuntuacion()) {
                mejor = jugadores[i];
            }
        }
        return mejor;
    }

    public void mostrarDatos() {
        System.out.println("Equipo: " + nombre);
        for (int i = 0; i < totalJugadores; i++) {
            jugadores[i].mostrarDatos();
        }
    }
}
