
package Tema7.Persona2;
/*
@autor: Luke Eric Marten Llorente
 */
public class Main_registro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona vera = new  Persona("Vera", 222222222, "La Laguna");
        Persona aguilar = new  Persona("Aguilar", 333333333, "La Laguna");
        Persona masso = new  Persona("Masso", 111111111, "La Laguna"); 
        Persona crespo = new  Persona("Crespo", 444444444, "Malaga");
        Persona delgado = new  Persona("Delgado", 555555555, "Granadilla");

        System.out.println(vera);

        Registro registroLaLaguna = new Registro("La Laguna");


        // Crear un array con las personas del Ayuntamiento de  La Laguna
        // Instanciar un registro llamado registroLaLaguna con el constructor adecuado al que se le pasa
        // un array de personas y la ciudad
        // Empadronar a crespo registroLaLaguna 
        // Mostrar el registro imprimiendo el registro

        System.out.println(registroLaLaguna);
        
        // Llamar al metodo buscaCiudadNacimiento() para que filtre y muestre las personas de registroLaLaguna
        // cuya ciudad de nacimientos contiene una cadena determinada (ej: Laguna)

        registroLaLaguna.buscaCiudadNacimiento("Laguna");


        // Crear registro para la ciudad de Santa Cruz vacio

        Registro registroSantaCruz = new Registro("Santa Cruz");
        // Empadronar a delgado registroSantaCruz

        registroSantaCruz.empadronar(delgado);

        // Inscribir un hijo en el ayuntamiento de Santa Cruz
        // Mostrar el registro imprimiendo el registro
        // System.out.println(registroSantaCruz);
        
        // Probar el metodo equals() para ver si dos personas son iguales
        
    }
    
}
