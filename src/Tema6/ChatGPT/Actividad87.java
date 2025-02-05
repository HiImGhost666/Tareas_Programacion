/*
Conversor de Texto a Código Morse
Escribe un programa en Java que convierta un mensaje de texto a código Morse y viceversa.

📌 Condiciones:

El usuario podrá elegir:

Convertir un mensaje de texto a código Morse.
Convertir código Morse a texto.

El programa usará la siguiente equivalencia:

A → .-    B → -...  C → -.-.  D → -..
E → .     F → ..-.  G → --.   H → ....
I → ..    J → .---  K → -.-   L → .-..
M → --    N → -.    O → ---   P → .--.
Q → --.-  R → .-.   S → ...   T → -
U → ..-   V → ...-  W → .--   X → -..-
Y → -.--  Z → --..
✍ Ejemplo de Entradas y Salidas:

Entrada	Modo	Salida Esperada
"Hola"	Texto → Morse	".... --- .-.. .-"
"... --- ..."	Morse → Texto	"SOS"
 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("1. Texto a Morse");
            System.out.println("2. Morse a Texto");
            System.out.println("3. Salir");
            System.out.print("Elige una opcion: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el texto: ");
                    String texto = sc.nextLine();

                    System.out.println("El texto en Morse es: " + textoMorse(texto));
                    break;

                case 2:
                    System.out.println("Introduce el texto en Morse: ");
                    String morse = sc.nextLine();

                    System.out.println("El texto es: " + morseTexto(morse));
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }

        }
    }

    public static String textoMorse(String texto) {
        String morse = "";

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            switch (letra) {
                case 'A':
                    morse += ".- ";
                    break;
                case 'B':
                    morse += "-... ";
                    break;
                case 'C':
                    morse += "-.-. ";
                    break;
                case 'D':
                    morse += "-.. ";
                    break;
                case 'E':
                    morse += ". ";
                    break;
                case 'F':
                    morse += "..-. ";
                    break;
                case 'G':
                    morse += "--. ";
                    break;
                case 'H':
                    morse += ".... ";
                    break;
                case 'I':
                    morse += ".. ";
                    break;
                case 'J':
                    morse += ".--- ";
                    break;
                case 'K':
                    morse += "-.- ";
                    break;
                case 'L':
                    morse += ".-.. ";
                    break;
                case 'M':
                    morse += "-- ";
                    break;
                case 'N':
                    morse += "- ";
                    break;
                case 'O':
                    morse += "--- ";
                    break;
                case 'P':
                    morse += ".--. ";
                    break;
                case 'Q':
                    morse += "--.- ";
                    break;
                case 'R':
                    morse += ".-. ";
                    break;
                case 'S':
                    morse += "... ";
                    break;
                case 'T':
                    morse += "- ";
                    break;
                case 'U':
                    morse += "..- ";
                    break;
                case 'V':
                    morse += "...- ";
                    break;
                case 'W':
                    morse += ".-- ";
                    break;
                case 'X':
                    morse += "-..- ";
                    break;
                case 'Y':
                    morse += "-.-- ";
                    break;
                case 'Z':
                    morse += "--.. ";
                    break;
                default:
                    morse += " ";
            }
        }

        return morse;
    }

    public static String morseTexto(String morse) {
        String texto = "";

        String[] palabras = morse.split("   ");

        for (String palabra : palabras) {
            String[] letras = palabra.split(" ");

            for (String letra : letras) {
                switch (letra) {
                    case ".-":
                        texto += "A";
                        break;
                    case "-...":
                        texto += "B";
                        break;
                    case "-.-.":
                        texto += "C";
                        break;
                    case "-..":
                        texto += "D";
                        break;
                    case ".":
                        texto += "E";
                        break;
                    case "..-.":
                        texto += "F";
                        break;
                    case "--.":
                        texto += "G";
                        break;
                    case "....":
                        texto += "H";
                        break;
                    case "..":
                        texto += "I";
                        break;
                    case ".---":
                        texto += "J";
                        break;
                    case "-.-":
                        texto += "K";
                        break;
                    case ".-..":
                        texto += "L";
                        break;
                    case "--":
                        texto += "M";
                        break;
                    case "-":
                        texto += "N";
                        break;
                    case "---":
                        texto += "O";
                        break;
                    case ".--.":
                        texto += "P";
                        break;
                    case "--.-":
                        texto += "Q";
                        break;
                    case ".-.":
                        texto += "R";
                        break;
                    case "...":
                        texto += "S";
                        break;
                    case "- ":
                        texto += "T";
                        break;
                    case "..-":
                        texto += "U";
                        break;
                    case "...-":
                        texto += "V";
                        break;
                    case ".--":
                        texto += "W";
                        break;
                    case "-..-":
                        texto += "X";
                        break;
                    case "-.--":
                        texto += "Y";
                        break;
                    case "--..":
                        texto += "Z";
                        break;
                    default:
                        texto += " ";
                }
            }
            texto += " ";
        }

        return texto;
    }
}
