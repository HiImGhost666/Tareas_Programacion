/*
Ejercicio 22
Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 */
package Tema3.Bucles;

public class Actividad22 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean esPrimo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.println(i);
            }
        }

    }
}
