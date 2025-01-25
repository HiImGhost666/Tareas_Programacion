/*
9.Escribir  una  aplicación  que  indique  cuántas  cifras  tiene  un  número  entero introducido por teclado, que estará comprendido entre 0 y 99999.
 */
package Tema2.Actividad_de_Repaso;
import java.util.Scanner;
public class actividad9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero entre 0 y 99999");
        int num = sc.nextInt();

        if(num >0 && num < 10){
            System.out.println("El numero tiene una cifra");
        }else if(num >10 && num < 100){
            System.out.println("El numero tiene dos cifras");
        } else if(num >100 && num < 1000){
            System.out.println("El numero tiene tres cifras");
        } else if(num >1000 && num < 10000){
            System.out.println("El numero tiene cuatro cifras");
        } else if (num >10000 && num < 100000){
            System.out.println("El numero tiene cinco cifras");
        } else{
            System.out.println("Pon un numero entre 0 y 99999");
        }
    }
}
