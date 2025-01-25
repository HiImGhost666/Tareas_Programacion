/*
Ejercicio 2 – 4 puntos
Escribe un programa que simule una calculadora de áreas de diferentes figuras geométricas (cuadrado, rectángulo, triángulo, círculo). El programa pedirá al usuario que elija una figura del menú y, luego, solicite los datos necesarios para calcular el área. Utiliza un switch para seleccionar la figura y las fórmulas correspondientes para calcular las áreas:

Cuadrado: área = lado^2
Rectángulo: área = base * altura
Triángulo: área = (base * altura) / 2
Círculo: área = π * radio^2
Ejemplo:
Entrada: Figura: Triángulo, Base: 5, Altura: 3
Salida: "El área del triángulo es 7.5"
 */
package Tema2.Actividades_ChatGPT;

import java.util.Scanner;

public class Actividad12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Elija una figura: ");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectángulo");
        System.out.println("3. Triángulo");
        System.out.println("4. Círculo");

        int figura = sc.nextInt();

        System.out.println("Introduce la base: ");
        double base = sc.nextDouble();

        System.out.println("Introduce la altura: ");
        double altura = sc.nextDouble();

        double volumen = 0;

        switch(figura) {
            case 1:
                volumen = base * base;
                break;
            case 2:
                volumen = base * altura;
                break;
            case 3:
                volumen = (base * altura) / 2;
                break;
            case 4:
                volumen = Math.PI * Math.pow(base, 2);
                break;
            default:
                System.out.println("Figura no encontrada");
        }

        System.out.println("El volumen es: " + volumen);
    }
}
