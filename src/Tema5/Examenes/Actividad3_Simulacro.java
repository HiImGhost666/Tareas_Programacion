package Tema5.Examenes;

import java.util.Scanner;

public class Actividad3_Simulacro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] grupo = {"Nieves", "Alberto", "Ana", "Carlos", "Sandra", "Arancha", "Alex"};

        int[] nota1eva = {5,6,10,4,6,5,5};
        int[] nota2eva = {3,6,9,4,7,7,8};
        int[] nota3eva = {7,7,10,5,9,8,8};


        for(int i = 0; i < grupo.length; i++){
            System.out.println(grupo[i] + ": " + nota1eva[i] + ", " + nota2eva[i] + ", " + nota3eva[i]);
        }
        System.out.println("\nMedia de cada alumno: ");
        for(int i = 0; i < grupo.length; i++){
            int media = (nota1eva[i] + nota2eva[i] + nota3eva[i]) / 3;
            System.out.println(grupo[i] + ": " + media);
        }

        System.out.println("\nIntroduce el nombre del alumno o su posicion:");
        String alumno = sc.nextLine();

        for(int i = 0; i < grupo.length; i++){
            if(alumno.equals(grupo[i]) || alumno.equals(Integer.toString(i + 1))){
                System.out.println("La nota media del alumno " + alumno + " es: " + (nota1eva[i] + nota2eva[i] + nota3eva[i]) / 3);
            }
        }
    }
}
