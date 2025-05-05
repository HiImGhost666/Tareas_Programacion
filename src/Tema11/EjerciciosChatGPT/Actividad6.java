package Tema11.EjerciciosChatGPT;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 Ejercicio 1: Análisis de un texto literario
Tienes un fichero llamado libro.txt, que contiene parte de una novela famosa.
El contenido es extenso, varias líneas de texto normal, por ejemplo:

Tu tarea es:

Leer todo el contenido del fichero.

Separar todas las palabras (sin contar signos de puntuación como , . ;).

Contar cuántas palabras tienen longitud:

Menor a 5 letras

Entre 5 y 8 letras (ambos incluidos)

Más de 8 letras

Mostrar el número total de palabras en cada grupo.

IMPORTANTE:

Limpia la puntuación antes de contar (replace(",", "").replace(".", "")...).

Considera las palabras insensibles a mayúsculas/minúsculas.
 */
public class Actividad6 {
    public static void main(String[] args) {
        // Código para la actividad
        ArrayList <String> palabras = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("libro.txt"))){
            String linea;
            while((linea = br.readLine()) != null){
                linea = linea.replace(",", " ").replace("."," ").toLowerCase();

               String[] partes = linea.split("\\s+");
               for(String palabra : partes){
                   if(!palabra.isEmpty()){
                       palabras.add(palabra);
                   }
               }
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        int menorque5 = 0;
        int entre5y8 = 0;
        int mayorque8 = 0;

        for(String palabra : palabras){
            int longitud = palabra.length();
            if(longitud < 5){
                menorque5++;
            } else if(longitud >= 5 && longitud <= 8){
                entre5y8++;
            } else if(longitud > 8){
                mayorque8++;
            }
        }

        System.out.println("Palabras con menos de 5 letras: " + menorque5);
        System.out.println("Palabras con entre 5 y 8 letras: " + entre5y8);
        System.out.println("Palabras con mas de 8 letras: " + mayorque8);
    }
}
