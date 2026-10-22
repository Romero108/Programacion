package EjercicioU3;

import java.util.Locale;
import java.util.Scanner;

class Ejercicio4b {

static Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        
         System.out.println("Dime un año ");
         int año = teclado.nextInt();

        if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) {
            System.out.println("El año " + año + " es bisiesto.");
        } else {
            System.out.println("El año " + año + " no es bisiesto.");}
        }   
}
 

  