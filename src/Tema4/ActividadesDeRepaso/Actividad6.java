/*
6. Diseñar una función con el siguiente prototipo:
boolean esPrimo(int n)
que devolverá true si n es primo y false en caso contrario.
 */
package Tema4.ActividadesDeRepaso;

public class Actividad6 {
    public static void main(String[] args) {
        System.out.println(esPrimo(1));  // Cambia el número para probar
        System.out.println(esPrimo(2));
        System.out.println(esPrimo(3));
        System.out.println(esPrimo(4));
    }

    static boolean esPrimo(int n){
        if(n <= 1){
            return false;
        }

        for(int i = 2; i < n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }

}
