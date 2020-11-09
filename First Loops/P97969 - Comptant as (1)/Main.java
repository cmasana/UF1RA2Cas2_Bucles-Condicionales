// Librerías
import java.util.Scanner;

/**
 * Feu un programa que llegeixi una seqüència de caràcters acabada en punt i que
 * escrigui quantes lletres ‘a’ conté.
 * 
 * Entrada: L’entrada consisteix en una seqüència de caràcters acabada en punt.
 * 
 * Salida: Cal escriure el nombre de vegades que ‘a’ apareix a la seqüència.
 * 
 * @author cmasa
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Declaramos scanner

        // Declaramos variable y asignamos valor introducido por consola
        String cadena = teclado.nextLine();
        
        int contLetras = 0; // Almacena cuantas veces se encuentra letra 'a'
        
        // Recorremos cadena con un bucle
        for(int i = 0; i < cadena.length(); i++){
            
            // Evaluamos caracter por caracter. Si c/u contiene la letra 'a'
            if(cadena.charAt(i) == 'a'){
                contLetras++; // Sumamos 1 al contador
            }
        }
        
        // Imprimimos valor por pantalla
        System.out.println(contLetras);
        
    }
}
