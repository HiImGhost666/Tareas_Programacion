
package arrays;
import java.util.Scanner;
import java.util.Arrays;

/**
* Los datos de los casos de covid en los municipios de la isla de Tenerife están
representados en los arrays del inicio del programa:
* a) Cambiar un dato existente Introduciendo el nombre del municipio.
* b) Introducir un nuevo dato en el array.
* c) Listado de todos los casos por municipio actuales.
* d) Función a la que se le pasa como parámetro un número de casos y te devuelve el
*    número de municipios que tienen más de ese número de casos.
* e) Mostrar por consola UNICAMENTE el nombre de los municipios que tienen más de
*    1000 casos y el número total de casos que suman esos municipios.
* f) Mostrar el municipio con mayor número de casos y también el que tiene menos casos. 
 * @author jvega
 */
public class municipios {

    public static void main(String[] args) {
        Scanner leeEntero = new Scanner(System.in);
        String[] municipios = {"Adeje","Arafo","Arico","Arona","Buenavista del Norte",
          "Candelaria","El Rosario","El Sauzal","El Tanque","Fasnia","Garachico","Granadilla de  Abona",
          "Guia de Isora","Güimar","Icod de Los Vinos","La Guancha","La Laguna","La Matanza de Acentejo",
          "La Orotava","La Victoria de Acentejo","Los Realejos","Los Silos","Puerto de La Cruz",
          "San Juan de La Rambla","San Miguel de Abona","Santa Cruz de Tenerife",
          "Santa Ursula","Santiago del Teide","Tacoronte","Tegueste","Vilaflor"}; 
        int[] casos ={2367,47,128,3139,29,505,272,135,44,65,17,2659,646,415,400,
            84,12645,125,749,234,826,56,876,49,307,25563,198,194,548,128,37}; 


        
        //System.out.println(Arrays.binarySearch(municipios, "Arafo"));
        
        cambiaDato (municipios, casos);   // a) Función para cambiar el dato de casos de covid de un municipio
        // Para añadir un nuevo municipio con su nº de casos de covid necesito aumentar la dimensión de ambos arrays
        municipios= Arrays.copyOf(municipios, municipios.length+1);
        casos= Arrays.copyOf(casos, casos.length+1);
        nuevoDato (municipios, casos);    // b) Función introducir nuevo dato (municipio + casos)
        listadoCasos (municipios, casos); // c) Función para listar los municipio y sus casoss de covid 
        System.out.println("Escribe el número de casos para ver cuantos municipios tiene ese nº de casos o más: "); 
        int numero =  leeEntero.nextInt();
        numeroCasos(casos, numero);       // d) Función que da cuantos municipios tienen "n" casos o más
        System.out.printf("Hay %d municipios con %d casos de covid o más\n", numeroCasos(casos, numero), numero); 
    
        mostrarMunicipios(municipios,casos);// e) Mostrar por consola UNICAMENTE el nombre de los municipios que tienen más de
                                            //    1000 casos y el número total de casos que suman esos municipios.
        // Reordeno el array  de municipios alfabéticamente y debo reordenar paralelamente el array de casos de covid
        ordenaMatrices (municipios, casos);
         
        // Vuelvo a llamar a la función para dar el listado de municipios y casos, y compruebo que se ha hecho bien.
        listadoCasos (municipios, casos);
        
        maximoMinimo(municipios, casos);  // f) Mostrar el municipio con mayor número de casos y también el que tiene menos casos. 
        
    }
    
    static void cambiaDato(String municipios[], int casos[]) {
        Scanner leeEntero = new Scanner(System.in);
        Scanner leeString = new Scanner(System.in, "windows-1252"); // Pongo el "windows-1252") para que recopnozca  Güimar
        System.out.println("Escribe el nombre del Municipio que quieres modificar los casos covid: ");
        String nombre = leeString.nextLine(); 
        boolean salta =false;
        for (int i =0; i<municipios.length; i++){
            if (municipios[i].equals(nombre)) {
                System.out.printf("Introduce el valor actualizado de casos para el muncipio %s: ", municipios[i]);
                int valor =  leeEntero.nextInt();
                casos[i]= valor; 
                salta =true;
            }
            if (salta)
                break;
        }
    }
    
    static void nuevoDato(String municipios[], int casos[]){
        Scanner leeEntero = new Scanner(System.in);
        Scanner leeString = new Scanner(System.in, "windows-1252");
        System.out.printf("Introduce el nombre del municipio a añadir: ");
        municipios[municipios.length-1] = leeString.nextLine();
        System.out.printf("Introduce el número de casos de covid del municipio: ");
        casos[casos.length-1] = leeEntero.nextInt(); 
    }
    
    static void listadoCasos(String municipios[], int casos[]) {
        
        System.out.println("Listado municipios y sus casos correspondientes de covid: ");
        for (int i =0; i<municipios.length; i++)
           System.out.println(municipios[i]+": "+casos[i]);
    }
     
     
    static int numeroCasos(int casos[], int numero) {
        int nmunicipios =0;
        //System.out.println("Número de municipios con " + numero + " casos o más: ");
        for (int i =0; i<casos.length; i++) 
            if (casos[i]>= numero)
                nmunicipios++;                   
       return nmunicipios;
    } 
     
    static void ordenaMatrices (String municipios[], int casos[]) {
        String xcopia[] = Arrays.copyOf(municipios,municipios.length );
        int ycopia[] = Arrays.copyOf(casos,municipios.length );
        Arrays.sort(municipios);
        for (int i=0; i<municipios.length;i++) {
            casos[Arrays.binarySearch(municipios, xcopia [i])]= ycopia[i];   
        }  
    }
    
    static void mostrarMunicipios (String municipios[], int casos[]) {
        int suma =0;
        for (int i=0; i<municipios.length;i++) {
            if (casos[i] > 1000) {
                System.out.print("\""+ municipios[i] + "\" ");
                suma += casos[i];
            }
        }  
        System.out.println("Entre todos suman "+ suma + " casos");   
    }
    
     static void maximoMinimo (String municipios[], int casos[]) {
        String xcopia[] = Arrays.copyOf(municipios,municipios.length );
        int ycopia[] = Arrays.copyOf(casos,municipios.length );
        Arrays.sort(casos);
        for (int i=0; i<municipios.length;i++) {
            municipios[Arrays.binarySearch(casos, ycopia [i])]= xcopia[i];   
        }
        System.out.println("El municipio con más casos es "+ municipios[municipios.length-1] + " con "+  casos[municipios.length-1]+ " casos.");  
        System.out.println("El municipio con menos casos es "+ municipios[0] + " con "+  casos[0]+ " casos.");  
        
    }
    
    
}

