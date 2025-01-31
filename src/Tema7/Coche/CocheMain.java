package Tema7.Coche;

public class CocheMain {
    public static void main(String[] args) {

        Coche coche1 = new Coche("Toyota", "Corolla");

        coche1.acelerar(50);
        coche1.frenar(20);
        coche1.mostrarInfo();

    }
}

    class Coche{
        private String marca;
        private String modelo;
        private int velocidad;


        public Coche(String marca, String modelo){
            this.marca = marca;
            this.modelo = modelo;
            this.velocidad = 0;
        }


        public void acelerar(int cantidad){
            velocidad += cantidad;
            System.out.println(marca + " " + modelo + " aceleró a " + velocidad + " km/h.");
        }

        public void frenar(int cantidad){
            velocidad -= cantidad;
            if (velocidad < 0) {
                velocidad = 0; // No puede ser negativa
            }
            System.out.println(marca + " " + modelo + " frenó a " + velocidad + " km/h.");
        }


        public void mostrarInfo(){
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Velocidad actual: " + velocidad + "km/h");
        }
    }

