// Librerías
import java.util.Scanner;

/**
 * Feu un programa que llegeixi tres nombres i que n’escrigui la suma.
 * Entrada: L’entrada consisteix en tres enters.
 * Salida: Cal escriure una l ́ınia amb la suma dels tres nombres.
 * @author cmasa
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); // Declaramos scanner
        
        // Declaramos variables y asignamos valor introducido por consola
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        
        // Variable que almacena el resultado
        int suma = a + b + c;
        
        // Imprimimos resultado
        System.out.println(suma);
    }
}
