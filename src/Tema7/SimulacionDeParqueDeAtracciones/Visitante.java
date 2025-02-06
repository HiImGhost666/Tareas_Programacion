package Tema7.SimulacionDeParqueDeAtracciones;

public class Visitante {
    private String nombre;
    private int edad;
    private double altura;

    public Visitante(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    public boolean puedeSubirse(Atraccion a){
        return this.altura >= a.getAlturaMinima();
    }

    public void mostrarInformacion() {
        System.out.println("Visitante: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Altura: " + altura + "m");
    }
}
