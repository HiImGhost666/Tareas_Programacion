package Tema10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ArrayEnArchivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de numeros que quieres introducir:");
        int n = sc.nextInt();

        //Introducir uno en uno al .dat
        Double[] array = new Double[n];
        for(int i = 0; i < n; i++){
            System.out.println("Introduce un numero + " + (i + 1) + ": ");
            array[i] = sc.nextDouble();
        }

        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("datosObjetos.dat"))){
            for(int i = 0; i < n; i++){
                out.writeDouble(array[i]);
            }
            System.out.println("Los números se han guardado correctamente en 'numeros.bin'.");


        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        //Introducir el objeto array al .dat
        try(ObjectOutputStream out2 = new ObjectOutputStream(new FileOutputStream("datosObjetos2.dat"))){
            Double[] tabla = {1.1,1.2,1.3,1.4,1.5,1.6,1.7,1.8,1.8,2.0};
            out2.writeObject(tabla);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


        sc.close();
    }
}
