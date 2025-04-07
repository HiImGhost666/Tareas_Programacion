package Tema10.GestiónDeNavesEspaciales;

import java.io.*;
import java.util.Comparator;

public class HangarGalactico {
    private Nave[] naves = new Nave[50];
    private int totalNaves = 0;

    public boolean añadirNave(Nave n) {
        if (totalNaves >= naves.length) return false;
        for (int i = 0; i < totalNaves; i++) {
            if (naves[i].getMatricula().equals(n.getMatricula())) return false;
        }
        naves[totalNaves++] = n;
        return true;
    }

    public void listarNaves() {
        for (int i = 0; i < totalNaves; i++) {
            System.out.println(naves[i]);
        }
    }

    public Nave buscarPorMatricula(String matricula) {
        for (int i = 0; i < totalNaves; i++) {
            if (naves[i].getMatricula().equals(matricula)) return naves[i];
        }
        return null;
    }

    public boolean eliminarNave(String matricula) {
        for (int i = 0; i < totalNaves; i++) {
            if (naves[i].getMatricula().equals(matricula)) {
                for (int j = i; j < totalNaves - 1; j++) {
                    naves[j] = naves[j + 1];
                }
                totalNaves--;
                return true;
            }
        }
        return false;
    }

    // En HangarGalactico.java
    public void ordenar(Comparator<Nave> comparador) {
        for (int i = 0; i < naves.length - 1; i++) {
            for (int j = i + 1; j < naves.length; j++) {
                if (naves[i] != null && naves[j] != null &&
                        comparador.compare(naves[i], naves[j]) > 0) {

                    Nave temp = naves[i];
                    naves[i] = naves[j];
                    naves[j] = temp;
                }
            }
        }
    }

    public void exportarATexto(String ruta) {
        try (FileWriter fw = new FileWriter(ruta)) {
            for (int i = 0; i < totalNaves; i++) {
                fw.write(naves[i].toString() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error al guardar en texto: " + e.getMessage());
        }
    }

    public void guardarBinario(String ruta) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta))) {
            for (int i = 0; i < totalNaves; i++) {
                oos.writeObject(naves[i]);
            }
        } catch (IOException e) {
            System.out.println("Error al guardar binario: " + e.getMessage());
        }
    }

    public void cargarBinario(String ruta) {
        totalNaves = 0;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta))) {
            while (true) {
                Nave nave = (Nave) ois.readObject();
                naves[totalNaves++] = nave;
            }
        } catch (EOFException e) {
            // Fin del fichero
        } catch (Exception e) {
            System.out.println("Error al cargar binario: " + e.getMessage());
        }
    }

}
