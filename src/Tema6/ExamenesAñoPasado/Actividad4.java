/*
Dado el programa adjunto en el examen, realizar las siguientes modificaciones:
- Crear un método que decodifique el mensaje codificado.
- Modificar el método de codificación (cifradoAsterisco()) para que cada vez que
aparezca una letra que no esté afectada por la codificación ponga un asterisco en su
lugar.
- Crea otro que llamará el método de descifrado para avisar de que si el mensaje ha sido
cifrado con el método cifradoAsterisco() dicho mensaje será indescifrable. El
método no devolverá nada al programa principal, imprimirá el mensaje desde el propio
método.
 */
package Tema6.ExamenesAñoPasado;

public class Actividad4 {
    public static void main(String[] args) {
        String texto = "Hola Mundo!";
        String textoCifrado = cifradoAsterisco(texto);
        System.out.println("Texto cifrado: " + textoCifrado);

        decodificar(textoCifrado);
    }

    // Método de cifrado con asteriscos
    public static String cifradoAsterisco(String texto) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isLetter(c)) {
                resultado.append(c);
            } else {
                resultado.append('*');
            }
        }
        return resultado.toString();
    }

    // Método para decodificar el mensaje cifrado
    public static void decodificar(String textoCifrado) {
        if (textoCifrado.contains("*")) {
            System.out.println("El mensaje ha sido cifrado con el método de cifrado asterisco y no se puede descifrar.");
        } else {
            System.out.println("El mensaje descifrado es: " + textoCifrado);
        }
    }
    }

