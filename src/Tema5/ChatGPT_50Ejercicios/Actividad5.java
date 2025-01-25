/*
Contar cuántos números pares y cuántos impares hay en un array.
 */
package Tema5.ChatGPT_50Ejercicios;

public class Actividad5 {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10};

        int pares = 0;
        int impares = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                pares++;
            }else{
                impares++;
            }
        }

        System.out.println("El array tiene " + pares + " elementos pares y " + impares + " elementos impares.");
    }
}
