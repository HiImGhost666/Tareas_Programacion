package Tema8.VideoJuego;

class GestorTorneo {
    private Participante[] participantes;
    private int totalParticipantes;

    public GestorTorneo() {
        participantes = new Participante[50];
        totalParticipantes = 0;
    }

    public void añadirParticipante(Participante p) {
        if (totalParticipantes < 50) {
            participantes[totalParticipantes++] = p;
        } else {
            System.out.println("Máximo de participantes alcanzado.");
        }
    }

    public void listarParticipantes() {
        for (int i = 0; i < totalParticipantes; i++) {
            participantes[i].mostrarDatos();
        }
    }

    public Participante buscarPorNombre(String nombre) {
        for (int i = 0; i < totalParticipantes; i++) {
            if (participantes[i].getNombre().equalsIgnoreCase(nombre)) {
                return participantes[i];
            }
        }
        return null;
    }

    public void ordenarPorPuntuacion() {
        for (int i = 0; i < totalParticipantes - 1; i++) {
            for (int j = i + 1; j < totalParticipantes; j++) {
                if (participantes[i].getPuntuacion() < participantes[j].getPuntuacion()) {
                    Participante temp = participantes[i];
                    participantes[i] = participantes[j];
                    participantes[j] = temp;
                }
            }
        }
    }
}

