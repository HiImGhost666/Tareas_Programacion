package Tema10.SistemaInteligenteDeControlDeRobots;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class Laboratorio {
    private Robot[] robots;
    private int contador;


    public Laboratorio(int tamañoMax) {
        robots = new Robot[tamañoMax];
        contador = 0;
    }

    public void agregarRobot(Robot r) {
        if (contador < robots.length) {
            robots[contador++] = r;
        } else {
            System.out.println("Laboratorio lleno.");
        }
    }

    public void mostrarRobots() {
        for (int i = 0; i < contador; i++) {
            System.out.println(robots[i] + " - Autonomía: " + robots[i].calcularAutonomia());
        }
    }

    public void ordenarPor(Comparator<Robot> comp) {
        Arrays.sort(robots, 0, contador, comp);
    }

    public void guardarEnArchivo(String ruta) {
        try (FileWriter fw = new FileWriter(ruta)) {
            for(Robot robot : robots){
                if(robot != null){
                    fw.write(robot.toString() + "\n");

                }
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void cargarDesdeArchivo(String ruta) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                String id = datos[0];
                String modelo = datos[1];
                double bateria = Double.parseDouble(datos[2]);
                int anio = Integer.parseInt(datos[3]);
                String tipo = datos[4];

                switch (tipo) {
                    case "ANALISIS":
                        int sensores = Integer.parseInt(datos[5]);
                        double consumo = Double.parseDouble(datos[6]);
                        agregarRobot(new RobotAnalisis(id, modelo, bateria, anio, sensores, consumo));
                        break;
                    case "MANIPULADOR":
                        int brazos = Integer.parseInt(datos[5]);
                        boolean precision = Boolean.parseBoolean(datos[6]);
                        agregarRobot(new RobotManipulador(id, modelo, bateria, anio, brazos, precision));
                        break;
                    case "EXPLORACION":
                        double blindaje = Double.parseDouble(datos[5]);
                        int ruedas = Integer.parseInt(datos[6]);
                        agregarRobot(new RobotExploracion(id, modelo, bateria, anio, blindaje, ruedas));
                        break;
                }
            }
        }
    }
}
