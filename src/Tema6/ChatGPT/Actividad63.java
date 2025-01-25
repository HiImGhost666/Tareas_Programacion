/*
    Intercambiar las letras mayúsculas por minúsculas y viceversa.

 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();

        for(int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z') {
                System.out.print((char) (frase.charAt(i) + 32));
            } else if(frase.charAt(i) >= 'a' && frase.charAt(i) <= 'z') {
                System.out.print((char) (frase.charAt(i) - 32));
            }
        }



    }
}
