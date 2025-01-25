/*
    Mayúsculas o minúsculas: Dado un texto, indica si tiene más caracteres en mayúsculas o en minúsculas.
 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un texto: ");
        String texto = sc.nextLine();


        for(int i = 0; i < texto.length(); i++){
            int num = 0;

            if(Character.isUpperCase(texto.charAt(i))){
                num++;
            }else if(Character.isLowerCase(texto.charAt(i))){
                num--;
            }

            if(num > 0){
                System.out.println("El texto tiene mas mayusculas");
                break;
            }else if(num < 0){
                System.out.println("El texto tiene mas minusculas");
                break;
            }
        }
    }
}
