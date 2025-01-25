/*
    Reemplazo condicional: Cambia todas las letras de una cadena por su siguiente letra en el alfabeto.

 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();


        String resultado = "";
        for(int i = 0; i < cadena.length(); i++){
            if(cadena.charAt(i) == 'z'){
                resultado += 'a';
            } else {
                resultado += (char) (cadena.charAt(i) + 1);
            }
        }

        System.out.println("Cadena con reemplazos: " + resultado);

    }
}
