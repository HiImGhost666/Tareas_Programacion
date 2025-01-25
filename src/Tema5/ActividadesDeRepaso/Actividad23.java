/*
Ejercicio 1: Juego de Tic-Tac-Toe (Tres en Raya)
Crea un programa que:

Simule un juego de Tic-Tac-Toe entre dos jugadores.
Use una matriz
3
×
3
3×3 para representar el tablero.
Permita que los jugadores ingresen sus movimientos por coordenadas.
Verifique después de cada movimiento si hay un ganador o si el juego termina en empate.
Funciones que puedes implementar:

Mostrar el tablero.
Verificar si hay tres en línea en filas, columnas o diagonales.
Validar si una posición está disponible.
Indicar el resultado del juego (ganador o empate)
 */
package Tema5.ActividadesDeRepaso;

import java.util.Scanner;

public class Actividad23 {
    public static void main(String[] args) {
        char[][] tablero = new char[3][3];
        inicializarTablero(tablero);
        char jugadorActual = 'X';
        boolean hayGanador = false;

        while(true){
            mostrarTablero(tablero);
            System.out.println("Turno del jugador " + jugadorActual);

            int fila, columna;
            while(true){
                int[] movimiento = solicitarMovimiento();
                fila = movimiento[0];
                columna = movimiento[1];
                if(tablero[fila][columna] == ' '){
                    tablero[fila][columna] = jugadorActual;
                    break;
                } else{
                    System.out.println("Posicion ocupada, ingresa otra posicion");
                }
            }

            hayGanador = comprobarGanador(tablero, jugadorActual);
            if(hayGanador){
                mostrarTablero(tablero);
                System.out.println("Ganador: " + jugadorActual);
                break;
            }

            if(esEmpate(tablero)){
                mostrarTablero(tablero);
                System.out.println("Empate");
                break;
            }

            jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
        }

    }

    static void inicializarTablero(char[][] tablero) {
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                tablero[i][j] = ' ';
            }
        }
    }

    static void mostrarTablero(char[][] tablero) {
        System.out.println("    0   1   2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " "); // Etiqueta de la fila
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + tablero[i][j] + " "); // Espacios alrededor del valor
                if (j < 2) System.out.print("|"); // Separador vertical
            }
            System.out.println(); // Salto de línea al final de la fila
            if (i < 2) System.out.println("   ---+---+---"); // Separador horizontal
        }
    }

    static int[] solicitarMovimiento() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa fila (0-2): ");
        int fila = sc.nextInt();
        System.out.println("Ingresa columna (0-2): ");
        int columna = sc.nextInt();
        return new int[]{fila, columna};
    }

    static boolean comprobarGanador(char[][] tablero, char jugador) {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) return true;
            if (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador) return true;
        }

        // Comprobar diagonales
        if (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) return true;
        if (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador) return true;

        return false;
    }

    static boolean esEmpate(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') return false;
            }
        }
        return true;
    }



}
