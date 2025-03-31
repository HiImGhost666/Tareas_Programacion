package Tema8.VideoJuego;

class Partida {
    private Participante participante1;
    private Participante participante2;
    private double puntuacion1;
    private double puntuacion2;
    private String ganador;

    public Partida(Participante p1, Participante p2, double puntos1, double puntos2) {
        this.participante1 = p1;
        this.participante2 = p2;
        this.puntuacion1 = puntos1;
        this.puntuacion2 = puntos2;
        determinarGanador();
    }

    private void determinarGanador() {
        if (puntuacion1 > puntuacion2) {
            ganador = participante1.getNombre();
        } else if (puntuacion2 > puntuacion1) {
            ganador = participante2.getNombre();
        } else {
            ganador = "Empate";
        }
    }

    public void mostrarResultado() {
        System.out.println(participante1.getNombre() + " (" + puntuacion1 + " puntos) vs " +
                participante2.getNombre() + " (" + puntuacion2 + " puntos) => Ganador: " + ganador);
    }
}

