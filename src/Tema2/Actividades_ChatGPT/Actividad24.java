/*
1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.
2. Ha aumentado sus gastos de vestuario
3. Ha perdido el interés que mostraba anteriormente por ti
4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)
5. No te deja que mires la agenda de su teléfono móvil
6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante
7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a
8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo
9. Has notado que últimamente se perfuma más
10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo

Puntuación entre 0 y 10:
¡Enhorabuena! tu pareja parece ser totalmente fiel.

Puntuación entre 11 y 22:
Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.

Puntuación entre 22 y 30
Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.
 */
package Tema2.Actividades_ChatGPT;
import java.util.Scanner;
public class Actividad24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Test de infidelidad: ");

        System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin motivo aparente");
        int puntuacion1 = sc.nextInt();
        System.out.println("2. Ha aumentado sus gastos de vestuario");
        int puntuacion2 = sc.nextInt();
        System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti");
        int puntuacion3 = sc.nextInt();
        System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
        int puntuacion4 = sc.nextInt();
        System.out.println("5. No te deja que mires la agenda de su tel：fono");
        int puntuacion5 = sc.nextInt();
        System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás en la cabeza");
        int puntuacion6 = sc.nextInt();
        System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
        int puntuacion7 = sc.nextInt();
        System.out.println("8. Muchos años viene tarde aquí de trabajar porque dice tener mucho más trabajo");
        int puntuacion8 = sc.nextInt();
        System.out.println("9. Has notado que ha estado en sitios donde no ha ido contigo");
        int puntuacion9 = sc.nextInt();
        System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
        int puntuacion10 = sc.nextInt();

        int total = puntuacion1 + puntuacion2 + puntuacion3 + puntuacion4 + puntuacion5 + puntuacion6 + puntuacion7 + puntuacion8 + puntuacion9 + puntuacion10;
        System.out.println("Puntuación total: " + total);

        if (total >= 0 && total <= 10) {
            System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        } else if (total >= 11 && total <= 22) {
            System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente está algo sin importancia. No baje la guardia.");
        } else if (total >= 22 && total <= 30) {
            System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
        } else {
            System.out.println("Puntuación incorrecta");
        }
    }
}
