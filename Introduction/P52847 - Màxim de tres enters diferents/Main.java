// Librerías
import java.util.Scanner;

/**
 * Feu un programa que llegeixi tres nombres, tots diferents, i que n’escrigui el màxim. 
 * Entrada: L’entrada consisteix en tres enters diferents.
 * Salida: Cal escriure una línia amb el màxim dels tres nombres.
 *
 * @author cmasa
 */
public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); // Declaramos scanner

        // Declaramos variables y asignamos valor introducido por consola
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        
        // Condicional que comprueba cual de los tres valores es el máximo
        if ((a > b) && (a > c)) {
            System.out.println(a); // Si a es mayor se imprime a
        } else if ((b > a) && (b > c)) {
            System.out.println(b); // Si b es mayor se imprime b
        } else {
            System.out.println(c); // Si no se cumple ninguna de las dos condiciones anteriores el mayor es c
        }
    }
}
