import java.util.Scanner;

/**
 * Feu un programa que calculi potències.
 *
 * Entrada: L’entrada consisteix en diversos parells d’enters a i b.
 * Assumiu b ≥ 0.
 *
 * Salida: Per a cada parell a,b, cal escriure 'a' elevat a 'b'. Suposeu, com és
 * habitual, que 0 elevat a 0 = 1.
 *
 * @author cmasana
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Declaramos scanner

        /*
        Almacena nº entero
         */
        int a;

        /*
        Almacena exponente
         */
        int b;

        /*
        Almacena resultado. Hay que asignar el valor de 1 estrictamente.
        Si la inicializamos en 0 siempre será 0, porque un nº multiplicado por 0 es 0
         */
        int resultado = 1;

        /*
        Bucle que permanece abierto mientras existan parejas de números
         */
        while(teclado.hasNextInt()){

            /*
            Asignamos a 'a' y a 'b' los valores introducidos por el usuario
             */
            a = teclado.nextInt();
            b = teclado.nextInt();

            /*
            Bucle que se repite tantas veces como el valor del exponente
            Como asignamos a i el valor de 0, la condición que se evalúa es i < b
            Incremento de 1 en 1
             */
            for(int i = 0; i < b; i++){
                /*
                Asigna a resultado el valor de multiplicar la base por si misma
                el nº de veces indicado con el exponente
                 */
                resultado *= a;
            }

            System.out.println(resultado); // Muestra resultado

            /*
            Reiniciamos variable resultado para las siguientes parejas de números
             */
            resultado = 1;
        }
    }
}
