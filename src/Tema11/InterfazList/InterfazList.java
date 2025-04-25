package Tema11.InterfazList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InterfazList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        Integer num = 0;

        while(num >= 0){
            System.out.println("Numero:");
            num = sc.nextInt();
            lista.add(num);
        }

        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i) % 2 == 0){
                lista.set(i, lista.get(i) * 100);
            }
        }

        System.out.println(lista);

    }
}
