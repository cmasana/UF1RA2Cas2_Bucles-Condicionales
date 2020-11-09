// Librerías

import java.util.Scanner;

/**
 * Feu un programa que llegeixi un enter que representa una temperatura en graus
 * Celsius, i que digui si fa calor, si fa fred, o si s’està bé. Suposeu que fa
 * calor si la temperatura és més alta que 30 graus, que fa fred si és més baixa
 * que 10 graus, i que s’està bé en altre cas. A més, cal avisar si amb
 * temperatura donada l’aigua bulliria, o si es gelaria. Suposeu que l’aigua
 * bull amb 100 o més graus, i que es gela amb 0 o menys graus.
 * 
 * Entrada: L’entrada consisteix en un enter.
 * 
 * Salida: Cal escriure una línia dient si fa calor, si fa fred, o si s’està bé.
 * Adicionalment, potser cal escriure una altra línia si l’aigua bulliria o si es gelaria.
 * @author cmasa
 */
public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); // Declaramos scanner

        /*
        Declaramos variable y asignamos valor introducido por consola
        */
        int temperatura = teclado.nextInt();
        
        /*
         * Declaramos constantes que definen las temperaturas y asignamos
         * el valor correspondiente
         */
        final int CALOR = 30; // Más de 30 hace calor
        final int FRIO = 10; // Menos de 10 hace frío
        
        /*
        Si la temperatura es igual o menor a 0 el agua se hiela
        */
        final int AGUAHELADA = 0;
        
        /*
        Si la temperatura es igual o mayor a 100 el agua hierve
        */
        final int AGUAHIRVIENDO = 100;

        /*
         * Condicional que comprueba las temperaturas y muestra los resultados 
         * correspondientes por consola. Hay que utilizar if anidados para poder evaluar
         * si cuando hace CALOR el agua está HIRVIENDO o si cuando hace FRIO
         * el agua está HELADA
         * En el resto de los casos se imprime otro resultado
         */
        
        if (temperatura > CALOR){
            System.out.println("fa calor");
            if (temperatura >= AGUAHIRVIENDO) {
                System.out.println("l'aigua bulliria");
            }
        } else if (temperatura < FRIO) {
            System.out.println("fa fred");
            if (temperatura <= AGUAHELADA) {
                System.out.println("l'aigua es gelaria");
            }
        } else {
            System.out.println("s'esta be");
        }
    }
}
