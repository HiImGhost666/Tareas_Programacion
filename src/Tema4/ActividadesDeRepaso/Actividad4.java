/*
4. Diseñar una función que recibe como parámetros dos números
enteros y devulve el máximo de ambos
 */
package Tema4.ActividadesDeRepaso;

public class Actividad4 {
    public static void main(String[] args) {
        maximo(45,10);
    }

    static int maximo(int a, int b){
        if(a > b){
            System.out.println(a + " es mayor que " + b);
        } else{
            System.out.println(b + " es mayor que " + a);
        }
        return a;
    }
}
