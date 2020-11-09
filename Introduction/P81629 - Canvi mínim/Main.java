// Librerías
import java.util.Scanner;

/**
 * Feu un programa que, donada una quantitat d’euros i de cèntims, calculi el 
 * nombre mínim de bitllets i monedes necessaris per assolir aquella quantitat. 
 * Es disposa de monedes de 1, 2, 5, 10, 20 i 50 cèntims i de 1 i 2 euros, i de 
 * bitllets de 5, 10, 20, 50, 100, 200 i 500 euros.
 * 
 * Entrada: L’entrada consistex en dos naturals: el nombre d’euros e i el 
 * nombre de cèntims c. Assumiu c menor que 100.
 * 
 * Salida: Escriviu quants bitllets i quantes monedes de cada tipus calen per 
 * representar la quantitat de l’entrada, tot minimitzant el nombre total de 
 * bitllets i monedes.
 * 
 * @author cmasa
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Declaramos scanner

        /*
        Declaramos variable y asignamos valor introducido por consola
        */
        int euros = teclado.nextInt();
        int centimos = teclado.nextInt();
        
        /*
        Constantes que almacenan valor de billetes
        */
        final int B500 = 500;
        final int B200 = 200;
        final int B100 = 100;
        final int B50 = 50;
        final int B20 = 20;
        final int B10 = 10;
        final int B5 = 5;
        final int M2 = 2;
        final int M1 = 1;
        
        /*
        Constantes que almacenan valor centimos
        */
        final int M50 = 50;
        final int M20 = 20;
        final int M10 = 10;
        final int M5 = 5;
        final int M02 = 2;
        final int M01 = 1;
        
        
        // EUROS
        int t500 = euros / B500; // Total de billetes de 500
        euros = euros % B500; // Nuevo valor para euros
        
        int t200 = euros / B200; // Total de billetes de 200
        euros = euros % B200; // Nuevo valor para euros
        
        int t100 = euros / B100; // Total de billetes de 100
        euros = euros % B100; // Nuevo valor para euros
        
        int t50 = euros / B50; // Total de billetes de 50
        euros = euros % B50; // Nuevo valor para euros
        
        int t20 = euros / B20; // Total de billetes de 20
        euros = euros % B20; // Nuevo valor para euros
        
        int t10 = euros / B10; // Total de billetes de 10
        euros = euros % B10; // Nuevo valor para euros
        
        int t5 = euros / B5; // Total de billetes de 5
        euros = euros % B5; // Nuevo valor para euros
        
        int t2 = euros / M2; // Total de monedas de 2
        euros = euros % M2; // Nuevo valor para euros
        
        int t1 = euros / M1; // Total de monedas de 1
        
        
        // CENTIMOS
        int t050 = centimos / M50; // Total de monedas de 50
        centimos = centimos % M50; // Nuevo valor para centimos
        
        int t020 = centimos / M20; // Total de monedas de 20
        centimos = centimos % M20; // Nuevo valor para centimos
        
        int t010 = centimos / M10; // Total de monedas de 10
        centimos = centimos % M10; // Nuevo valor para centimos
        
        int t05 = centimos / M5; // Total de monedas de 5
        centimos = centimos % M5; // Nuevo valor para centimos
        
        int t02 = centimos / M02; // Total de monedas de 2
        centimos = centimos % M02; // Nuevo valor para centimos
        
        int t01 = centimos / M01; // Total de monedas de 1
        
        /*
        Mostramos resultado por pantalla
        */
        System.out.println("Bitllets de 500 euros: " + t500);
        System.out.println("Bitllets de 200 euros: " + t200);
        System.out.println("Bitllets de 100 euros: " + t100);
        System.out.println("Bitllets de 50 euros: " + t50);
        System.out.println("Bitllets de 20 euros: " + t20);
        System.out.println("Bitllets de 10 euros: " + t10);
        System.out.println("Bitllets de 5 euros: " + t5);
        System.out.println("Monedes de 2 euros: " + t2);
        System.out.println("Monedes de 1 euro: " + t1);
        System.out.println("Monedes de 50 centims: " + t050);
        System.out.println("Monedes de 20 centims: " + t020);
        System.out.println("Monedes de 10 centims: " + t010);
        System.out.println("Monedes de 5 centims: " + t05);
        System.out.println("Monedes de 2 centims: " + t02);
        System.out.println("Monedes de 1 centim: " + t01);
    }
}
