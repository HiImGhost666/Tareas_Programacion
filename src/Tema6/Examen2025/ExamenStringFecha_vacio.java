
package Tema6.Examen2025;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author jvega
 */
public class ExamenStringFecha_vacio {

    public static void main(String[] args) {
        boolean condicion = true; // Condic�n de salida del do-while (al menos debe haber una condicion)
        Scanner sc = new Scanner(System.in);
        // Declaracion e inicializacion de variables globales necesarias para el programa
        String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio",
            "agosto", "septiembre", "agosto", "octubre", "noviembre", "diciembre"};

        // Hacer una estructura do-while para que el programa solicite la fecha 
        // hasta que se introduzca el formato adecuado

        do {
            System.out.println("Introduce un mes:");
            String mesElegido = sc.nextLine();


            for(int i = 0; i < mes.length; i++){
                if(mesElegido.equalsIgnoreCase(mes[i])){
                    System.out.println("Se encontró el mes: " + mes[i]);
                    break;
                } else{
                    System.out.println("Has introducido mal el mes, las opciones son: " + Arrays.toString(mes));
                    break;
                }
            }


            System.out.println("Introduce un año:");
            String año = sc.nextLine();


            if(año.length() > 4){
                System.out.println("4 digitos como mucho");
            }

            break;






            // Leo A�O y Compruebo formato 
            // ..........
      
     } while (condicion);
        
         System.out.println("Has introducido correctamente la fecha: " + "Poner valores de mes y a�o"); 
      
    }
    
}
