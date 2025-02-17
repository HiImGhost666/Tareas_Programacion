/*
Escribe un programa que encuentre cuantas palabras de una cadena acaban en una letra
determinada. Construir un método que cuente cuantas palabras acaban en una letra determinada
letraFinal(String texto, char letra) y devuelva al programa principal cuantas
veces se repite esa letra.
 */
package Tema6.ExamenesAñoPasado;

public class Actividad3 {
    public static void main(String[] args) {
        String texto = "Hola mundo, estas bien? Todo correcto.";
        char letra = 'o';
        int cantidad = letraFinal(texto, letra);
        System.out.println("La letra '" + letra + "' aparece al final de " + cantidad + " palabras.");
    }

    // Método para contar cuántas palabras terminan con la letra especificada
    public static int letraFinal(String texto, char letra) {
        int contador = 0;
        String[] palabras = texto.split(" ");

        for (String palabra : palabras) {
            if (palabra.length() > 0 && palabra.charAt(palabra.length() - 1) == letra) {
                contador++;
            }
        }

        return contador;
    }
    }

