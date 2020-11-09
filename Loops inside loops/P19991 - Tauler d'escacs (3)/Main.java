
import java.util.Scanner;

/**
 * Considereu un tauler d’escacs quadrat amb n files i n columnes, on a cada
 * casella hi ha entre 0 i 9 monedes. Feu un programa que, donat un tauler,
 * calculi el nombre total de monedes contingudes a les dues diagonals.
 *
 * Entrada: L’entrada comença amb la mida n del tauler, Segueixen n línies,
 * cadascuna amb n caràcters entre ‘0’ i ‘9’.
 *
 * Salida: Cal escriure el nombre total de monedes a les dues diagonals del
 * tauler.
 *
 * @author cmasana
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Declaramos scanner

        int filas = teclado.nextInt(); // filas

        String monedas; // Almacena cada fila de numeros
        char num; // Almacena el caracter
        char num2; // 2º caracter
        int digito; // Primer dígito de 1 fila
        int digito2; // Segundo dígito de 1 fila
        int suma = 0; // Total de sumar todos los dígitos de una fila
        int total = 0; // Total de sumar cada una de las filas
        int mitad = filas / 2;
        int contador = 1; // Para bucle while

        // Si el nº de filas es 1
        if (filas == 1) {
            monedas = teclado.next();

            num = monedas.charAt(0);

            digito = Character.getNumericValue(num);

            suma += digito;
        }

        while (contador < filas) { // Controla el nº de filas

            if (filas % 2 != 0) { // IMPAR
                // Mitad superior de filas
                for (int j = 0; j < mitad; j++) {
                    // Para cada fila pedimos un String
                    monedas = teclado.next();

                    // Transforma cada uno de los números en un caracter
                    num = monedas.charAt(j);
                    num2 = monedas.charAt(filas - 1 - j);

                    // Obtiene el valor numérico (INT) de cada caracter NUM
                    digito = Character.getNumericValue(num);

                    // Obtiene el valor numérico (INT) de cada caracter NUM2
                    digito2 = Character.getNumericValue(num2);

                    // Obtiene la suma de c/u de los caracteres
                    suma += (digito + digito2);

                    // Sumamos 1 al contador de filas
                    contador++;
                }

                // Bloque de sentencias para fila central de impares
                monedas = teclado.next();

                num = monedas.charAt(mitad);

                // Obtiene el valor numérico (INT) de cada caracter NUM
                digito = Character.getNumericValue(num);

                // Obtiene la suma de c/u de los caracteres
                suma += digito;

                // Sumamos 1 al contador de filas
                contador++;

                // Mitad inferior de filas
                for (int k = mitad + 1; k < filas; k++) {
                    // Para cada fila pedimos un String
                    monedas = teclado.next();
                    // Transforma cada uno de los números en un caracter
                    num = monedas.charAt(filas - 1 - k);
                    num2 = monedas.charAt(k);

                    // Obtiene el valor numérico (INT) de cada caracter NUM
                    digito = Character.getNumericValue(num);

                    // Obtiene el valor numérico (INT) de cada caracter NUM2
                    digito2 = Character.getNumericValue(num2);

                    // Obtiene la suma de c/u de los caracteres
                    suma += (digito + digito2);

                    contador++;
                }

            } else { // PAR

                // Mitad superior de filas
                for (int j = 0; j < mitad; j++) {
                    // Para cada fila pedimos un String
                    monedas = teclado.next();

                    // Transforma cada uno de los números en un caracter
                    num = monedas.charAt(j);
                    num2 = monedas.charAt(filas - 1 - j);

                    // Obtiene el valor numérico (INT) de cada caracter NUM
                    digito = Character.getNumericValue(num);

                    // Obtiene el valor numérico (INT) de cada caracter NUM2
                    digito2 = Character.getNumericValue(num2);

                    // Obtiene la suma de c/u de los caracteres
                    suma += (digito + digito2);

                    contador++;
                }

                // Mitad inferior de filas
                for (int k = mitad; k < filas; k++) {
                    // Para cada fila pedimos un String
                    monedas = teclado.next();
                    // Transforma cada uno de los números en un caracter
                    num = monedas.charAt(filas - 1 - k);
                    num2 = monedas.charAt(k);

                    // Obtiene el valor numérico (INT) de cada caracter NUM
                    digito = Character.getNumericValue(num);

                    // Obtiene el valor numérico (INT) de cada caracter NUM2
                    digito2 = Character.getNumericValue(num2);

                    // Obtiene la suma de c/u de los caracteres
                    suma += (digito + digito2);

                    contador++;
                }
            }
        }

        // El total de las sumas de cada una de las filas
        total += suma;
        System.out.println(total);

    }
}
