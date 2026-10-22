package EjercicioU3;

import java.util.Locale;
import java.util.Scanner;

class Ejercicio14 {

static Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {

        System.out.println("Dime el numero");
        int num = teclado.nextInt();
       

        for (int cont = 1; cont <= num; cont++){
            if (cont % 7 == 0 || cont % 10 == 7) {
                System.out.println("pato");
            }else {
                System.out.println(cont);
            }
        }
        
    }
}