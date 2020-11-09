import java.util.Scanner;

/**
 * Feu un programa que, donat un nombre n, escrigui un “triangle de mida n”.
 *
 * Entrada: L’entrada consisteix en un natural n.
 *
 * Salida: Escriviu n línies, de manera que la línia i contingui i asteriscos.
 *
 * @author cmasana
 */
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Declaramos scanner

        int num; // Almacenamos nº desde teclado
        num = teclado.nextInt();
        int filas = 0;
        int columnas = 0;
        String asterisco = "";
        
        // Bucle para las filas
        while(filas < num){
            // Bucle para cada línea de la fila
            while(columnas <= filas){ // La primera vez 'i' = 'j' así que no entra al bucle
                asterisco += "*";
                columnas++;
            }
            System.out.println(asterisco);
            filas++;
            columnas = 0; // Reiniciamos valor de la variable para cada fila
            asterisco = "";
        }
        
        /*
        // Bucle para las filas
        for (int i = 0; i < num; i++) {
            // Bucle para cada línea de la fila
            for (int j = 0; j < i; j++) { // La primera vez 'i' = 'j' así que no entra al bucle
                System.out.print("*");
            }
            System.out.println("*");
        }
        */
    }
}