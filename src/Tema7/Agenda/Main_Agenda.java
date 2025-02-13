package Tema7.Agenda;

import java.util.Arrays;

/**
 *
 * @author Juan Carlos Vega <jvegbel@canariaseducacion.es>
 */
public class Main_Agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contacto juan = new Contacto("Juan", "Vega",  "444666111Q", "666777888", 18);
        Contacto eva = new Contacto("Eva", "Pineiro", "422662111x", 25);
        Contacto ana = new Contacto("Ana", "Perez",   "444444444h", "444555666",40);

//      int[] enteros = {1, 2, 3, 4};         // Así declaro e inicializo un array de elementos tipo entero
//      String[] nombres = {"Juan", "Pepe"};  // Así declaro e inicializo un array de elementos tipo String
        Contacto[] contactos = {juan, eva};   // Declaro e inicializo una array de elementos clase Contacto

     
        Agenda agenda = new Agenda(contactos); // Creo una agenda con un array de contactos ya creado
        System.out.println(agenda);

        agenda.append(ana);   // Añado un contacto a la agenda
        System.out.println(agenda);

    }

}
