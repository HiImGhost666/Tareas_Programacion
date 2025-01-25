/*
    Validar URL: Verifica si una cadena es una URL válida.

 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una URL: ");
        String url = sc.nextLine();

        if (esURLValida(url)) {
            System.out.println("La URL es válida.");
        } else {
            System.out.println("La URL no es válida.");
        }


    }

    public static boolean esURLValida(String url) {

        if(url.startsWith("http://") || url.startsWith("https://") || url.startsWith("www.") && url.endsWith(".com") || url.endsWith(".es") || url.endsWith(".org") || url.endsWith(".net") || url.endsWith(".co") || url.endsWith(".edu")) {
            return true;
        } else {
            return false;
        }
    }
}
