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

        /*
        Declaramos variables y asignamos valores introducidos por consola
        */
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        
        /*
        Creamos condicional para evaluar las diferentes casuisticas
        */
        if(a <= b){ // Si a es mayor o igual a b
            /*
            Asignamos a i el valor de a (por ser este el mayor)
            Mientras i sea menor que b se repetirá el bucle, ya que no queremos 
            mostrar una coma final
            Incrementamos el valor de i de 1 en 1
            */
            for (int i = a; i < b; i++) {
                System.out.print(i + ","); // Formato para números entre a y b
            }
            System.out.println(b); // Imprime último número (sin coma)
        }
        /*
        En el resto de casos mostramos una cadena vacía
        */
        else {
            System.out.println("");
        }
    }
}
