/*
5. Crear una función que, mediante un booleano, indique si el carácter
que se pasa como parámetro de entrada corresponde con una vocal.

 */
package Tema4.ActividadesDeRepaso;

public class Actividad5 {
    public static void main(String[] args) {
        System.out.println(esVocal('b'));
    }

    static boolean esVocal(char caracter){
        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
    }
}
