package Tema7.Zoologico2;

public class Main {
    public static void main(String[] args) {
        Animal Leon = new Animal("Leon", 23, "Selva", true, new String[]{"Carnivoro", "Herbivoro"});

        Animal ciervo = new Animal("Ciervo", 35, "Ns", true, new String[]{"Carnivoro", "Herbivoro"});

        Mamifero perro = new Mamifero("Perro", 2, "Tampoco se", false, new String[]{"Carnivoro", "Herbivoro"}, true);

        Ave pato = new Ave("Pato", 2, "Tampoco se", false, new String[]{"Carnivoro", "Herbivoro"}, 2);


        System.out.println(Leon);
        System.out.println(ciervo);
        System.out.println(perro);
        System.out.println(pato);

        System.out.println(Leon.presentarse());
        System.out.println(ciervo.presentarse());
        System.out.println(perro.presentarse());
        System.out.println(pato.presentarse());


        Leon.alimentarse("Carne");
        ciervo.alimentarse("Pollas");
        perro.alimentarse("Carnivoro");
        pato.alimentarse("Carnivoro");


        System.out.println(Animal.compararEdad(Leon, ciervo));

        Animal lobo = perro.clone();

        System.out.println(lobo);
        lobo.presentarse();
        lobo.alimentarse("Carnivoro");

        System.out.println(Animal.compararEdad(perro, lobo));

    }
}
