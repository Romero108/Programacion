package EjerciciosUnidad1;
import java.util.*;

public class Ejercicio28 {

    static Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        
        System.out.println("Dime la direccion de correo: ");
        String correo = teclado.nextLine();


        int primArroba = correo.indexOf("@");
        String spsp = correo.substring(primArroba +1);
        System.out.println("El dominio de tu correo es:" + spsp);


    }
}

