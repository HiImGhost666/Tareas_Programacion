package Tema8.interfazVolador;

public class Main {
    public static void main(String[] args) {
        Avion jet = new Avion("Jet", "Dos reactores", 3000.);

        System.out.println(jet);

        System.out.println(Avion.GRAVEDAD);
        jet.volar(14000., 300);

    }
}
