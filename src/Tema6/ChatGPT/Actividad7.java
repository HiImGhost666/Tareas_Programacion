/*
Programe un método que reciba dos Strings y devuelva verdadero si ambos
String contienen a los mismos caracteres ignorando si están en mayúsculas. 
Por ejemplo “casa” y “CaSa” deberá devolver verdadero mientras que “casa” y 
“caso” deberá devolver falso. Utilice el método Character.toLowerCase(c). 
para transformar a minúsculas el carácter c
  */
package Tareas_Programacion.src.Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introuduce la primera palabra:");
        String palabra1 = sc.nextLine();


        System.out.println("Introuduce la segunda palabra:");
        String palabra2 = sc.nextLine();


        System.out.println(sonIguales(palabra1,palabra2));
    }

    static boolean sonIguales(String palabra1, String palabra2){

        if(palabra1.equalsIgnoreCase(palabra2)){
            return true;
        } else{
            return false;
        }
    }
}
