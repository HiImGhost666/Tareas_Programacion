/*
Ejercicio 1
Muestra los numeros multiplos de 5 de 0 a 100 utilizando un bucle for.
 */
package AprendeJavaConEjercicios.Bucles;

public class Actividad1 {
    public static void main(String[] args) {

        for(int i = 0; i <= 100; i++){
            if(i % 5 == 0){
                System.out.println(i);
            }
        }
    }
}
