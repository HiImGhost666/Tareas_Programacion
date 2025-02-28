package Tema7.Progenitor;
/*
@autor: Luke Eric Marten Llorente
 */
public class Main {
    public static void main(String[] args) {
        //Creamos la instancia Luke
        Progenitor Luke = new Progenitor("Luke", "Marten","Llorente");
        //Creamos la instancia Paula
        Progenitor Paula = new Progenitor("Paula", "Garcia", "Galon");

        //Creamos la instancia Hijo "Pablo"
        Hijo Pablo = new Hijo("Pablo", "Marten", "Galon", 0);


        //Imprimimos los datos del hijo creado por el constructor
        System.out.println("Dato hijo instanciado con constructor:");

        System.out.println("\t" + Pablo);

        //Imprimimos los datos de los Progenitores.
        System.out.println(Luke);
        System.out.println(Paula);


        //Llamamos al metodo reproducir e imprime informacion del hijo.
        Progenitor.reproducir(Luke,Paula);


        //Otros metodos como el de cumplir() y mejorAmigo() e imprime los datos para ver los cambios.
        System.out.println("Datos del hijo despues de cumplir años:");
        Pablo.cumplir();
        System.out.println("\t" + Pablo);
        Pablo.mejorAmigo("Pocoyo");
        System.out.println(Pablo);


        //Probando el clone()
        System.out.println(Luke);

        System.out.println("Datos del clon de Luke");
        Progenitor LukeClon = Luke.clone();

        System.out.println(LukeClon);
    }
}
