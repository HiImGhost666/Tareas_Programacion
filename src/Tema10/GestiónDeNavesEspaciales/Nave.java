package Tema10.GestiónDeNavesEspaciales;

import java.io.Serializable;

public class Nave implements Serializable {
    private String matricula;
    private String nombre;
    private double velocidadMax;
    private int añoFabricacion;

    public Nave(String matricula, String nombre, double velocidadMax, int añoFabricacion) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.velocidadMax = velocidadMax;
        this.añoFabricacion = añoFabricacion;
    }


    @Override
    public String toString() {
        return matricula + " " + nombre + " " + velocidadMax + " " + añoFabricacion;
    }

    public double calcularValorEstrategico() {
        return 0;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }
}
