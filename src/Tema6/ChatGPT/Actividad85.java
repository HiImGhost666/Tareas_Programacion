/*
Entrada	Salida Esperada
+34 612345678	"Número de teléfono válido: +34 612345678"
612-34-5678	"Número de teléfono válido: 612345678"
0034 612345678	"Error: El número debe comenzar con '+34' o tener exactamente 9 dígitos."
61234a567	"Error: El número contiene caracteres no permitidos."
 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        while(true) {
            System.out.println("Introduce un numero de teléfono.");
            String telefono = sc.nextLine();

            if (telefono.startsWith("+34") && telefono.length() == 13) {
                System.out.println("Número de teléfono válido: " + telefono);
                break;
            } else if (telefono.length() == 9) {
                System.out.println("Número de teléfono valido: " + telefono);
                break;
            } else {
                System.out.println("Error: El número debe comenzar con '+34' o tener exactamente 9 dígitos.");
            }
        }

    }
}
