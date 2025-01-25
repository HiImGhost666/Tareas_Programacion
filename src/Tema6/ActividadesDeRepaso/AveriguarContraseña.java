/*
Diseñar el juego «Acierta la contraseña». La mecánica del juego es la siguiente:
el primer jugador introduce la contraseña; a continuación, el segundo jugador debe
teclear palabras hasta que la acierte.
Realizar dos versiones;
En la primera, se facilita el juego indicando si la palabra introducida es mayor o menor alfabéticamente que la
contraseña.
En la segunda, el programa mostrará la longitud de la contraseña y una cadena
con los caracteres acertados en sus lugares respectivos y asteriscos en los no acertados.
 */
package Tareas_Programacion.src.Tema6.ActividadesDeRepaso;

import java.util.Scanner;

public class AveriguarContraseña {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.println("Jugador 1, introduce la contraseña:");
        String contraseña = sc.nextLine();


        while(true){
            System.out.println("Jugador 2, adivina la contraseña");
            String intento = sc.nextLine();

            if(intento.equals(contraseña)){
                System.out.println("Felicidades, has adivinidado la contraseña");
                break;
            }else{
                String pista = "";
                for (int i = 0; i < contraseña.length(); i++) {
                    if (i < intento.length() && contraseña.charAt(i) == intento.charAt(i)) {
                        pista += intento.charAt(i);
                    } else {
                        pista += "*";
                    }
                }

                System.out.println("Pista: " + pista);
            }
        }
    }
}
