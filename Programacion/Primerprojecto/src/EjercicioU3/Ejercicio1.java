package EjercicioU3;

import java.util.Locale;
import java.util.Scanner;

class Ejercicio1 {

static Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        
        System.out.println("Dame un numero");
        int primernum = teclado.nextInt();

        System.out.println("Dame otro");
        int secnum = teclado.nextInt();

        if (primernum > secnum) {
            System.out.println("El primer número es mayor que el segundo");
        } else if (primernum < secnum) {
            System.out.println("El segundo número es mayor que el primero");
        }else {
            System.out.println("Los dos números son iguales");
        }
    }
}