

package Tema10.Socio;

import java.io.Serializable;
import java.util.Arrays;

class Socio implements Serializable {

            String dni;
            String nombre;
            Socio[] socios;
            int contador;

            public Socio(String dni, String nombre) {
                this.dni = dni;
                this.nombre = nombre;
                this.socios = new Socio[0];
            }

            @Override
            public String toString() {
                return "Socio{" + "dni=" + dni + ", nombre=" + nombre + '}';
            }

            public void append(Socio socio){
                if (contador == socios.length) {
                    socios = Arrays.copyOf(socios, socios.length * 2);
                }
                socios[contador] = socio;
                contador++;
            }
        }