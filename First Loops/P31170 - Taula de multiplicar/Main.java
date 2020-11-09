// Librerías
import java.util.Scanner;

/**
 * Feu un programa que llegeixi un nombre n i que escrigui la “taula de 
 * multiplicar” de n.
 * 
 * Entrada: L’entrada consisteix en un natural n entre 1 i 9.
 * 
 * Salida: Cal escriure la “taula de multiplicar” de n.
 * 
 * @author cmasa
 */
public class Main {

    public static void main(String[] args) {
        /*
        Declaramos scanner para que el usuario pueda introducir datos desde
        la consola
        */
        Scanner teclado = new Scanner(System.in);

        /*
        Declaramos variable n de tipo entero y asignamos valor introducido por consola
        */
        int n = teclado.nextInt();
        
        /*
        Declaramos una Constante con el valor máximo a multiplicar
        */
        final int TABLA_MULTIPLICAR = 10;
        
        /*
        Bucle que imprime tabla multiplicar
        Valor inicial de i es 1 porque queremos que la primera multiplicación se haga por 1
        Condición menor o igual que 10 para que el bucle sea recorrido 10 veces
        Vamos aumentando el valor de i de uno en uno para que se muestren todos los
        resultados de la tabla de multiplicar
        */
        for (int i = 1; i <= TABLA_MULTIPLICAR; i++){
            int resultado = n * i; // Variable que almacena el resultado final
            System.out.println(n + "*" + i + " = " + resultado); // Concatenamos variables con texto
        }
        
    }
}
