package Tareas_Programacion.src.Tema6.ActividadesDeRepaso;

import java.util.Arrays;
import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Menú Agenda");
        System.out.println("1. Agregar contacto:");
        System.out.println("2. Buscar contacto:");
        System.out.println("3. Ver todo.");
        System.out.println("4. Salir.");

        int opcion = sc.nextInt();

        String[] agenda = new String[0];

        switch (opcion){
            case 1:
                agregarContacto(agenda);
                break;

            case 2:
                buscarContacto(agenda);
                break;

            case 3:
                mostrarTodo(agenda);
                break;

            case 4:
                System.out.println("Hasta pronto!");
                break;
        }



    }

    static String[] agregarContacto(String[] agenda){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre:");
        String nombre = sc.nextLine();
        System.out.println("Apellido");
        String apellido = sc.nextLine();
        System.out.println("Telefono");
        String telefono = sc.nextLine();

        agenda = Arrays.copyOf(agenda, agenda.length +1);
        agenda[agenda.length -1] = nombre + ":" + apellido + ":" + telefono;

        return agenda;
    }


    static void buscarContacto(String[] agenda){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre a buscar:");
        String nombre = sc.nextLine();

        for(String contacto : agenda){
            String aux[] = contacto.split(":");
            if(aux[0].startsWith(nombre)){
                System.out.println("Nombre: " + aux[0] + "\t(" + aux[1] + ")");
            }
        }
    }

    static void mostrarTodo(String[] agenda){
        Arrays.sort(agenda);
        for(String contacto : agenda){
            String aux[] = contacto.split(":");
            System.out.println("Nombre: " + aux[0] + "\t(" + aux[1] + ")");

        }
    }
}
