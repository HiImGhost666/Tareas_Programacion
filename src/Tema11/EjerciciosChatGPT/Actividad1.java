package Tema11.EjerciciosChatGPT;

import java.util.ArrayList;
import java.util.HashSet;

public class Actividad1 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(); // ArrayList para almacenar los números

        // Agregar números al ArrayList
        for (int i = 0; i <= 10; i++) {
            numeros.add((int) (Math.random() * 11));
        }


        System.out.println("Números generados:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        HashSet<Integer> numerosUnicos = new HashSet<>(numeros); // HashSet para almacenar los números únicos>


        System.out.println("\nNúmeros únicos:");
        for (int num : numerosUnicos) {
            System.out.print(num + " ");
        }





    }
}
