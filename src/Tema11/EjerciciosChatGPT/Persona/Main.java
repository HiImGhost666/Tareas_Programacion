package Tema11.EjerciciosChatGPT.Persona;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Persona> personas = new TreeSet<>();

        personas.add(new Persona("Juan", 25, "12345678A"));
        personas.add(new Persona("Ana", 30, "87654321B"));
        personas.add(new Persona("Pedro", 35, "98765432C"));
        personas.add(new Persona("Maria", 40, "45678901D"));

        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}
