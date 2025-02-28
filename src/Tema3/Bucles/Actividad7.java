/*
Ejercicio 7
Realiza el control de acceso a una caja fuerte. La combinacion sera un numero de 4 cifras.
El programa nos pedira la combincacion para abrirla. Si no acertamos, se nos mostrará el mensaje
"Lo siento, esa no es la combincacion" y si acertamos se nos dirá "La caja fuerte se ha abierto satisfactoriamente".
Tendremos cuatro oportunidades para abrir la caja fuerte.
 */
package Tema3.Bucles;

import java.util.Scanner;

public class Actividad7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int combincacion = 1234;

        for(int i = 1; i <= 4; i++){
            System.out.println("Introduce la combinación");
            int intento = sc.nextInt();

            if(intento == combincacion){
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
            } else {
                System.out.println("Lo siento, esa no es la combinación");
            }

            if(i == 4){
                System.out.println("Se han agotado las oportunidades");
            }
        }
    }
}
