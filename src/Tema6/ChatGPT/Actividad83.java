/*
Ejercicio 2 (3.5 Puntos)
Implementa un programa en Java que realice la verificación de una matrícula de coche.

Requisitos:
a) Se pedirá al usuario que introduzca una matrícula en formato "NNNN-LLL", donde:

NNNN representa cuatro números (de 0000 a 9999).
LLL representa tres letras mayúsculas (sin vocales ni la letra Ñ).
b) El programa validará que la matrícula cumple las siguientes condiciones:

Contiene exactamente 4 números seguidos de un guion - y luego 3 letras.
Las letras no pueden incluir vocales (A, E, I, O, U) ni la Ñ.
Si la matrícula no cumple el formato, mostrará un mensaje de error específico según la razón del fallo.
c) Si la matrícula es válida, el programa mostrará el mensaje:
"La matrícula '1234-XYZ' es correcta."

Ejemplo de entradas y salidas esperadas:

Entrada	Salida esperada
1234-XYZ	Matrícula válida.
ABCD-XYZ	Error: Los primeros 4 caracteres deben ser números.
123-XYZ	Error: Faltan dígitos en la matrícula.
1234-AAA	Error: Las letras no pueden contener vocales.

 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String matricula;

        while (true) {
            System.out.print("Introduce una matrícula en formato NNNN-LLL: ");
            matricula = sc.nextLine().trim();

            if (esMatriculaValida(matricula)) {
                System.out.println("La matrícula '" + matricula + "' es válida.");
                break;
            } else {
                System.out.println("Error: La matrícula ingresada no es válida. Inténtalo de nuevo.");
            }
        }
        sc.close();

    }

    public static boolean esMatriculaValida(String matricula) {
        if (matricula.length() != 8 ||matricula.charAt(4) != '-') {
            return false;
        }

        for(int i = 0; i < 4; i++) {
            if (!Character.isDigit(matricula.charAt(i))) {
                return false;
            }
        }

        String permitidas = "BCDFGHJKLMNPQRSTVWXYZ";

        for(int i = 5; i < 8; i++) {
            if (!permitidas.contains(Character.toString(matricula.charAt(i)))) {
                return false;
            }
        }

        return true;
    }
}
