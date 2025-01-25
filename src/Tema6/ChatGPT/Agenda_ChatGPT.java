package Tema6.ChatGPT;

import java.util.Arrays;
import java.util.Scanner;

public class Agenda_ChatGPT {
    static String[] agenda = new String[0];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Introduce una opción:");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Ordenar agenda");
            System.out.println("5. Mostrar agenda");
            System.out.println("6. Buscar por apellido");
            System.out.println("7. Contar contactos");
            System.out.println("0. Salir");
            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("Introduce un nombre:");
                    String nombre = sc.nextLine();
                    System.out.println("Introduce un apellido:");
                    String apellido = sc.nextLine();
                    agregarContacto(nombre, apellido);
                    break;
                case 2:
                    System.out.println("Introduce el nombre a buscar:");
                    String buscarNombre = sc.nextLine();
                    buscarContacto(buscarNombre);
                    break;
                case 3:
                    System.out.println("Introduce el nombre a eliminar:");
                    String eliminarNombre = sc.nextLine();
                    eliminarNombre(eliminarNombre);
                    break;
                case 4:
                    ordenarAgenda();
                    break;
                case 5:
                    mostrarAgenda();
                    break;
                case 6:
                    System.out.println("Introduce el apellido a buscar:");
                    String apellidoBusqueda = sc.nextLine();
                    buscarPorApellidos(apellidoBusqueda);
                    break;
                case 7:
                    System.out.println("Numero de contactos: " + agenda.length);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }


        }
    }

    static void agregarContacto(String nombre, String apellido) {
        String contacto = nombre + " " + apellido;
        agenda = Arrays.copyOf(agenda, agenda.length + 1);
        agenda[agenda.length - 1] = contacto;
        System.out.println("Contacto agredado: " + contacto);
    }

    static void buscarContacto(String nombre) {
        boolean encontrado = false;
        for (String contacto : agenda) {
            String[] partes = contacto.split(" ");  // Dividimos el contacto en nombre y apellido
            if (partes[0].equalsIgnoreCase(nombre)) {  // Comparamos solo el nombre
                System.out.println("Contacto encontrado: " + contacto);
                encontrado = true;
                break;  // Sale del bucle si encuentra el contacto
            }
        }

        // Si no se encuentra el contacto, se muestra el mensaje fuera del bucle
        if (!encontrado) {
            System.out.println("Contacto no encontrado.");
        }
    }

    static void eliminarNombre(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < agenda.length; i++) {
            String[] partes = agenda[i].split(" ");
            if (partes[0].equalsIgnoreCase(nombre)) {
                for (int j = i; j < agenda.length - 1; j++) {
                    agenda[j] = agenda[j + 1];
                }

                agenda = Arrays.copyOf(agenda, agenda.length - 1);
                System.out.println("Contacto " + nombre + " eliminado.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Contacto no encontrado.");
        }
    }


    static void ordenarAgenda() {
        for (int i = 0; i < agenda.length - 1; i++) {
            for (int j = 0; j < agenda.length - 1 - i; j++) {
                if (agenda[j].compareToIgnoreCase(agenda[j + 1]) > 0) {
                    String temp = agenda[j];
                    agenda[j] = agenda[j + 1];
                    agenda[j + 1] = temp;
                }
            }
        }

        System.out.println("Agenda ordenada.");
    }

    static void mostrarAgenda() {
        if (agenda.length == 0) {
            System.out.println("Agenda vacia.");
        } else {
            System.out.println("Agenda:");
            for (String contactos : agenda) {
                System.out.println(contactos);
            }
        }
    }

    static void buscarPorApellidos(String apellido) {
        boolean encontrado = false;
        for (String contacto : agenda) {
            String[] partes = contacto.split(" ");

            if (partes[1].equalsIgnoreCase(apellido)) {
                System.out.println("Contacto con apellido " + apellido + ": " + contacto);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Contacto no encontrado.");
        }
    }

}