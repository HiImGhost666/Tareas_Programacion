/*
jercicio 5: Simulación de un Zoológico 🦁🐒🐘
Crea una clase Animal con:

nombre (String)
especie (String)
edad (int)
Debe incluir:
✅ Un constructor que reciba estos atributos.
✅ Un método hacerSonido() (diferente para cada animal).
✅ Un método mostrarInfo().

📌 Extra:
Crea clases Leon, Mono, Elefante, etc., que hereden de Animal y sobrescriban hacerSonido().

Crea una clase Zoologico con una lista de animales y métodos para:
✅ Agregar animales.
✅ Mostrar todos los animales.

📌 En main():

Crea varios animales.
Agrega animales al zoológico.
Llama a hacerSonido() de cada uno.
 */
package Tema7.Zoologico;

public class ZoologicoMain {
    public static void main(String[] args) {
        Zoologico zoologico = new Zoologico(5); // Capacidad de 5 animales

        // Crear animales
        Perro perro1 = new Perro("Rex", 5);
        Gato gato1 = new Gato("Miau", 3);
        Leon leon1 = new Leon("Simba", 8);

        // Agregar animales al zoológico
        zoologico.agregarAnimal(perro1);
        zoologico.agregarAnimal(gato1);
        zoologico.agregarAnimal(leon1);

        // Mostrar animales y hacerlos sonar
        zoologico.mostrarAnimales();
    }
}
