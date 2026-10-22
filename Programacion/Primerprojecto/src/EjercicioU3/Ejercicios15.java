package EjercicioU3;

import java.util.Locale;
import java.util.Scanner;

class Ejercicio15 {

static Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {


        System.out.println("Dame un numero");
        int numero = teclado.nextInt();

        int cont = 0;
        int contPos = 0;
        int suma = 0;
        while (numero != 0) {
            cont++;
            if (numero > 0) {
                contPos++;
            }
            
            suma = numero + suma;
            
            System.out.println("Dame otro");
            numero = teclado.nextInt();
        }

        System.out.println("Total de numeros " + cont);
        System.out.println("Total de numeros positivos " + contPos);
        System.out.println("Total de numeros " + cont);
        System.out.println("Mostrar media: " + suma / cont);

        // if (numero == 0 ) {
            
        //     System.out.println("Numeros leidos");
        //     System.out.println("Mostrar cuantos numeros pasitivos ");
        //     System.out.println("Media de los numeros");


            
            
        
    }
}