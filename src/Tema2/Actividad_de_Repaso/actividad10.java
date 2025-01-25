/*
10.Pedir una nota entera de 0 a 10 y mostrarla de la siguiente forma:
insuficiente (de 0 a 4), suficiente (5), bien (6), notable (7 y 8) y sobresaliente (9 y 10)
 */
package Tema2.Actividad_de_Repaso;

import java.util.Scanner;

public class actividad10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una nota entre 0 y 10");
        int nota = sc.nextInt();
        if (nota>=0 && nota<=4){
            System.out.println("Insuficiente");
        }
        else if (nota == 5){
            System.out.println("Suficiente");
        }
        else if (nota == 6){
            System.out.println("Bien");
        }
        else if (nota == 7 || nota == 8){
            System.out.println("Notable");
        }
        else if (nota == 9 || nota == 10){
            System.out.println("Sobresaliente");
        } else {
            System.out.println("Nota incorrecta");
        }
    }
}
