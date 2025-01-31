/*
Hacer  un  programa  que  simule  una calculadora de  impuestos y  descuentos automático según la cantidad económica introducida por el usuario por teclado
MENÚ:
(1)Calcular el IVA sobre el precio
(2)Calcular el IGIC sobre el precio
(3)Realizar otro descuento X sobre el precio
(4)Salir

El IVA se obtiene calculando el 21% (0,21) del precio del producto y para el IGIC sería el 7% (0,07).
Para  calcular  una  cantidad  económica  con  el  IVA  por  ejemplo(se  haría  igual  con  el  IGIC  pero cambiando el valor),
 se tiene que multiplicar esa cantidad económica por 0,21y después sumarle este resultado resultante al valor económico.

 Para calcular un descuento, se realiza igual que cualquier impuesto, pero con el descuento que se le pida al usuario por teclado.

 El precio con descuento sería quitarle al precio original la cantidad calculada del descuento.

 Si marcamos una opción del menú incorrecta nos dará un error.La cantidad económica la introduce el usuario por teclado.
 */

import java.util.Scanner;
public class MenuImpuestos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("MENU:");
        System.out.println("(1)Calcular el IVA sobre el precio");
        System.out.println("(2)Calcular el IGIC sobre el precio");
        System.out.println("(3)Realizar otro descuento X sobre el precio");
        System.out.println("(4)Salir");
        System.out.println("Por favor, introduce una opción del menu: ");
        switch (sc.nextInt()) {
            case 1:
                System.out.println("Introduce el precio: ");
                double precioIVA = sc.nextDouble();
                double IVA = (precioIVA * 0.21);
                System.out.println("IVA: " + IVA);
                System.out.println("Total: " + (IVA + precioIVA));
                break;
            case 2:
                System.out.println("Introduce el precio: ");
                double precioIGIC = sc.nextDouble();
                double IGIC = (precioIGIC * 0.07);
                System.out.println("IGIC: " + IGIC);
                System.out.println("Total: " + (IGIC + precioIGIC));
                break;
            case 3:
                System.out.println("Introduce el precio: ");
                double precioDescuento = sc.nextDouble();
                System.out.println("Porcentaje de Descuento: ");
                double porcentaje = sc.nextDouble();
                double descuento2 = (porcentaje * precioDescuento) / 100;
                System.out.println("Descuento: " + descuento2);
                System.out.println("Total: " + (precioDescuento - descuento2));
                break;
            case 4:
                System.out.println("Hasta pronto");
                break;
            default:
                System.out.println("Opción incorrecta");
        }

    }
}
