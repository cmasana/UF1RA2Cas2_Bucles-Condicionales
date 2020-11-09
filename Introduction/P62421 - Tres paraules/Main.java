// Librerías
import java.util.Scanner;

/**
 * Feu un programa que llegeixi tres paraules a, b i c, i que escrigui una línia amb c, b i a en aquest ordre.
 * Entrada: L’entrada consisteix en tres paraules en una línia.
 * Salida: Cal escriure una línia amb les tres paraules en ordre invers, separades amb espais.
 * @author cmasa
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); // Declaramos scanner
        
        /*
        Declaramos variables y asignamos valor introducido por consola
        */
        String a = teclado.next();
        String b = teclado.next();
        String c = teclado.next();
        
        /*
        Imprimimos resultado
        */
        System.out.println(c + " " + b + " " + a);
    }
}
