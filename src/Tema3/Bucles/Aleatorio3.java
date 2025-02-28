/*
Ejercicio 3
Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.

 */
package Tema3.Bucles;

import java.util.Scanner;

public class Aleatorio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palos = "Oros, Espadas, Copas, Bastos";
        String cartas = "2, 3, 4, 5, 6, 7, sota, caballo, rey, as";

        int paloAleatorio = (int) (Math.random() * 4) + 1;
        String paloSeleccionado = "";
        int contador = 0;

        for(int i = 0; i < palos.length(); i++) {
            if(palos.charAt(i) == ',') {
                contador++;
            }
            if(contador == paloAleatorio - 1 && palos.charAt(i) != ',') {
                paloSeleccionado += palos.charAt(i);
            } else if(contador == paloAleatorio) {
                break;
            }
        }


        int cartaAleatoria = (int) (Math.random() * 10) + 1;
        String cartaSeleccionada = "";
        contador = 0;
        for(int i = 0; i < cartas.length(); i++) {
            if(cartas.charAt(i) == ',') {
                contador++;
            }
            if(contador == cartaAleatoria - 1 && cartas.charAt(i) != ',') {
                cartaSeleccionada += cartas.charAt(i);
            } else if(contador == cartaAleatoria) {
                break;
            }
        }

        String carta = paloSeleccionado.trim() + " " + cartaSeleccionada.trim();
        System.out.println("La carta generada es: " + carta);



    }
}
