package EjercicioU3;
import java.util.Locale;
import java.util.Scanner;

class Ejercicio19 {
 static Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {

    System.out.println("Deja una valoracion");
    int valora = teclado.nextInt();
    
    if (valora <= 5 && valora >= -5) {
        System.out.println("Muchas gracias por la valoracion");
    }else{
        System.out.println("Dame la valoracion entre el 5 y el -5 ");
        
    }


}
}