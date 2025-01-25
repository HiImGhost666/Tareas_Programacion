/*
Ejercicio 14: La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, se requiere determinar cuanto recibirá un productor por la uva que entrega en un embarque considerando lo siguiente:
* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si es de tamaño 2.
* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2.
 */
package Tema2.Actividades_ChatGPT;

import java.util.Scanner;

public class Actividad20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el tipo de uva (A o B): ");
        char tipo = sc.next().charAt(0);

        System.out.println("Introduce el tamaño de la uva (1 o 2): ");
        int tamano = sc.nextInt();

        if(tipo == 'A' && tamano == 1) {
            System.out.println("El precio de la uva es de 20 centimos");
        } else if(tipo == 'A' && tamano == 2) {
            System.out.println("El precio de la uva es de 30 centimos");
        } else if(tipo == 'B' && tamano == 1) {
            System.out.println("El precio de la uva es de 30 centimos");
        } else if(tipo == 'B' && tamano == 2) {
            System.out.println("El precio de la uva es de 50 centimos");
        } else {
            System.out.println("Tipo o tamano incorrecto");
        }
    }
}

