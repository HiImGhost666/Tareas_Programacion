/*
4. Escribir una aplicación que pide el año actual y de nacimiento del usuario. Debe
calcular su edad, suponiendo que en el año en curso el usuario ya ha cumplido
años
 */
package Tema1;
import java.util.Scanner;
public class actividad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el año actual:");
        int anio = sc.nextInt();
        System.out.println("Introduce el año de nacimiento:");
        int nacimiento = sc.nextInt();

        int edad = (anio - nacimiento);
        System.out.println("Tu edad es: " + edad);
    }
}
