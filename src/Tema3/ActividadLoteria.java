package Tema3;
import java.util.Scanner;
public class ActividadLoteria {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int coincidencias = 0;

        // Variables para almacenar los números introducidos por el usuario y los números de la lotería
        int numeroUsuario;
        int numeroLoteria;

        // Pedir al usuario 5 números
        for (int i = 1; i <= 5; i++) {
            System.out.println("Introduce un número entre 1 y 50:");
            numeroUsuario = sc.nextInt();

            // Generar un número aleatorio entre 1 y 50
            numeroLoteria = (int) (Math.random() * 50) + 1;

            // Mostrar el número generado por la lotería
            System.out.println("Número de la lotería: " + numeroLoteria);

            // Comprobar si el número del usuario coincide con el de la lotería
            if (numeroUsuario == numeroLoteria) {
                coincidencias++;
            }
        }

        // Mostrar cuántos números coincidieron
        System.out.println("Tienes " + coincidencias + " coincidencias.");

        // Comprobar si ganó
        if (coincidencias == 5) {
            System.out.println("¡Felicidades! Has ganado 1 millón €.");
        } else {
            System.out.println("Lo siento, no has ganado esta vez.");
        }


    }
}
