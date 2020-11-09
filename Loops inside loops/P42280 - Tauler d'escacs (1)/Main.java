
import java.util.Scanner;

/**
 * Considereu un tauler d’escacs amb f files i c columnes, on a cada casella hi
 * ha entre 0 i 9 monedes. Feu un programa que, donat un tauler, calculi el
 * nombre total de monedes que conté.
 *
 * Entrada: L’entrada comença amb el nombre de files f i el nombre de
 * columnes c. Segueixen f línies, cadascuna amb c caràcters entre ‘0’ i ‘9’.
 *
 * Salida: Cal escriure el nombre total de monedes del tauler.
 *
 * @author cmasana
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Declaramos scanner

        /*
        Asignamos el nº de filas introducido por el usuario a la variable correspondiente
         */
        int filas = teclado.nextInt();

        /*
        Asignamos el nº de columnas introducido por el usuario a la variable correspondiente
         */
        int columnas = teclado.nextInt();

        /*
        Almacena cada fila de numeros
         */
        String monedas;

        /*
        Cada uno de los dígitos de 1 fila
         */
        int digito;

        /*
        Total de sumar todos los dígitos de una fila
         */
        int suma = 0;

        /*
        Total de sumar cada una de las filas
         */
        int total = 0;

        /*
        Bucle que se repite hasta que se alcanza el nº de filas introducido
        Asignamos a i el valor de 0 y establecemos la condición a evaluar en i menor que filas
        Incrementamos el valor de i de 1 en 1
         */
        for (int i = 0; i < filas; i++) {

            /*
            Para cada fila pedimos un String
             */
            monedas = teclado.next();

            /*
            Recorre cada fila y suma sus dígitos. En este caso, hay que asignar estrictamente el valor 0 a k para poder
            recorrer el String, ya que el primer índice es 0
             */
            for (int k = 0; k < columnas; k++) {
                /*
                Transforma cada uno de los números en un caracter
                 */
                char num = monedas.charAt(k);

                /*
                Obtiene el valor numérico (INT) de cada caracter
                 */
                digito = Character.getNumericValue(num);

                /*
                Obtiene la suma de c/u de los caracteres
                 */
                suma += digito;
            }

        }
        /*
        El total de sumar cada una de las filas
         */
        total += suma;
        System.out.println(total);
    }
}
