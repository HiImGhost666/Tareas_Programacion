/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema11.IntefacesConGenericos;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author jvega
 */
public class Main_comparable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Socio luisito = new Socio(2, "Luisito", "11-07-2002");
        Socio luisa = new Socio(15, "Luisa", "21-11-2001");
        Socio elena = new Socio(5, "Elena", "21-11-2010");
//        int resultado = luisito.compareTo(luisa);
//         System.out.print("resultado = " + resultado + ": ");
//        if (resultado >= 1) {
//            System.out.println( "luisa es un socio más antiguo que luisito.\n" );
//        } else if (resultado <= -1) {
//            System.out.println("luisito es un socio más antiguo que luisa.\n" );
//        } else {
//            System.out.println("Error luisito y luisa tienen el mismo nº de socio.\n" );
//        }

        
//        Socio[] tabla = new Socio[] {
//           new Socio(3, "Luisito", "11-07-2002"),
//           new Socio(5, "Luisa", "21-11-2001"),
//           new Socio(200, "Elena", "21-11-2010")
//        };

        Socio[] arraySocios = {luisito,luisa,elena, new Socio(200,"Pedro","12-08-2002")};

        System.out.println("Orden natural (por ID)");
        Arrays.sort(arraySocios);
        System.out.println(Arrays.deepToString(arraySocios));

        //Comparator para las edades
        Comparator cEdad = new ComparaEdades();

        System.out.println("Orden basado en las edades. .reversed() sirve para cambiar el orden al reves.");
        Arrays.sort(arraySocios, cEdad.reversed());
        System.out.println(Arrays.deepToString(arraySocios));


        //Comparator para los nombres
        Comparator cNombre = new ComparaNombres();

        System.out.println("Orden basado en los nombres");
        Arrays.sort(arraySocios, cNombre);
        System.out.println(Arrays.deepToString(arraySocios));










    }
    
    
}
