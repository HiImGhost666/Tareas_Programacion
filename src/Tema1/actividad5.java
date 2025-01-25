/*
5.El tipo short permite almacenar valores comprendidos entre-32768 y 32767.

Escribir  un  programa  que  compruebe  que  el  rango  de  valores  de  un  tipo  se comporta  de
forma  cíclica,  es  decir,  el  valor  siguiente  al  máximo  es  el  valor mínimo
 */
package Tema1;
import java.util.Scanner;
public class actividad5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        short num = sc.nextShort();

        num = 32767;
        System.out.println("Valor máximo para el tipo short: " + num);
        num++;
        System.out.println("Valor mínimo para el tipo short: " + num);

    }
}
