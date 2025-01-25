/*
4.Implementar un programa que pida por teclado un número decimal e indique si es un número casi-cero, que son aquellos, positivos o negativos,
que se acercan a  O  por  menos  de  1  unidad,  aunque  curiosamente  el  O  no  se  considera  un número casi-cero.

Ejemplos denúmeros casi-cero son el 0,3, el -0,99 o el 0,123; algunos números que no se consideran casi-ceros son: el 12,3, el 0 o el -1.
 */
package Tema2.Actividad_de_Repaso;
import java.util.Scanner;
public class actividad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número decimal: ");
        double num = sc.nextDouble();

        if(num >-1 && num <1 && num !=0){
            System.out.println("El número es casi-cero");
        } else{
            System.out.println("El número no es casi-cero");
        }
    }
}
