
import java.util.Scanner;

/**
 * Considereu un tauler d’escacs amb f files i c columnes, on a cada casella hi ha entre 0 i 9 monedes. Suposeu que 
 * la casella de dalt a l’esquerra és blanca.
 * Feu un programa que, donat un tauler, calculi el nombre total de monedes contingudes a les caselles blanques.
 *
 * Entrada: L’entrada comença amb el nombre de files f i el nombre de columnes c. 
 * Segueixen f línies, cadascuna amb c caràcters entre ‘0’ i ‘9’.
 *
 * Salida: Cal escriure el nombre total de monedes a les caselles blanques del tauler.
 *
 * @author cmasana
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Declaramos scanner

        /*
        Almacena el número de filas que introducimos por consola
        */
        int filas = teclado.nextInt();
        
        /*
        Almacena el número de columnas que introducimos por consola
        */
        int columnas = teclado.nextInt();

        /*
        Almacena cada fila de numeros, utilizamos un String porque es la única
        manera que he encontrado para recorrer cada dígito de 1 en 1
        */
        String monedas;
        
        /*
        Almacena cada uno de los dígitos de 1 fila
        */
        int digito;
        
        /*
        Almacena la suma de c/u de los dígitos de una fila
        */
        int suma = 0;
        
        /*
        Almacena el total de sumar cada una de las filas
        */
        int total = 0;

        /*
        Bucle que se repite hasta que se alcanza el nº de filas introducido
        Asignamos a i el valor de 1 para que numere las filas
        En este caso la condición es i <= filas ya que necesitamos que el bucle se repita
        el nº de veces que hemos introducido. Y al inicializar la variable i con 1 necesitamos que
        llegué hasta el nº introducido (incluído)
        Incrementamos el valor de i de 1 en 1 para recorrer cada una de las filas
        */
        for (int i = 1; i <= filas; i++) {

            /*
            Para cada fila pedimos un String y lo asignamos a monedas
            */
            monedas = teclado.next();

            /*
            Condición para evaluar si la fila es PAR
            */
            if (i % 2 == 0) { //PAR
                /*
                Si la fila es par se realiza este bucle
                k = 1, porque el indice empieza en 0 pero en las filas pares
                necesitamos que sea el segundo dígito el seleccionado

                k menor que columnas porque tiene el valor total de digitos utilizados
                (creo que también funcionaría monedas.length() )

                Incrementamos de 2 en 2 para que vaya saltando 1 casilla como en un tablero
                de ajedrez
                */
                for (int k = 1; k < columnas; k += 2) {
                    /*
                    Utiliza el valor de k como índice y lo almacena
                    en la variable num
                     */
                    char num = monedas.charAt(k);

                    /*
                    Obtiene el valor numérico (INT) de cada caracter
                    (solo funciona para caracteres numéricos)
                     */
                    digito = Character.getNumericValue(num);

                    /*
                    Va sumando cada uno de los caracteres extraídos
                     */
                    suma += digito;
                }
            }
            /*
            Si la fila es IMPAR se realiza este otro bucle
            en este caso k = 0 porque el primer dígito es la casilla
            blanca de un tablero de ajedrez
             */
            else {
                for (int k = 0; k < columnas; k += 2) {
                    char num = monedas.charAt(k);
                    digito = Character.getNumericValue(num);
                    suma += digito;
                }
            }

        }
        /*
        Asignamos a total el resultado de sumar lo extraído en cada una de las condiciones
         */
        total += suma;
        System.out.println(total); // Imprimimos por pantalla
        
        /*
        La lógica que envié al JUTGE era diferente pero funcionaba también, pero a la hora de cambiar los
        comentarios descubrí que era mucho más fácil de explicar si lo hacía de otra manera y como obtengo el mismo
        resultado bienvenido sea
        */
    }
}
