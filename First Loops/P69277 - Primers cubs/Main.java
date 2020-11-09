// Librerías
import java.util.Scanner;

/**
 * Feu un programa que llegeixi un nombre n, i que escrigui els primers cubs
 * 
 * Entrada: L’entrada consisteix en un natural n.
 * 
 * Salida: Escriviu una línia amb 03,13,…,(n−1)3,n3. Separeu els nombres amb 
 * comes.
 * 
 * @author cmasa
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Declaramos scanner

        // Declaramos variable y asignamos valor introducido por consola
        int n = teclado.nextInt();
        
        // Bucle que imprime los cubos
        for(int i = 0; i < n; i++) {
            System.out.print((i * i * i) + ","); // Formato con coma hasta n - 4
        }
        
        System.out.println(n * n * n); // Formato sin coma final
    }
}
