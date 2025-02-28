package Tema7.Progenitor;

import java.util.Scanner;
/*
@autor: Luke Eric Marten Llorente
 */
public class Progenitor {

    //Los atributos
    private String nombre;
    private String apellido1;
    private String apellido2;

    public Progenitor(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    //Los Getters y Setters necesarios
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }


    public String getApellido2() {
        return apellido2;
    }

    //Metodo reproducir, donde introducimos 2 objetos de Progenitor.
    public static void reproducir(Progenitor p1, Progenitor p2){
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Que nombre le quieres poner al hijo?");
        String nombreHijo = sc.nextLine();

        //Creamos un objeto o instancia hijo con el nombre que se ha pedido y los apellidos de los padres.
        Hijo hijo = new Hijo(nombreHijo, p1.getApellido1(), p2.getApellido2(), 0);

       //Imprimir informacion del hijo creado.
        System.out.println("Datos del hijo de " + p1.nombre + " y " + p2.nombre + " al nacer:");
        System.out.println("\t" + hijo);
    }


    //Clonamos un Hijo nuevo.
    @Override
    public Hijo clone(){
        return new Hijo(this.nombre, this.apellido1, this.apellido2, 0);
    }

    //El toString()
    @Override
    public String toString() {
        return ("Datos de " + this.nombre + ": " + this.nombre + " " + this.apellido1 + " " + this.apellido2);
    }
}
