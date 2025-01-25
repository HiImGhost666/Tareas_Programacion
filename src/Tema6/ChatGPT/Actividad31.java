/*
  Evaluar una expresión matemática simple en forma de cadena: Por ejemplo, "3+5*2-8" debería evaluarse como 7.
 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una expresion matemática:");
        String cadena = sc.nextLine();

        int resultado = calcular(cadena);
        System.out.println("Resultado: " + resultado);
    }

    static int calcular(String cadena){
        int resultado = 0;
        int numeroActual = 0;
        char operacion = '+';

        for(int i = 0; i < cadena.length(); i++){
            char charActual = cadena.charAt(i);


            if(Character.isDigit(charActual)){
                numeroActual = numeroActual * 10 + (charActual - '0');
            }

            if(!Character.isDigit(charActual) || i == cadena.length() -1){
                if(operacion == '+'){
                    resultado += numeroActual;
                } else if (operacion == '-'){
                    resultado -= numeroActual;
                }else if (operacion == '*'){
                    resultado *= numeroActual;
                }else if (operacion == '/'){
                    resultado /= numeroActual;
                }


                operacion = charActual;
                numeroActual = 0;
            }
        }

        return resultado;


    }
}
