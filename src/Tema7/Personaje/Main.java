package Tema7.Personaje;

public class Main {
    public static void main(String[] args) {
//        Personaje IronMan = new Personaje("Iron Man", 10, 100);
//        Personaje SpiderMan = new Personaje("Spider-Man", 10, 120);
//
//        Personaje.saludar(IronMan, SpiderMan);
//
//        System.out.println(SpiderMan);
//
//        SpiderMan.descansar();
//
//        System.out.println(SpiderMan);

        Heroe Batman = new Heroe("Batman", 10, 100, false);
        Villano Joker = new Villano("Joker", 9, 90, "Es maricon");

        System.out.println(Batman);
        System.out.println(Joker);

        Batman.descansar();

        Personaje.saludar(Batman, Joker);

        Joker.ataque(Batman);

        Heroe DrStrange = new Heroe("Dr Strange",10, 100, true);
        System.out.println(DrStrange);

        Heroe DrStrangeClon = DrStrange.clonar();

        System.out.println(DrStrangeClon);

        System.out.println(DrStrange.equals(DrStrangeClon));


    }
}
