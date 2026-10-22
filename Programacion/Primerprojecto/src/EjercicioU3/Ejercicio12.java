package EjercicioU3;

import java.util.Locale;
import java.util.Scanner;

class Ejercicio12 {

static Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {


        System.out.println("Dame el primer");
        int primer = teclado.nextInt();

        System.out.println("Dame el primer");
        int segundo = teclado.nextInt();
        
        if (primer > 100 && primer < 200 && segundo > 100 && segundo < 200) {
            System.out.println(primer + segundo );
        } else 
            System.out.println("No se puede sumar");
            
    }
}