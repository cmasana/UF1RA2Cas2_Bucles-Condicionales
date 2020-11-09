
import java.util.Scanner;

/**
 * Feu un programa que llegeixi diversos nombres i que, per a cadascun,
 * n’escrigui la suma dels dígits.
 *
 * Entrada: L’entrada consisteix en una seqüència de naturals.
 *
 * Salida: Per a cada nombre, escriviu la suma dels seus digits seguint el
 * format de l’exemple.
 *
 * @author cmasana
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Declaramos scanner

        int num; // Almacena nº natural
        int separa; // Almacena dígitos individuales
        int suma = 0; // Almacena suma dígitos

        // Bucle que permanece abierto mientras existen parejas de numeros
        while (teclado.hasNext()) {
            int original = teclado.nextInt(); // Almacenamos nº original para impresion por pantalla
            num = original;

            // Bucle para realizar las operaciones con el nº introducido
            while (!(num / 10 == 0)) {
                separa = num % 10; // Obtenemos el último dígito

                // Obtenemos los primeros digitos
                num = num / 10;

                // Vamos sumando los dígitos por separado
                suma += separa;
            }
            
            // Cuando num es inferior a 10 lo sumamos directamente al resultado (último dígito)
            suma += num;

            System.out.println("La suma dels digits de " + original + " es " + suma + "."); // Muestra resultado
            suma = 0; // Reiniciamos valor de suma        
        }
    }
}
