// Librerías
import java.util.Scanner;

/**
 * Feu un programa que llegeixi dos nombres x i y, i que escrigui tots els 
 * nombres entre x i y (o entre y i x), de gran a petit.
 * 
 * Entrada: L’entrada consisteix en dos enters x i y.
 * 
 * Salida: Cal escriure tots els enters entre x i y (o entre y i x), de gran a 
 * petit.Escriviu en ordre tots els naturals entre 0 i n.
 * 
 * @author cmasa
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Declaramos scanner

        // Declaramos variable y asignamos valor introducido por consola
        int x = teclado.nextInt();
        int y = teclado.nextInt();
        
        // Condicional que comprueba que úmero es mayor
        if (x >= y){ // Si x es mayor o igual a y
            for (int i = x; i >= y; i--){
                System.out.println(i); 
            }
        }
        else { // Si y es mayor que x
            for (int i = y; i >= x; i--){
                System.out.println(i);
            }
        }
    }
}
