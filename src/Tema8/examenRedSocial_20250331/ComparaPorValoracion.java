package Tema8.examenRedSocial_20250331;

import java.util.Comparator;

public class ComparaPorValoracion implements Comparator<RedSocial> {
    //Capaz mal
    @Override
    public int compare(RedSocial r1, RedSocial r2) {
        return Double.compare(r1.getValoracion(), r2.getValoracion());
    }
}
