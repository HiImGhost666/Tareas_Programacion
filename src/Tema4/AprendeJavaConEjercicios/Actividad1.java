/*
Ejercicios 1-14
Crea una biblioteca de funciones matemáticas que contenga las siguientes funciones. Recuerda que puedes usar unas dentro de otras si es necesario.
1. esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario.
2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario.
3. siguientePrimo: Devuelve el menor primo que es mayoral número que se pasa como parámetro.
4. potencia: Dada una base y un exponente devuelve la potencia.
5. digitos: Cuenta el número de dígitos de un número entero.
6. voltea: Le da la vuelta a un número.
7. DigitoN: Devuelve el dígito que está en la posición n de un número entero. Se empieza contando por el 0 y de izquierda a derecha.
8. posicióndeDigito: Da la posición de la primera ocurrencia de un dígito dentro de un número entero. Si no se encuentra. devuelve -1.
9. quitaPorDetras: Le quita a un número n dígitos por detrás (per la derecha).
10.quitaPorDelante: Le quita a un número n dígitos por delante (per la izquierda).
11. pegaPorDetrás: Añade un dígito a un número por detrás.
12. pegaPorDelante: Añade un dígito a un número por delante.
13. trozoDeNumero: Toma como parámetros las posiciones inicial y final dentro de un número y devuelve el trozo correspondiente.
14. juntaNumeros: Pega dos números para formar uno.

 */
package Tema4.AprendeJavaConEjercicios;

import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- Menú de Opciones ---");
        System.out.println("1. esCapicua\t\t2. esPrimo\t\t\t3. siguientePrimo");
        System.out.println("4. potencia\t\t\t5. digitos\t\t\t6. voltea");
        System.out.println("7. DigitoN\t\t\t8. posicióndeDigito\t9. quitaPorDetras");
        System.out.println("10. quitaPorDelante\t11. pegaPorDetrás\t12. pegaPorDelante");
        System.out.println("13. trozoDeNumero\t14. juntaNumeros\t0. Salir");
        System.out.print("Seleccione una opción: ");

        int num = 0;
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Seleccionaste esCapicua");
                System.out.println("---------------------------- \n" + "Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario. \n" + "---------------------------- \n");

                System.out.println("Introduce un numero:");
                num = sc.nextInt();

                System.out.println(esCapicua(num));
                break;
            case 2:
                System.out.println("Seleccionaste esPrimo");
                System.out.println("---------------------------- \n" + "Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario. \n" + "---------------------------- \n");

                System.out.println("Introduce un numero:");
                num = sc.nextInt();

                System.out.println(esPrimo(num));
                // Llamar a la función esPrimo aquí
                break;
            case 3:
                System.out.println("Seleccionaste siguientePrimo");
                System.out.println("---------------------------- \n" + "Devuelve el menor primo que es mayor al número que se pasa como parámetro. \n" + "---------------------------- \n");

                System.out.println("Introduce un numero:");
                num = sc.nextInt();
                // Llamar a la función siguientePrimo aquí

                System.out.println("El siguiente primo a " + num + " es: " + siguientePrimo(num));
                break;
            case 4:
                System.out.println("Seleccionaste potencia");
                System.out.println("---------------------------- \n" + "Dada una base y un exponente devuelve la potencia. \n" + "---------------------------- \n");

                System.out.println("Introduce la base:");
                int base = sc.nextInt();
                System.out.println("Introduce el expontente");
                int exponente = sc.nextInt();
                // Llamar a la función potencia aquí

                System.out.println(potencia(base, exponente));
                break;
            case 5:
                System.out.println("Seleccionaste digitos");
                System.out.println("---------------------------- \n" + "Cuenta el número de dígitos de un número entero. \n" + "---------------------------- \n");

                System.out.println("Introduce un numero:");
                num = sc.nextInt();
                // Llamar a la función digitos aquí

                System.out.println("El numero " + num + " tiene " + digitos(num) + " digitos.");
                break;
            case 6:
                System.out.println("Seleccionaste voltea");

                System.out.println("---------------------------- \n" + "Le da la vuelta a un número.\n" + "---------------------------- \n");

                System.out.println("Introduce un numero:");
                num = sc.nextInt();
                // Llamar a la función voltea aquí

                System.out.println("El numero " + num + " volteado es: " + voltea(num) );
                break;
            case 7:
                System.out.println("Seleccionaste DigitoN");
                System.out.println("---------------------------- \n" + "Devuelve el dígito que está en la posición n de un número entero. Se empieza contando por el 0 y de izquierda a derecha.  \n" + "---------------------------- \n");

                System.out.println("Introduce un numero:");
                num = sc.nextInt();
                // Llamar a la función DigitoN aquí
                break;
            case 8:
                System.out.println("Seleccionaste posicióndeDigito");
                // Llamar a la función posicióndeDigito aquí
                break;
            case 9:
                System.out.println("Seleccionaste quitaPorDetras");
                // Llamar a la función quitaPorDetras aquí
                break;
            case 10:
                System.out.println("Seleccionaste quitaPorDelante");
                // Llamar a la función quitaPorDelante aquí
                break;
            case 11:
                System.out.println("Seleccionaste pegaPorDetrás");
                // Llamar a la función pegaPorDetrás aquí
                break;
            case 12:
                System.out.println("Seleccionaste pegaPorDelante");
                // Llamar a la función pegaPorDelante aquí
                break;
            case 13:
                System.out.println("Seleccionaste trozoDeNumero");
                // Llamar a la función trozoDeNumero aquí
                break;
            case 14:
                System.out.println("Seleccionaste juntaNumeros");
                // Llamar a la función juntaNumeros aquí
                break;
            case 0:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("ERROR: Opción no válida. Intente de nuevo.");
                break;
        }
        sc.close();
    }

    static boolean esCapicua(int num){
        if(num < 0){
            return false;
        }

        int invertido = voltea(num);
        return num == invertido;

        }

        static boolean esPrimo(int num){
            if(num <= 1){
                return false;
            }
            for(int i = 2; i < num; i++){
                if(num % i == 0) return false;
            }
            return true;
        }


        static int siguientePrimo(int num){
            int siguiente = num +1;

            while(true){
                if(esPrimo(siguiente)){
                    return siguiente;
                }
                siguiente++;
            }
        }

    static double potencia(double base, int exponente){
        if(exponente == 0){
            return 1;
        }
        return base * potencia(base, exponente -1);
    }

    static int digitos(int num){
        if(num < 0){
            num = -num;
        }

        if(num == 0){
            return 1;
        }

        int contador = 0;
        while(num > 0){
            num /= 10;
            contador++;
        }

        return contador;
    }

    static int voltea(int num){
        int invertido = 0;
        while(num > 0){
            int digito = num % 10;
            invertido = invertido * 10 + digito;
            num /= 10;
         }
        return invertido;
        }
    }



