package Tema7.Persona;

public class PersonaMain {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Luke", 18, "45981530E");

        persona1.mostrarInfo();

        System.out.println("¿Es mayor de edad? " + persona1.esMayorDeEdad());
    }
}
