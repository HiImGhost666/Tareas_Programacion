/*
3. Realizar una función que calcule y muestre el área o el volumen de
un cilindro, según se especifique. Para distinguir un caso de otro se le
pasará como opción un número: 1 (para el área) o el 2 (para el
volumen). Además, hay que pasarle a la función el radio de la base y
la altura.
Área = 2*pi * radio * (altura + radio)
Volumen = pi * radio2 * altura

 */
package Tema4.ActividadesDeRepaso;

import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que opción quieres realizar?");
        System.out.println("1. Calcular el área de un cilindro:");
        System.out.println("2. Calcular el volumen de un cilindro:");

        calcularCilindro(1,5,10);
        calcularCilindro(2, 5, 10);
    }

    static int calcularCilindro(int opcion, double radio, double altura){
        double pi = Math.PI;

        switch (opcion){
            case 1:
                double area = 2 * pi * radio * (altura + radio);
                System.out.println("Area del cilindro = " + area);
                break;

            case 2:
                double volumen = pi * Math.pow(radio, 2) * altura;
                System.out.println("Volumen del cilindro = " + volumen);
                break;
            default:
                System.out.println("Introduce una opcion valida");
                break;
        }

        return opcion;
    }
}
