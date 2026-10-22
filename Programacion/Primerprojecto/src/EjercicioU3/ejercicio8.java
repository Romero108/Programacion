package EjercicioU3;

import java.util.Locale;
import java.util.Scanner;

class ejercicio8 {

static Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {

    
    System.out.println("Dime la Hora");
    int hora = teclado.nextInt();
    System.out.println("Dime el min");
    int min = teclado.nextInt(); 

        min++;
    if (min == 60) {
        hora = 0;
        hora++;
    }
    if (hora == 24){
        hora = 0;
    }    
    System.out.println("El siguiente minuto es " + hora + ":" + min);
}

    }