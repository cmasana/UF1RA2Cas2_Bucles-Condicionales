import java.util.Scanner;

/**
 * Feu un programa que calculi logaritmes en diverses bases.
 *
 * Entrada: L’entrada consisteix en una seqüència de parells de naturals b≥ 2 i
 * n≥ 1.
 *
 * Salida: Per a cada parell, escriviu ⌊ log b n ⌋.
 *
 * @author cmasana
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Declaramos scanner

        /*
        Almacena nº natural
         */
        int a;
        
        /*
        Almacena base
         */
        int b;

        /*
        Bucle que permanece abierto mientras existen parejas de numeros
         */
        while(teclado.hasNextInt()){
            
            /*
            Asignamos a variables los valores introducidos por el usuario
             */
            a = teclado.nextInt(); //Número
            b = teclado.nextInt(); // Base

            /*
            Asignamos el valor de 0 a la varible contador para controlar el número de veces que se repite 
            el bucle while
             */
            int contador = 0;

            /*
            Bucle que se repite hasta que la base es mayor o igual al nº
             */
            while(b >= a){
                /*
                Asignamos a la base el valor de dividir la misma base por el nº
                 */
                b = b / a;
                
                /*
                Incrementamos en 1 el valor del contador (Nº de veces)
                 */
                contador++;
            }

            System.out.println(contador); // Muestra resultado
        }
    }
}
