/*
    Contraseña fuerte: Escribe un programa que determine si una cadena cumple con los criterios de una contraseña fuerte
    (longitud >= 8, al menos un número, una mayúscula y un símbolo).

 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una contraseña:");
        String contraseña = sc.nextLine();

        boolean esFuerte = true;

        if(contraseña.length() < 8) {
            esFuerte = false;
            System.out.println("- Mínimo 8 caracteres");
        } else {
            boolean tieneNumero = false;
            boolean tieneMayuscula = false;
            boolean tieneSimbolo = false;

            for (char c : contraseña.toCharArray()) {
                if (Character.isDigit(c)) {
                    tieneNumero = true;
                } else if (Character.isUpperCase(c)) {
                    tieneMayuscula = true;
                } else if (!Character.isLetterOrDigit(c)) {
                    tieneSimbolo = true;
                }
            }

            if (!tieneNumero) {
                esFuerte = false;
                System.out.println("- Al menos un número");
            }

            if (!tieneMayuscula) {
                esFuerte = false;
                System.out.println("- Al menos una mayúscula");
            }

            if (!tieneSimbolo) {
                esFuerte = false;
                System.out.println("- Al menos un símbolo");
            }
        }

        if (esFuerte) {
            System.out.println("La contraseña es fuerte.");
        } else {
            System.out.println("La contraseña no es fuerte.");
        }
        }
    }

