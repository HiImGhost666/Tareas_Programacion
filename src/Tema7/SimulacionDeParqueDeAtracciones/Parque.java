package Tema7.SimulacionDeParqueDeAtracciones;

public class Parque {
    private String nombre;
    private Atraccion[] atracciones;
    private Visitante[] visitantes;
    private int numAtracciones;
    private int numVisitantes;

    public Parque(String nombre, int maxAtracciones, int maxVisitantes) {
        this.nombre = nombre;
        this.atracciones = new Atraccion[maxAtracciones];
        this.visitantes = new Visitante[maxVisitantes];
        this.numAtracciones = 0;
        this.numVisitantes = 0;
    }

    public String getNombre(){
        return nombre;
    }

    public void agregarAtraccion(Atraccion a){
        if(numAtracciones < atracciones.length){
            atracciones[numAtracciones] = a;
            numAtracciones++;
            System.out.println("✅ Atracción '" + a.getNombre() + "' agregada al parque.");
        } else{
            System.out.println("❌ No se pueden agregar más atracciones. Capacidad máxima alcanzada.");

        }
    }


    public void agregarVisitante(Visitante v){
        if(numVisitantes < visitantes.length){
            visitantes[numVisitantes] = v;
            numVisitantes++;
            System.out.println("✅ Visitante '" + v.getNombre() + "' ingresó al parque.");
        } else{
            System.out.println("❌ No se pueden agregar más visitantes. Capacidad máxima alcanzada.");

        }
    }

    public void listarAtracciones(){
        System.out.println("\n🎡 Lista de Atracciones en " + nombre + ":");
        if(numAtracciones == 0){
            System.out.println("No hay atracciones disponibles.");
            return;
        }
        for(int i = 0; i < numAtracciones; i++){
            atracciones[i].mostrarInformacion();
        }
    }

    public void listarVisitantes(){
        System.out.println("\n🎡 Lista de Visitantes en " + nombre + ":");
        if(numVisitantes == 0){
            System.out.println("No hay visitantes en el parque.");
            return;
        }
        for(int i = 0; i < numVisitantes; i++){
            visitantes[i].mostrarInformacion();
        }
    }

    public void permitirEntrada(Visitante v, Atraccion a){
        if(v.puedeSubirse(a)){
            System.out.println("✅ " + v.getNombre() + " PUEDE subir a " + a.getNombre() + ".");
        } else{
            System.out.println("❌ " + v.getNombre() + " NO puede subir a " + a.getNombre() + " (Altura insuficiente).");

        }
    }


}
