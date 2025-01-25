/*
5. Contar la frecuencia de elementos en un array
Dado un array de números enteros (positivos o negativos), escribe un programa que calcule cuántas veces aparece cada número en el array. El resultado debe imprimirse en formato número: frecuencia. Por ejemplo, para [1, 2, 2, 3, 1, 4], el programa debe imprimir:

makefile
Copy code
1: 2
2: 2
3: 1
4: 1
Restricciones:

No uses estructuras como HashMap o ArrayList. Resuelve el problema usando arrays y bucles únicamente.
La función debe ser capaz de manejar arrays grandes sin problemas de rendimiento.
 */
package Tema5.ChatGPT_50Ejercicios;

public class Actividad31 {
    public static void main(String[] args) {
        int[] num1 = {1,2,2,3,1,4,1};

        for(int i = 0; i < num1.length; i++) {
            int count = 1;
            for(int j = i+1; j < num1.length; j++) {
                if(num1[i] == num1[j]) {
                    count++;
                    num1[j] = 0;
                }
            }
            if(num1[i] != 0) {
                System.out.println(num1[i] + ":" + count);
            }
        }

    }
}
