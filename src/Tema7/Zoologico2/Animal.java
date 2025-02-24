package Tema7.Zoologico2;

import java.util.Arrays;

public class Animal {
    private String nombre;
    private int edad;
    private String habitat;
    private boolean enPeligro;
    private String[] dieta;

    public Animal(String nombre, int edad, String habitat, boolean enPeligro, String[] dieta) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.enPeligro = enPeligro;
        this.dieta = dieta;
    }

    public String presentarse(){
        return "Soy " + this.nombre + ", tengo " + this.edad + " años y vivo en " + this.habitat;
    }

    public void alimentarse(String comida){
        for (int i = 0; i < this.dieta.length; i++) {
            if (comida.equals(this.dieta[i])) {
                System.out.println("El " + this.nombre + " puede comer " + comida);
            } else{
                System.out.println("El " + this.nombre + " no puede comer " + comida);
            }
        }
    }

    public boolean isEnPeligro() {
        return enPeligro;
    }

    public static String compararEdad(Animal animal1, Animal animal2) {
        if (animal1.edad > animal2.edad) {
            return animal1.nombre + " es más viejo que " + animal2.nombre;
        } else if (animal1.edad < animal2.edad) {
            return animal2.nombre + " es más viejo que " + animal1.nombre;
        } else {
            return animal1.nombre + " y " + animal2.nombre + " tienen la misma edad.";
        }
    }


    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", habitat='" + habitat + '\'' +
                ", enPeligro=" + enPeligro +
                ", dieta=" + dieta +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return enPeligro == animal.enPeligro && edad == animal.edad && nombre.equals(animal.nombre) && habitat.equals(animal.habitat) && Arrays.equals(dieta, animal.dieta);
    }

    @Override
    public Animal clone(){
        return new Animal(this.nombre, this.edad, this.habitat, this.enPeligro, this.dieta);
    }




}
