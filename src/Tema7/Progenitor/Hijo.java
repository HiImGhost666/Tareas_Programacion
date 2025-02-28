package Tema7.Progenitor;
/*
@autor: Luke Eric Marten Llorente
 */
public class Hijo extends Progenitor{
    private int edad;
    private String amigos;


    //Creamos el constructor
    public Hijo(String nombre, String apellido1, String apellido2, int edad) {
        super(nombre, apellido1, apellido2); //Hereda de Progenitor.
        this.edad = edad;
        this.amigos = "Sin amigos"; //Por defecto
    }


    //Los Getters y Setters necesarios
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    //Este metodo suma 1 año a la edad del hijo.
    public void cumplir(){
        edad += 1;
    }

    //Sobreescribe el "amigos" del hijo a un nombre que quieras.
    public String mejorAmigo(String nombre){
       return amigos = nombre;
    }


    //El toString()
    @Override
    public String toString() {
        return (super.toString() + " (" + edad + " años)" + " mejorAmigo: " + amigos);
    }


}
