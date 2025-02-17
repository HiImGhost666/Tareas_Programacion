package Tema1.Tema1_VariablesYCondicionales;

import java.util.Scanner;

/*
12. Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.
 */
public class actividad12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero entre 0 y 9999:");
        int num = sc.nextInt();
        int dm, um, c, d, u;

        // unidad
        u = num % 10;
        num = num / 10;
        // decenas
        d = num % 10;
        num = num / 10;
        // centenas
        c = num % 10;
        num = num / 10;
        // unidades de millar
        um = num % 10;
        num = num / 10;
        // decenas de millar
        dm = num;

        num = 10000*u + 1000*d + 100*c + 10*um + dm;
        System.out.println (num);


    }
}
