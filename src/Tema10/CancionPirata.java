package Tema10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class CancionPirata {
    public static void main(String[] args) {

        String estrofa = "Con diez cañones por banda, \n"
                + "viento en popa a toda vela, \n"
                + "no corta el mar, sino vuela \n"
                + "un velero bergantin.";

        try(OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("cancionPirata.txt"))){
            writer.write(estrofa);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
