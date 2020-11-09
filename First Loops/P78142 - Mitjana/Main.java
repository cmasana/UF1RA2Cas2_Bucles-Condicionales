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
        Locale.setDefault(new Locale("en", "US")); // Añadimos punto como separador decimal

        double num; // Almacena numeros introducidos
        int contador = 0; // Cuenta los numeros introducidos para hallar la media
        double resultado; // Almacena el resultado en decimales
        double suma = 0; // Almacena la suma de los números introducidos
        
        while(teclado.hasNextDouble()){
            num = teclado.nextDouble(); // Almacena nº introducido por teclado
            suma += num; // Va sumando números introducidos
            contador++; // Suma 1 al contador
        }
        
        teclado.close(); // Cerramos scanner
        
        resultado = suma / contador; // Media de números
        
        // Cambiamos formato de decimales
        DecimalFormat formato = new DecimalFormat("0.00");
        
        System.out.println(formato.format(resultado)); // Imprime resultado
    }
}
