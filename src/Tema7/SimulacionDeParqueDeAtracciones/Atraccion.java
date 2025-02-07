package Tema7.SimulacionDeParqueDeAtracciones;

public class Atraccion {
    private String nombre;
    private int capacidadMaxima;
    private double alturaMinima;
    private int duracion;

    public Atraccion(String nombre, int capacidadMaxima, double alturaMinima, int duracion) {
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.alturaMinima = alturaMinima;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getAlturaMinima() {
        return alturaMinima;
    }

    public int getDuracion() {
        return duracion;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre + "\n Capacidad Máxima: " + capacidadMaxima + "\n Altura Mínima: " + alturaMinima + "\n Duracion:" + duracion);
    }


}
