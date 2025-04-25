package Tema11.listas;
import java.util.*;


public class TutorialListas {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(); // Creo una lista de tipo Arraylist  
        
        /*******************************************************************
         *              MÉTODOS ESPECÍFICOS de la INTERFAZ LIST            *
         *******************************************************************/
        // Añado elementos a la lista (se añaden al final de la lista) 
        lista.add(3); 
        lista.add(1); 
        lista.add(-2); 
        lista.add(0); 
        lista.add(3); 
        lista.add(7); 
        lista.add(-5);                       
        System.out.println("Lista: " + lista);
        
        //E get (1nt indice): 
        //devuelve el elemento que ocupa el lugar indice en la lista,
        //siendo 0 el indice del primer elemento, como en los arrays.
        System.out.println("\nElemento en la posición 0: " + lista.get(0));

        //E set (1nt indice, E elem): 
        //guarda el elemento elem en la posición indice, machacando el valor que
        //hubiera previamente en esa posicion, que es devuelto. 
        //Con el siguiente codigo, vamos a poner el valor 10 en el elemento de indice 3, 
        //sustituyendo su valor actual (0), que es devuelto y asignado a la variable y.
        Integer y = lista.set(3,10);
        System.out.println("y: " + y);
        System.out.println(lista);
        
        //void add (int indice, E elem): inserta el valor elem en la posición indice.
        //Todos los elementos que ocupaban una posición igual o mayor que indice, se desplazan
        //una posición hacia el final de la lista, para dejar hueco al nuevo elemento. 
        //Por ejemplo, si queremos insertar el valor 5 entre el -2 y el 10, se insertará 
        //en la posición 3, que actualmente ocupa el 10. Este y los elementos que le siguen 
        //se desplazarán un lugar hacia el final de la lista.
        lista.add(3, 5) ;
        System.out.println ("Insertamos el 5 en la posicion 3: " + lista) ;

        //boolean addAll (int indice, Collection <? extends E> c) : 
        //inserta todos los elementos de la colección c, en el mismo orden que tengan, en la lista que invoca
        //al método, empezando por el lugar indice y desplazando hacia el final todos los
        //elementos de la lista original a partir de indice, incluido este, tantos lugares como
        //sean necesarios. Los elementos de la colección c deben ser del mismo tipo E que
        //los de la lista original, o de un subtipo de E.
        //Vamos a crear una segunda lista de enteros Integer:
        ArrayList<Integer> otraLista = new ArrayList<>() ;
        otraLista.add(20);
        otraLista.add(30);
        otraLista.add(40);
        System.out.println (otraLista) ;
        //Ahora insertamos esta lista en el lugar de índice 2 de listaEnteros, es decir, donde
        //se encuentra el valor -2. Este elemento, junto con los que le siguen se desplazan
        //hacia el final para hacer sitio a los tres valores insertados.
        lista.addAll(2, otraLista) ;
        System.out.println (lista) ;
    
        //E remove (int indice): elimina el elemento que ocupa el lugar indice y lo devuelve.
        //En este caso, hay que tener cuidado si lo usamos en una lista de objetos Integer,
        //como la de nuestro ejemplo, ya que una sentencia como
        lista.remove(5);
        System.out.println(lista);
        //no será interpretada como que queremos eliminar un elemento Integer con valor 5 de
        //la lista, sino el elemento con índice 5, es decir, el elemento de valor -2, ya que, al ser
        //de tipo int el valor pasado como parámetro, dado que hay una versión de remove()
        //le da prioridad y no hace autoboxing.
        // En el caso de que quisiéramos eliminar un elemento Integer cuyo valor es 5, escribiríamos
        lista.remove(Integer.valueOf(-5));
        System.out.println(lista);
        //Así estaríamos pasando como argumento un objeto Integer y no un valor int, con lo cual
        //Java ejecuta la versión del método correspondiente a la interfaz Collection y elimina el
        //elemento de valor 5.

        /********************************************************************
         *            FUNCIONES DE BÚSQUEDA y COMPARACIÓN de LIST           *
         *******************************************************************/
        
        //int indexOf (Object ob): devuelve el índice de la primera ocurrencia de ob en la
        //lista. Si no está, devuelve -1.
        System.out.println("Posición donde encuentra el primer elemento con valor 3: " + lista.indexOf(3));

        //int lastIndexOf (Object ob) : hace lo mismo que indexof (), pero empezando
        //la búsqueda por el final, devolviendo la última ocurrencia de ob.
        System.out.println("Posición donde encuentra el último elemento con valor 3: " + lista.lastIndexOf(3));

        //boolean equals (Object otraLista) : compara dos listas, tanto si las dos son
        //ArrayList como si son LinkedList, o una de cada, y devuelve true si ambas tienen
        //exactamente los mismos elementos, incluidas las repeticiones, en el mismo orden.
        ArrayList<Integer> lista1 = new ArrayList<>(); //Creo una lista nueva: lista1
        lista1.add(3);
        lista1.add(1);
        lista1.add(-2);
        lista1.add(0);
        lista1.add(3);
        ArrayList<Integer> lista2 = new ArrayList<>(); //Creo una lista nueva: lista2
        lista2.add(3);
        lista2.add(1);
        lista2.add(-2);
        lista2.add(0);
        // Compruebo si lista1  y lista2 son iguales:
        System.out.println("Compruebo si lista1  y lista2 son iguales: " + lista1.equals(lista2));
        // Añado el elemento "3" a lista2 y compruebo ahora:    
        lista2.add(3);
        System.out.println("Compruebo si lista1  y lista2 son iguales: " + lista1.equals(lista2));

        //void sort (Comparator <? super E> c): ordena la lista invocante con el criterio
        //de c, cuya implementación compara objetos de la clase E o una superclase (para
        //que no se utilicen atributos que no están en E). Para ordenar por el criterio de
        //orden natural de E, caso de que exista, antes tendremos que obtener el compara-
        //dor correspondiente, implementándolo nosotros mismos, o por medio del método
        //naturalOrder(). También podremos recurrir a la clase Collections (con «S» al
        //final, no confundir con la interfaz Collection), que estudiaremos más adelante.
        Comparator<Integer> comparador = new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                return num1 - num2; // cambiar a 'num1 - num2' para orden ascendente
            }
        };
        lista.sort(comparador);
        System.out.println("Lista ordenada por el comparador descendente; " + lista);

        Socio luisito = new Socio(2, "Luisito", "11-07-2002");
        Socio luisa = new Socio(5, "Luisa", "21-11-2001");
        Socio elena = new Socio(3, "Elena", "21-11-2010");
        
        List<Socio> listaSocio = new ArrayList<>(); 
        
        listaSocio.add(luisito);
        listaSocio.add(luisa);
        listaSocio.add(elena);
        System.out.println("Lista de socios por orden de inserción: \n " + listaSocio);
        
        Comparator<Socio> comparaId = new Comparator<Socio>() {
            @Override
            public int compare(Socio ob1, Socio ob2) {
            return ob1.getId() - ob2.getId();    
            }
        };
        
        listaSocio.sort(comparaId.reversed());
         System.out.println("Lista de socios por orden creciente ID: \n " + listaSocio);
        
    }
    
}
