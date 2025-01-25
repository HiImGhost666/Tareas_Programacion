package Tareas_Programacion.src.Tema6.ActividadesDeRepaso;

import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al juego del ahorcado. Eres el jugador A, y tienes que teclear una palabra secreta sin que el jugador B (el ordenador) la vea.");
        System.out.println("Introduce una palabra secreta:");
        String palabraSecreta = sc.nextLine().toLowerCase();


        String palabra = "";
        for(int i = 0; i < palabraSecreta.length(); i++){
            palabra += "_";
        }


        System.out.println("Jugador B tiene 7 intentos. Adivina una letra:");
        String letrasAcertadas = "";
        int intentos = 7;


        while(intentos > 0 && !palabra.equals(palabraSecreta)){
            char letra = sc.nextLine().toLowerCase().charAt(0);
            if(letrasAcertadas.indexOf(letra) != -1){
                System.out.println("Ya has intendado la letra " + letra + ". Intenta otra letra.");
            } else if (palabraSecreta.indexOf(letra) != -1) {
                letrasAcertadas += letra;
                palabra = "";
                for (int i = 0; i < palabraSecreta.length(); i++) {
                    if (letrasAcertadas.indexOf(palabraSecreta.charAt(i)) != -1) {
                        palabra += palabraSecreta.charAt(i);
                    } else {
                        palabra += "_";
                    }
                }
                if (!palabra.equals(palabraSecreta)) {
                    System.out.println("Acertaste la letra " + letra + ". La palabra actual es: " + palabra);
                }
            } else {
                intentos--;
                System.out.println("No has acertado la letra " + letra + ". Te quedan " + intentos + " intentos. Intenta otra letra:");
            }
        }

        if (intentos > 0) {
            System.out.println("¡Felicidades! Has acertado todos los caracteres de la palabra secreta. La palabra era: " + palabraSecreta);
        } else {
            System.out.println("Lo siento, te has quedado sin intentos. La palabra secreta era: " + palabraSecreta);
        }

    }
}
