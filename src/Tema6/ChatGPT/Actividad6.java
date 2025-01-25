/*
Escriba*un métodoque*dado*un*array*de*chars*inicializado
(Ej*char*cadena[]*=*“Hola*Mundo”;),*recorra*el*array*imprimiendo*cada*
carácter*en*una*línea*distinta
 */
package Tareas_Programacion.src.Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        char[] cadena = sc.nextLine().toCharArray();
        imprimirLineas(cadena);
    }

    static void imprimirLineas(char[] cadena){
        for(int i = 0; i < cadena.length; i++){
            System.out.println(cadena[i]);
        }
    }
}
