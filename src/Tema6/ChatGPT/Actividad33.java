/*
   Comparar cadenas: Pide al usuario dos cadenas y muestra cuál es mayor alfabéticamente.
 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la primera cadena:");
        String cadena1 = sc.nextLine();

        System.out.println("Introduce la segunda cadena:");
        String cadena2 = sc.nextLine();


        for(int i = 0; i < cadena1.length(); i++){
            if(cadena1.charAt(i) < cadena2.charAt(i)){
                System.out.println("La primera cadena es mayor alfabeticamente");
                break;
            }else if(cadena1.charAt(i) > cadena2.charAt(i)){
                System.out.println("La segunda cadena es mayor alfabeticamente");
                break;
            } else if(i == cadena1.length() - 1){
                System.out.println("Las cadenas son iguales");
            }

        }
    }
}
