/*
5.10 Escribir la función:
int[] eliminarMayores(int t[], int valor)
que crea y devuelve una copia de la tabla t donde se han eliminado todos los elementos que son mayores que valor.
 */
package Tema5.ActividadesDeRepaso;

import java.util.Scanner;

public class Actividad10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] t = new int[10];
        for(int i = 0; i < t.length; i++){
            System.out.println("Introduce el valor " + (i + 1) + ":");
            t[i] = sc.nextInt();
        }

        System.out.println("Introduce el valor maximo:");
        int valor = sc.nextInt();

        int[] sinMayores = eliminarMayores(t, valor);

        System.out.println("Tabla original:");
        for(int i = 0; i < t.length; i++){
            System.out.print(t[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Tabla sin mayores del valor: " + valor);
        for(int i = 0; i < sinMayores.length; i++){
            System.out.print(sinMayores[i] + " ");
        }

    }
    public static int[] eliminarMayores(int[] t, int valor){

        int[] sinMayores = new int[valor];
        int indice = 0;

        for(int i = 0; i < t.length; i++){
            if(t[i] <= valor){
                sinMayores[indice] = t[i];
                indice++;
            }

        }

        return sinMayores;
    }
}
