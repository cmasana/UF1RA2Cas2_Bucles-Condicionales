
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

        /*
        Almacena número
         */
        int num;

        /*
        Almacena dígitos individuales
         */
        int separa;

        /*
        Almacena suma de dígitos
         */
        int suma = 0;

        /*
        Bucle que permanece en ejecución mientras existan números
         */
        while (teclado.hasNext()) {
            /*
            Asignamos el valor introducido por teclado a variable original
             */
            int original = teclado.nextInt();

            /*
            Asignamos el valor de original a variable num
             */
            num = original;

            /*
            Bucle que se repite mientras no se cumpla la condición
             */
            while (!(num / 10 == 0)) {
                /*
                Para obtener el último dígito, realizamos la operación
                 */
                separa = num % 10;

                /*
                Almacenamos en la variable num todos los dígitos menos el último
                 */
                num = num / 10;

                /*
                Asignamos a la variable el total de sumar cada digito que hemos ido separando
                 */
                suma += separa;
            }

            /*
            Cuando num es inferior a 10 lo sumamos directamente al resultado (último dígito)
             */
            suma += num;

            System.out.println("La suma dels digits de " + original + " es " + suma + "."); // Muestra resultado
            suma = 0; // Reiniciamos valor de suma        
        }
    }
}
