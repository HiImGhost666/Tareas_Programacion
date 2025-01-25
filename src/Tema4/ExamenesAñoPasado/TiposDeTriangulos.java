package Tema4.ExamenesAñoPasado;

import java.util.Scanner;

public class TiposDeTriangulos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int num = 4;
// -----------------------------------------------------------------------
//        *
//        **
//        ***
//        ****

//        for (int i = 1; i <= num; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

//  ------- CON FUNCIONES ---------------------------------------------
//        int num = 5;  // Define la cantidad de filas del triángulo
//        imprimirTriangulo(num);
//    }
//
//    // Función principal para imprimir el triángulo
//    public static void imprimirTriangulo(int num) {
//        for (int i = 1; i <= num; i++) {
//            imprimirAsteriscos(i);  // Llama a la función que imprime los asteriscos
//            imprimirSaltoDeLinea(); // Llama a la función para el salto de línea
//        }
//    }
//
//    // Función que imprime la cantidad de asteriscos según la fila actual
//    public static void imprimirAsteriscos(int cantidad) {
//        for (int j = 1; j <= cantidad; j++) {
//            System.out.print("*");
//        }
//    }
//
//    // Función que imprime un salto de línea
//    public static void imprimirSaltoDeLinea() {
//        System.out.println();
// -----------------------------------------------------------------------
//           *
//          **
//         ***
//        ****

//        for (int i = 1; i <= num; i++) {
//            // Imprimir espacios en blanco
//            for (int j = 1; j <= num - i; j++) {
//                System.out.print(" ");
//            }
//            // Imprimir puntos
//            for (int k = 1; k <= i; k++) {
//                System.out.print("*");
//            }
//            // Salto de línea para la siguiente fila
//            System.out.println();
//        }


//  ------- CON FUNCIONES ---------------------------------------------
//        int num = 5;  // Define el número de filas del triángulo
//        imprimirTriangulo(num);
//    }
//
//    // Función principal para imprimir el triángulo completo
//    public static void imprimirTriangulo(int num) {
//        for (int i = 1; i <= num; i++) {
//            imprimirEspacios(num - i); // Llama a la función para imprimir espacios
//            imprimirAsteriscos(i);     // Llama a la función para imprimir asteriscos
//            imprimirSaltoDeLinea();    // Llama a la función para el salto de línea
//        }
//    }
//
//    // Función para imprimir una cantidad de espacios
//    public static void imprimirEspacios(int cantidad) {
//        for (int j = 1; j <= cantidad; j++) {
//            System.out.print(" ");
//        }
//    }
//
//    // Función para imprimir una cantidad de asteriscos
//    public static void imprimirAsteriscos(int cantidad) {
//        for (int k = 1; k <= cantidad; k++) {
//            System.out.print("*");
//        }
//    }
//
//    // Función para imprimir un salto de línea
//    public static void imprimirSaltoDeLinea() {
//        System.out.println();
//    }
// -----------------------------------------------------------------------
//        ****
//        ***
//        **
//        *

//        for(int i = num; i >= 1; i--){
//            for(int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//    }


//  ------- CON FUNCIONES ---------------------------------------------
//        int num = 5;  // Define el número de filas del triángulo
//        imprimirTrianguloInvertido(num);
//    }
//
//    // Función principal para imprimir el triángulo invertido
//    public static void imprimirTrianguloInvertido(int num) {
//        for (int i = num; i >= 1; i--) {
//            imprimirAsteriscos(i);     // Llama a la función para imprimir asteriscos
//            imprimirSaltoDeLinea();    // Llama a la función para el salto de línea
//        }
//    }
//
//    // Función para imprimir una cantidad de asteriscos
//    public static void imprimirAsteriscos(int cantidad) {
//        for (int j = 1; j <= cantidad; j++) {
//            System.out.print("*");
//        }
//    }
//
//    // Función para imprimir un salto de línea
//    public static void imprimirSaltoDeLinea() {
//        System.out.println();
//    }
// -----------------------------------------------------------------------
//        ****
//         ***
//          **
//           *
//        for (int i = num; i >= 1; i--) {
//            // Imprimir espacios en blanco
//            for (int j = 1; j <= num - i; j++) {
//                System.out.print(" ");
//            }
//            // Imprimir asteriscos
//            for (int k = 1; k <= i; k++) {
//                System.out.print("*");
//            }
//            // Salto de línea para la siguiente fila
//            System.out.println();
//        }

// -----------------------------------------------------------------------
//         *
//        ***
//       *****
//      *******

