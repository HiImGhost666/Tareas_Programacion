/*
Ordenamiento Personalizado de Palabras
Escribe un programa que ordene una lista de palabras según la cantidad de letras en cada palabra, de mayor a menor.

📌 Condiciones:

Se pedirá al usuario una lista de palabras separadas por comas.
El programa ordenará las palabras según su longitud, de mayor a menor.
Si dos palabras tienen la misma longitud, se ordenarán alfabéticamente.

✍ Ejemplo de Entradas y Salidas:

Entrada	                        Salida Esperada
"gato,elefante,perro,ratón"	    "elefante, ratón, perro, gato"
"java,c++,python,ruby"	        "python, java, ruby, c++"
 */
package Tema6.ChatGPT;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una lista de palabras separadas por comas.");
        String[] palabras = sc.nextLine().split(",");


        for(int i = 0; i < palabras.length; i++){
            palabras[i] = palabras[i].trim();
        }

        for(int i = 0; i < palabras.length; i++){
            for(int j = i + 1; j < palabras.length; j++){
                if(palabras[i].length() < palabras[j].length()){
                    String temp = palabras[i];
                    palabras[i] = palabras[j];
                    palabras[j] = temp;
                }
            }
        }

        System.out.println(String.join(", ", palabras));


    }
}
