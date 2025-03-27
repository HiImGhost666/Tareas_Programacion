package Tema9;

import java.util.Scanner;

public class ScannerExepciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce los datos: (Nombre edad estatura).");

        String texto = sc.nextLine();

        String[] datos = texto.split(" ");

        try{
            String nombre = datos[0];
            int edad = Integer.parseInt(datos[1]);
            double estatura = Double.parseDouble(datos[2]);

            System.out.println("Nombre: " + nombre + " Edad: " + edad + " Estatura: " + estatura);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Asegúrate de introducir los datos correctamente (ejemplo: Juan 25 1.75)");

        }


    }
}
