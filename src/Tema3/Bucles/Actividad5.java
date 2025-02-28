/*
Ejercicio 5
Muestra los numeros del 320 al 160, contando de 20 en 20 hacia atras utilizando un bucle while.
 */
package Tema3.Bucles;

public class Actividad5 {
    public static void main(String[] args) {
        int num = 320;
        while(num >= 160){
            System.out.println(num);
            num -= 20;
        }
    }
}
