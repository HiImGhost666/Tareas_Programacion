package Tema7.ejemploPersona;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona("Juan", "6536574");
        System.out.println(persona);

        Alumno alumno = new Alumno("Juan", "654547635", "1ºDAW");
        System.out.println(alumno);
    }
}
