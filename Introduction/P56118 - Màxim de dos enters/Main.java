// Librerías
import java.util.Scanner;

/**
 * Feu un programa que llegeixi dos nombres i que n’escrigui el màxim. 
 * Entrada: L’entrada consisteix en dos enters.
 * Salida: Cal escriure una línia amb el màxim dels dos nombres.
 *
 * @author cmasa
 */
public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); // Declaramos scanner

        /*
        Declaramos variables y asignamos valor introducido por consola
        */
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        
        /*
        Condicional que comprueba cual de los dos valores es el máximo
        */
        if (a > b) {
            System.out.println(a); // Si a es mayor se imprime a
        } else {
            System.out.println(b); // Si b es mayor se imprime b
        }
    }
}
