/*
8. Diseñar la función calculadora (), a la que se le pasan dos números reales (operandos) y qué operación se desea realizar con ellos.
Las operaciones disponibles son: sumar, restar, multiplicar o dividir.

Estas se especifican mediante un número: 1 para la suma, 2 para la resta, 3 para la multiplicación y 4 para la división.

La función devolverá el resultado de la operación mediante un número real.
 */
package Tema4.ActividadesDeRepaso;

public class Actividad8 {
    public static void main(String[] args) {
        calculadora(1,3,2);
    }

    static int calculadora(int opcion, int num1, int num2){

        switch (opcion){
            case 1:
                System.out.println("La suma de los dos numeros es: " + (num1 + num2));
                break;
            case 2:
                System.out.println("La resta de los dos numeros es: " + (num1-num2));
                break;
            case 3:
                System.out.println("La multiplicacion de los dos numeros es: " + (num1*num2));
                break;
            case 4:
                System.out.println("La division de los dos numeros es: " + (num1/num2));
                break;
            default:
                System.out.println("ERROR: Introduce una opcion valida.");
                break;
        }
        return opcion;
    }
}
