package EjercicioU3;

import java.util.Locale;
import java.util.Scanner;

class Ejercicio4 {

static Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        
        System.out.println("Dime la nota de alumno");
        int nota = teclado.nextInt();

        if (nota < 3 ) {
            System.out.println("Deficiente");
        }else if (nota < 5 ) {
            System.out.println("Insuficiente");}
            else if (nota < 6) {
                System.out.println("Bien");
            }else if (nota < 9) {
                System.out.println("Notable");
            }else if (nota == 10) {
                System.out.println("Exelente");
            } 
        }   
            
        

        }
    

  