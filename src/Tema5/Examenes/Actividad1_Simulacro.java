/*
Actividad 1 (3p)
Crea una función a la que se le pasa como parámetro una matriz de 2 dimensiones rellena con
números decimales metidos por teclado o puestos directamente como en los ejemplos, y
devuelve un array con la suma de cada una de las columnas.
Ejemplos donde se puede ver a cada matriz que array daría como resultado de sumar sus
columnas.
double[][] matriz = {
{2.5, 3, 6.7, 0.6},
{8, 4.5, 5.4, 3.2},
{9, 6.2, 1.2, 4.3}
};
[19.5, 13.7, 13.3, 8.1]


double[][] matriz = {
{1, 2, 3, 4, 5, 6},
{1, 2, 3, 4, 5, 6},
{1, 2, 3, 4, 5, 6},
{1, 2, 3, 4, 5, 6},
{1, 2, 3, 4, 5, 6}
};
[ 5.0, 10.0, 15.0, 20.0, 25.0, 30.0 ]

double[][] matriz = {
{1.2, 3.4},
{2.3, 4.5},
{3.4, 5.6},
{4.5, 6.7},
{5.6, 7.8}
};
[ 17.0, 28.0 ]
 */
package Tema5.Examenes;

public class Actividad1_Simulacro{
    public static void main(String[] args) {

        double[][] matriz = {
                {2.5, 3, 6.7, 0.6},
                {8, 4.5, 5.4, 3.2},
                {9, 6.2, 1.2, 4.3}
        };

        double[] resultado = sumarColumnas(matriz);

        for(int i = 0; i < resultado.length; i++){
            System.out.println("La suma de la columna " + (i + 1) + " es: " + resultado[i]);
        }
    }

    static double[] sumarColumnas(double[][] matriz){
        double[] resultado = new double[matriz[0].length];
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                resultado[j] += matriz[i][j];
            }
        }
        return resultado;
    }
}
