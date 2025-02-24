//package Tema7.Individuo;
//
//public class Main {
//    public static void main(String[] args) throws CloneNotSupportedException {
//
//        // Crear algunos individuos
//        Individuo ind1 = new Individuo("González", "Negro", "12345678A");
//        Individuo ind2 = new Individuo("Pérez", "Rubio", "87654321B");
//        Individuo ind3 = new Individuo("López", "Castaño", "11223344C");
//
//        // Crear un listado de individuos con capacidad inicial de 2
//        Listado lista = new Listado(2);
//
//        // Agregar individuos con append
//        lista.append(ind1);
//        lista.append(ind2);
//
//        // Imprimir la lista original
//        System.out.println("Lista original:");
//        for (int i = 0; i < 2; i++) {
//            System.out.println(lista.añadir(null).listado[i]); // Para ver contenido
//        }
//
//        // Clonar un individuo y comprobar si son iguales
//        Individuo ind1Clone = ind1.clone();
//        System.out.println("\nClon de ind1: " + ind1Clone);
//        System.out.println("¿El clon es igual al original?: " + ind1.equals(ind1Clone));
//
//        // Añadir un individuo sin modificar la lista original
//        Listado nuevaLista = lista.añadir(ind3);
//
//        // Imprimir la nueva lista después de añadir a ind3
//        System.out.println("\nNueva lista después de añadir ind3:");
//        for (int i = 0; i < nuevaLista.numListado; i++) {
//            System.out.println(nuevaLista.añadir(null).listado[i]);
//        }
//
//        // Verificar que la lista original sigue igual
//        System.out.println("\nLista original después de añadir en la nueva lista:");
//        for (int i = 0; i < lista.numListado; i++) {
//            System.out.println(lista.añadir(null).listado[i]);
//        }
//
//    }
//}
