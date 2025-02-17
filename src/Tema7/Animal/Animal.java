package Tema7.Animal;

public class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void comer(){
        System.out.println("El " + nombre + " está comiendo");
    }

    @Override
    public String toString(){
        return ("Soy un " + nombre + ", tengo " + edad + " años.");
    }


}
