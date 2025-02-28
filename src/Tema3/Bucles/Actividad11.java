/*
Ejercicio 11
Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros números enteros a partir de uno que se introduce por teclado.

 */
package Tema3.Bucles;

public class Actividad11 {
    public static void main(String[] args) {
        int cuadrado = 0;
        int cubo = 0;

        for(int i = 1; i <= 5; i++){
            cuadrado = i * i;
            cubo = i * i * i;
            System.out.println(i + "\t" + cuadrado + "\t" + cubo);
        }


    }
}
