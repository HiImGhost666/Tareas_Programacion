package Tema11.EjerciciosChatGPT.LeerFichero;

import java.io.Serializable;

public class Animal implements Serializable {
    private String nombre;
    private int patas;
    private boolean esMamifero;

    public Animal(String nombre, int patas, boolean esMamifero) {
        this.nombre = nombre;
        this.patas = patas;
        this.esMamifero = esMamifero;
    }

    public Animal(String nombre, int patas) {
        this.nombre = nombre;
        this.patas = patas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPatas() {
        return patas;
    }

    public boolean isEsMamifero() {
        return esMamifero;
    }

    @Override
    public String toString() {
       return "Animal: " + nombre + ", patas: " + patas + ", mamifero: " + esMamifero;
    }
}
