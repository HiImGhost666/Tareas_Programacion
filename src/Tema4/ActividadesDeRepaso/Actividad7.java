/*
7. Escribir una función a la que se le pase un número entero y devuelva el número de divisores primos que tiene.
 */
package Tema4.ActividadesDeRepaso;

public class Actividad7 {
    public static void main(String[] args) {
        divisoresPrimos(9);
    }

    static int divisoresPrimos(int num){
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.println(i);
            }
        }
        return num;
    }
}
