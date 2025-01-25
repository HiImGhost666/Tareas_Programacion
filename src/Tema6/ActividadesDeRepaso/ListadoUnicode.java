package Tareas_Programacion.src.Tema6.ActividadesDeRepaso;

import java.sql.SQLOutput;

public class ListadoUnicode {
    public static void main(String[] args) {

        System.out.printf("%-10s %-10s %-10s%n", "Caracter", "Codepoint", "Hexadecimal");

        for(int codePoint = 0x00F1; codePoint <= 0x00F2; codePoint++) {
         String xxxx = Integer.toHexString(codePoint);
         System.out.println("\\u" + xxxx + ": " + (char)codePoint);
        }
        for (char c = '\u0020'; c <= '\u00FF'; c++) {
            System.out.println("Carácter: " + c + ", Codepoint: " + (int) c + ", Hexadecimal: " + Integer.toHexString(c));
        }
    }
}

