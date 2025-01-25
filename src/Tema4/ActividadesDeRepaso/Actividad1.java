/*
1. Diseñar la función eco() a la que se le pasa como parámetro un
número n, y muestra por pantalla n veces el mensaje «Eco...».
 */
package Tema4.ActividadesDeRepaso;
import java.util.Scanner;
public class Actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        eco(10);
    }

    static int eco(int num){
        for(int i = 1; i <= num; i++){
                System.out.println("Eco...");
        }
        return num;
    }


}
