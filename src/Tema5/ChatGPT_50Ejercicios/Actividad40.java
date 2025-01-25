package Tema5.ChatGPT_50Ejercicios;

import java.util.Scanner;

public class Actividad40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] municipios = {
                "Adeje", "Arafo", "Arico", "Arona", "Buenavista del Norte", "Candelaria", "ElRosario", "ElSauzal",
                "El Tanque", "Fasnia", "Garachico", "Granadilla de Abona", "Guia de Isora", "Guimar", "Icod de Los Vinos",
                "LaGuancha", "LaLaguna", "La Matanza de Acentejo", "LaOrotava", "La Victoria de Acentejo", "LosRealejos",
                "LosSilos", "Puerto de La Cruz", "San juan de La Rambla", "San Miguel de Abona", "Santa Cruz de Tenerife",
                "SantaUrsula", "Santiago del Teide", "Tacoronte", "Tegueste", "Vilaflor"
        };

        int[] casos = {
                2367, 47, 128, 3139, 29, 505, 272, 135, 44, 65, 17, 2659, 646, 415, 400, 84, 12645, 125, 749, 234, 826, 56,
                876, 49, 307, 25563, 198, 194, 548, 128, 37
        };

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Cambiar un dato existente");
            System.out.println("2. Introducir un nuevo dato");
            System.out.println("3. Listar todos los casos por municipio");
            System.out.println("4. Contar municipios con más de un número dado de casos");
            System.out.println("5. Mostrar municipios con más de 1000 casos");
            System.out.println("6. Mostrar municipio con más y menos casos");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cambiarDato(municipios, casos, scanner);
                    break;
                case 2:
                    introducirNuevoDato(municipios, casos, scanner);
                    break;
                case 3:
                    listarCasos(municipios, casos);
                    break;
                case 4:
                    contarMunicipiosConMasDe(municipios, casos, scanner);
                    break;
                case 5:
                    mostrarMunicipiosConMasDe1000(municipios, casos);
                    break;
                case 6:
                    mostrarMunicipioConMasYMenosCasos(municipios, casos);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    // Cambiar un dato existente
    public static void cambiarDato(String[] municipios, int[] casos, Scanner scanner) {
        System.out.print("Introduce el nombre del municipio a modificar: ");
        scanner.nextLine();  // Limpiar el buffer
        String municipio = scanner.nextLine();
        int index = -1;
        for (int i = 0; i < municipios.length; i++) {
            if (municipios[i].equalsIgnoreCase(municipio)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.print("Introduce el nuevo número de casos: ");
            casos[index] = scanner.nextInt();
        } else {
            System.out.println("Municipio no encontrado.");
        }
    }

    // Introducir un nuevo dato
    public static void introducirNuevoDato(String[] municipios, int[] casos, Scanner scanner) {
        System.out.print("Introduce el nombre del nuevo municipio: ");
        scanner.nextLine();  // Limpiar el buffer
        String nuevoMunicipio = scanner.nextLine();
        System.out.print("Introduce el número de casos: ");
        int nuevosCasos = scanner.nextInt();

        String[] nuevosMunicipios = new String[municipios.length + 1];
        int[] nuevosCasosArray = new int[casos.length + 1];

        for (int i = 0; i < municipios.length; i++) {
            nuevosMunicipios[i] = municipios[i];
            nuevosCasosArray[i] = casos[i];
        }

        nuevosMunicipios[municipios.length] = nuevoMunicipio;
        nuevosCasosArray[casos.length] = nuevosCasos;

        municipios = nuevosMunicipios;
        casos = nuevosCasosArray;
    }

    // Listar todos los casos por municipio
    public static void listarCasos(String[] municipios, int[] casos) {
        for (int i = 0; i < municipios.length; i++) {
            System.out.println(municipios[i] + " tiene " + casos[i] + " casos.");
        }
    }

    // Contar municipios con más de un número dado de casos
    public static void contarMunicipiosConMasDe(String[] municipios, int[] casos, Scanner scanner) {
        System.out.print("Introduce el número de casos: ");
        int limite = scanner.nextInt();
        int contador = 0;

        for (int i = 0; i < casos.length; i++) {
            if (casos[i] > limite) {
                contador++;
            }
        }

        System.out.println("Número de municipios con más de " + limite + " casos: " + contador);
    }

    // Mostrar municipios con más de 1000 casos
    public static void mostrarMunicipiosConMasDe1000(String[] municipios, int[] casos) {
        System.out.println("Municipios con más de 1000 casos:");
        int sumaCasos = 0;
        for (int i = 0; i < municipios.length; i++) {
            if (casos[i] > 1000) {
                System.out.println("- " + municipios[i]);
                sumaCasos += casos[i];
            }
        }
        System.out.println("Suma de estos municipios: " + sumaCasos);
    }

    // Mostrar municipio con más y menos casos
    public static void mostrarMunicipioConMasYMenosCasos(String[] municipios, int[] casos) {
        int maxCasos = casos[0], minCasos = casos[0];
        String municipioMax = municipios[0], municipioMin = municipios[0];

        for (int i = 1; i < casos.length; i++) {
            if (casos[i] > maxCasos) {
                maxCasos = casos[i];
                municipioMax = municipios[i];
            }
            if (casos[i] < minCasos) {
                minCasos = casos[i];
                municipioMin = municipios[i];
            }
        }

        System.out.println("El municipio con más casos es " + municipioMax + " con " + maxCasos + " casos.");
        System.out.println("El municipio con menos casos es " + municipioMin + " con " + minCasos + " casos.");
    }
}
