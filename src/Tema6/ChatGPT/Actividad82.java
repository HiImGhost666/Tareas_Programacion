/*
Ejercicio 1 (3.5 Puntos)
Escribe un programa en Java que valide una dirección de correo electrónico introducida por el usuario.

Requisitos:
a) El programa pedirá al usuario que introduzca una dirección de correo electrónico.

b) Se verificará que la dirección de correo sigue el siguiente formato:

Contiene exactamente un símbolo @.
Tiene al menos un punto (.) después del @.
La parte antes del @ solo puede contener letras, números, puntos (.) y guiones bajos (_).
La parte después del @ debe tener al menos un dominio válido (por ejemplo, gmail.com, hotmail.com, outlook.es, etc.).
c) Si el formato es incorrecto, el programa deberá mostrar el error específico y volver a pedir la dirección de correo. Los errores posibles pueden ser:

"Error: La dirección de correo no contiene '@' o hay más de uno."
"Error: No se ha encontrado un dominio válido después del '@'."
"Error: La parte antes del '@' contiene caracteres no permitidos."
d) Si la dirección es válida, el programa mostrará el mensaje:
"La dirección de correo 'usuario@dominio.com' es válida."



 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una dirección de correo: ");
        String correo = sc.nextLine();

        // Validar la dirección de correo
        if (validarCorreo(correo)) {
            System.out.println("La dirección de correo '" + correo + "' es válida.");
        } else {
            System.out.println("La dirección de correo no es válida.");
        }
    }

    public static boolean validarCorreo(String correo) {
        // Validar el formato del correo
        if (!correo.contains("@") || correo.split("@").length != 2) {
            return false;
        }

        // Validar el dominio del correo
        String dominio = correo.split("@")[1];
        if (!dominio.contains(".")) {
            return false;
        }

        // Validar la parte antes del @
        String parteAntesDelAt = correo.split("@")[0];
        if (!parteAntesDelAt.matches("^[a-zA-Z0-9._-]*$")) {
            return false;
        }

        return true;
    }
}
