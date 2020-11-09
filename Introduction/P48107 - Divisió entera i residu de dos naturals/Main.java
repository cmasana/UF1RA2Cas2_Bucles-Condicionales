// Librerías

import java.util.Scanner;

/**
 * Feu un programa que llegeixi dos naturals a i b, amb b > 0, i que escrigui la
 * divisió entera d i el residu r de a entre b.
 * 
 * Entrada: L’entrada conté a i b, amb b > 0.
 * 
 * Salida: Escriviu una línia amb la divisió entera i el residu de a dividit per 
 * b, separats amb un espai.
 * 
 * Observación: Malgrat que les condicions sobre l’entrada d’aquest exercici 
 * impedeixen divisions per zero, proveu què li passa al vostre programa en aquest cas.
 * 
 * @author cmasa
 */
public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); // Declaramos scanner

        // Declaramos variables y asignamos valor introducido por consola
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        
        // Declaramos variables para almacenar los resultados
        int division;
        int residuo;
        
        // Asignamos el valor de la operación a las variables de resultado
        division = a / b;
        residuo = a % b;
        
        // Mostramos resultado por pantalla
        System.out.print(division + " " + residuo);
        
        /*
        NOTA: Si dividimos por 0 da un error de ejecución
        */
    }
}
