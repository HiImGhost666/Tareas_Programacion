package Tema11.EjerciciosChatGPT.Persona;

public class Persona implements Comparable<Persona> {

    private String nombre;
    private int edad;
    private String DNI;

    public Persona(String nombre, int edad, String DNI) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Persona: " + nombre + ", edad: " + edad + ", DNI: " + DNI;
    }
    @Override
    public int compareTo(Persona o) {
        return this.edad - o.edad;
    }

}
