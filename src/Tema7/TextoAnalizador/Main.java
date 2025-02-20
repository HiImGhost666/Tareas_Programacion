package Tema7.TextoAnalizador;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de la clase TextoAnalizador con diferentes textos
        TextoAnalizador texto1 = new TextoAnalizador("Hola mundo, esto es un programa en Java.");
        TextoAnalizador texto2 = new TextoAnalizador("El aprendizaje de Java es divertido y útil.");
        TextoAnalizador texto3 = new TextoAnalizador("Una cadena de texto con palabras largas como electroencefalografista.");

        // Mostrar información del análisis para cada texto
        System.out.println("🔍 Análisis de Texto 1:");
        System.out.println(texto1.toString());
        System.out.println("\n🔍 Análisis de Texto 2:");
        System.out.println(texto2.toString());
        System.out.println("\n🔍 Análisis de Texto 3:");
        System.out.println(texto3.toString());

        // Probar métodos individuales
        System.out.println("\n📌 Pruebas de Métodos Individuales:");
        System.out.println("Palabra más larga en Texto 1: " + texto1.palabraMasLarga());
        System.out.println("Frecuencia de 'Java' en Texto 1: " + texto1.buscarPalabra("Java"));
        System.out.println("Acrónimo de Texto 2: " + texto2.convertirAcronimo());
        System.out.println("Resumen de Texto 3: " + texto3.generarResumen());
    }
}
