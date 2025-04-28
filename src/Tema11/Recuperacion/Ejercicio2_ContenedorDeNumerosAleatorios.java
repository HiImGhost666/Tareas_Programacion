package Tema11.Recuperacion;

import com.sun.source.tree.Tree;

import java.util.*;

public class Ejercicio2_ContenedorDeNumerosAleatorios {
    public static void main(String[] args) {

        int[] numeros = new int[50];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 31);
        }

        System.out.println("Array original:" + Arrays.toString(numeros));

        // Usar un TreeSet para eliminar repetidos y ordenar
        Set<Integer> conjuntoOrdenado = new TreeSet<>();
        for (int num : numeros) {
            conjuntoOrdenado.add(num);
        }

        System.out.println("Sin repetidos y ordenado: " + conjuntoOrdenado);


        Set<Integer> multiplosde2y3 = new TreeSet<>();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0 || numeros[i] % 3 == 0) {
                multiplosde2y3.add(numeros[i]);
            }
        }

        System.out.println("Multiplos de 2 y 3: " + multiplosde2y3);


        Set<Integer> impares = new TreeSet<>(Collections.reverseOrder()); // Usar un Comparator para ordenar de mayor a menorComparator);

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                impares.add(numeros[i]);
            }
        }

        System.out.println("Impares: " + impares);}
}