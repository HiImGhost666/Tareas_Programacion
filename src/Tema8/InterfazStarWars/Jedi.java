package Tema8.InterfazStarWars;

public class Jedi extends PersonajeStarWar implements Whatsapp{

    private String pareja;
    String[] bloqueados;
    private int numBloqueados;

    public Jedi(String nombre, int fuerza, Estado estado, int midiclorianos, Lado lado) {
        super(nombre, fuerza, estado, midiclorianos, lado);
        this.pareja = "No tiene pareja";
        this.bloqueados = new String[10];
        this.numBloqueados = 0;
    }


    @Override
    public void enviar(Jedi jedi, String mensaje) {
        for(String bloqueado : jedi.bloqueados){
            if(bloqueado != null && bloqueado.equals(this.getNombre())){
                System.out.println(jedi.getNombre() + " te tiene bloqueado. No puedes enviarle un mensaje.");
                return;
            }
        }
        System.out.println(jedi.getNombre() + " ha recibido el mensaje: " + mensaje);
    }

    @Override
    public void presentarse() {
        System.out.println("Soy el Jedi " + getNombre() + ". Tengo " + getMidiclorianos() + " midiclorianos y pertenezco al lado " + getLado());
    }

    @Override
    public void enamorarse(PersonajeStarWar nombreJedi) {
        pareja = nombreJedi.getNombre();

        System.out.println(getNombre() + " está enamorado de " + pareja);
    }

    @Override
    public void bloquear(PersonajeStarWar nombreBloqueado) {
        if(nombreBloqueado == null){
            System.out.println(getNombre() + " no puede bloquear un personaje nulo.");
            return;
        }

        for(int i = 0; i < numBloqueados; i++){
            if(bloqueados[i].equals(nombreBloqueado.getNombre())){
                System.out.println(getNombre() + " ya tiene bloqueado a " + nombreBloqueado.getNombre());
                return;
            }
        }

        if(numBloqueados < bloqueados.length){
            bloqueados[numBloqueados] = nombreBloqueado.getNombre();
            numBloqueados++;
            System.out.println(getNombre() + " ha bloqueado a " + nombreBloqueado.getNombre());
        } else{
            System.out.println(getNombre() + " no pudo bloquear a " + nombreBloqueado.getNombre());
        }
    }


}
