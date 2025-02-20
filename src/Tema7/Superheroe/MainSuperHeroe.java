package Tema7.Superheroe;

public class MainSuperHeroe {
    public static void main(String[] args) {

        SuperHeroe heroe = new SuperHeroe("Spiderman", 10, true, "Peter Parker", Universe.MARVEL);
        SuperHeroe heroe2 = new SuperHeroe("Batman", 10, true, "Bruce Wayne", Universe.DC);

        heroe.presentarse();
        heroe.identidadSecreta();
        heroe2.detiene("Joker");
        heroe2.mostrarDetenidos();
        heroe2.presentarse();
        heroe2.identidadSecreta();
        heroe2.mostrarDetenidos();
        heroe.Ganador(heroe, heroe2);

        heroe.detiene("Thanos");
        heroe.mostrarDetenidos();
    }
}