package Tema8.examen;

import java.util.Comparator;

public class CompararPorNombre implements Comparator<Usuario> {
    public int compare(Usuario u1, Usuario u2) {
        return u1.getNick().compareTo(u2.getNick());
    }
}
