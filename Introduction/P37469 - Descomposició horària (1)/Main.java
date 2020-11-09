// Librerías
import java.util.Scanner;

/**
 * Feu un programa que, donada una quantitat de segons, digui quantes hores, 
 * minuts i segons representa.
 * 
 * Entrada: L’entrada consisteix en un natural n.
 * 
 * Salida: Escriviu tres naturals h, m, s tals que 3600h+60m+s=n, amb m menor 
 * que 60 i s menor que 60.
 * 
 * @author cmasa
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Declaramos scanner

        // Declaramos variable y asignamos valor introducido por consola
        int tiempo = teclado.nextInt();
        
        // Declaramos constantes para almacenar unidades de tiempo
        final int HORA = 3600; // Segundos que tiene 1 hora
        final int MINUTO = 60; // Segundos que tiene 1 minuto
        
        // Declaramos variable que almacena las horas totales
        int tHoras = tiempo / HORA;
        
        // Asignamos nuevo valor a variable tiempo 
        tiempo = tiempo % HORA;
        
        // Declaramos variables que almacenan los minutos y segundos totales
        int tMins = tiempo / MINUTO;
        int tSegs = tiempo % MINUTO;
        
        // Mostramos resultado por pantalla
        System.out.println(tHoras + " " + tMins + " " + tSegs);
    }
}
