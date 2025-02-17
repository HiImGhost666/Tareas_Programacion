package Tema7.Animal;

public class Main {
    public static void main(String[] args) {
        Animal Leon = new Animal("Leon", 23);

        Mamifero ciervo = new Mamifero("Ciervo", 35, "Ns", 4);

        Perro perro = new Perro("Perro", 2, "Tampoco se", 4, "Labrador", true);

        Persona persona = new Persona("Luke", 22, "Yo que se", 2, "45981530E", "653281958");

        System.out.println(Leon);
        System.out.println(ciervo);
        System.out.println(perro);
        System.out.println(persona);
    }
}
