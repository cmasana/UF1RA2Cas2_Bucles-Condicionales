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

        /*
        Declaramos y asignamos a la variable n el valor introducido por consola
        */
        int n = teclado.nextInt();
        
        /*
        Bucle que imprime los cubos
        i = 0 porque necesitamos que el primer valor obtenido sea 0
        i menor que n porque necesitamos que el bucle no tome en cuenta el numero introducido
        y así evitar que se muestre una última coma final
        Incrementamos el valor de i de uno en uno
        */
        for(int i = 0; i < n; i++) {
            System.out.print((i * i * i) + ","); // Formato con coma
        }
        
        /*
        Añadimos al resultado anterior el cubo de n y cambiamos así
        el formato para que no se muestre la coma final
        */
        System.out.println(n * n * n); // Formato sin coma final
    }
}
