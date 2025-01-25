/*
1. Cálculo de Números Primos con Función y Bucles
Escribe un programa en Java que imprima todos los números primos entre 1 y un número dado, n. Deberás hacerlo usando una función que verifique si un número es primo.

Pasos:

Crea una función boolean esPrimo(int num) que devuelva true si num es primo y false si no lo es. Para esto, usa un bucle que verifique la divisibilidad del número.
En el main, pide al usuario el número n y utiliza un bucle for para iterar desde 2 hasta n.
Para cada número en el bucle, llama a la función esPrimo y, si devuelve true, imprime el número en pantalla.
 */
package Tema4.ActividadesDeRepaso;

import java.util.Scanner;

public class Actividad13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un valor maximo:");
        int n = sc.nextInt();

        for(int i = 2; i <= n; i++){
            if(esPrimo(i)){
                System.out.println(i);
            }
        }

    }

    public static boolean esPrimo(int n){
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
