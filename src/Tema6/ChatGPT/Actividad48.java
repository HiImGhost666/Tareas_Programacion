/*
    Dividir cadenas: Divide una cadena en fragmentos de tamaño n e imprímelos.

 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();

        System.out.println("Introduce el tamaño de los fragmentos: ");
        int tamanoFragmento = sc.nextInt();

       String fragmento = "";

       for(int i = 0; i < cadena.length(); i++){
           fragmento += cadena.charAt(i);

           if((i+1) % tamanoFragmento == 0 || i == cadena.length() - 1){
               System.out.println(fragmento);
               fragmento = "";
           }
       }



    }
}
