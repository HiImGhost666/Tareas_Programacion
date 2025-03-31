package Tema8.Criatura;

public class Main {
    public static void main(String[] args) {
        Bestiario bestiario = new Bestiario();

        bestiario.añadirCriatura(new Dragon("Smaug", 300, 25.5, "Fuego", true));
        bestiario.añadirCriatura(new Fenrir("Fenris", 500, 5.0, "Oscuridad"));
        bestiario.añadirCriatura(new Dragon("Draco", 200, 15.0, "Hielo", false));

        System.out.println("--- Lista de Criaturas ---");
        bestiario.listarCriaturas();

        System.out.println("\n--- Criaturas de tipo Fuego ---");
        for (Criatura c : bestiario.buscarPorElemento("Fuego")) {
            System.out.println(c.obtenerDescripcion());
        }

        System.out.println("\n--- Ordenando por Tamaño ---");
        bestiario.ordenarPorTamaño();
        bestiario.listarCriaturas();
    }
}
