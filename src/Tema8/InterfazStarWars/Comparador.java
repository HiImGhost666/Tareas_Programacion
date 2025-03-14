package Tema8.InterfazStarWars;

import java.util.Comparator;

public class Comparador implements Comparator<Jedi> {
    @Override
    public int compare(Jedi j1, Jedi j2){
        if(j1.getFuerza() > j2.getFuerza()){
            return 1;
        } else if (j1.getFuerza() < j2.getFuerza()){
            return -1;
        } else{
            return 0;
        }
    }
}
