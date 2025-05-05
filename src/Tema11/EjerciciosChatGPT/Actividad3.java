package Tema11.EjerciciosChatGPT;

import java.util.ArrayList;
import java.util.Arrays;

public class Actividad3 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>(); // ArrayList para almacenar los números>

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(5);

        System.out.println("ArrayList original: " + numeros);

        numeros.add(3,4);

        System.out.println("ArrayList con el número 4 insertado en la posición 2: " + numeros);

        numeros.add(3,7);

        System.out.println("ArrayList con el número 4 insertado en la posición 2: " + numeros);
    }
}
