// Librerías
import java.util.Scanner;

/**
 * Feu un programa que llegeixi dues paraules i que n’indiqui l’ordre lexicogràfic.
 * 
 * Entrada: L’entrada consisteix en dues paraules amb lletres minúscules a i b.
 * 
 * Salida: Escriviu una línia indicant si a menor que b, a mayor que b o a = b, seguint 
 * exactament el format dels exemples.
 * 
 * @author cmasa
 */
public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); // Declaramos scanner

        // Declaramos variable y asignamos valor introducido por consola
        String a = teclado.next();
        String b = teclado.next();
        
        // Declaramos variables para asignar valor de la operación que compara
        // el orden lexicográfico de las dos cadenas
        int res1 = a.compareTo(b);
        int res2 = b.compareTo(a);
        
        // Condicional que evalua las opciones y muestra resultados por pantalla
        if (res1 > res2) {
            System.out.println(a + " > " + b);
        } else if (res1 < res2) {
            System.out.println(a + " < " + b);
        } else {
            System.out.println(a + " = " + b);
        } 
    }
}
