// Librerías
import java.util.Scanner;

/**
 * Feu un programa que llegeixi un nombre n, i que escrigui tots els nombres 
 * entre 0 i n.
 * 
 * Entrada: L’entrada consisteix en un natural n.
 * 
 * Salida: Escriviu en ordre tots els naturals entre 0 i n.
 * 
 * @author cmasa
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Declaramos scanner

        // Declaramos variable y asignamos valor introducido por consola
        int numero = teclado.nextInt();
        
        // Bucle que imprime resultados
        for (int i = 0; i <= numero; i++){
            System.out.println(i);
        }  
    }
}
