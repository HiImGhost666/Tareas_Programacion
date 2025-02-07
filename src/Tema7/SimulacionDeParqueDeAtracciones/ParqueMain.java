/*
Un parque de atracciones necesita un sistema para gestionar sus atracciones y visitantes. Debes desarrollar las siguientes clases:

1. Clase Atraccion
    Atributos privados:
    nombre (String)
    capacidadMaxima (int) → Número máximo de visitantes por turno.
    alturaMinima (double) → Estatura mínima en metros para acceder.
    duracion (int) → Duración del recorrido en minutos.

Métodos:
    mostrarInformacion() → Devuelve los datos de la atracción en formato de texto.

2. Clase Visitante
    Atributos privados:
    nombre (String)
    edad (int)
    altura (double)

Métodos:
    puedeSubirse(Atraccion a) → Devuelve true si el visitante cumple la altura mínima, false en caso contrario.

3. Clase Parque
    Atributos privados:
    nombre (String)
    atracciones (ArrayList<Atraccion>)
    visitantes (ArrayList<Visitante>)

Métodos:
    agregarAtraccion(Atraccion a).
    agregarVisitante(Visitante v).
    listarAtracciones().
    listarVisitantes().
    permitirEntrada(Visitante v, Atraccion a), que devuelve si el visitante puede ingresar a la atracción.

4. Pruebas
    Crea un parque con varias atracciones.
    Agrega varios visitantes y verifica si pueden subir a distintas atracciones.
    Muestra la lista de atracciones y visitantes.
 */
package Tema7.SimulacionDeParqueDeAtracciones;

public class ParqueMain {
    public static void main(String[] args) {
        Parque miParque = new Parque("Parque Aventura", 3, 5);

        // Crear atracciones
        Atraccion montañaRusa = new Atraccion("Montaña Rusa Extrema", 20, 1.4, 3);
        Atraccion carrusel = new Atraccion("Carrusel Mágico", 10, 0.8, 2);
        Atraccion casaDelTerror = new Atraccion("Casa del Terror", 15, 1.2, 5);

        // Agregar atracciones al parque
        miParque.agregarAtraccion(montañaRusa);
        miParque.agregarAtraccion(carrusel);
        miParque.agregarAtraccion(casaDelTerror);

        // Crear visitantes
        Visitante juan = new Visitante("Juan", 12, 1.5);
        Visitante ana = new Visitante("Ana", 9, 1.2);
        Visitante luis = new Visitante("Luis", 8, 1.0);

        // Agregar visitantes al parque
        miParque.agregarVisitante(juan);
        miParque.agregarVisitante(ana);
        miParque.agregarVisitante(luis);

        // Mostrar atracciones y visitantes
        miParque.listarAtracciones();
        miParque.listarVisitantes();

        // Intentar subir a atracciones
        miParque.permitirEntrada(juan, montañaRusa);
        miParque.permitirEntrada(ana, montañaRusa);
        miParque.permitirEntrada(luis, carrusel);
        miParque.permitirEntrada(ana, casaDelTerror);
    }
}
