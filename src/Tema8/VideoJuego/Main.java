package Tema8.VideoJuego;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GestorTorneo torneo = new GestorTorneo();

        Jugador j1 = new Jugador("Carlos", 20, "España");
        Jugador j2 = new Jugador("Ana", 22, "México");
        Jugador j3 = new Jugador("Luis", 18, "Argentina");

        j1.sumarPuntos(100);
        j2.sumarPuntos(150);
        j3.sumarPuntos(120);

        torneo.añadirParticipante(j1);
        torneo.añadirParticipante(j2);
        torneo.añadirParticipante(j3);

        Equipo equipo1 = new Equipo("Los Pro");
        equipo1.añadirJugador(j1);
        equipo1.añadirJugador(j2);

        torneo.añadirParticipante(equipo1);

        System.out.println("\nLista de Participantes:");
        torneo.listarParticipantes();

        System.out.println("\nOrdenando por puntuación...");
        torneo.ordenarPorPuntuacion();
        torneo.listarParticipantes();

        System.out.println("\nOrdenando jugadores por edad...");
        Jugador[] jugadores = {j1, j2, j3};
        Arrays.sort(jugadores, new ComparadorPorEdad());
        for (Jugador j : jugadores) {
            j.mostrarDatos();
        }

        System.out.println("\nSimulación de Partida:");
        Partida partida = new Partida(j1, j2, 100, 150);
        partida.mostrarResultado();
    }
}
