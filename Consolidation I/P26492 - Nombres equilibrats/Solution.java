import java.util.Scanner;

/**
 * En aquest exercici, direm que un natural és equilibrat si la suma dels dígits de les posicions parells és igual a la
 * suma dels dígits de les posicions senars. Per exemple, 1463 i 48015 són nombres equilibrats.
 *
 * Feu una funció que indiqui si un cert natural n és equilibrat o no.
 */
class Solution {

    public static void main(String[] args) {
        /*
        //Trozo de código que utiliza Jutge para hacer la comprobación del método esEquilibrat()
        final Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            System.out.println(Solution.esEquilibrat(n) ? "1" : "0"); //Ternario
        }
         */
    }


    /**
     * Método que indica si el nº introducido por parámetro es equilibrado o no
     * @param n Tipo int - el número a evaluar
     * @return status Tipo boolean - TRUE si es equilibrado, FALSE si no lo es
     */
    public static boolean esEquilibrat(int n) {
        boolean status = false;

        /*
        Transformamos número a String
         */
        String numero = String.valueOf(n);

        /*
        Almacena cada uno de los dígitos del String
         */
        int digito;

        /*
        Total de sumar todos los dígitos pares
         */
        int sumaPares = 0;

        /*
        Total de sumar todos los dígitos impares
         */
        int sumaImpares = 0;

        /*
        Bucle que permite sumar los dígitos impares
        Asignamos a k el valor de 0 ya que se corresponde con la posición 0 del String
        o sea, el primer caracter que sería impar

        Incrementamos el valor de k de 2 en 2 para que se salte todos los pares
         */
        for (int k = 0; k < numero.length(); k+=2) {
            /*
            Transforma cada uno de los números en un caracter
             */
            char num = numero.charAt(k);

            /*
            Obtiene el valor numérico (INT) de cada caracter
             */
            digito = Character.getNumericValue(num);

            /*
            Obtiene la suma de c/u de los caracteres Impares
             */
            sumaImpares += digito;
        }

        /*
        Bucle que permite sumar los dígitos pares
        Asignamos a k el valor de 1 ya que se corresponde con la posición 1 del String
        o sea, el segundo caracter que sería par

        Incrementamos el valor de k de 2 en 2 para que se salte todos los impares
         */
        for (int k = 1; k < numero.length(); k+=2) {
            /*
            Transforma cada uno de los números en un caracter
             */
            char num = numero.charAt(k);

            /*
            Obtiene el valor numérico (INT) de cada caracter
             */
            digito = Character.getNumericValue(num);

            /*
            Obtiene la suma de c/u de los caracteres Pares
             */
            sumaPares += digito;
        }

        /*
        Evaluamos con una condición Si ambos valores son iguales
        En caso afirmativo, cambiamos el boolean a TRUE
         */
        if (sumaPares == sumaImpares) {
            status = true;
        }

        /*
        Retornamos el valor de la variable booleana
         */
        return status;
    }
}
