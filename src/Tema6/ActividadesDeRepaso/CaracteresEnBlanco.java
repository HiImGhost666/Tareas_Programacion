/*
Diseñar una función que pida al usuario que introduzca una frase por teclado e indique cuantos espacios en blanco tiene.
 */
package Tareas_Programacion.src.Tema6.ActividadesDeRepaso;

import java.util.Scanner;

public class CaracteresEnBlanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();

        int contadorEspacios = 0;
        for(int i = 0; i < frase.length(); i++){
            if(frase.charAt(i) == ' '){
                contadorEspacios++;
            }
        }

        System.out.println("Hay " + contadorEspacios + " espacios.");
    }
}
