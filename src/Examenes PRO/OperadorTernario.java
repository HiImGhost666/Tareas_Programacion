/*
Utiliza el operador ternario para discernir si un número positivo es múltiplo de 5 o no.
El programa deberá pedir el número a estudiar por teclado.
El programa comprobará que dicho número es mayor que cero y entonces aplicará el operador ternario para evaluar si
dicho número es múltiplo de 5o no. Si el número leído no es mayor que cero,se debe indicar que el número introducido no es válido y que está fuera de rango.
 */

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        //pedimos el número al usuario
        System.out.println("Por favor, introduce un número: ");
        num = sc.nextInt(); //leemos el número introducido por el usuario
        sc.close(); //cerramos el scanner

        //comprobamos si es múltiplo de 5 o no y mostramos el resultado por pantalla utilizando el operador ternario
        System.out.println((num > 0) ? ((num % 5 == 0) ? "El número introducido es múltiplo de 5" : "El número introducido no es múltiplo de 5") : "El número introducido no es mayor que cero");
    }
}
