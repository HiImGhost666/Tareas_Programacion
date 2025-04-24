
package Tema11.contenedor;

/**
 *
 * @author jvega
 */
public class Contenedor<T> {
    private T objeto; //Se inicializa a null: contenedor vacío
    public Contenedor(){
    }
    void guardar(T nuevo) {
        objeto = nuevo;
    }
    T extraer(){
        T resultado = objeto;
        objeto = null; // vació el contenedor
        return resultado;
    }
   

}
