// Librerías
import java.util.Scanner;

/**
 * Feu un programa que llegeixi un nombre n, i que escrigui tots els nombres 
 * entre 0 i n.
 * 
 * Entrada: L’entrada consisteix en un natural n.
 * 
 * Salida: Escriviu en ordre tots els naturals entre 0 i n.
 * 
 * @author cmasa
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Declaramos scanner

        /*
        Declaramos variable numero y asignamos valor introducido por consola
        */
        int numero = teclado.nextInt();
        
        /*
        Bucle que imprime los resultados
        i = 0 porque queremos mostrar los números desde 0
        i menor o igual a numero porque el bucle tiene que repetirse desde 0 hasta el nº
        introducido por el usuario (incluido)
        Aumentamos el valor de i de 1 en 1 para imprimir cada nº
        */
        for (int i = 0; i <= numero; i++){
            System.out.println(i);
        }  
    }
}
