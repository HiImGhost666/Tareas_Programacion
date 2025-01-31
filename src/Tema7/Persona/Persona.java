package Tema7.Persona;

public class Persona {
    private String nombre;
    private int edad;
    private String DNI;


    public Persona(String nombre, int edad, String DNI) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
    }


    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + "\n Edad: " + edad + "\n DNI: " + DNI);
    }

   public boolean esMayorDeEdad(){
        return edad >= 18;
   }
}
