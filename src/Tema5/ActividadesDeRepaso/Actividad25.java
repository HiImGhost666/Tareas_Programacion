package Tema5.ActividadesDeRepaso;

public class Actividad25 {
    public static void main(String[] args) {
        int[][] temperaturas = {
                {20, 22, 21, 19, 18, 22, 21},  // Ciudad 1
                {25, 24, 26, 27, 28, 30, 29},  // Ciudad 2
                {18, 17, 16, 15, 14, 15, 16},  // Ciudad 3
                {30, 31, 29, 28, 27, 26, 25}   // Ciudad 4
        };

        calcularPromedio(temperaturas);
    }

    static void calcularPromedio(int[][] temperaturas) {
        // Calcular el promedio de temperaturas en cada ciudad


            for(int i = 0; i < temperaturas.length; i++) {
                int mayor = 0;
                int ciudadMayor = 0;
                double promedio = 0;
                for(int j = 0; j < temperaturas[i].length; j++) {
                    promedio += temperaturas[i][j];
                }
                promedio /= temperaturas[i].length;

                System.out.println("Ciudad " + (i + 1) + ": " + promedio);
                System.out.println("Ciudad con mayor promedio: Ciudad " + ciudadMayor);}

    }

    }
