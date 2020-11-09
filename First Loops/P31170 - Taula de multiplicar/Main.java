// Librerías
import java.util.Scanner;

/**
 * Feu un programa que llegeixi un nombre n i que escrigui la “taula de 
 * multiplicar” de n.
 * 
 * Entrada: L’entrada consisteix en un natural n entre 1 i 9.
 * 
 * Salida: Cal escriure la “taula de multiplicar” de n.
 * 
 * @author cmasa
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Declaramos scanner

        // Declaramos variable y asignamos valor introducido por consola
        int n = teclado.nextInt();
        
        // Constante con valor máximo a multiplicar
        final int TABLA_MULTIPLICAR = 10;
        
        // Bucle que imprime tabla multiplicar
        for (int i = 1; i <= TABLA_MULTIPLICAR; i++){
            int resultado = n * i; // Variable que almacena el resultado
            System.out.println(n + "*" + i + " = " + resultado);
        }
        
    }
}
