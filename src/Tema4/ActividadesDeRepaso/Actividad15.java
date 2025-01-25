/*
3. Juego de Adivinanza con Intentos Ilimitados
Crea un juego en el que el programa genere un número aleatorio entre 1 y 100, y el usuario tenga que adivinarlo.
El programa debe permitir intentos ilimitados hasta que el usuario acierte, y debe dar pistas después de cada intento (si el número es mayor o menor).
Al final, muestra la cantidad de intentos realizados.

Pasos:

En el main, genera un número aleatorio entre 1 y 100 usando Math.random().
Usa un bucle while que permita al usuario seguir intentando hasta adivinar el número.
Cada vez que el usuario haga una suposición, indica si el número es mayor o menor que la suposición.

 */
package Tema4.ActividadesDeRepaso;

import java.util.Scanner;

public class Actividad15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int aleatorio = (int) (Math.random() * 100 + 1);

        System.out.println("Adivina el numero");
        adivina(aleatorio);

    }

    public static void adivina(int aleatorio){
        Scanner sc = new Scanner(System.in);
        int intentos = 0;
        int suposicion = 0;

        while(suposicion != aleatorio){
            suposicion = sc.nextInt();
            if(suposicion > aleatorio){
                System.out.println("El numero es menor");
            } else if(suposicion < aleatorio){
                System.out.println("El numero es mayor");
            }
            intentos++;
        }
        System.out.println("Has acertado en " + intentos + " intentos");
    }
}
