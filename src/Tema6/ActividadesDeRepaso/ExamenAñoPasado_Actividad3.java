/*
Escribe un programa que encuentre cuantas palabras de una cadena acaban en una letra determinada.

Construir un metodo que cuente cuantas palabras acaban en una letra determinada letraFinal(String texto, char letra)
y devuelva al programa principal cuantas veces se repite esa letra
 */
package Tareas_Programacion.src.Tema6.ActividadesDeRepaso;

import java.util.Scanner;

public class ExamenAñoPasado_Actividad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String texto = sc.nextLine();

        System.out.println("Introduce una letra determinada al que acaba la palabra:");
        char letra = sc.nextLine().charAt(0);


        int count = letraFinal(texto, letra);
        System.out.println("Numero de palabras que terminan con la letra \"" + letra + "\" : " + count );
    }

    static int letraFinal(String texto, char letra){
        String[] palabras = texto.split(" ");
        int count = 0;

        for(String palabra : palabras){
            if(!palabra.isEmpty() && palabra.charAt(palabra.length() -1) == letra){
                count++;
            }
        }

        return count;
    }
}
