/*
  Reemplazar caracteres: Dado un texto, reemplaza todas las vocales por el carácter '*'.
 */
package Tareas_Programacion.src.Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] vocales = {'a', 'e', 'i', 'o', 'u'};

        System.out.println("Introduce un texto:");
        String texto = sc.nextLine().toLowerCase();

        char[] textoArray = texto.toCharArray();

        for(int i = 0; i < textoArray.length; i++){
            for(char vocal : vocales){
                if(textoArray[i] == vocal){
                    textoArray[i] = '*';
                }
            }
        }

        String textoModificado = new String(textoArray);

        System.out.println(textoModificado);
    }
}

