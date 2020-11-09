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
        
        int a; // Almacena nº entero
        int b; // Almacena exponente
        
        int resultado = 1; // Si la inicializamos en 0 siempre será 0
        
        // Bucle que permanece abierto mientras
        while(teclado.hasNextInt()){
            a = teclado.nextInt();
            b = teclado.nextInt();
            
            for(int i = 0; i < b; i++){ // Repite el nº de veces del exponente
                resultado *= a;
            }
            
            System.out.println(resultado); // Muestra resultado
            
            resultado = 1; // Reiniciamos variable para la segunda pareja de nºs
        }
        
        
    }
}
