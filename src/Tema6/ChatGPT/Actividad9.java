/*
Escriba  un  metodo  que  imprima  la  frecuencia  de  aparición  de  los  caracteres
de  un  String.  Por  ejemplo,  “esto  es  una  cadena”  debería  imprimir:
_: 3
a: 3
c: 1
d: 1
e: 3
n: 2
o: 1
s: 2
t: 1
u: 1
 */
package Tareas_Programacion.src.Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String frase = sc.nextLine().toLowerCase();


        int[] frecuencias = new int[26];

        for(int i = 0; i < frase.length(); i++){
            char letra = frase.charAt(i);

            if(letra >= 'a' && letra <= 'z'){
                int indice = letra - 'a';
                frecuencias[indice]++;
            }
        }


        System.out.println("Frecuencia de letras:");
        for(int i = 0; i < frecuencias.length; i++){
            if(frecuencias[i] > 0){
                char letra = (char) ('a' + i);
                System.out.println(letra + ": " + frecuencias[i]);
            }
        }


    }
}
