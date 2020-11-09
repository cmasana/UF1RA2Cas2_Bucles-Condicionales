import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Feu un programa que llegeixi una seqüència de nombres i que n’escrigui la 
 * mitjana.
 * 
 * Entrada: L’entrada consisteix en una seqüència no buida de nombres reals 
 * estrictament positius.
 * 
 * Salida: Cal escriure la mitjana dels nombres amb dues xifres decimals.
 * 
 * @author cmasana
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Declaramos scanner
        
        /*
        Utilizamos la clase Locale de java para hacer un cambio de cultura/región en
        nuestro programa y establecer así que los números decimales utilicen como separador,
        por defecto,un punto y no una coma. (Si no lo hacemos Jutge muestra un error de 
        presentación)
        */
        Locale.setDefault(new Locale("en", "US")); 

        /*
        Almacena números con coma flotante introducidos 
        */
        double num;
        
        /*
        Cuenta el total de numeros introducidos para hallar la media
        */
        int contador = 0;
        
        /*
        Almacena el resultado (la media)
        */
        double resultado;
        
        /*
        Almacena la suma de los números introducidos
        */
        double suma = 0;
        
        /*
        Bucle que se ejecuta mientras haya números introducidos
        Esto permite que se puedan introducir un número indeterminado de
        números
        */
        while(teclado.hasNextDouble()){
            num = teclado.nextDouble(); // Almacena nº introducido por teclado
            
            /*
            Suma todos los números introducidos y asigna el total a la variable suma
            */
            suma += num;
            
            /*
            Incrementamos el contador en 1 por cada número introducido
            */
            contador++;
        }
        
        teclado.close(); // Cerramos scanner
        
        /*
        Asignamos a la variable resultado el valor de la operación (la media)
        */
        resultado = suma / contador; 
        
        /*
        Cambiamos el formato decimal, para que muestre como máximo 2 dígitos después
        de la coma flotante
        */
        DecimalFormat formato = new DecimalFormat("0.00");
        
        System.out.println(formato.format(resultado)); // Imprime resultado
    }
}
