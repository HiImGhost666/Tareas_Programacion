package Tema7.Individuo;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        // Creamos un objeto original
        Individuo individuo1 = new Individuo("García", "Negro", "12345678A");

        // Clonamos el objeto
        Individuo individuo2 = individuo1.clone();

        // Mostramos los objetos originales y clonados
        System.out.println("Objeto original: " + individuo1);
        System.out.println("Clon: " + individuo2);

        // Comparamos el original con el clon
        System.out.println("¿El original y el clon son iguales? " + individuo1.equals(individuo2)); // ✅ true (mismo contenido)

        // Modificamos el clon para ver si sigue siendo igual
        individuo2 = new Individuo("García", "Negro", "87654321B");
        System.out.println("\nDespués de modificar el DNI del clon:");
        System.out.println("Objeto original: " + individuo1);
        System.out.println("Clon modificado: " + individuo2);
        System.out.println("¿El original y el clon son iguales? " + individuo1.equals(individuo2)); // ❌ false (DNI cambiado)

    }
}
