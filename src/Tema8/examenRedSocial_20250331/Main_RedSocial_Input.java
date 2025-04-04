package Tema8.examenRedSocial_20250331;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author jvega
 */
public class Main_RedSocial_Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Usuarios Asia
        Usuario epicExplorer = new Usuario("EpicExplorer", "epicExplorer@gmail.com", 1234);
        Usuario socialSurfer23 = new Usuario("SocialSurfer23", "SocialSurfer23@gmail.com", 1234);
        Usuario pixelPilot = new Usuario("PixelPilot", "PixelPilot@gmail.com", 1111);
        Usuario dreamDrifter = new Usuario("DreamDrifter", "DreamDrifter@gmail.com", 4321);
        Usuario lifeLensX = new Usuario("LifeLensX", "LifeLensX@gmail.com", 5555);
        Usuario infinityVibes = new Usuario("InfinityVibes", "InfinityVibes@gmail.com", 6767);
        Usuario[] listaUsuariosAsia = {epicExplorer, socialSurfer23, pixelPilot, dreamDrifter, lifeLensX, infinityVibes};
        Usuario springRoll = new Usuario("SpringRoll", "SpringRoll@gmail.com", 1167);
        // Ordena alfab�ticamente por el atributo nick el objeto listaUsuariosAsia
        // ..........

//        Usuario.compare(listaUsuariosAsia); No me funciona.

        // Crear un objeto de tipo TikTok llamado tiktokAsia con los usuarios de listaUsuariosAsia
        Tiktok tiktokAsia = new Tiktok("Tiktok Asia",6.5,352);
        tiktokAsia.append(epicExplorer);
        tiktokAsia.append(socialSurfer23);
        tiktokAsia.append(pixelPilot);
        tiktokAsia.append(dreamDrifter);
        tiktokAsia.append(lifeLensX);
        tiktokAsia.append(infinityVibes);
        tiktokAsia.append(springRoll);

        // .......... 
        // Mostrar los usuarios de la red tiktokAsia con el formato que se muestra en el enunciado usando mostrarUsuarios()
        // ...........
        tiktokAsia.mostrarUsuario(tiktokAsia);

        // Crear un objeto de tipo Instagram llamado instagramAsia con los usuarios de listaUsuariosAsia + el usuario springRoll
        // .......... 
        Instagram instagramAsia = new Instagram("Instagram Asia" , 6.9, 546);
        instagramAsia.append(epicExplorer);
        instagramAsia.append(socialSurfer23);
        instagramAsia.append(pixelPilot);
        instagramAsia.append(dreamDrifter);
        instagramAsia.append(lifeLensX);
        instagramAsia.append(infinityVibes);
        instagramAsia.append(springRoll);
        System.out.println("\n");
        instagramAsia.mostrarUsuario(instagramAsia);

        // Usuarios Europa
        Usuario hashtagHero = new Usuario("HashtagHero", "HashtagHero@gmail.com", 2233);
        Usuario trendTracker = new Usuario("TrendTracker", "TrendTracker@gmail.com", 3468);
        Usuario skySnapper = new Usuario("SkySnapper", "SkySnapper@gmail.com", 4567);
        Usuario bioBliss = new Usuario("BioBliss", "SkySnapper@gmail.com", 3467);




        // Crear un objeto de tipo TikTok llamado tiktokEuropa

        Tiktok tiktokEuropa = new Tiktok("Tiktok Europa", 6.8, 5423);

        // A�adir uno a uno los usuarios de Europa a la RedSocial TikTok de tiktokEuropa

        tiktokEuropa.append(hashtagHero);
        tiktokEuropa.append(trendTracker);
        tiktokEuropa.append(skySnapper);
        tiktokEuropa.append(bioBliss);

        // Mostrar los usuarios de la red tiktokEuropa con el formato que se muestra en el enunciado usando mostrarUsuarios()
        // ..........
        System.out.println("\n");

        tiktokEuropa.mostrarUsuario(tiktokEuropa);
        // Compara dos redes a ver cual est� mejor valorada con el m�todo est�tico comparar()
        // ..........
        RedSocial.comparar(tiktokEuropa,tiktokAsia);

        // Mostrar informaci�n con el m�todo toString() del array de redes sociales listaRedes
        System.out.println("Informaci�n del array con las redes");
        // ..........



//       Arrays.toString(redesSociales);

        // Mostrar informaci�n con el m�todo toString() del objeto Instagram instagramAsia
        // ..........
        System.out.println(instagramAsia);

        // Llamar a aumentarValoracion para el objeto instagramAsia
        // ..........
        instagramAsia.aumentarValoracion(instagramAsia);

        // Mostrar informaci�n con el m�todo toString() del objeto Instagram instagramAsia
        // ..........
        System.out.println(instagramAsia);
        // Mostrar informaci�n con el m�todo toString() sobreescrito del objeto TikTok tiktokAsia
        System.out.println("\nInformaci�n de la red " + tiktokAsia.getNombre());
        System.out.println(tiktokAsia);
        
        // Mostrar usuarios de TikTok con contrase�as bajas
        // Llamar al m�todo passwordBaja ......

        //No funciona
//        tiktokAsia.passwordBaja();


        // Mostrar con toString() los elementos del array listaRedes por orden introducido
        System.out.println("\nRedes por orden introducido");

//        System.out.println(Arrays.toString(redesSociales));
        // ..........

        // Mostrar con toString() los elementos del array listaRedes por orden creciente de usuarios
        System.out.println("\nRedes por orden creciente de usuarios");
        // ..........

        // instancia un objeto Comparador para poder comparar por orden inverso de valoracion de las redes
        // ..........


        // Mostrar con toString() los elementos del array listaRedes por orden inverso de valoracion
        System.out.println("\nRedes por orden inverso de valoracion");
        // ..........
        
       
        //Llamar a promocionarContenido de un objeto Tiktok
        // ..........
         tiktokEuropa.promocionarContenido();

        
        //Llamar a analizarTendencias de un objeto Instagram
        // ..........
        instagramAsia.analizarTendencias();






    }
    
    


}
