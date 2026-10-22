package EjercicioU3;

import java.util.Locale;
import java.util.Scanner;

class Ejercicio5 {

static Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        
        System.out.println("Dime la velocidad maxima");
        int velocidadMAXIMA = teclado.nextInt() ;
        System.out.println("Dime la velocidad ");
        int velocidad = teclado.nextInt();
        int resultado = (velocidad - velocidadMAXIMA);
        if (velocidad >= (velocidadMAXIMA *1.50)&&(resultado >= 30)) {
            System.out.println("Pierdes 6 puntos");
        } else if (resultado >= 21 && resultado <= 30){
            System.out.println("Pierdes 2 puntos");       
        } else if (resultado >= 31 && resultado <= 40) {
            System.out.println("pierdes 3 puntos");
        } else if (resultado > 40 ) {
            System.out.println("Pierdes 4 puntos");
        } else {
            System.out.println("velocidad correcta");
        }
          
        







        }   
}