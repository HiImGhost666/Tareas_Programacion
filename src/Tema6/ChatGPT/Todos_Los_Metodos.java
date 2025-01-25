package Tema6.ChatGPT;

import java.util.ArrayList;
import java.util.Scanner;

public class Todos_Los_Metodos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\nSelecciona una opción:");

            System.out.println("1. isDigit              - Verifica si un carácter es un dígito");
            System.out.println("2. isLetter             - Verifica si un carácter es una letra");
            System.out.println("3. isLetterOrDigit      - Verifica si un carácter es letra o dígito");
            System.out.println("4. isLowerCase          - Verifica si un carácter es minúscula");
            System.out.println("5. isUpperCase          - Verifica si un carácter es mayúscula");
            System.out.println("6. isSpaceChar          - Verifica si un carácter es un espacio");
            System.out.println("7. isWhitespace         - Verifica si un carácter es espacio en blanco");
            System.out.println("8. toLowerCase          - Convierte un carácter a minúscula");
            System.out.println("9. toUpperCase          - Convierte un carácter a mayúscula");
            System.out.println("10. equals              - Compara dos cadenas");
            System.out.println("11. equalsIgnoreCase    - Compara dos cadenas sin importar mayúsculas/minúsculas");
            System.out.println("12. compareTo           - Compara dos cadenas lexicográficamente");
            System.out.println("13. compareToIgnoreCase - Compara dos cadenas sin importar mayúsculas/minúsculas");
            System.out.println("14. length              - Devuelve la longitud de una cadena");
            System.out.println("15. concat              - Concatena dos cadenas");
            System.out.println("16. charAt              - Devuelve el carácter en una posición específica de una cadena");
            System.out.println("17. substring           - Devuelve una subcadena de una cadena");
            System.out.println("18. indexOf             - Devuelve la primera posición de un carácter en una cadena");
            System.out.println("19. isEmpty             - Verifica si una cadena está vacía");
            System.out.println("20. contains            - Verifica si una cadena contiene otra");
            System.out.println("21. startsWith          - Verifica si una cadena empieza con un prefijo");
            System.out.println("22. endsWith            - Verifica si una cadena termina con un sufijo");
            System.out.println("23. toLowerCase         - Convierte una cadena a minúsculas");
            System.out.println("24. toUpperCase         - Convierte una cadena a mayúsculas");
            System.out.println("25. replace             - Reemplaza un carácter por otro en una cadena");
            System.out.println("26. replace             - Reemplaza una subcadena por otra en una cadena");
            System.out.println("27. split               - Divide una cadena en partes según un separador");
            System.out.println("28. valueOf             - Convierte un array de caracteres en una cadena");
            System.out.println("29. valueOf             - Convierte una parte de un array de caracteres en una cadena");
            System.out.println("30. toCharArray         - Convierte un string en un array de caracteres");
            System.out.println("0. Salir");


            option = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (option) {
                case 1:
                    System.out.print("Ingresa un carácter: ");
                    char char1 = scanner.nextLine().charAt(0);
                    System.out.println(Character.isDigit(char1));
                    break;
                case 2:
                    System.out.print("Ingresa un carácter: ");
                    char char2 = scanner.nextLine().charAt(0);
                    System.out.println(Character.isLetter(char2));
                    break;
                case 3:
                    System.out.print("Ingresa un carácter: ");
                    char char3 = scanner.nextLine().charAt(0);
                    System.out.println(Character.isLetterOrDigit(char3));
                    break;
                case 4:
                    System.out.print("Ingresa un carácter: ");
                    char char4 = scanner.nextLine().charAt(0);
                    System.out.println(Character.isLowerCase(char4));
                    break;
                case 5:
                    System.out.print("Ingresa un carácter: ");
                    char char5 = scanner.nextLine().charAt(0);
                    System.out.println(Character.isUpperCase(char5));
                    break;
                case 6:
                    System.out.print("Ingresa un carácter: ");
                    char char6 = scanner.nextLine().charAt(0);
                    System.out.println(Character.isSpaceChar(char6));
                    break;
                case 7:
                    System.out.print("Ingresa un carácter: ");
                    char char7 = scanner.nextLine().charAt(0);
                    System.out.println(Character.isWhitespace(char7));
                    break;
                case 8:
                    System.out.print("Ingresa un carácter: ");
                    char char8 = scanner.nextLine().charAt(0);
                    System.out.println(Character.toLowerCase(char8));
                    break;
                case 9:
                    System.out.print("Ingresa un carácter: ");
                    char char9 = scanner.nextLine().charAt(0);
                    System.out.println(Character.toUpperCase(char9));
                    break;
                case 10:
                    System.out.print("Ingresa la primera cadena: ");
                    String str1 = scanner.nextLine();
                    System.out.print("Ingresa la segunda cadena: ");
                    String str2 = scanner.nextLine();
                    System.out.println(str1.equals(str2));
                    break;
                case 11:
                    System.out.print("Ingresa la primera cadena: ");
                    String str3 = scanner.nextLine();
                    System.out.print("Ingresa la segunda cadena: ");
                    String str4 = scanner.nextLine();
                    System.out.println(str3.equalsIgnoreCase(str4));
                    break;
                case 12:
                    System.out.print("Ingresa la primera cadena: ");
                    String str5 = scanner.nextLine();
                    System.out.print("Ingresa la segunda cadena: ");
                    String str6 = scanner.nextLine();
                    System.out.println(str5.compareTo(str6));
                    break;
                case 13:
                    System.out.print("Ingresa la primera cadena: ");
                    String str7 = scanner.nextLine();
                    System.out.print("Ingresa la segunda cadena: ");
                    String str8 = scanner.nextLine();
                    System.out.println(str7.compareToIgnoreCase(str8));
                    break;
                case 14:
                    System.out.print("Ingresa una cadena: ");
                    String str9 = scanner.nextLine();
                    System.out.println("Longitud: " + str9.length());
                    break;
                case 15:
                    System.out.print("Ingresa la primera cadena: ");
                    String str10 = scanner.nextLine();
                    System.out.print("Ingresa la segunda cadena: ");
                    String str11 = scanner.nextLine();
                    System.out.println(str10.concat(str11));
                    break;
                case 16:
                    System.out.print("Ingresa una cadena: ");
                    String str12 = scanner.nextLine();
                    System.out.print("Ingresa la posición del carácter: ");
                    int pos = scanner.nextInt();
                    scanner.nextLine();  // Limpiar buffer
                    System.out.println(str12.charAt(pos));
                    break;
                case 17:
                    System.out.print("Ingresa una cadena: ");
                    String str13 = scanner.nextLine();
                    System.out.print("Ingresa la posición inicial: ");
                    int start = scanner.nextInt();
                    System.out.print("Ingresa la posición final: ");
                    int end = scanner.nextInt();
                    scanner.nextLine();  // Limpiar buffer
                    System.out.println(str13.substring(start, end));
                    break;
                case 18:
                    System.out.print("Ingresa una cadena: ");
                    String str14 = scanner.nextLine();
                    System.out.print("Ingresa un carácter: ");
                    char char14 = scanner.nextLine().charAt(0);
                    System.out.println(str14.indexOf(char14));
                    break;
                case 19:
                    System.out.print("Ingresa una cadena: ");
                    String str15 = scanner.nextLine();
                    System.out.println(str15.isEmpty());
                    break;
                case 20:
                    System.out.print("Ingresa la cadena: ");
                    String str16 = scanner.nextLine();
                    System.out.print("Ingresa la subcadena: ");
                    String substr = scanner.nextLine();
                    System.out.println(str16.contains(substr));
                    break;
                case 21:
                    System.out.print("Ingresa la cadena: ");
                    String str17 = scanner.nextLine();
                    System.out.print("Ingresa el prefijo: ");
                    String prefix = scanner.nextLine();
                    System.out.println(str17.startsWith(prefix));
                    break;
                case 22:
                    System.out.print("Ingresa la cadena: ");
                    String str18 = scanner.nextLine();
                    System.out.print("Ingresa el sufijo: ");
                    String suffix = scanner.nextLine();
                    System.out.println(str18.endsWith(suffix));
                    break;
                case 23:
                    System.out.print("Ingresa una cadena: ");
                    String str19 = scanner.nextLine();
                    System.out.println(str19.toLowerCase());
                    break;
                case 24:
                    System.out.print("Ingresa una cadena: ");
                    String str20 = scanner.nextLine();
                    System.out.println(str20.toUpperCase());
                    break;
                case 25:
                    System.out.print("Ingresa una cadena: ");
                    String str21 = scanner.nextLine();
                    System.out.print("Ingresa el carácter a reemplazar: ");
                    char oldChar = scanner.nextLine().charAt(0);
                    System.out.print("Ingresa el carácter nuevo: ");
                    char newChar = scanner.nextLine().charAt(0);
                    System.out.println(str21.replace(oldChar, newChar));
                    break;
                case 26:
                    System.out.print("Ingresa una cadena: ");
                    String str22 = scanner.nextLine();
                    System.out.print("Ingresa la subcadena a reemplazar: ");
                    String oldSubstr = scanner.nextLine();
                    System.out.print("Ingresa la nueva subcadena: ");
                    String newSubstr = scanner.nextLine();
                    System.out.println(str22.replace(oldSubstr, newSubstr));
                    break;
                case 27:
                    System.out.print("Ingresa una cadena para dividir: ");
                    String str23 = scanner.nextLine();
                    System.out.print("Ingresa el separador: ");
                    String separator = scanner.nextLine();
                    String[] splitResult = str23.split(separator);
                    for (String part : splitResult) {
                        System.out.println(part);
                    }
                    break;
                case 28:
                    System.out.print("Ingresa un array de caracteres (sin espacios): ");
                    String str24 = scanner.nextLine();
                    char[] charArray = str24.toCharArray();
                    System.out.println(String.valueOf(charArray));
                    break;
                case 29:
                    System.out.print("Ingresa un array de caracteres (sin espacios): ");
                    String str25 = scanner.nextLine();
                    System.out.print("Ingresa el índice de inicio: ");
                    int startIndex = scanner.nextInt();
                    System.out.print("Ingresa el tamaño: ");
                    int length = scanner.nextInt();
                    System.out.println(String.valueOf(str25.toCharArray(), startIndex, length));
                    break;

                case 30:
                    String input = "Hola Mundo";
                    char[] result = stringToCharArray(input);

                    // Imprimir el array de caracteres
                    for (char c : result) {
                        System.out.print(c + " ");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (option != 0);
    }

    // Método para comprobar si el carácter es un dígito
    public static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    // Método para comprobar si el carácter es una letra
    public static boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    // Método para comprobar si el carácter es una letra o un dígito
    public static boolean isLetterOrDigit(char c) {
        return isDigit(c) || isLetter(c);
    }

    // Método para comprobar si el carácter es minúscula
    public static boolean isLowerCase(char c) {
        return c >= 'a' && c <= 'z';
    }

    // Método para comprobar si el carácter es mayúscula
    public static boolean isUpperCase(char c) {
        return c >= 'A' && c <= 'Z';
    }

    // Método para comprobar si el carácter es un espacio
    public static boolean isSpaceChar(char c) {
        return c == ' ';
    }

    // Método para comprobar si el carácter es un espacio en blanco
    public static boolean isWhitespace(char c) {
        return c == ' ' || c == '\r' || c == '\n' || c == '\t';
    }

    // Método para convertir a minúscula
    public static char toLowerCase(char c) {
        if (isUpperCase(c)) {
            return (char) (c + 32); // A convertir a a través del valor ASCII
        }
        return c;
    }

    // Método para convertir a mayúscula
    public static char toUpperCase(char c) {
        if (isLowerCase(c)) {
            return (char) (c - 32); // a convertir a A a través del valor ASCII
        }
        return c;
    }

    // Método para comprobar si dos cadenas son iguales
    public static boolean equals(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // Método para comprobar si dos cadenas son iguales sin tener en cuenta mayúsculas y minúsculas
    public static boolean equalsIgnoreCase(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (toLowerCase(str1.charAt(i)) != toLowerCase(str2.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    // Método para comparar dos cadenas lexicográficamente
    public static int compareTo(String str1, String str2) {
        int minLength = str1.length() < str2.length() ? str1.length() : str2.length();
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return str1.charAt(i) - str2.charAt(i);
            }
        }
        return str1.length() - str2.length(); // Comparar longitudes si los primeros caracteres son iguales
    }

    // Método para comparar dos cadenas ignorando mayúsculas y minúsculas
    public static int compareToIgnoreCase(String str1, String str2) {
        int minLength = str1.length() < str2.length() ? str1.length() : str2.length();
        for (int i = 0; i < minLength; i++) {
            if (toLowerCase(str1.charAt(i)) != toLowerCase(str2.charAt(i))) {
                return toLowerCase(str1.charAt(i)) - toLowerCase(str2.charAt(i));
            }
        }
        return str1.length() - str2.length();
    }

    // Método para obtener la longitud de una cadena
    public static int length(String str) {
        int length = 0;
        for (int i = 0; i < str.length(); i++) {
            length++;
        }
        return length;
    }

    // Método para concatenar dos cadenas
    public static String concat(String str1, String str2) {
        String result = "";
        for (int i = 0; i < str1.length(); i++) {
            result += str1.charAt(i);
        }
        for (int i = 0; i < str2.length(); i++) {
            result += str2.charAt(i);
        }
        return result;
    }

    // Método para obtener el carácter en una posición específica
    public static char charAt(String str, int index) {
        return str.charAt(index);
    }

    // Método para obtener un substring desde un índice específico
    public static String substring(String str, int start) {
        String result = "";
        for (int i = start; i < str.length(); i++) {
            result += str.charAt(i);
        }
        return result;
    }

    // Método para obtener un substring entre dos índices específicos
    public static String substring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    // Método para encontrar el índice de un carácter en una cadena
    public static int indexOf(String str, char c) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                return i;
            }
        }
        return -1; // Si no se encuentra el carácter, devuelve -1
    }

    // Método para comprobar si la cadena está vacía
    public static boolean isEmpty(String str) {
        return str.length() == 0;
    }

    // Método para comprobar si una cadena contiene otra
    public static boolean contains(String str, String sub) {
        return str.indexOf(sub) != -1;
    }

    // Método para comprobar si una cadena empieza con un prefijo
    public static boolean startsWith(String str, String prefix) {
        return substring(str, 0, prefix.length()).equals(prefix);
    }

    // Método para comprobar si una cadena empieza con un prefijo a partir de un índice
    public static boolean startsWith(String str, String prefix, int start) {
        return substring(str, start, start + prefix.length()).equals(prefix);
    }

    // Método para comprobar si una cadena termina con un sufijo
    public static boolean endsWith(String str, String suffix) {
        return substring(str, str.length() - suffix.length()).equals(suffix);
    }

    // Método para convertir una cadena a minúsculas
    public static String toLowerCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += toLowerCase(str.charAt(i));
        }
        return result;
    }

    // Método para convertir una cadena a mayúsculas
    public static String toUpperCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += toUpperCase(str.charAt(i));
        }
        return result;
    }

    // Método para reemplazar un carácter en una cadena
    public static String replace(String str, char original, char replacement) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == original) {
                result += replacement;
            } else {
                result += str.charAt(i);
            }
        }
        return result;
    }

    // Método para reemplazar una subcadena en una cadena
    public static String replace(String str, String original, String replacement) {
        int index = str.indexOf(original);
        if (index == -1) {
            return str; // Si no se encuentra el original, devolvemos la cadena original
        }
        String result = "";
        while (index != -1) {
            result += str.substring(0, index) + replacement;
            str = str.substring(index + original.length());
            index = str.indexOf(original);
        }
        result += str; // Añadimos el resto de la cadena después del último reemplazo
        return result;
    }


    public static String valueOf(char[] tabla) {
        String result = "";
        for (char c : tabla) {
            result += c;
        }
        return result;
    }

    public static String valueOf(char[] tabla, int inicio, int cuantos) {
        String result = "";
        for (int i = inicio; i < inicio + cuantos; i++) {
            result += tabla[i];
        }
        return result;
    }

    public static char[] stringToCharArray(String str) {
        // Crear un array de caracteres con la longitud de la cadena
        char[] charArray = new char[str.length()];

        // Recorrer la cadena y agregar cada carácter al array
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }

        // Retornar el array de caracteres
        return charArray;
    }
}


