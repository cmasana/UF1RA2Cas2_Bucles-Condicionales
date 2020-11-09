// Librerías
import java.util.Scanner;

/**
 * Feu un programa que llegeixi una lletra i que l’escrigui en minúscula si era 
 * majúscula, o l’escrigui en majúscula si era minúscula.
 * 
 * Entrada: L’entrada consisteix en una lletra.
 * 
 * Salida: Cal escriure una línia amb la lletra en minúscula si era majúscula, o
 * en majúscula si era minúscula.
 * 
 * @author cmasa
 */
public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); // Declaramos scanner

        /*
        Declaramos variable y asignamos valor introducido por consola
        */
        char a = teclado.next().charAt(0);

        /*
        Condicional que comprueba si la letra es mayúscula o minúscula
        Utilizamos el método isLowerCase de la clase Character para averiguar si es minúscula
        Utilizamos método toUpperCase de clase Character para transformar a mayúscula y
        toLowerCase para transformar en minúscula
        */
        if (Character.isLowerCase(a)) {
            // Si es minúscula la cambia a mayúscula
            System.out.println(Character.toUpperCase(a));
        } else {
            // En caso contrario la cambia a minúscula
            System.out.println(Character.toLowerCase(a));
        }
        

    }
}
