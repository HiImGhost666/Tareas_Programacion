public class MainSuperHeroe {
    public static void main(String[] args) {

        SuperHeroe heroe = new SuperHeroe("Spiderman", 10, true, "Peter Parker", Universe.MARVEL);
        SuperHeroe heroe2 = new SuperHeroe("Batman", 10, true, "Bruce Wayne", Universe.DC);

        heroe.presentarse();
        heroe.identidadSecreta();
        heroe.mostrarDetenidos();
        heroe2.presentarse();
        heroe2.identidadSecreta();
        heroe2.mostrarDetenidos();
        heroe.Ganador(heroe, heroe2);

    }
}