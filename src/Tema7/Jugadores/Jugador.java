package Tema7.Jugadores;

import Tema7.SimulacionDeParqueDeAtracciones.Atraccion;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Jugador {
    private String nombre;
    private int fuerza;
    private int numVidas;
    private String[] registro;


    public Jugador(String nombre, int fuerza) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.numVidas = 3;
        registro = new String[0];
    }


    public String getNombre() {
        return nombre;
    }


    public static void combate(Jugador uno, Jugador dos){

        int resultadoJugadorUno = uno.dados() + uno.fuerza;
        int restultadoJugadorDos = dos.dados() + dos.fuerza;
        String mensaje = "";

        if(uno.numVidas == 0){
            System.out.println(uno.getNombre() + " abandona el juego");
            return;
        } else if (dos.numVidas == 0) {
            System.out.println(dos.getNombre() + " abandona el juego");
            return;
        } else{
            System.out.println("Batalla de Jugadores");
        }

        uno.registro = uno.añadir(uno.registro, mensaje);
        if(resultadoJugadorUno > restultadoJugadorDos){
            mensaje = uno.getNombre() + " ganó el combate con un total de " + resultadoJugadorUno + "\n" + dos.getNombre() + " sacó un " + restultadoJugadorDos;
            dos.numVidas--;
        } else if(restultadoJugadorDos > resultadoJugadorUno){
            mensaje = dos.getNombre() + " ganó el combate con un total de " + restultadoJugadorDos + "\n" + uno.getNombre() + " sacó un " + resultadoJugadorUno;
            uno.numVidas--;
        } else{
            mensaje = "Empate.";
        }

        uno.registro = uno.añadir(uno.registro, mensaje);
        dos.registro = dos.añadir(dos.registro, mensaje);


    }
    public String[] añadir(String[] matriz, String mensaje){
        String[] aux = new String[matriz.length + 1];
        for (int i = 0; i < matriz.length; i++) {
            aux[i] = matriz[i];
        }
        aux[aux.length - 1] = mensaje;
        return aux;
    }

    private int dados(){
        Random random = new Random();
        return random.nextInt(20) +1;
    }

    private static String obtenerFechaHoraActual(){
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return ahora.format(formato);
    }



    public void mostrarRegistro(){
        System.out.println("Registro de combates de " + nombre);
        for (String mensaje : registro) {
            System.out.println(mensaje);
        }
    }


    public String toString(){
        String texto = "=====Datos del jugador=====" +"\n\tNombre: " + nombre + "\n\tFuerza: " + fuerza + "\n\tNumero de Vidas: "+ numVidas;
        return (texto);
    }

}
