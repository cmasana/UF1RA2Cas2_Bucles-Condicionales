// Librerías
import java.util.Scanner;

/**
 * Feu un programa que llegeixi un nombre i que n’escrigui el nombre de dígits.
 * 
 * Entrada: L’entrada consisteix en un natural n.
 * 
 * Salida: Cal escriure el nombre de dígits de n.
 * 
 * @author cmasa
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Declaramos scanner

        // Declaramos variable y asignamos valor introducido por consola
        int n = teclado.nextInt(); // Almacena el número
        int digitos = 0;
        
        // Bucle para contar los digitos de n
        for(int i = n; i > 0; digitos++) {
            i = i / 10; // Cada vez que se divide entre 10, tenemos 1 dígito
        }
        
        /**
         * Comprobación: Si el número es 0 se muestra un mensaje predefinido
         * ya que es la única manera de mostrar que tiene 1 dígito, ya que es el
         * único caso en el que no entra en el bucle
         */
        if(digitos == 0){
            System.out.println("El nombre de digits de " + n + " es 1.");
        }
        else {
            System.out.println("El nombre de digits de " + n + " es " + digitos + ".");
        } 
    }
}
