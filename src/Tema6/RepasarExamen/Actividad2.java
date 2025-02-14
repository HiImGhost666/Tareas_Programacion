/*
Ejercicio 2: Generación de contraseñas seguras
Escribe un programa en Java que genere una contraseña segura de 12 caracteres. La contraseña debe cumplir con los siguientes requisitos:

Debe contener al menos una letra mayúscula.

Debe contener al menos una letra minúscula.

Debe contener al menos un número.

Debe contener al menos un carácter especial (por ejemplo, !, @, #, $, etc.).

No puede contener espacios en blanco.

El programa debe generar y mostrar la contraseña segura. Además, debe permitir al usuario generar una nueva contraseña si no está satisfecho con la generada.

Ejemplo de salida:


Tu contraseña segura es: A1b@C2d#E3f$
¿Deseas generar otra contraseña? (s/n): s
Tu nueva contraseña segura es: XyZ!1qW@2eR#

 */
package Tema6.RepasarExamen;

import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        generarContrasena();


    }

    static void generarContrasena() {

        String contrasena = "";

        for(int i = 0; i < 12; i++) {
            int aleatorio = (int) (Math.random() * 4);

            switch (aleatorio) {
                case 0:
                    contrasena += (char) (Math.random() * 26 + 'A');
                    break;
                case 1:
                    contrasena += (char) (Math.random() * 26 + 'a');
                    break;
                case 2:
                    contrasena += (char) (Math.random() * 10 + '0');
                    break;
                case 3:
                    contrasena += (char) (Math.random() * 15 + '!');
                    break;
            }

        }
        System.out.println("Tu contrasena es: " + contrasena);

    }
}
