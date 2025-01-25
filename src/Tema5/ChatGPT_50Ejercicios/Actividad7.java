/*
Calcular el promedio de los números en un array.
 */
package Tema5.ChatGPT_50Ejercicios;

public class Actividad7 {
    public static void main(String[] args) {

        int[] array = {9,6,4,7,3,5};


        int suma = 0;
        double promedio = 0;
        for(int i = 0; i < array.length; i++) {
            suma += array[i];
            promedio = (double) suma / array.length;
        }

        System.out.println("El promedio del array es: " + promedio);
    }
}
