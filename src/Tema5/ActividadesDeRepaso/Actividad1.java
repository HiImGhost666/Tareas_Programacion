/*
5.1 Crear una tabla de longitud 10 que se inicializará con números aleatorios comprendidos entre 1 y 100.
Mostrar la suma de todos los números aleatorios que se guardan en la tabla.
 */
package Tema5.ActividadesDeRepaso;

public class Actividad1 {
    public static void main(String[] args) {

        int[] tabla = new int[10];
        int suma = 0;
        for(int i = 0; i < tabla.length; i++){
            tabla[i] = (int) (Math.random() * 100) + 1;

            System.out.print(tabla[i] + " ");
            suma += tabla[i];
        }

        System.out.println("La suma de todos los elementos de la tabla es: " + suma);
    }
}
