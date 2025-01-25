package Tema5.ChatGPT_50Ejercicios;

import java.util.Scanner;

public class Actividad41 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int[] temperaturas = new int[30];

                while (true) {
                    System.out.println("\nMenú:");
                    System.out.println("1. Ingresar datos de temperatura");
                    System.out.println("2. Mostrar datos de temperaturas");
                    System.out.println("3. Día más caluroso y más frío");
                    System.out.println("4. Temperatura promedio");
                    System.out.println("5. Días con temperaturas superiores al promedio");
                    System.out.println("6. Histograma de temperaturas");
                    System.out.println("0. Salir");
                    System.out.print("Selecciona una opción: ");
                    int opcion = scanner.nextInt();

                    switch (opcion) {
                        case 1:
                            ingresarTemperaturas(temperaturas, scanner);
                            break;
                        case 2:
                            mostrarTemperaturas(temperaturas);
                            break;
                        case 3:
                            mostrarDiaMasCalurosoYMasFrio(temperaturas);
                            break;
                        case 4:
                            mostrarTemperaturaPromedio(temperaturas);
                            break;
                        case 5:
                            mostrarDiasConTemperaturasSuperioresAlPromedio(temperaturas);
                            break;
                        case 6:
                            generarHistograma(temperaturas);
                            break;
                        case 0:
                            System.out.println("Saliendo del programa...");
                            return;
                        default:
                            System.out.println("Opción no válida.");
                    }
                }
            }

            public static void ingresarTemperaturas(int[] temperaturas, Scanner scanner) {
                for (int i = 0; i < temperaturas.length; i++) {
                    System.out.print("Introduce la temperatura para el día " + (i + 1) + ": ");
                    temperaturas[i] = scanner.nextInt();
                }
            }

            public static void mostrarTemperaturas(int[] temperaturas) {
                for (int i = 0; i < temperaturas.length; i++) {
                    System.out.println("Día " + (i + 1) + ": " + temperaturas[i] + "°C");
                }
            }

            public static void mostrarDiaMasCalurosoYMasFrio(int[] temperaturas) {
                int maxTemp = temperaturas[0], minTemp = temperaturas[0];
                int diaMax = 1, diaMin = 1;

                for (int i = 1; i < temperaturas.length; i++) {
                    if (temperaturas[i] > maxTemp) {
                        maxTemp = temperaturas[i];
                        diaMax = i + 1;
                    }
                    if (temperaturas[i] < minTemp) {
                        minTemp = temperaturas[i];
                        diaMin = i + 1;
                    }
                }

                System.out.println("El día más caluroso fue el día " + diaMax + " con " + maxTemp + "°C.");
                System.out.println("El día más frío fue el día " + diaMin + " con " + minTemp + "°C.");
            }

            public static void mostrarTemperaturaPromedio(int[] temperaturas) {
                int suma = 0;
                for (int temp : temperaturas) {
                    suma += temp;
                }
                double promedio = suma / 30.0;
                System.out.println("La temperatura promedio del mes es: " + promedio + "°C.");
            }

            public static void mostrarDiasConTemperaturasSuperioresAlPromedio(int[] temperaturas) {
                double promedio = 0;
                for (int temp : temperaturas) {
                    promedio += temp;
                }
                promedio /= 30.0;

                System.out.println("Días con temperaturas superiores al promedio:");
                for (int i = 0; i < temperaturas.length; i++) {
                    if (temperaturas[i] > promedio) {
                        System.out.println("Día " + (i + 1) + ": " + temperaturas[i] + "°C");
                    }
                }
            }

            public static void generarHistograma(int[] temperaturas) {
                int[] rangos = new int[6]; // Rango: 15-20, 20-25, 25-30, 30-35, 35-40, 40+
                for (int temp : temperaturas) {
                    if (temp >= 40) rangos[5]++;
                    else if (temp >= 35) rangos[4]++;
                    else if (temp >= 30) rangos[3]++;
                    else if (temp >= 25) rangos[2]++;
                    else if (temp >= 20) rangos[1]++;
                    else rangos[0]++;
                }

                System.out.println("Histograma de temperaturas:");
                System.out.println("15-20°C: " + rangos[0]);
                System.out.println("20-25°C: " + rangos[1]);
                System.out.println("25-30°C: " + rangos[2]);
                System.out.println("30-35°C: " + rangos[3]);
                System.out.println("35-40°C: " + rangos[4]);
                System.out.println("40°C+: " + rangos[5]);
            }
        }

