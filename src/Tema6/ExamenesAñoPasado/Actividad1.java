/*
Escribe un programa en JAVA que convierta un texto a UpperCamelCase (la primera letra
de cada una de las palabras es mayúscula), sin usar métodos de la clase String o Character
(debes hacerlo con bucles). En el texto sólo poner Si hubiera caracteres distintos de las letras
del abecedario (mayúsculas o minúsculas) los ignoraría y no aparecerían en el texto de salida.
Por ejemplo, el siguiente texto: “Hola me llamo Juan”, produciría una salida:

Nota: Puedes usar length(), charAt(j), Split() y toCharArray() (aunque este
último no es necesario) Cualquier otro método de String o de Character bajaría
sustancialmente la nota del ejercicio.
Pista: crea un método para convertir cada palabra a CamelCAse:
static String toCamelCase(String texto)
 */
package Tema6.ExamenesAñoPasado;

public class Actividad1 {
    public static void main(String[] args) {
        String texto = "Hola me llamo Juan";
        String resultado = toCamelCase(texto);
        System.out.println(resultado);
    }

    // Método para convertir cada palabra a UpperCamelCase
    static String toCamelCase(String texto) {
        StringBuilder resultado = new StringBuilder();
        boolean esInicioPalabra = true;  // Para saber si estamos al principio de una palabra

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            // Ignorar caracteres no alfabéticos
            if (Character.isLetter(c)) {
                // Si es el inicio de la palabra, ponemos la letra en mayúscula
                if (esInicioPalabra) {
                    resultado.append(Character.toUpperCase(c));
                    esInicioPalabra = false;
                } else {
                    // Si no es el inicio, ponemos la letra en minúscula
                    resultado.append(Character.toLowerCase(c));
                }
            } else {
                // Si encontramos un espacio o un carácter no alfabético, cambiamos a la siguiente palabra
                esInicioPalabra = true;
            }
        }
        return resultado.toString();
    }
}

