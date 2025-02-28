
package Tema7.Persona2;

import java.util.Scanner;

/*
@autor: Luke Eric Marten Llorente
 */
public class Registro {
    Scanner sc = new Scanner(System.in);
    private Persona[] listaPersonas;
    private String ciudad;
    private String ciudadEmpadronamiento;



    public Registro(String ciudad) {
      // Creo un registro sin ningúb elemento en la lista de personas empadronadas 
      // y le asigno la ciudad que se le pasa como argumento
        this.listaPersonas = new Persona[0];

        this.ciudad = ciudad;
    }


    // SOBRECARGAR el Constructor de forma que le pase un array de personas y la ciudad del Ayuntamiento
    public Registro(Persona[] listaPersonas, String ciudad) {
        this.listaPersonas = new Persona[0];
        this.ciudad = ciudad;
    }


    public Persona[] getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(Persona[] listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCiudadEmpadronamiento() {
        return ciudadEmpadronamiento;
    }

    public void setCiudadEmpadronamiento(String ciudadEmpadronamiento) {
        this.ciudadEmpadronamiento = ciudadEmpadronamiento;
    }

    // método INSCRIBIRHIJO
    public void inscribirHijo() {

        System.out.println("Introduce el apellido del hijo:");
        String apellidoHijo = sc.nextLine();

        String dni = "";
        for(int i = 0; i < 9; i++){
            dni += (int) Math.random() * 10;
        }


        // asignar un dni aleatorio de 9 cifras
        // lo inscribe en la ciudad del registro en el que se inscribre
        // debe agregar la persona con los datos generados al registro
    }
    
//    // método EMPADRONAR
    public void empadronar(Persona persona) {
        this.ciudadEmpadronamiento = ciudad
        ;
        // Al empadronar una persona debe sobreescribir  la ciudad de empadronamiento de la persona
        // por la ciudad donde se encuentra el registro
        // Debe agregar la persona al registro
    }

        
                
    // Método void para añadir un objeto individuo a al array de individuos (lista) de  un Objeto Listado    
        
//    private void append(Persona persona) { //Agrega un objeto Individuo a la lista de personas del registro
//        // Modificar el método append que vimos en clase
//        // Adjunto metodo append visto en clase debe modificarse para que funciones correctamente
//
//    }

    public Persona[] append(Persona nuevaPersona) { //Agrega un objeto Individuo a la lista de individuos del objeto listado
        Persona[] nuevoArrayIndividuo = new Persona[listaPersonas.length + 1]; // Creo un array con un elemento mas que de this.lista
        for (int i = 0; i < listaPersonas.length; i++) { // Copio todos los elementos de this.lista al principo de la lista de nuevoArrayIndividuo
            nuevoArrayIndividuo[i] = listaPersonas[i];
        }
        nuevoArrayIndividuo[nuevoArrayIndividuo.length-1]= nuevaPersona;  // Agrego el nuevoIndividuo el la ultima posicion del nuevoArrayIndividuo
        this.listaPersonas =  nuevoArrayIndividuo; // Reescribo la lista de individuos del objeto listado que invoca el metodo, no necesito reescribir el objeto Listado

        return nuevoArrayIndividuo;
    }



    public void buscaCiudadNacimiento(String ciudad) {
        System.out.println("Lista de personas nacidas en la ciudad que contiene " + ciudad);
        // Mostrar s�lo las personas del registro que contengan la cadena ciudad en el atributo ciudadNacimiento de la clase persona

        for(int i = 0; i < listaPersonas.length; i++){
            if(listaPersonas[i].equals(ciudad)){
                System.out.println(listaPersonas[i]);
            }
        }
    }
        
    
    @Override
    public String toString() {
        String textoSalida = " ";
        // Ejemplo de formato del String (usar para que sea m�s facil String.format):
//      Listado de personas empadronadas en el Ayuntamiento de La Laguna:
//	Apellido     DNI        Ciudad Nacimiento    Ciudad Empadronamiento
//	Vera         222222222  La Laguna            La Laguna           
//	Aguilar      333333333  La Laguna            La Laguna           
//	Masso        111111111  La Laguna            La Laguna           
//	Crespo       444444444  Malaga               La Laguna           
//	ivan         226293513  La Laguna            La Laguna           


        return textoSalida;
    }


    
    
}
