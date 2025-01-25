package Tema5.ActividadesDeRepaso;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el tamaño del array:");
        int tamaño = sc.nextInt();

        int[] array = new int[tamaño];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        Arrays.toString(array);
        System.out.println("Introduce el numero que quieres buscar:");
        int num = sc.nextInt();

        buscarNumero(array, num);
    }

    static void buscarNumero(int[] array, int num) {
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                System.out.println("El numero " + num + " se encuentra en la posicion: " + i);
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("El numero no se encuentra en el array");
        }
    }
}
