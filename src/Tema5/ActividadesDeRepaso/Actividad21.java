package Tema5.ActividadesDeRepaso;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Introduce el numero que quieres desplazar:");
        int num = sc.nextInt();

        int[] arrayDesplazado = ArrayDesplazado(array, num);
        System.out.println("El array desplazado es: " + Arrays.toString(arrayDesplazado));
    }


    static int[] ArrayDesplazado(int[] array, int num) {
        int[] arraydesplazado = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arraydesplazado[i] = array[(i + num) % array.length];
        }
        return arraydesplazado;
    }
}