/*
    Transformar números: Convierte un número entero en texto (Ej: 123 → "ciento veintitrés").

 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero:");
        int num = sc.nextInt();

        System.out.println(convertirATexto(num));

    }

    public static String convertirATexto(int num) {
        if(num == 0){
            return "cero";
        }

        String[] unidades = {"", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        String[] decenas = {"", "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
        String[] especiales = {"diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve"};
        String[] centenas = {"", "cien", "doscientos", "trescientos", "cuatrocientos", "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos"};

        String texto = "";

       if(num >= 100) {
           int centena = num / 100;
           texto += centenas[centena] + " ";
           num %= 100;
       }

       if(num >= 20){
           int decena = num / 10;
           texto += decenas[decena] + " y ";
           num %= 10;
       } else if(num >= 10) {
           texto += especiales[num - 10] + " ";
           num = 0;
       }

       if(num >= 0){
           texto += unidades[num] + " ";
       }

       return texto.trim();
    }
}
