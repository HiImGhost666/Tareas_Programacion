package Tema8.VideoJuego;

class Jugador implements Participante, Comparable<Jugador> {
    private String nombre;
    private int edad;
    private double puntuacionTotal;
    private String pais;

    public Jugador(String nombre, int edad, String pais) {
        this.nombre = nombre;
        this.edad = edad;
        this.pais = pais;
        this.puntuacionTotal = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPuntuacion() {
        return puntuacionTotal;
    }

    public void sumarPuntos(double puntos) {
        this.puntuacionTotal += puntos;
    }

    public void mostrarDatos() {
        System.out.println("Jugador: " + nombre + " | Edad: " + edad + " | Puntos: " + puntuacionTotal + " | País: " + pais);
    }

    @Override
    public int compareTo(Jugador otro) {
        return Double.compare(otro.puntuacionTotal, this.puntuacionTotal); // Mayor a menor
    }

    public int getEdad() {
        return edad;
    }
}

