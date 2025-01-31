/*
Ejercicio 3.Letra DNI
El DNI consta de un entero de 8 dígitos seguido de una letra que se obtiene a partir del número de la siguiente forma:
numeroLetra = numeroDni%23

Basándote en esta información, elige la letra a partir de la numeración de la siguiente tabla:

y  diseña  una  aplicación  en  la  que,  dado  un  número  de  DNI,  calcule  la  letra  que  le  corresponde.

Observa que un número de 8 dígitos está dentro del rango del tipo int.
 */

import java.util.Scanner;
public class LetraDNI {
    public static void main(String[] args) {
        String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduce tu DNI: ");
        int dni = sc.nextInt();

        if(dni < 10000000 || dni > 99999999){
            System.out.println("DNI incorrecto");
        } else{
            System.out.println("Tu DNI es: " + dni + letrasDNI.charAt(dni%23));
        }
        sc.close();

    }
}
