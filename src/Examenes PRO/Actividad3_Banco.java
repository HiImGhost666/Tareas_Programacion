/*
Hacer  un  programa  que  simule  un  cajero  automático  con  un  saldo  inicial  de  1000€  con  el siguiente menú de opciones:
1.Ingresar dinero. Puedes ingresar lo que quieras. La cantidad a ingresar no puede ser negativa,ni cero
y el mínimo a ingresar debe ser de 0,1€, si no el programa dará un error.

2.Retinar dinero. No puedes retirar más de lo que tienes ni retirar cero, el valor mínimo a retirar será 0.1€

3.Salir. Salimos del cajero.

Si marcamos una opción del menú incorrecta nos dará un error.Recuerda que el saldo inicial no va a cambiar nunca,
siempre será elmismo.

El saldo actual será el nuevo saldo después de un ingreso o una retirada.
 */
import java.util.Scanner;
public class Actividad3_Banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int saldo = 1000;

        System.out.println("Bienvenido al cajero");
        System.out.println("1. Ingresar dinero");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Salir");

        System.out.println("Por favor, introduce una de las opciones");

        switch (sc.nextInt()) {
            case 1:
                System.out.println("Por favor, introduce la cantidad a introducir");
                int cantidad = sc.nextInt();
                if(cantidad < 0 || cantidad == 0){
                    System.out.println("La cantidad introducida es incorrecta");
                }else if(cantidad < 0.1){
                    System.out.println("La cantidad introducida es incorrecta");
                }else{
                    saldo += cantidad;
                    System.out.println("El saldo actual es de: " + saldo);
                }
                break;
            case 2:
                System.out.println("Por favor, introduce la cantidad a retirar");
                int cantidad2 = sc.nextInt();
                if(cantidad2 < 0 || cantidad2 == 0){
                    System.out.println("La cantidad introducida es incorrecta");
                }else if(cantidad2 < 0.1){
                    System.out.println("La cantidad introducida es incorrecta");
                }else if(cantidad2 > saldo){
                    System.out.println("No tienes esa cantidad");
                }else{
                    saldo -= cantidad2;
                    System.out.println("El saldo actual es de: " + saldo);
                }
                break;
            case 3:
                System.out.println("Hasta pronto");
                break;
            default:
                System.out.println("La entrada introducida es incorrecta");
                break;
        }
    }
}
