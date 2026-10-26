
package EjercicioU3;

import java.util.Locale;
import java.util.Scanner;

class Ejercicio18 {

    static Scanner teclado = new Scanner(System.in)
            .useLocale(Locale.US);

    public static void main(String[] args) {

        System.out.println("Dime un numero positivo:");
        int numero = teclado.nextInt();

        while (numero <= 0) {
            System.out.println("Error. Introduce un numero positivo:");
            numero = teclado.nextInt();
        }

        int suma = 0;

        for (int cont = numero + 1; cont <= numero + 100; cont++) {
            suma += cont;
            
        }

        System.out.println("La suma es: " + suma);
        
    }
}
