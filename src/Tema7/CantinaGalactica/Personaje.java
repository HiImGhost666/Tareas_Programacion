package Tema7.CantinaGalactica;

import Tema7.Vehiculo_RepasoExamen.Vehiculo;

public class Personaje {
    private String nombre;
    private String especie;
    private int edad;
    private boolean peligroso;
    private static int totalPersonajes;

    public Personaje(String nombre, String especie, int edad, boolean peligroso) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peligroso = peligroso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isPeligroso() {
        return peligroso;
    }

    public static int getTotalPersonajes(){
        return totalPersonajes;
    }

    @Override
    public String toString(){
        return ("Me llamo " + nombre + ". Soy de la especie " + especie + " y tengo " + edad + " años. Y " + (peligroso ? "Soy peligroso" : "No soy peligroso"));
    }

    public boolean equals(Personaje p1, Personaje p2){
        return (this.nombre.equals(p1.nombre) && this.especie.equals(p2.especie));
    }

    @Override
    public Personaje clone(){
        Personaje clon = new Personaje(this.nombre,this.especie,this.edad,this.peligroso);
        return clon;
    }
}
