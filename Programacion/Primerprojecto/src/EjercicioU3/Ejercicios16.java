package EjercicioU3;

import java.util.Locale;
import java.util.Scanner;

class Ejercicio16 {

static Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {

        System.out.println("Dame un numero");
        int num = teclado.nextInt();
        
        if (num < 10) {
            System.out.println("Tiene una cifra");
        }if (num > 10) {
            System.out.println("Tiene dos cifras");
        }if (num > 100) {
            System.out.println("Tiene tres cifras");
        }if (num > 1000) {
            System.out.println("Tiene cuatro digitos");
        }if (num > 10000) {
            System.out.println("Tiene cinco cifras");





    }


}
}