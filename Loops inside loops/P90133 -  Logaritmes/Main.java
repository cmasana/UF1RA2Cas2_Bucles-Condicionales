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
        
        int a; // Almacena nº natural
        int b; // Almacena base
        
        // Bucle que permanece abierto mientras existen parejas de numeros
        while(teclado.hasNextInt()){
            a = teclado.nextInt(); // 2
            b = teclado.nextInt(); // 8
            
            int contador = 0;
            
            while(b >= a){
                b = b / a;
                contador++;
            }
            
            System.out.println(contador); // Muestra resultado
        }
        
        
    }
}
