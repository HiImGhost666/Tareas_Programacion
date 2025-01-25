package Tema5.ActividadesDeRepaso;

public class Actividad18 {
    public static void main(String[] args) {

        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2,3,4,5};

        comprobarIguales(array1, array2);
    }

    static void comprobarIguales(int[] array1, int[] array2) {
        boolean sonIguales = true;
        int posicion = 0;
        for(int i = 0; i < array1.length; i++) {
            if(array1[i] != array2[i]) {
                sonIguales = false;
                posicion = i;
                break;
            }
        }

        if(sonIguales) {
            System.out.println("Los arrays son iguales");
        } else {
            System.out.println("Los arrays son diferentes en la posicion: " + posicion);
        }
    }
}
