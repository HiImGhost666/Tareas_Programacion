package Tema10.GestiónDeNavesEspaciales;

public class Main {
    public static void main(String[] args) {
        HangarGalactico hangar = new HangarGalactico();

        hangar.añadirNave(new NaveMilitar("A001", "Interceptor", 30000, 2010, 10, 90));
        hangar.añadirNave(new NaveCientifica("C001", "Curiosity", 20000, 2015, 5, 12));
        hangar.añadirNave(new NaveMilitar("A002", "Defender", 28000, 2012, 8, 80));
        hangar.añadirNave(new NaveCientifica("C002", "Explorer", 21000, 2020, 4, 10));
        hangar.añadirNave(new NaveMilitar("A003", "Hammer", 35000, 2005, 15, 70));
        hangar.añadirNave(new NaveCientifica("C003", "Orion", 24000, 2018, 6, 14));

        System.out.println("=== Todas las naves ===");
        hangar.listarNaves();

        System.out.println("\n=== Ordenado por Nombre ===");
        hangar.ordenar(new ComparadorPorNombre());
        hangar.listarNaves();

        System.out.println("\n=== Ordenado por Valor Estratégico ===");
        hangar.ordenar(new ComparadorPorValorEstrategico());
        hangar.listarNaves();

        System.out.println("\n=== Eliminando nave con matrícula A002 ===");
        boolean eliminada = hangar.eliminarNave("A002");
        System.out.println("Resultado: " + eliminada);
        hangar.listarNaves();

        System.out.println("\n=== Exportando a texto ===");
        hangar.exportarATexto("naves.txt");

        System.out.println("\n=== Guardando en binario y recargando ===");
        hangar.guardarBinario("naves.bin");
        hangar = new HangarGalactico(); // borramos el array
        hangar.cargarBinario("naves.bin");
        hangar.listarNaves();
    }
}