//        for(int i = 1; i <= num; i++){
//            for(int j = 1; j <= num-i; j++){
//                System.out.print(" ");
//            }
//            for(int j = 1; j <= 2 * i - 1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//  ------- CON FUNCIONES ---------------------------------------------
//
//        // Función para imprimir espacios
//        public static void imprimirEspacios(int cantidad) {
//            for (int i = 0; i < cantidad; i++) {
//                System.out.print(" ");
//            }
//        }
//
//        // Función para imprimir asteriscos
//        public static void imprimirAsteriscos(int cantidad) {
//            for (int i = 0; i < cantidad; i++) {
//                System.out.print("*");
//            }
//        }
//
//        // Función para imprimir la pirámide completa
//        public static void imprimirPiramide(int num) {
//            for (int i = 1; i <= num; i++) {
//                imprimirEspacios(num - i);           // Espacios a la izquierda
//                imprimirAsteriscos(2 * i - 1);       // Asteriscos en cada fila
//                System.out.println();                // Salto de línea
//            }
//        }
//
//        public static void main(String[] args) {
//            int num = 5; // Número de líneas en la pirámide
//            imprimirPiramide(num); // Llamada a la función principal
//        }
// -----------------------------------------------------------------------
//        *****
//        *   *
//        *   *
//        *   *
//        *****

//        num = 5;
//        for(int i = 1; i <=num; i++){
//            for(int j = 1; j <=num; j++){
//                if(i == 1 || i == num || j == 1 || j == num){
//                    System.out.print("*");
//                } else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
// -----------------------------------------------------------------------
//         *
//        ***
//       *****
//      *******
//     *********

//        num = 5;
//        for(int i = 1; i <= num; i++){
//            for(int j = i; j < num; j++){
//                System.out.print(" ");
//            }
//            for(int j = 1; j <= (2 * i - 1); j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

// -----------------------------------------------------------------------
//     *********
//      *******
//       *****
//        ***
//         *

//        num = 5;
//        for(int i = num; i >= 1; i--){
//            for(int j = i; j < num; j++){
//                System.out.print(" ");
//            }
//            for(int j = 1; j <= (2 * i - 1); j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

// -----------------------------------------------------------------------
//        *
//        **
//        ***
//        ****
//        *****
//        ****
//        ***
//        **
//        *

//        num = 5;
//        for(int i = 1; i <= num; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i = num - 1; i >= 1; i--){
//            for(int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

// -----------------------------------------------------------------------
//        *
//       * *
//      *   *
//     *     *
//    *********

//        num = 5;
//        for(int i = 1; i <=num; i++){
//            for(int j = i; j < num; j++){
//                System.out.print(" ");
//            }
//            for(int j = 1; j <= (2 * i - 1); j++){
//                if(j == 1 || j == (2 * i - 1) || i == num){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

// -----------------------------------------------------------------------
//    *   *
//     * *
//      *
//     * *
//    *   *

//        num = 5;
//        for(int i = 1; i <= num; i++){
//            for(int j = 1; j <= num; j++){
//                if(j == i || j == num - i + 1){
//                    System.out.print("*");
//                } else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

// -----------------------------------------------------------------------
//     ***   ***
//    ***** *****
//    ***********
//     *********
//      *******
//       *****
//        ***
//         *

//        num = 6;
//        for(int i = num / 2; i <= num; i += 2){
//            for(int j = 1; j < num - i; j+= 2){
//                System.out.print(" ");
//            }
//            for(int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            for(int j = 1; j <= num - i; j++){
//                System.out.print(" ");
//            }
//            for(int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for(int i = num; i >= 1; i--){
//            for(int j = i; j < num; j++){
//                System.out.print(" ");
//            }
//            for(int j = 1; j <= (i * 2) - 1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
// -----------------------------------------------------------------------

//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15

//        num = 5; // Número de filas
//        int contador = 1; // Comienza con el número 1
//
//        for (int i = 1; i <= num; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(contador + " ");
//                contador++;
//            }
//            System.out.println(); // Salto de línea después de cada fila
//        }

// -----------------------------------------------------------------------
//        1
//       121
//      12321
//     1234321

//        System.out.println("Introduce la altura del piramide:");
//        int alturaIntroducida = sc.nextInt();
//
//        int altura = 1;
//        int i = 0;
//        int espacios = alturaIntroducida - 1;
//
//        while (altura <= alturaIntroducida) {
//
//            // inserta espacios
//            for (i = 1; i <= espacios; i++) {
//                System.out.print(" ");
//            }
//            // pinta la línea de números
//            for (i = 1; i < altura; i++) {
//                System.out.print(i);
//            }
//            for (i = altura; i > 0; i--) {
//                System.out.print(i);
//            }
//
//            System.out.println();
//
//            altura++;
//            espacios--;
//        }

//        *
//       * *
//      *****
//     *     *
//    *       *
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 9; j++) {
//                if ((j == 6 - i) || (i == 3 && j >= 3 && j <= 7) || (j == 4 + i)) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }



    }
}