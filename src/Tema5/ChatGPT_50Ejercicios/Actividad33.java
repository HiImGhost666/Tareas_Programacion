/*
10. Determinar si un array es simétrico
Escribe un programa que reciba un array y determine si es simétrico. Un array es simétrico si se lee igual de izquierda a derecha que de derecha a izquierda (como un palíndromo). Por ejemplo, [1, 2, 3, 2, 1] es simétrico, pero [1, 2, 3] no lo es.

Restricciones:

Escribe una función llamada esSimetrico que devuelva un valor booleano.
Resuelve el problema sin usar un array adicional.
 */
package Tema5.ChatGPT_50Ejercicios;

public class Actividad33 {
    public static void main(String[] args) {
        int[] array = {1,2,3,2,1};

        for(int i = 0; i < array.length/2; i++) {
            if(array[i] != array[array.length - 1 - i]) {
                System.out.println("El array no es simetrico.");
                return;
            }
        }
        System.out.println("El array es simetrico.");
    }
}
