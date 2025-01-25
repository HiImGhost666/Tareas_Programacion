/*
Introducir por teclado dos frases e indicar cuál de ellas es la más corta, es decir, la que contiene menos caracteres.
 */
package Tareas_Programacion.src.Tema6.ActividadesDeRepaso;

import java.util.Scanner;

public class Frase_más_corta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String frase1 = sc.nextLine();

        System.out.println("Introduce otra frase:");
        String frase2 = sc.nextLine();


        if(frase1.length() > frase2.length()){
            System.out.println("frase1  '" + frase1 + "' es mas larga que frase2");
        } else if(frase2.length() > frase1.length()){
            System.out.println("frase2 '" + frase2 + "' es mas larga que frase1");
        } else{
            System.out.println("Tienen la misma longitud");
        }
    }
}
