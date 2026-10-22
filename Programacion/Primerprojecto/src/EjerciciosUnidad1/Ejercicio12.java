package EjerciciosUnidad1;
import java.lang.Math;
import java.util.*;

public class Ejercicio12 {

static Scanner teclado = new Scanner (System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        

        System.out.print("Dame el numero a ");
        int numeroa = teclado.nextInt();

        System.out.print("Dame el numero b ");
        int numerob = teclado.nextInt();

        System.out.print("Dame el numero c ");
        int numeroc = teclado.nextInt();

        double x1 =(-numerob + Math.sqrt(numerob*numerob - 4*numeroa*numeroc)) / (2*numeroa);
        double x2 =(-numerob - Math.sqrt(numerob*numerob - 4*numeroa*numeroc)) / (2*numeroa);

        System.out.print("Resultado de x1: " + x1);
        System.out.println("Resultado de x2: " + x2);



        
    }
}