// Librerías
import java.util.Scanner;

/**
 * Feu un programa que llegeixi dos nombres i que n’escrigui la suma.
 * Entrada: L’entrada consisteix en dos enters.
 * Salida: Cal escriure una línia amb la suma dels dos nombres.
 * @author cmasa
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); // Declaramos scanner
        
        // Declaramos variables y asignamos valor introducido por consola
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        
        // Variable que almacena el resultado
        int suma = a + b;
        
        // Imprimimos resultado
        System.out.println(suma);
    }
}
