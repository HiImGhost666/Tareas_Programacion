/*
Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América Central, América del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:

ZONA UBICACIÓN	COSTO/KILOGRAMO
1 América del Norte	24,00 euros
2 América Central	20, 00 euros
3 América del Sur	21,00 euros
4 Europa	10,00 euros
5 Asia	18,00 euros
Parte de su política implica que los paquetes con un peso superior a 5kg no son transportados, por cuestiones de logística y seguridad.
Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo de la entrega.
 */
package Tema2.Actividades_ChatGPT;

import java.util.Scanner;

public class Actividad22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el peso del paquete: ");
        double peso = sc.nextDouble();
        System.out.println("Introduce la zona de destino: ");
        System.out.println("1 América del Norte\t24,00 euros\n" +
                "2 América Central\t20, 00 euros\n" +
                "3 América del Sur\t21,00 euros\n" +
                "4 Europa\t10,00 euros\n" +
                "5 Asia\t18,00 euros");
        int zona = sc.nextInt();
        double cobro = 0;
        if (peso > 5) {
            System.out.println("El paquete no se puede transportar");
        } else {
            if (zona == 1) {
                cobro = peso * 24;
            } else if (zona == 2) {
                cobro = peso * 20;
            } else if (zona == 3) {
                cobro = peso * 21;
            } else if (zona == 4) {
                cobro = peso * 10;
            } else if (zona == 5) {
                cobro = peso * 18;
            }

            System.out.println("El paquete tiene un cobro de " + cobro + " euros");

        }
    }
}
