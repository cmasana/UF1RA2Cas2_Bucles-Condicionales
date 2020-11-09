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

        /*
        Asignamos los dos números introducidos por teclado a cada una de las variables
        */
        int x = teclado.nextInt();
        int y = teclado.nextInt();
        
        /*
        Añadimos un condicional para evaluar las posibles casuisticas 
        */
        if (x >= y){ // Si x es mayor o igual a y
            /*
            Asignamos el valor del nº x a i
            i mayor o igual que y para que el bucle se ejecute hasta que el valor de 
            ambos números sea el mismo
            Restamos de uno en 1 el valor de i para ir imprimiendo los números de mayor
            a menor
            */
            for (int i = x; i >= y; i--){
                System.out.println(i); 
            }
        }
        
        else { // Para el resto de los casos
            /*
            Como el de arriba con la única diferencia de que asignamos a i el valor de y
            (Por si el 2º número fuera el mayor)
            */
            for (int i = y; i >= x; i--){
                System.out.println(i);
            }
        }
    }
}
