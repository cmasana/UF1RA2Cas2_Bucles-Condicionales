// Librerías
import java.util.Scanner;

/**
 * Feu un programa que llegeixi una lletra i que indiqui si és una majúscula, si
 * és una minúscula, si és una vocal, i si és una consonant. Recordeu que en 
 * català les vocals són les lletres ‘a’, ‘e’, ‘i’, ‘o’ i ‘u’, i llurs majúscules.
 * 
 * Entrada: L’entrada consisteix en una lletra.
 * 
 * Salida: Heu de dir si la lletra és majúscula, minúscula, vocal o consonant. 
 * Seguiu el format dels exemples.
 * 
 * @author cmasa
 */
public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); // Declaramos scanner

        // Declaramos variable y asignamos valor introducido por consola
        char letra = teclado.next().charAt(0);

        // Condicional que comprueba si la letra es vocal o consonante
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A'
                || letra == 'E' || letra == 'I'|| letra == 'O' || letra == 'U') {
            
            // Condicional que comprueba si es minúscula o mayúscula
            if (Character.isLowerCase(letra)) {
                System.out.println("minuscula");
                System.out.println("vocal");
            } else {
                System.out.println("majuscula");
                System.out.println("vocal");
            }
        
        } else { // Consonante
            if (Character.isUpperCase(letra)) {
                System.out.println("majuscula");
                System.out.println("consonant");
            } else {
                System.out.println("minuscula");
                System.out.println("consonant");
            }
        }
    }
}
