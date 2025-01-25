/*
Escribe un programa en JAVA que convierta un texto a UpperCamelCase (la primera letra
de cada una de las palabras es mayúscula), sin usar métodos de la clase String o Character
(debes hacerlo con bucles).

En el texto sólo poner Si hubiera caracteres distintos de las letras
del abecedario (mayúsculas o minúsculas) los ignoraría y no aparecerían en el texto de salida.

Por ejemplo, el siguiente texto: “Hola me llamo Juan”, produciría una salida:

Nota: Puedes usar length(), charAt(j), Split() y toCharArray() (aunque este
último no es necesario) Cualquier otro metodo de String o de Character bajaría
sustancialmente la nota del ejercicio.

Pista: crea un metodo para convertir cada palabra a CamelCAse:
static String toCamelCase(String texto)
 */
package Tareas_Programacion.src.Tema6.ActividadesDeRepaso;

import java.util.Scanner;

public class ExamenAñoPasado_Actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();

        System.out.println(toCamelCase(frase));

    }

    static String toCamelCase(String frase){

        String[] palabras = frase.split(" ");
        String resultado = "";

        for(String palabra : palabras){
            if(palabra.length() > 0){
                char primeraLetra = palabra.charAt(0);
                if(primeraLetra >= 'a' && primeraLetra <= 'z'){
                    primeraLetra = (char) (primeraLetra - 32);
                }
            String resto = "";
                for(int i = 1; i < palabra.length(); i++){
                    char letra = palabra.charAt(i);
                    if (letra >= 'A' && letra <= 'Z') {
                        letra = (char) (letra - 32);
                    }
                    resto += letra;
                }

                resultado += primeraLetra + resto + " ";
            }
        }
        return resultado;
    }
}
