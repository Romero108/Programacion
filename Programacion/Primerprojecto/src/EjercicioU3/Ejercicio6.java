package EjercicioU3;

import java.util.Locale;
import java.util.Scanner;

class Ejercicio6 {

static Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
      System.out.println("Dime que dias has hablado");
      String diAhablado = teclado.nextLine();
      System.out.println("Duracion");
      int duracion = teclado.nextInt();
      System.out.println("Mañana (M) o Tarde (T)");
      String MoT = teclado.nextLine();
      System.out.println("Cuanto pagaras por minutos ");
      System.out.println("Cuanto pagaras por impuestos cargados ");
      double precio = (0); 
      System.out.println(precio); 
    
      /*
        casos: duracion -> precio
            1 min -> 1€
            3 min -> 3€
            6 min -> 5*1€ + 0,80 -> 5,80 || 5 * 1 + duracion - 5 * 0,80
            8 min -> 5 + 3 * 0,80 
            9 min -> 5 + 2,40 + 0,70 || 5 * 1 + 3 * 0.8 + duracion - 8
            11 min -> 5 + 2,40 + 1,40 + 0,50 || 5*1 + 3*0.8+ 2*0.70 + duracion - 10

       */

        if (duracion >= 5) {
            precio = duracion*1;
        }else if (duracion >= 6 && duracion <= 8){
            precio = 5 + (duracion - 5) * 0.80;
        }else if (duracion >= 9 && duracion < 11) {
            precio = 5 + 2.40 + (duracion - 8) * 0.70;
        }else {
            precio = 8.80 + (duracion - 10) * 0.50;
            System.out.println(precio);
        }
    }
}