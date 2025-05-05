    package Tema11.EjerciciosChatGPT.Zoo;


    import Tema11.EjerciciosChatGPT.LeerFichero.Animal;

    import java.io.*;
    import java.util.List;

    public class Zoo implements Serializable {
        private String nombre;
        private String ciudad;
        private List<Animal> animales;

        public Zoo(String nombre, String ciudad, List<Animal> animales) {
            this.nombre = nombre;
            this.ciudad = ciudad;
            this.animales = animales;
        }

        public static void guardar(Zoo zoo) {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("zoo.dat"))) {
                oos.writeObject(zoo); // Guardas TODO el objeto Zoo
            } catch (Exception e) {
                System.out.println("Error guardando el Zoo: " + e.getMessage());
            }
        }

        public static Zoo leer() {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("zoo.dat"))) {
                return (Zoo) ois.readObject();
            } catch (Exception e) {
                System.out.println("Error leyendo el Zoo: " + e.getMessage());
                return null;
            }
        }

        public List<Animal> getAnimales() {
            return animales;
        }

        public String getNombre() {
            return nombre;
        }

        public String getCiudad() {
            return ciudad;
        }
    }
