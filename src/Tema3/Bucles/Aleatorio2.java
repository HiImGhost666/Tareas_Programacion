/*
Ejercicio 2
Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa.
Esta baraja está dividida en cuatro palos: picas, corazones, diamantes y tréboles.
Cada palo está formado por 13 cartas, de las cuales 9 cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el 1).

Para convertir un número en una cadena de caracteres podemos Usar String.value0f(n).


 */
package Tema3.Bucles;

import java.util.Scanner;

public class Aleatorio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palos = "Picas, Corazones, Diamantes, Treboles";
        String cartas = "2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A";

        // Seleccionar un palo aleatorio
        int paloAleatorio = (int) (Math.random() * 4) + 1;
        String paloSeleccionado = "";
        int contador = 0;
        for (int i = 0; i < palos.length(); i++) {
            if (palos.charAt(i) == ',') {
                contador++;
            }
            if (contador == paloAleatorio - 1 && palos.charAt(i) != ',') {
                paloSeleccionado += palos.charAt(i);
            } else if (contador == paloAleatorio) {
                break;
            }
        }

        // Seleccionar una carta aleatoria
        int cartaAleatoria = (int) (Math.random() * 13) + 1;
        String cartaSeleccionada = "";
        contador = 0;
        for (int i = 0; i < cartas.length(); i++) {
            if (cartas.charAt(i) == ',') {
                contador++;
            }
            if (contador == cartaAleatoria - 1 && cartas.charAt(i) != ',') {
                cartaSeleccionada += cartas.charAt(i);
            } else if (contador == cartaAleatoria) {
                break;
            }
        }

        // Mostrar la carta generada
        String carta = paloSeleccionado.trim() + " " + cartaSeleccionada.trim();
        System.out.println("La carta generada es: " + carta);
    }
}
