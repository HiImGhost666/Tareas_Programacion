package Tema11.EjerciciosChatGPT;

import java.util.HashSet;

public class Actividad2 {
    public static void main(String[] args) {
        HashSet<String> palabras = new HashSet<>(); // HashSet para almacenar las palabras

//    palabras.add("Manzana");
    palabras.add("Banana");
    palabras.add("Naranja");
    palabras.add("Pera");
    palabras.add("Limon");

    if(palabras.contains("Manzana") || palabras.contains("Banana")) {
        System.out.println("La palabra 'Manzana' se encuentra en el HashSet.");
    } else {
        System.out.println("La palabra 'Manzana' no se encuentra en el HashSet.");
    }
    }
}
