/*
    Verificar correo: Crea un programa que verifique si una cadena tiene el formato de un correo (contiene '@' y '.').
 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un correo: ");
        String correo = sc.nextLine();

        if (correo.contains("@") && correo.contains(".")) {
            System.out.println("El correo es válido.");
        } else {
            System.out.println("El correo no es válido.");
        }




    }
}
