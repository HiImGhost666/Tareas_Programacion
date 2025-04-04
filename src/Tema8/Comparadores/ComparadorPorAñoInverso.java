package Tema8.Comparadores;

import java.util.Comparator;
// más reciente a más antiguo
//class ComparadorPorAñoInverso implements Comparator<Publicacion> {
//    @Override
//    public int compare(Publicacion p1, Publicacion p2) {
//        return Integer.compare(p2.getAñoPublicacion(), p1.getAñoPublicacion()); // Orden inverso
//    }
//}
// Arrays.sort(catalogo, 0, totalPublicaciones, new ComparadorPorAñoInverso());

// más antiguo al más reciente
//import java.util.Comparator;
//
//class ComparadorPorAño implements Comparator<Publicacion> {
//    @Override
//    public int compare(Publicacion p1, Publicacion p2) {
//        return Integer.compare(p1.getAñoPublicacion(), p2.getAñoPublicacion()); // Orden normal (ascendente)
//    }
//}

/*

Orden alfabético (A-Z)
java
Copiar
Editar
import java.util.Comparator;

class ComparadorPorTitulo implements Comparator<Publicacion> {
    @Override
    public int compare(Publicacion p1, Publicacion p2) {
        return p1.getTitulo().compareTo(p2.getTitulo()); // Orden normal (A-Z)
    }
}

Orden inverso (Z-A)

import java.util.Comparator;

class ComparadorPorTituloInverso implements Comparator<Publicacion> {
    @Override
    public int compare(Publicacion p1, Publicacion p2) {
        return p2.getTitulo().compareTo(p1.getTitulo()); // Orden inverso (Z-A)
    }
}

Uso en el código

Para ordenar alfabéticamente:
java
Copiar
Editar
Arrays.sort(catalogo, 0, totalPublicaciones, new ComparadorPorTitulo());

Para ordenar de Z a A:
Arrays.sort(catalogo, 0, totalPublicaciones, new ComparadorPorTituloInverso());
 */