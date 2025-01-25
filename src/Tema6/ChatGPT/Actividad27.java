/*
Ejercicio 4 (2 Puntos)
Crea un programa que realice un cifrado de tipo "sustitución por desplazamiento".

El programa debe recibir un texto y un número de desplazamiento.
Cada carácter debe ser desplazado en el alfabeto por el número indicado (por ejemplo, un desplazamiento de 3 convierte a en d).
Si el desplazamiento sobrepasa la z, debe volver al principio del alfabeto.
Sólo se cifrarán letras; otros caracteres permanecerán sin cambios.
Ejemplo:

Entrada:
Texto: "Hola Mundo!"
Desplazamiento: 3.
Salida: "Kród Pxqgr!".
 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String letras = "abcdefghijklmnñopqrstuvwxyz";

        System.out.println("Introduce un texto:");
        String texto = sc.nextLine();

        System.out.println("Cuanto lo quieres desplazar?");
        int num = sc.nextInt();

        System.out.println("Texto cifrado:");
        System.out.println(textoCifrado(texto,letras, num));
    }

    static String textoCifrado(String texto, String letras, int num){
        String textoCifrado = "";

        for(int i = 0; i < texto.length(); i++){
            char letra = texto.charAt(i);

            if(Character.isLetter(letra)){
                int pos = letras.indexOf(Character.toLowerCase(letra));

                int nuevapos = (pos + num) % letras.length();

                if(Character.isUpperCase(letra)){
                    textoCifrado += Character.toUpperCase(letras.charAt(nuevapos));
                }else{
                    textoCifrado += letras.charAt(nuevapos);
                }
            } else{
                textoCifrado += letra;
            }
        }

        return textoCifrado;
    }
}
