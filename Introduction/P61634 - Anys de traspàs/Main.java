// Librerías
import java.util.Scanner;

/**
 * Feu un programa que indiqui si un any és de traspàs o no.
 * Un any de traspàs té 366 dies. Després de la reforma gregoriana, els anys de 
 * traspàs són els múltiples de quatre que no acaben en dos zeros, i també els 
 * acabats en dos zeros tals que el nombre que queda després de treure els dos 
 * zeros finals és divisible per quatre. Així, 1800 i 1900, tot i ser múltiples 
 * de quatre, no foren de traspàs; en canvi, 2000 ho va ser.
 * 
 * Entrada: L’entrada consisteix en un natural entre 1800 i 9999.
 * 
 * Salida: Si l’any és de traspàs, cal escriure “YES”, altrament cal escriure 
 * “NO”.
 * 
 * @author cmasa
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Declaramos scanner

        /*
        Declaramos variable y asignamos valor introducido por consola
        */
        int year = teclado.nextInt();
        
        /*
        Condicional que comprueba cada caso
        */
        if (year % 4 == 0){ 
            if (year % 100 == 0){
                if (year % 400 == 0){
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
            else {
                System.out.println("YES");
            }
        }
        else {
            System.out.println("NO");
        }
    }
}
