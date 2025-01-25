package Tareas_Programacion.src.Tema6.ActividadesDeRepaso;

import java.util.Scanner;

public class ComprobadorContraseña {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean esValida = false;

        do{
            System.out.println("Introduce una contraseña:");
            String contraseña = sc.nextLine();
            esValida = validarContrasena(contraseña);
        }while (!esValida);

    }

    public static boolean validarContrasena(String contraseña) {

        if(contraseña.length() < 8){
            System.out.println("- Mínimo 8 caracteres");
            return false;
        }
        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneNumero = false;
        boolean tieneEspecial = false;


        for (char c : contraseña.toCharArray()) {

            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            } else if (Character.isLowerCase(c)) {
                tieneMinuscula = true;
            } else if (Character.isDigit(c)) {
                tieneNumero = true;
            } else if (!Character.isLetterOrDigit(c)) {
                tieneEspecial = true;
            }
        }

        // Contraseña válida
        if (tieneMayuscula && tieneMinuscula && tieneNumero && tieneEspecial) {
            System.out.println("La contraseña es válida.");
            return true;
        } else {
            // Contraseña no válida
            System.out.println("La contraseña no cumple con los requisitos:");
            if (!tieneMayuscula) {
                System.out.println("- Falta al menos una mayúscula.");
            }
            if (!tieneMinuscula) {
                System.out.println("- Falta al menos una minúscula.");
            }
            if (!tieneNumero) {
                System.out.println("- Falta al menos un número.");
            }
            if (!tieneEspecial) {
                System.out.println("- Falta al menos un carácter especial.");
            }
            return false;
        }

    }
}