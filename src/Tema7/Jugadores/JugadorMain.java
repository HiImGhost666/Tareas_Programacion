package Tema7.Jugadores;

public class JugadorMain {
    public static void main(String[] args) {

        Jugador batman = new Jugador("Batman", 10);
        Jugador WonderWoman = new Jugador("Wonder Woman", 15);
        System.out.println(batman);
        System.out.println(WonderWoman);

        Jugador.combate(batman, WonderWoman);

        System.out.println("\n");
        System.out.println(batman);
        System.out.println(WonderWoman);
        Jugador.combate(batman, WonderWoman);

        System.out.println("\n");

        System.out.println(batman);
        System.out.println(WonderWoman);
        Jugador.combate(batman, WonderWoman);

        System.out.println("\n");

        System.out.println(batman);
        System.out.println(WonderWoman);
        Jugador.combate(batman, WonderWoman);


        System.out.println(batman);
        System.out.println(WonderWoman);
        Jugador.combate(batman, WonderWoman);


        batman.mostrarRegistro();
        WonderWoman.mostrarRegistro();

        System.out.println();
    }
}
