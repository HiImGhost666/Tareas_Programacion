package Tema5.ActividadesDeRepaso;

public class Actividad12 {
    public static void main(String[] args) {
        int[][] tabla = new int [5][5];

        for(int i = 0; i < tabla.length; i++){
            for(int j = 0; j < tabla[i].length; j++){
                tabla[i][j] = 10 * i + j;
            }
        }

        for(int i = 0; i < tabla.length; i++){
            for(int j = 0; j < tabla[i].length; j++){
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
    }
}
