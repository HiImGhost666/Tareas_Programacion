/*
Ejercicio 3: Búsqueda de palabras en un texto
Escribe un programa en Java que permita buscar una palabra en un texto. El programa debe realizar las siguientes acciones:

Pedir al usuario que introduzca un texto.

Pedir al usuario que introduzca una palabra a buscar.

Mostrar cuántas veces aparece la palabra en el texto.

Mostrar las posiciones (índices) en las que aparece la palabra en el texto.

El programa debe ser insensible a mayúsculas y minúsculas.

Ejemplo de salida:

Introduce un texto: Este es un texto de ejemplo. Este texto es para practicar.
Introduce una palabra a buscar: texto
La palabra "texto" aparece 2 veces.
Posiciones: [12, 28]

 */
package Tema6.RepasarExamen;

import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un texto: ");
        String texto = sc.nextLine();

        System.out.println("Introduce una palabra a buscar: ");
        String palabra = sc.nextLine();


        int contador = buscarPalabra(texto, palabra);
        System.out.println("La palabra \"" + palabra + "\" aparece " + contador + " veces.");


        int[] posiciones = new int[contador];
        int indice = 0;
        for (int i = 0; i < texto.length() - palabra.length(); i++) {
            if (texto.substring(i, i + palabra.length()).equalsIgnoreCase(palabra)) {
                posiciones[indice] = i;
                indice++;
            }
        }

        System.out.print("Posiciones: ");
        for (int i = 0; i < contador; i++) {
            System.out.print(posiciones[i] + " ");
        }
        System.out.println();

    }

    static int buscarPalabra(String texto, String palabra) {
        int contador = 0;
        for (int i = 0; i < texto.length() - palabra.length(); i++) {
            if (texto.substring(i, i + palabra.length()).equalsIgnoreCase(palabra)) {
                contador++;
            }
        }
        return contador;
    }
}
