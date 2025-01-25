package Tareas_Programacion.src.Tema6.ActividadesDeRepaso;

import java.util.Scanner;

public class dni {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu DNI:");
        String dni = sc.nextLine();

        if (dni.length() != 9) {
            System.out.println("ERROR: El DNI debe tener 9 caracteres.");
            return;
        }

        // Comprobar los primeros 8 caracteres son dígitos
        for (int i = 0; i < 8; i++) {
            if (!Character.isDigit(dni.charAt(i))) {
                System.out.println("ERROR: Los primeros 8 caracteres deben ser números.");
                return;
            }
        }

        // Comprobar que el último carácter es una letra
        if (!Character.isLetter(dni.charAt(8))) {
            System.out.println("ERROR: El último carácter del DNI debe ser una letra.");
            return;
        }

        // Convertir los primeros 8 caracteres a número manualmente
        String numeroStr = dni.substring(0, 8);
        int numero = 0;

        for (int i = 0; i < numeroStr.length(); i++) {
            numero = numero * 10 + (numeroStr.charAt(i) - '0');  // Convierte cada carácter a su valor numérico
        }

        // Obtener la letra del DNI
        char letra = Character.toUpperCase(dni.charAt(8));

        // Letras válidas para la asignación según el resto del número % 23
        String letrasValidas = "TRWAGMYFPDXBNJZSQVHLCKE";

        // Comprobar si la letra del DNI es correcta
        if (letrasValidas.charAt(numero % 23) == letra) {
            System.out.println("El DNI es válido.");
        } else {
            System.out.println("ERROR: El DNI no es válido.");
        }
    }
}
