package Tema7.Personaje;

public class Personaje {
    private String nombre;
    private int fuerza;
    private int energia;

    public Personaje(String nombre, int fuerza, int energia) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.energia = energia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getEnergia() {
        return energia;
    }

    public static void saludar(Personaje p1, Personaje p2){
        System.out.println("\tPersonaje 1: Hola me llamo " + p1.nombre + "\n\tPersonaje 2: Encantado " + p1.nombre + " mi nombre es " + p2.nombre);
    }

    public void descansar(){
        energia += 10;
    }

    public boolean equals(Personaje p1){
        return (this.nombre.equals(p1.nombre) && this.fuerza == p1.fuerza);
    }

    @Override
    public String toString(){
        return ("Datos de " + nombre + ": Fuerza: " + fuerza + " - Nivel de energia: " + energia);
    }
}
