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

        /*
        Declaramos variable y asignamos valor introducido por consola
        */
        String cadena = teclado.nextLine();
        
        /*
        Variable que almacena cuantas veces se encuentra letra 'a'
        */
        int contLetras = 0;
        
        /*
        Recorremos la cadena con un bucle
        i = 0 porque cuando utilizamos caracteres la primera posición se corresponde con un 0
        y necesitamos evaluar si en la primera letra hay una 'a' también
        
        El bucle se repite mientras i sea menor a la longitud de la cadena
        
        Incrementamos el valor de i de uno en 1 para que vaya recorriendo cada uno
        de los caracteres
        */
        for(int i = 0; i < cadena.length(); i++){
            
            /*
            Evaluamos caracter por caracter. Si c/u contiene la letra 'a'
            sumamos 1 al contador
            */
            if(cadena.charAt(i) == 'a'){
                contLetras++;
            }
        }
       
        System.out.println(contLetras); // Imprimimos resultado por pantalla
        
    }
}
