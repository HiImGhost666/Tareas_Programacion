/*
Diseñar un algoritmo que nos indique si podemos salir a la calle.

Existen aspectos que influirán en esta decisión: si está lloviendo y si hemos terminado nuestras tareas.

Solo podremos salir a la calle si no está lloviendo y hemos finalizado nuestras tareas.

Existe una opción en la que, indistintamente de lo anterior,
podremos salir a la calle: el hecho de que tengamos que ir a la biblioteca (para realizar algún trabajo, entregar un libro, etc.).

Solicitar al usuario (mediante un booleano) si llueve, si ha finalizado las tareas y si necesita ir a la biblioteca.

El algoritmo debe mostrar mediante un booleano (true o false) si es posible que se le otorgue permiso para ir a la calle.

*/

package Tema1;
import java.util.Scanner;

public class actividad10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean estaLloviendo, acaboTareas, irBiblioteca;

        System.out.println("¿Esta lloviendo?");
        estaLloviendo = sc.nextBoolean();
        System.out.println("¿Ha finalizado las tareas?");
        acaboTareas = sc.nextBoolean();
        System.out.println("¿Necesitas ir a la biblioteca?");
        irBiblioteca = sc.nextBoolean();

        boolean puedeSalir = (!estaLloviendo && acaboTareas) || irBiblioteca;

        System.out.println("Puedes salir a la calle: " + puedeSalir);
    }
}
