/*
Muestra los numeros multiplos de 5 de 0 a 100 utilizando un bucle do-while.
 */
package Tema3.Bucles;

public class Actividad3 {
    public static void main(String[] args) {
        int num = 0;
        do{
            if(num % 5 == 0){
                System.out.println(num);
            }
            num++;
        } while(num <= 100);
    }
}
