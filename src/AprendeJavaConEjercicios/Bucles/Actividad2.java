/*
Muestra los numeros multiplos de 5 de 0 a 100 utilizando un bucle while.

 */
package AprendeJavaConEjercicios.Bucles;

public class Actividad2 {
    public static void main(String[] args) {
        int num = 0;

        while(num <= 100){
            if(num % 5 == 0){
                System.out.println(num);
            }
            num++;
        }
    }
}
