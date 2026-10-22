package EjercicioU3;

import java.util.Locale;
import java.util.Scanner;

class Ejercicio13 {

static Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {

        System.out.println("Dime el numero");
        int num = teclado.nextInt();
        
        
        while (num >= 10) {
            num /= 10;
            
        
        }
        System.out.println("La primera cifra del numero es " + num);


    }
}