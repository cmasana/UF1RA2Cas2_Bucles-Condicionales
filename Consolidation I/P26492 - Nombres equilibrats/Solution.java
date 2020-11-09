import java.util.Scanner;

/**
 * En aquest exercici, direm que un natural és equilibrat si la suma dels dígits de les posicions parells és igual a la
 * suma dels dígits de les posicions senars. Per exemple, 1463 i 48015 són nombres equilibrats.
 * <p>
 * Feu una funció que indiqui si un cert natural n és equilibrat o no.
 */
class Solution {

    public static void main(String[] args) {
        /*
        final Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            System.out.println(Solution.esEquilibrat(n) ? "1" : "0");
        }

         */
    }


    public static boolean esEquilibrat(int n) {
        boolean status = false;

        // Transformamos número a String
        String numero = String.valueOf(n);

        int digito; // Cada uno de los dígitos
        int sumaPares = 0; // Total de sumar todos los dígitos pares
        int sumaImpares = 0; // Total de sumar todos los dígitos impares

        // Bucle Impares
        for (int k = 0; k < numero.length(); k+=2) {
            // Transforma cada uno de los números en un caracter
            char num = numero.charAt(k);

            // Obtiene el valor numérico (INT) de cada caracter
            digito = Character.getNumericValue(num);

            // Obtiene la suma de c/u de los caracteres Impares
            sumaImpares += digito;
        }

        // Bucle Pares
        for (int k = 1; k < numero.length(); k+=2) {
            // Transforma cada uno de los números en un caracter
            char num = numero.charAt(k);

            // Obtiene el valor numérico (INT) de cada caracter
            digito = Character.getNumericValue(num);

            // Obtiene la suma de c/u de los caracteres Pares
            sumaPares += digito;
        }

        // Si son iguales TRUE
        if (sumaPares == sumaImpares) {
            status = true;
        }

        return status;
    }
}
