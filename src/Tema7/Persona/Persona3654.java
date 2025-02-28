package Tema7.Persona;

public class Persona3654 {
    private String nombre;
    private int edad;
    private String DNI;


    public Persona3654(String nombre, int edad, String DNI) {
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
