package EjercicioU3;

import java.util.Locale;
import java.util.Scanner;

class Ejercicio17 {

static Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {

       
        System.out.println("Dame un numero");
        int num = teclado.nextInt();
        int cont = 1;
        int div = 0;

        while (cont <= num ) {
            if (num % cont == 0) {
                div++;
            }
            cont++;
        }
        
        if (div == 2) {
            System.out.println("Es primo");
        }if (div > 2) {
            System.out.println("No es primo");
        }

    }


}
