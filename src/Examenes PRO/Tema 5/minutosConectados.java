
package arrays;
import java.util.Scanner;
import java.util.Arrays;

/**
* En Canarias, una encuesta se encarga de recoger y de analizar cuantos
minutos dedican al día los jóvenes al uso de las redes sociales. El tiempo se recoge y se mide
en minutos, es decir, si el usuario gasta una hora y diez minutos al día, los datos que se
introducen serían 70 min, si es de una hora y media sería 90 minutos. Se introducen datos
hasta que se pulse 0.
Como información interesante, el número máximo de usuarios analizados NUNCA será mayor
de 10 ni menor que 1.
Realiza de manera independiente, funciones que realicen las siguientes tareas.
 a) Array ordenado ascendentemente.
 b) Función que me genere un nuevo array con los minutos pares comprendidos entre 120-240.
 c) Función que me devuelva los minutos máximos.
 d) La media de los minutos expresado en horas. 

 * @author jvega
 */
public class minutosConectados {

    public static void main(String[] args) {
        Scanner leeEntero = new Scanner(System.in);
        int minutos[] = new int[0];
        int matrizRango[];
        int tiempo;
        for (int i =0; i<10; i++) {
            System.out.println("Introduce los minutos conectdps para la persona "+(i+1)+": ");
            tiempo = leeEntero.nextInt();
            if (tiempo ==0)
                break;
            minutos = Arrays.copyOf(minutos, minutos.length+1);
            minutos[minutos.length-1] = tiempo;
        }
        ordena(minutos);
        System.out.println("Array ordenado: " + Arrays.toString(minutos));    
        matrizRango = intervalo(minutos);
        System.out.println("Valores entre 120 y 240 y pares: " + Arrays.toString(matrizRango));   
        System.out.println("Persona con mayor número de minutos conectados: " + maximo(minutos));
        System.out.println("Media de minutos conectados: " + media(minutos));
    }
    
    static void ordena(int x[]){   // a) Función que ordena un Array ascendentemente.
        Arrays.sort(x);
    }
    
    static int [] intervalo(int x[]) {    // b) Función que me genere un nuevo array con los minutos pares comprendidos entre 120-240.
        int matriz[] = new int[0];
        for (int i=0; i<x.length;i++)
            if (x[i] > 120 && x[i]<240 && x[i]%2 ==0) {
                matriz = Arrays.copyOf(matriz, matriz.length+1);
                matriz[matriz.length-1] = x[i];
            }
        return matriz;
    }
    
    static int maximo(int x[]) { // c) Función que me devuelva los minutos máximos.
        Arrays.sort(x);
        return x[x.length-1];
    }
    
    static double  media(int x[]) { // d) Función que calcula la media de los minutos expresado en horas. 
        double media=0;
        for (int i=0; i<x.length; i++)
            media += x[i];
        media /= (x.length*60);
        return media;
    }
}
