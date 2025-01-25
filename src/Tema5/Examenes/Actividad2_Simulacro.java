/*
Arrays
El jefe de tu empresa de análisis estadísticos, te ha encargado una aplicación que ayude a
realizar encuestas para conocer el nivel adquisitivo de los empleados de Apple. Para ello,
tendrás que preguntar el sueldo a cada empleado encuestado. En principio, no conoces el
número de encuestados a analizar, por lo que, para finalizar la entrada de datos, introduce un
sueldo con valor-1.
Una vez terminada la entrada de datos, muestra la siguiente información (Recuerda que
puedes hacer cada una de estas operaciones en una función):
- Todos los sueldos introducidos ordenados de forma decreciente.
- El sueldo máximo y mínimo.
- La media de los sueldos.
 */
package Tema5.Examenes;

import java.util.Scanner;

public class Actividad2_Simulacro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] sueldos = new double[100];

        double sueldo = 0;
        while (sueldo != -1) {
            System.out.println("Introduce el sueldo:");
            sueldo = sc.nextDouble();
            sueldos[0] = sueldo;
        }

        System.out.println("Todos los sueldos introducidos ordenados de forma decreciente:");
        for(int i = sueldos.length - 1; i >= 0; i--){
            System.out.println(sueldos[i]);
        }

        double[] calculos = calculosSueldos(sueldos);
        for(int i = 0; i < calculos.length; i++){
            System.out.println(calculos[i]);
        }

        System.out.println("La media de los sueldos es: " + calculos[2]);

        System.out.println("El sueldo más alto es: " + calculos[0] + ", y el sueldo más bajo es: " + calculos[1]);

    }

    static double[] calculosSueldos(double[] sueldos){
        double sueldoMax = sueldos[0];
        double sueldoMin = sueldos[0];
        double suma = 0;
        for(int i = 0; i < sueldos.length; i++){
            if(sueldos[i] > sueldoMax){
                sueldoMax = sueldos[i];
            }
            if(sueldos[i] < sueldoMin){
                sueldoMin = sueldos[i];
            }
            suma += sueldos[i];
        }
        double media = suma / sueldos.length;

        return new double[]{sueldoMax, sueldoMin, media};
    }

    static double[] ordenarSueldos(double[] sueldos){
        for(int i = 0; i < sueldos.length; i++){
            for(int j = i + 1; j < sueldos.length; j++){
                if(sueldos[i] < sueldos[j]){
                    double aux = sueldos[i];
                    sueldos[i] = sueldos[j];
                    sueldos[j] = aux;
                }
            }
        }
        return sueldos;
    }

}
