package Tema8.examenRedSocial_20250331;

import java.util.Comparator;

public class CompararPorNombre implements Comparator<Usuario> {
    public int compare(Usuario u1, Usuario u2) {
        return u1.getNick().compareTo(u2.getNick());
    }
}
