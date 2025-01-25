package Tema4.ExamenesAñoPasado;

import java.util.Scanner;

public class Actividad3_A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("---Menu---");
            System.out.println("1. Iterativo");
            System.out.println("2. Recursivo");
            System.out.println("3. Iterativo Sobrecargado");
            System.out.println("4. Iterativo Sobrecargado Recursivo");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Iterativo");
                    System.out.print("Introduce un número: ");
                    int numIter = sc.nextInt();
                    System.out.println("Resultado: " + productoParIterativo(numIter));
                    break;
                case 2:
                    System.out.println("Recursivo");
                    System.out.print("Introduce un número: ");
                    long numRecurs = sc.nextInt();
                    System.out.println("Resultado: " + productorParRecursivo(numRecurs));
                    break;
                case 3:
                    System.out.println("Iterativo Sobrecargado");
                    System.out.print("Introduce un número: ");
                    int numIterS = sc.nextInt();
                    System.out.print("Introduce el segundo parámetro: ");
                    int segundoParametro = sc.nextInt();
                    productoParIterativo(numIterS, segundoParametro);
                    break;
                case 4:
                    System.out.println("Iterativo Sobrecargado Recursivo");
                    System.out.print("Introduce un número: ");
                    int numRecursS = sc.nextInt();
                    System.out.print("Introduce el segundo parámetro: ");
                    int segundoParametroRecurs = sc.nextInt();
                    productorParRecursivo(numRecursS, segundoParametroRecurs);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 5);
        sc.close();
    }

    // Función para calcular el producto iterativamente
    static int productoParIterativo(int num) {
        int producto = 1;
        for (int i = 1; i <= num; i++) {
            int par = 2 * i; // Generar el número par
            producto *= par; // Multiplicar
        }
        return producto;
    }

    // Función recursiva para calcular el producto de números pares
    static long productorParRecursivo(long num) {
        if (num == 0) {
            return 1;
        } else if (num % 2 == 0) {
            return num * productorParRecursivo(num - 1);
        } else {
            return productorParRecursivo(num - 1);
        }
    }

    // Función sobrecargada iterativa
    static void productoParIterativo(int num, int segundoParametro) {
        if (segundoParametro == 0) {
            System.out.println("El cero es un número par.");
            return;
        }

        int producto = 1;

        if (segundoParametro > 0) {
            for (int i = 1; i <= num; i++) {
                int par = 2 * i;
                producto *= par;
            }
            System.out.println("El producto de los " + num + " primeros números pares positivos es: " + producto);
        } else {
            for (int i = 1; i <= num; i++) {
                int parNegativo = -2 * i;
                producto *= parNegativo;
            }
            System.out.println("El producto de los " + num + " primeros números pares negativos es: " + producto);
        }
    }

    // Función recursiva sobrecargada para imprimir el resultado
    static void productorParRecursivo(int num, int segundoParametro) {
        if (num == 0) {
            System.out.println("El cero es un número par.");
            return;
        }

        long resultado = 1;
        if (segundoParametro > 0) {
            resultado = productoParRecursivoHelper(num, 2);
        } else {
            resultado = productoParRecursivoHelper(num, -2);
        }

        System.out.println("El producto de los " + num + " primeros números pares es: " + resultado);
    }

    // Función auxiliar recursiva para calcular el producto
    static long productoParRecursivoHelper(int num, int par) {
        if (num <= 0) {
            return 1;
        }
        return par * productoParRecursivoHelper(num - 1, par > 0 ? par + 2 : par - 2);
    }
}
