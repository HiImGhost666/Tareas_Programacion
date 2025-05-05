package Tema11.EjerciciosChatGPT;

import java.util.HashSet;
import java.util.Iterator;

public class Actividad4 {
    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>(); // HashSet para almacenar los números>

        // Agregar números al HashSet
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);

        Iterator<Integer> iterator = numeros.iterator();

        while (iterator.hasNext()) {
            if(iterator.next() % 2 == 0) iterator.remove();
        }

        System.out.println("HashSet sin los números pares: " + numeros);
    }
}
