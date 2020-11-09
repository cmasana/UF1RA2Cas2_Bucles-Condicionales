// Librerías
import java.util.Scanner;

/**
 * Feu un programa que llegeixi dos nombres a i b, i que escrigui tots els 
 * nombres entre a i b.
 * 
 * Entrada: L’entrada consisteix en dos naturals a i b.
 * 
 * Salida: Escriviu una línia amb a,a+1,…,b−1,b. Separeu els nombres amb comes.
 * 
 * @author cmasa
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Declaramos scanner

        // Declaramos variable y asignamos valor introducido por consola
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        
        // Creamos condicional para verificar que a sea mayor o igual que b
        if(a <= b){
            // Bucle que imprime los números entre a y b
            for (int i = a; i < b; i++) {
                System.out.print(i + ","); // Formato para números entre a y b
            }
            System.out.println(b); // Imprime último número (sin coma)
        }
        else {
            System.out.println("");
        }
    }
}
