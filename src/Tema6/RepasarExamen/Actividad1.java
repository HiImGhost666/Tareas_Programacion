/*
Ejercicio 1: Validación de una dirección de correo electrónico
Escribe un programa en Java que valide si una dirección de correo electrónico es válida. El programa debe seguir las siguientes reglas:

El correo debe contener exactamente un símbolo @.

El correo debe contener al menos un punto . después del símbolo @.

El correo no puede contener espacios en blanco.

El correo debe tener al menos 5 caracteres antes del símbolo @.

El dominio (después del @) debe tener al menos 2 caracteres antes del punto y al menos 2 caracteres después del punto.

El programa debe pedir al usuario que introduzca una dirección de correo electrónico y mostrar un mensaje indicando si es válida o no. En caso de no ser válida, debe indicar cuál es el error.

Ejemplo de salida:

Introduce una dirección de correo electrónico: usuario@dominio.com
La dirección de correo electrónico es válida.

Introduce una dirección de correo electrónico: usuario@dominio
La dirección de correo electrónico no es válida: falta el punto después del @.

Introduce una dirección de correo electrónico: usuario@.com
La dirección de correo electrónico no es válida: el dominio debe tener al menos 2 caracteres antes del punto.

 */
package Tema6.RepasarExamen;

import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



    }
}
