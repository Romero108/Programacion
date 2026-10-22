package EjerciciosUnidad1;
import java.util.*;

public class Ejercicio8 {

static Scanner teclado = new Scanner (System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        System.out.print("Primer numero: ");
        int primernum = teclado.nextInt();

        System.out.print("segundo numero: ");
        int segundo = teclado.nextInt();

        System.out.println("Esto es la suma entre los dos numeros: " + (segundo + primernum));
        System.out.println("Esto es la resta entre los dos numeros: " + (segundo - primernum));
        System.out.println("Esto es la multiplicacion entre los dos numeros: " + (segundo * primernum));
        System.out.println("Esto es la dividir entre los dos numeros: " + (segundo / primernum));
        
    }
}