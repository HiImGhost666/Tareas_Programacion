
package Tema6.Examen2025;

import java.util.Arrays;

/**
 *
 * @author jvega
 */
public class ExamenStringFunciones_vacio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto = ("Es un ejercicio de Java, es un ejercicio de tratamiento de palabras, es un examen y se repite la palabra de.");

         System.out.println ("Texto original: ");
         System.out.println("\t"+texto);
        System.out.println("\t");
        
// a) Funcion para quitar los signos de puntuacion
        System.out.println("Texto sin signos de puntuación:");
        eliminarPuntuacion(texto);
        System.out.println("\t");

// b) Funcion que cuenta palabras y devuelve matriz cuyos elementos son las palabras del texto
        // Llamo a la funcion cuentaPalabras() y guardo las palabras en la matriz "textoMatriz" de Strings
        // La funcion debe mostrar cuantas palabras hay en el texto
        // .....
        String[] textoMatriz = new String[0];
        cuentaPalabras(texto, textoMatriz);
        System.out.println("\t");

// c) Funcion que elimina palabras duplicadas y convierte en minusculas
        // Llamo a la funcion eliminaDuplicados() y guardo el resultado en la misma matriz "textoMatriz"
        // ....
        // Muestro el contenido de la matriz "textoMatriz" con los elementos en minusculas y sin palabras repetidas

        eliminaDuplicados(texto);
        System.out.println("\t");



// d) Ordena la matriz de String en orden alfabetico inverso
        // Llamo a la funcion ordenarInversa() y guardo lo que devuelve en "textoMatriz"
        // ....
        System.out.println("El texto ordenado al reves");
        ordenarAlReves(texto);
        // Muestro el contenido de la matriz "textoMatriz" con los elementos en orden alfabetico inverso
    }

    public static void eliminarPuntuacion(String texto) {
        String textonuevo = ""; //Creamos un String vacio

        char[] textoArray = texto.toCharArray(); //convertimos el texto en un Array de caracteres

        for (int i = 0; i < textoArray.length; i++) { //buscamos por cada palabra
            for (char letra : textoArray) {
                if (textoArray[i] == ',' || textoArray[i] == '.') { //Si el caracter es un '.' o ',', se convierte en espacio.
                    textoArray[i] = ' ';
                    break;
                }
            }
        }

        String textoModificado = new String(textoArray); //Lo guardamos y lo imprimimos

        System.out.println(textoModificado);


    }

    

    
 // ...... FALTA DESARROLLAR LAS FUNCIONES: , cuentaPalabras(), eliminaDuplicados(), ordenarInversa(),

    public static void cuentaPalabras(String texto, String[] textoMatriz){
        int contador = 1;

        for(int i = 0; i < texto.length(); i++){
            if(Character.isWhitespace(texto.charAt(i))){ //Contamos los espacios que hay
                contador++; //Sube el contador

                //Lo guardamos en un array textoMatriz????? No entendí esta parte del examen.
                textoMatriz = Arrays.copyOf(textoMatriz, textoMatriz.length +1);
                textoMatriz[textoMatriz.length -1] = texto;
            }

        }
        //Imprimimos el resultado
        System.out.println("El texto tiene " + contador + " palabras");

    }


    public static void eliminaDuplicados(String texto){

        String[] palabras = texto.split(" "); // Separamos las palabras por espacios
        String fraseSinDuplicados = ""; // String vacío

        for (int i = 0; i < palabras.length; i++) {
            for (int j = i + 1; j < palabras.length; j++) {
                if (palabras[i].equalsIgnoreCase(palabras[j])) {
                    palabras[j] = ""; // Eliminamos el duplicado
                }
            }
        }

        for (String palabra : palabras) {
            if (!palabra.isEmpty()) { // Solo agregamos palabras no vacías
                fraseSinDuplicados += palabra + " ";
            }
        }

        // Eliminamos espacios extra y mostramos el resultado
        System.out.println("Frase sin palabras duplicadas: " + fraseSinDuplicados.trim().replaceAll("\\s+", " ").toLowerCase());
    }
  
//  FUNCI�N PARA ADJUNTAR UN ELEMENTO A UNA MATRIZ DE ELEMENTOS TIPO STRING 
    static String[] adjuntar(String[] matriz, String palabra) {
        String[] matrixAux = new String[matriz.length + 1];
        for (int i = 0; i < matriz.length; i++) {
            matrixAux[i] = matriz[i];
        }
        matrixAux[matrixAux.length - 1] = palabra;
        return matrixAux;
    }

    static void ordenarAlReves(String texto){
//        int aux;
//        for(int i = 0; i < texto.length() -1; i++){
//            for(int j = 0; j < texto.length() - 1 - i; j++){
//                if(texto.charAt(j) < texto.charAt(j +1)){
//                    aux = texto.charAt(j);
//                    texto.charAt(j) = texto.charAt(j +1);
//                    texto.charAt(j+1) = (char) aux;
//                }
//            }
//
//        }
    }

}
