package EjercicioU3;

import java.util.Locale;
import java.util.Scanner;

class Ejercicio3 {

static Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        
        System.out.println("Dime un numero ");
        int numero = teclado.nextInt();

        if (numero % 2 == 0 && numero % 3 == 0) {
            System.out.println("Es divisible por 2 y por 3");
        }else {
            if (numero % 2 == 0) {
                System.out.println("Es divisible por 2 ");
            }else {
                if (numero % 3 == 0) {
                    System.out.println("Es divisible por 3");
                }else  {
                    System.out.println("No es divisible por ninguno de los dos ");
                }
            }
        }

        }
    }
