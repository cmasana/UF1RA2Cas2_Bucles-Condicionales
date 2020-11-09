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

        /*
        Asignamos a variable num el entero intrucido por el usuario
         */
        int num = teclado.nextInt();

        /*
        Almacena el nº de filas
        */
        int filas = 0;

        /*
        Almacena el nº de columnas
         */
        int columnas = 0;

        /*
        Almacena una cadena de caracteres vacía para evitar errores de presentación en Jutge
         */
        String asterisco = "";

        /*
        Mientras el número de filas sea menor que el numero introducido se repetirá el bucle
         */
        while(filas < num){
            /*
            Este otro bucle evalúa las columnas, así que mientras el número de columnas sea menor o igual que el
            nº de filas se rpetirá el bucle
             */
            while(columnas <= filas){

                /*
                Añadimos a nuestra variable asterisco un *
                 */
                asterisco += "*";

                /*
                Incrementamos el valor de las columnas en 1
                 */
                columnas++;
            }

            /*
            Mostramos por pantalla el resultado de la primera fila. Básicamente sería Primera fila tiene 1 columna
             */
            System.out.println(asterisco);

            /*
            Incrementamos el valor de la variable filas para pasar a la siguiente fila
             */
            filas++;
            
            /*
            Es necesario reinicializar la variable columnas y la de asterisco porque sino no se pintarán los asteriscos
            correspondientes para cada una de las filas
             */
            columnas = 0;
            asterisco = "";
        }
    }
}
