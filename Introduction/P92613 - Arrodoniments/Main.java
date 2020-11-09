// Librerías
import java.util.Locale;
import java.util.Scanner;

/**
 * Feu un programa que llegeixi un real x≥0 i que escrigui ⌊ x ⌋ 
 * (la part entera inferior de x), ⌈ x ⌉ (la part entera superior de x), i 
 * l’arrodoniment de x.
 * 
 * Entrada: L’entrada consisteix en un real x ≥ 0.
 * 
 * Salida: Escriviu la part entera inferior de x, la part entera superior de x, 
 * i l’enter més proper a x (⌈ x ⌉ en cas d’empat).
 * 
 * @author cmasa
 */
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US")); // Añadimos punto como separador decimal
        Scanner teclado = new Scanner(System.in); // Declaramos scanner

        // Declaramos variable y asignamos valor introducido por consola
        double a = teclado.nextDouble();
        
        // Declaramos variables para almacenar resultados de los redondeos
        int entero = (int)Math.floor(a); // Redondeo hacia abajo con conversión explícita
        int decimal = (int)Math.ceil(a); // Redondeo hacia arriba con conversión explícita
        int redondeo = (int)Math.round(a); // Redondeo según criterio con conversión explícita
        
        // Mostramos resultado por pantalla
        System.out.println(entero + " " + decimal + " " + redondeo);

    }
}
