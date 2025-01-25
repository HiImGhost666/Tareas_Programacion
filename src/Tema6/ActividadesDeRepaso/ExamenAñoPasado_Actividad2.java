/*
Sean dos arrays de strings que contienen los nombres de los alumnos de una clase y los
apellidos respectivamente.
String[] nombres = {"Ana", "Juan", "Pedro", "Luis", "Antonio", "Belén"}
String[] apellidos = {"Perez", "Gomez", "Garcia", "Soto", "Gil", "Vega"}

Crear un metodo llamado CrearAgenda(), que meta en cada registro El nombre de alumno
seguido de su correspondiente apellido. La agenda, obviamente, tendrá la misma dimensión
que los dos arrays anteriores. El metodo debe recibir como argumentos los arrays nombres y
apellidos y devolver el array agenda.

Crea un metodo que ordene alfabeticamente la agenda por el apellido (ordenaApellido()).

Crea otro metodo que cuente cuántos nombres de menos de n caracteres hay en la agenda y
devuelva una subagenda sólo con los registros (nombres y apellidos) que satisfacen esta
condición. El metodo debe recibir como argumentos la agenda (no el arrays de nombres) y el
número de caracteres máximo deseado (nombresCortos(agenda, n)) y debe devolver una
agenda reducida con dichos registros.
 */
package Tareas_Programacion.src.Tema6.ActividadesDeRepaso;

import java.util.Arrays;
import java.util.Scanner;

public class ExamenAñoPasado_Actividad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = {"Ana", "Juan", "Pedro", "Luis", "Antonio", "Belén", "Sexo"};
        String[] apellidos = {"Perez", "Gomez", "Garcia", "Soto", "Gil", "Vega", "Anal"};

        String[] agenda = new String[0];

        agenda = Crearagenda(agenda, nombres, apellidos);

        ordenaApellido(agenda);
        for (String registro : agenda) {
            System.out.println(registro);
        }

        System.out.println("Nombres con menos de n letras. Introduce la cantidad:");
        int n = sc.nextInt();

        String[] subagenda = nombresCortos(agenda, n);
        for (String registro : subagenda) {
            System.out.println(registro);
        }

    }

    static String[] Crearagenda(String[] agenda, String[] nombres, String[] apellidos) {

        for (int i = 0; i < nombres.length; i++) {
            agenda = Arrays.copyOf(agenda, agenda.length + 1);
            agenda[agenda.length - 1] = nombres[i] + " " + apellidos[i];
        }
        return agenda;
    }

    static String[] ordenaApellido(String[] agenda) {
        Arrays.sort(agenda);
        return agenda;
    }

    static String[] nombresCortos(String[] agenda, int n) {
        String[] subagenda = new String[0];

        for (String registro : agenda) {
            String[] partes = registro.split(" ");
            String nombre = partes[0];

            if (nombre.length() < n) {
                subagenda = Arrays.copyOf(subagenda, subagenda.length + 1);
                subagenda[subagenda.length - 1] = registro;
            }
        }
        return subagenda;
    }
}

