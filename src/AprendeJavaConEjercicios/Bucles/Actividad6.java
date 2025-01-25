/*
/*
Ejercicio 4
Muestra los numeros del 320 al 160, contando de 20 en 20 hacia atras utilizando un bucle do-while.
 */

package AprendeJavaConEjercicios.Bucles;

public class Actividad6 {
    public static void main(String[] args) {
        int num = 360;

        do{
            System.out.println(num);
            num -= 20;
        } while(num >= 160);
    }
}
