
import java.util.Scanner;

/**
 * Considereu un tauler d’escacs amb f files i c columnes, on a cada casella hi
 * ha entre 0 i 9 monedes. Feu un programa que, donat un tauler, calculi el
 * nombre total de monedes que conté.
 *
 * Entrada: L’entrada comença amb el nombre de files f i el nombre de columnes
 * c. Segueixen f línies, cadascuna amb c caràcters entre ‘0’ i ‘9’.
 *
 * Salida: Cal escriure el nombre total de monedes del tauler.
 *
 * @author cmasana
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Declaramos scanner

        int filas = teclado.nextInt(); // filas
        int columnas = teclado.nextInt(); // columnas

        String monedas; // Almacena cada fila de numeros
        int digito; // Cada uno de los dígitos de 1 fila
        int suma = 0; // Total de sumar todos los dígitos de una fila
        int total = 0; // Total de sumar cada una de las filas

        // Bucle para repetir hasta que se alcanza el nº de filas introducido
        for (int i = 0; i < filas; i++) {

            // Para cada fila pedimos un String
            monedas = teclado.next();

            if (i % 2 != 0) { // IMPAR
                // Recorre cada fila y suma sus dígitos
                for (int k = 1; k < columnas; k += 2) {
                    // Transforma cada uno de los números en un caracter
                    char num = monedas.charAt(k);

                    // Obtiene el valor numérico (INT) de cada caracter
                    digito = Character.getNumericValue(num);

                    // Obtiene la suma de c/u de los caracteres
                    suma += digito;
                }
            }
            else {
                // Recorre cada fila y suma sus dígitos
                for (int k = 0; k < columnas; k += 2) {
                    // Transforma cada uno de los números en un caracter
                    char num = monedas.charAt(k);

                    // Obtiene el valor numérico (INT) de cada caracter
                    digito = Character.getNumericValue(num);

                    // Obtiene la suma de c/u de los caracteres
                    suma += digito;
                }
            }

        }
        // El total de las sumas de cada una de las filas
        total += suma;
        System.out.println(total);

        // PARA siguiente ejercicio hallar filas impares y pares y establecer la lógica para cada una de ellas
    }
}
