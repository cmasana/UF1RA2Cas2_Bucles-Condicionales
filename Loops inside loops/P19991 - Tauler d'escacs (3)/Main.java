
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

        /*
        Declaramos y asignamos a filas el valor introducido por teclado
         */
        int filas = teclado.nextInt();

        String monedas; // Almacena cada fila de numeros
        char num; // Almacena el caracter
        char num2; // 2º caracter
        int digito; // Primer dígito de 1 fila
        int digito2; // Segundo dígito de 1 fila
        int suma = 0; // Total de sumar todos los dígitos de una fila
        int total = 0; // Total de sumar cada una de las filas
        int mitad = filas / 2; // Algoritmo para calcular la mitad de las filas
        int contador = 1; // Contador para bucle while

        /*
        Si el nº de filas = 1 se realiza únicamente esta parte de código
        (Comprobación que se realiza para evitar errores de presentación en JUTGE)
         */
        if (filas == 1) {
            /*
            Asignamos el valor introducido por teclado a la variable monedas
            de tipo String
             */
            monedas = teclado.next();

            /*
            Como el nº de filas y de columnas es el mismo solo necesitamos recoger
            el primer y único valor y asignarlo a la variable num
             */
            num = monedas.charAt(0);

            /*
            Obtenemos el valor numérico del caracter y lo asignamos a digito
             */
            digito = Character.getNumericValue(num);

            /*
            Asignamos a total el resultado de la suma de cada dígito (Solo 1 en este caso)
             */
            suma += digito;
        }

        /*
        Recorre el nº de filas introducidas
        Mientras contador sea menor que el nº de filas introducidas el bucle se repite
         */
        while (contador < filas) {

            /*
            Evaluamos 2 casuisticas: Si el nº de filas es IMPAR o si el número de filas es PAR
             */
            if (filas % 2 != 0) { // Si es impar

                /*
                Primero, realizamos un bucle que se encarga de realizar una serie de sentencias
                para la primera mitad de las filas. Para ello, asignamos el valor de 0 a j y repetimos el bucle
                (No encuentro las palabras adecuadas para explicarlo, con un dibujo sería super fácil)

                Incrementamos el valor de j de 1 en 1
                 */
                for (int j = 0; j < mitad; j++) {
                    /*
                    Para cada fila pedimos un String
                     */
                    monedas = teclado.next();

                    /*
                    Asignamos a la variable num el digito desde el principio de la fila
                     */
                    num = monedas.charAt(j);

                    /*
                    Asignamos a la variable num2 el digito desde el final de la fila
                     */
                    num2 = monedas.charAt(filas - 1 - j);

                    /*
                    Obtenemos el valor numérico (INT) de cada caracter y lo asignamos a cada variable
                     */
                    digito = Character.getNumericValue(num);
                    digito2 = Character.getNumericValue(num2);

                    /*
                    Asigna a suma el total de sumar c/u de los caracteres obtenidos
                     */
                    suma += (digito + digito2);

                    /*
                    Incrementamos en 1 el valor del contador para el bucle while
                     */
                    contador++;
                }

                /*
                Para la fila central de los Impares se realizan una serie de sentencias
                pero en este caso sin bucle. Realizamos lo mismo que dentro del bucle anterior
                 */
                monedas = teclado.next();

                /*
                Indicamos en este caso que el nº que debe obtener es el del medio
                ya que se trata de la fila central
                 */
                num = monedas.charAt(mitad);
                digito = Character.getNumericValue(num);
                suma += digito;

                /*
                Sumamos 1 al contador de filas para el bucle while
                 */
                contador++;

                /*
                Para el resto de filas realizamos otro bucle. En este caso asignamos a k el valor de la mitad de las
                filas + 1 para que empiece justo en la siguiente después de la central

                La condición que evalúa en este caso es que k sea menor que el nº total de filas. E incrementamos su
                valor de 1 en 1
                 */
                for (int k = mitad + 1; k < filas; k++) {
                    /*
                    Para cada fila pedimos un String
                     */
                    monedas = teclado.next();

                    /*
                    En este caso vamos obteniendo los valores desde el centro hacia a fuera, al contrario
                    que el primer bucle
                     */
                    num = monedas.charAt(filas - 1 - k);
                    num2 = monedas.charAt(k);

                    /*
                    Obtiene el valor numérico (INT) de cada caracter
                     */
                    digito = Character.getNumericValue(num);
                    digito2 = Character.getNumericValue(num2);

                    /*
                    Obtiene la suma de c/u de los caracteres
                     */
                    suma += (digito + digito2);

                    /*
                    Incrementamos el contador de 1 en 1 para poder salir del bucle while
                    cuando sea necesario
                     */
                    contador++;
                }

                /*
                En el caso de que el nº de filas sea par se ejecutan estas otras sentencias
                Esto tuve que hacerlo así porque no se me ocurría nada más, probé diferentes cosas
                pero no podía reutilizar el código de los impares porque el funcionamiento era diferente
                 */
            } else { // PAR

                /*
                El funcionamiento del bucle para las filas superiores es igual que en la casuistica de los Impares
                con la diferencia de que no tenemos fila central. Así que voy a obviar los comentarios de bloque, porque
                sería repetir lo mismo otra vez
                 */
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

                /*
                El funcionamiento del bucle para las filas inferiores es igual que en la casuistica de los Impares
                con la diferencia de que no tenemos fila central. Así que voy a obviar los comentarios de bloque, porque
                sería repetir lo mismo otra vez
                 */
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

        /*
        Independientemente de que el nº sea Par o Impar
        Asignamos a total la suma de cada dígito extraído y lo mostramos por pantalla
         */
        total += suma;
        System.out.println(total);

    }
}
