package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Introduce un texto:");
        String texto = sc.nextLine();


        while(true){
            System.out.println("a. Contar cuantas palabras tiene el texto");
            System.out.println("b. Contar cuantas vocales tiene el texto");
            System.out.println("c. Mostrar la palabra mas larga");
            System.out.println("d. Decir si el texto contiene numeros y cuantos hay");
            System.out.println("e. Convertir el texto en Titulo. Cada palabra con la primera letra en mayuscula");
            System.out.println("f. Salir del programa");
            System.out.println("Elige una opcion:");
            char opcion = sc.next().charAt(0);


            switch(opcion){
                case 'a':{
                    int numPalabras = 0;
                    for(int i = 0; i < texto.length(); i++){
                        if(texto.charAt(i) == ' '){
                            numPalabras++;
                        }
                    }
                    System.out.println("El texto tiene " + numPalabras + " palabras");
                    break;
            }
                case 'b':{
                    int numVocales = 0;
                    for(int i = 0; i < texto.length(); i++){
                        if(texto.charAt(i) == 'a' || texto.charAt(i) == 'e' || texto.charAt(i) == 'i' || texto.charAt(i) == 'o' || texto.charAt(i) == 'u'){
                            numVocales++;
                        }
                    }
                    System.out.println("El texto tiene " + numVocales + " vocales");
                    break;
                }

                case 'c':{
                    String palabraLarga = "";
                    for(int i = 0; i < texto.length(); i++){
                        if(texto.charAt(i) == ' '){
                            if(palabraLarga.length() < i){
                                palabraLarga = texto.substring(i);
                            }
                        }
                    }
                    System.out.println("La palabra mas larga es: " + palabraLarga);
                    break;
                }

                case 'd':{
                    int numNumeros = 0;
                    for(int i = 0; i < texto.length(); i++){
                        if(texto.charAt(i) >= '0' && texto.charAt(i) <= '9'){
                            numNumeros++;
                        }
                    }
                    System.out.println("El texto contiene " + numNumeros + " numeros");
                    break;
                }

                case 'e':{
                    String titulo = "";
                    for(int i = 0; i < texto.length(); i++){
                        if(texto.charAt(i) == ' '){
                            titulo += " ";
                        }else{
                            titulo += Character.toUpperCase(texto.charAt(i));
                        }
                    }
                    System.out.println("El texto en titulo es: " + titulo);
                    break;
                }

                case 'f':{
                    System.out.println("Hasta luego!");
                    return;
                }
            }

        }
    }
}
