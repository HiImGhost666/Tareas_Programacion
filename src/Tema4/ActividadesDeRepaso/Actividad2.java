/*
2. Escribir una función a la que se le pasen dos enteros y muestre todos
los números comprendidos entre ellos.
 */
package Tema4.ActividadesDeRepaso;

public class Actividad2 {
    public static void main(String[] args) {
        comprension(7, 2);
    }

    static int comprension(int a, int b) {
        if (a <= b) {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = a; i >= b; i--) {
                System.out.println(i);
            }
        }
        return a;
    }
}

