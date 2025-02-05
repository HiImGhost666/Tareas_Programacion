/*
Generador de Nombre de Usuario
Escribe un programa en Java que genere un nombre de usuario a partir del nombre y apellido del usuario.

📌 Condiciones:

Se pedirá al usuario su nombre y apellido.
Se generará el nombre de usuario combinando:
Las tres primeras letras del nombre.
Las tres primeras letras del apellido.
Un número aleatorio de 100 a 999.
El programa mostrará el nombre de usuario generado en minúsculas.
Si el nombre o apellido tienen menos de 3 letras, se usará la palabra completa.
El usuario podrá generar varios nombres de usuario hasta que decida salir.

Ejemplo de Entradas y Salidas:

Nombre	    Apellido	Salida Esperada
"Carlos"	"Gómez"	    "cargom574"
"Ana"	    "Li"	    "anali892"
"Luis"	    "Torres"	"luisto219"
 */
package Tema6.ChatGPT;

import java.util.Scanner;

public class Actividad86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce tu apellido: ");
        String apellido = sc.nextLine();

        generarNombreUsuario(nombre, apellido);

    }

    public static void generarNombreUsuario(String nombre, String apellido) {
        int numaleatorio = (int) (Math.random() * 1000 +1);

        String usuario = nombre.substring(0, 3) + apellido.substring(0, 3) + numaleatorio;
        System.out.println("Tu nombre de usuario es: " + usuario.toLowerCase());

    }
}
