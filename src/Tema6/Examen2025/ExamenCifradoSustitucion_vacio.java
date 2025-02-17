
package Tema6.Examen2025;
  import java.util.Arrays;
  import java.util.Scanner;
/**
 *
 * @author jvega
 */
public class ExamenCifradoSustitucion_vacio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       // Variable clase Scanner
        System.out.print("Introduce el texto a cifrar: ");  
        String texto = sc.nextLine();                    // Lectura del texto a cifrar



        String cifrado = "";
        // Aqu� va un switch con las llamadas a las diferentes funciones que pide el enunciado.
        // ......
        // El programa debe reproducir los ejemplos de salida mostrados en el enunciado

        while(true){
            System.out.println("Elige una opción del menu");
            System.out.println("1. Cifrado clave \"ABCDEFGHIJKLMNOPQRSTUVWXYZ\"");
            System.out.println("b. Cifrado eligiendo clave.");
            System.out.println("c. Descifrando clave \"ABCDEFGHIJKLMNOPQRSTUVWXYZ\"");
            System.out.println("d. Salir.");

            int opcion = sc.nextInt();

            switch (opcion){
                case 1 :
                    System.out.println(cifrar(texto));
                    break;

                case 2:
                    System.out.println("Introduce la clave para cifrar:");
                    String clave = sc.nextLine();

                    System.out.println(cifrar(texto, clave));

                case 3:

            }

        }
    }

    
// Funci�n para CIFRAR un texto con la clave fija "QWERTYUIOPASDFGHJKLZXCVBNM"
    
    public static String cifrar(String texto) {
        String cifrado = "";
        // Desarrollo de la funci�n para cifrar un texto con la clave "QWERTYUIOPASDFGHJKLZXCVBNM"
        char[] letras = {'Q','W','E','R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Z','X','C','V','B','N','M'};
        char[] alfabetico = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',};
        int posiciontexto = 0;
        char[] textoArray = texto.toCharArray();


        for (int i = 0; i < textoArray.length; i++) {
            if(textoArray[i] == alfabetico[i]){
                alfabetico[i] = letras[i];
                textoArray[i] = letras[i];
            }
        }

        cifrado = Arrays.toString(textoArray);


        return cifrado;
    }

    public static String descifrar(String cifrado, int clave){
            String mensajeDescifrado = "";
            for (int i = 0; i < cifrado.length(); i++) {
                char caracter = cifrado.charAt(i);

                if (Character.isUpperCase(caracter)) {
                    caracter = (char) (((caracter - 'A' - clave + 26) % 26) + 'A');
                }
                else if (Character.isLowerCase(caracter)) {
                    caracter = (char) (((caracter - 'a' - clave + 26) % 26) + 'a');
                }

                mensajeDescifrado += caracter;
            }
            return mensajeDescifrado;
        }

        public static String cifrar(String texto, String clave){
        String cifrado = "";

        return cifrado;
    }































// Funci�n SOBRECARGADA para cifrar un texto con clave le�da por teclado    
// ......................

// Funci�n para DESCIFRAR un texto con la clave fija "QWERTYUIOPASDFGHJKLZXCVBNM"
    public static String descifrar(String texto) {
        String descifrado = "";
         // Desarrollo de la funci�n para DESCIFRAR un texto con la clave "QWERTYUIOPASDFGHJKLZXCVBNM"
        return descifrado;
    }
    
// Funci�n para mostrar las opciones del MEN�
    // ........................
    
    
}

    
