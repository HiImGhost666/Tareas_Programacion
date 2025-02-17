/*
Sean dos arrays de strings que contienen los nombres de los alumnos de una clase y los
apellidos respectivamente.
String[] nombres = {“Ana”, “Juan”, “Pedro”, “Luis”, “Antonio”, “Belén”}
String[] apellidos = {“Perez”, “Gomez”, “Garcia”, “Soto”, “Gil”, “Vega”}
Crear un método llamado CrearAgenda(), que meta en cada registro El nombre de alumno
seguido de su correspondiente apellido. La agenda, obviamente, tendrá la misma dimensión
que los dos arrays anteriores. El método debe recibir como argumentos los arrays nombres y
apellidos y devolver el array agenda.
Crea un método que ordene alfabéticamente la agenda por el apellido (ordenaApellido()).
Crea otro método que cuente cuántos nombres de menos de n caracteres hay en la agenda y
devuelva una subagenda sólo con los registros (nombres y apellidos) que satisfacen esta
condición. El método debe recibir como argumentos la agenda (no el arrays de nombres) y el
número de caracteres máximo deseado (nombresCortos(agenda, n)) y debe devolver una
agenda reducida con dichos registros.
 */
package Tema6.ExamenesAñoPasado;

import java.util.Arrays;

public class Actividad2 {
    public static void main(String[] args) {
        String[] nombres = {"Ana", "Juan", "Pedro", "Luis", "Antonio", "Belén"};
        String[] apellidos = {"Perez", "Gomez", "Garcia", "Soto", "Gil", "Vega"};

        String[] agenda = CrearAgenda(nombres, apellidos);
        System.out.println("Agenda: " + Arrays.toString(agenda));

        agenda = ordenarApellido(agenda);
        System.out.println("Agenda ordenada: " + Arrays.toString(agenda));

        String[] subAgenda = nombresCortos(agenda, 5);
        System.out.println("Subagenda con nombres cortos: " + Arrays.toString(subAgenda));
    }

    // Crear la agenda combinando los nombres y apellidos
    public static String[] CrearAgenda(String[] nombres, String[] apellidos) {
        String[] agenda = new String[nombres.length];
        for (int i = 0; i < nombres.length; i++) {
            agenda[i] = nombres[i] + " " + apellidos[i];
        }
        return agenda;
    }

    // Ordenar la agenda por apellido
    public static String[] ordenarApellido(String[] agenda) {
        Arrays.sort(agenda, (a, b) -> {
            String apellidoA = a.split(" ")[1];
            String apellidoB = b.split(" ")[1];
            return apellidoA.compareTo(apellidoB);
        });
        return agenda;
    }

    // Contar y devolver los registros con nombres de menos de 'n' caracteres
    public static String[] nombresCortos(String[] agenda, int n) {
        int count = 0;
        for (String registro : agenda) {
            String nombre = registro.split(" ")[0];
            if (nombre.length() < n) {
                count++;
            }
        }

        String[] subAgenda = new String[count];
        int index = 0;
        for (String registro : agenda) {
            String nombre = registro.split(" ")[0];
            if (nombre.length() < n) {
                subAgenda[index++] = registro;
            }
        }
        return subAgenda;
    }
    }

