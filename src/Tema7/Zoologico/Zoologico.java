package Tema7.Zoologico;

public class Zoologico {
    private Animal[] animales;
    private int numAnimales;

    public Zoologico(int capacidad) {
        animales = new Animal[capacidad]; // Array con la capacidad inicial
        numAnimales = 0;
    }

    public void agregarAnimal(Animal animal) {
        if (numAnimales < animales.length) {
            animales[numAnimales] = animal;
            numAnimales++;
        } else {
            System.out.println("No se pueden agregar más animales.");
        }
    }

    public void mostrarAnimales() {
        for (int i = 0; i < numAnimales; i++) {
            animales[i].mostrarInfo();
            animales[i].hacerSonido();
            System.out.println("-------------------------");
        }
    }
}
